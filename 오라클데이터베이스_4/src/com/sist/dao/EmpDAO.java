package com.sist.dao;
import java.util.*;
import com.sist.vo.*;
import java.sql.*;
/*
 *   오라클 / 자바 / 자바스크립트 / HTML / CSS
 *   ------------------------------------
 *     |     |        |       ----------- <iframe> , ThymeLeaf
 *                  function
 *        Class/Method
 *   PROCEDURE 
 *   => 반복 : 반복 제거 
 */
public class EmpDAO {
   private Connection conn;
   private PreparedStatement ps;
   private DataBase db=new DataBase();
   private static EmpDAO dao;
   
   // 싱글턴 
   public static EmpDAO newInstance()
   {
	   if(dao==null)
		   dao=new EmpDAO();
	   return dao;
   }
   
   // 기능 => 전체 목록 출력 
   public List<EmpVO> empListData()
   {
	   List<EmpVO> list=new ArrayList<EmpVO>();
	   try
	   {
		  conn=db.getConnection();
		  String sql="SELECT empno,ename,job,hiredate,dname,loc "
		  		   + "FROM emp JOIN dept "
		  		   + "ON emp.deptno=dept.deptno";
		  // 오라클에서 실행 => 실행되는 SQL
		  // => 오류를 처리하기 어렵다 (문자열)
		  /*
		   *   SELECT empno,ename,job,hiredate,dname,loc
		   *   FROM emp NATURAL JOIN dept 
		   *   
		   *   SELECT empno,ename,job,hiredate,dname,loc
		   *   FROM emp JOIN dept USING(deptno)
		   */
		  ps=conn.prepareStatement(sql);
		  ResultSet rs=ps.executeQuery();

		  while(rs.next())
		  {
			  EmpVO vo=new EmpVO();
			  vo.setEmpno(rs.getInt(1));
			  vo.setEname(rs.getString(2));
			  vo.setJob(rs.getString(3));
			  vo.setHiredate(rs.getDate(4));
			  vo.getDvo().setDname(rs.getString(5));
			  vo.getDvo().setLoc(rs.getString(6));
			  list.add(vo);
		  }
		  rs.close();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   db.disConnection(conn, ps);
	   }
	   return list;
   }
   // 상세보기 
   // 검색 
}
