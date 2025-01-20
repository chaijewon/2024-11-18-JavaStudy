package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
public class ReplyBoardDAO {
    // 연결 => 오라클 
	private Connection conn;
	// 송수신 => SQL문장 전송 , 결과값 받기 
	private PreparedStatement ps;
	// 메모리 절약 / Connection객체 생성 조절
	private static ReplyBoardDAO dao;
	// 오라클 연결 주소 
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// 드라이버 등록 => 한번만 사용
	public ReplyBoardDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 리플렉션 => 클래스이름으로 메모리할당 / 메소드 제어 ..
			// new 역할 => 메소드명을 모르는 경우에도 호출 가능 
		}catch(Exception ex) {}
	}
	// 싱글턴 
	public static ReplyBoardDAO newInstance()
	{
		if(dao==null)
			dao=new ReplyBoardDAO();
		return dao;
	}
	// 연결 
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	// 해제 
	public void disConnection()
	{
		try
		{
			if(ps!=null)
				ps.close();
			if(conn!=null)
				conn.close();
		}catch(Exception ex) {}
	}
	/////////////////////// 자바에서 오라클 연동 기본 (공통) 
	/////////////////////// ---------------- JDBC 
	//// JDBC (원시소스) => DBCP => ORM (MyBatis,Hibernate => JPA)
	/// 기능 
	// 1. 목록 출력 => 인라인뷰 => 1페이지에 10개 
	// => 최신순 
	// => INDEX사용은 X => 추가,수정,삭제가 많은 경우에는 
	// INDEX가 속도가 저하 => ORDER BY를 이용한다 
	public List<ReplyBoardVO> boardListData(int page)
	{
		List<ReplyBoardVO> list=
				new ArrayList<ReplyBoardVO>();
		try
		{
			// 1. 연결 
			getConnection();
			// 2. SQL문장 제작 
			String sql="SELECT no,subject,name,TO_CHAR(regdate,'YYYY-MM-DD'),hit,group_tab,num "
					  +"FROM (SELECT no,subject,name,regdate,hit,group_tab,rownum as num "
					  +"FROM (SELECT no,subject,name,regdate,hit,group_tab "
					  +"FROM replyBoard ORDER BY group_id DESC,group_step ASC)) "
					  +"WHERE num BETWEEN ? AND ?";
			ps=conn.prepareStatement(sql);
			int rowSize=10;
			int start=(rowSize*page)-(rowSize-1);
			int end=rowSize*page;
			
			ps.setInt(1, start);
			ps.setInt(2, end);
			
			// 실행 요청 
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				ReplyBoardVO vo=new ReplyBoardVO();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setDbday(rs.getString(4));
				vo.setHit(rs.getInt(5));
				vo.setGroup_tab(rs.getInt(6));
				
				list.add(vo);
			}
			rs.close();
			
		}catch(Exception ex)
		{
			// 오류 확인 
			ex.printStackTrace();
		}
		finally
		{
			// 연결 해제 
			disConnection();
		}
		return list;
	}
	// 1-1. 총페이지 
	public int boardTotalPage()
	{
		int total=0;
		try
		{
			getConnection();
			String sql="SELECT CEIL(COUNT(*)/10.0) FROM replyBoard";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			total=rs.getInt(1);
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return total;
	}
	// 2. 글쓰기 => INSERT 
	// 3. 상세보기 => WHERE 
	// 4. 수정 => UPDATE 
	// 5. 답변 => 트랜잭션 
	// 6. 삭제 => 트랜잭션 
	
	
}
