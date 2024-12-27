package com.sist.board;
import java.util.*;
import java.io.*;
public class BoardManager {
    // 게시물을 모아서 관리 영역 
	// 게시물이 모든 사용자에게 공유 
	private static List<BoardVO> boardList=
			  new ArrayList<BoardVO>();
	// 오라클 => 저장된 데이터가 static => 공유된 데이터 
	// 초기화 
	public BoardManager()
	{
		boardGetData();
	}
	// 기능 설정 
	// 1. 목록출력 => 페이지 나누기 => Read SELECT
	// 2. 추가    => Create INSERT
	// 3. 상세보기 
	// 4. 수정 / 삭제 => Update / Delete 
	// CURD => DML 
	// 5. 찾기 => 검색 
	// => 오라클 => 
	// 중복 => 저장 / 읽기 => 별도의 메소드로 제작 
	// 추가 / 수정 / 삭제 
	public void boardGetData()
	{
		ObjectInputStream ois=null;
		try
		{
			FileInputStream fis=
				new FileInputStream("c:\\java_data\\board.txt");
			ois=new ObjectInputStream(fis);
			boardList=(List<BoardVO>)ois.readObject();
			// ObjectInputStream => 파일과 연결 
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				ois.close();
			}catch(Exception ex) {}
		}
	}
	// => 자바 => 자동으로 갱신은 없다 
	// => 메소드 호출시에만 갱신 
	// 수정 / 추가 / 삭제 => 변경 
	public void boardSave()
	{
		ObjectOutputStream oos=null;
		try
		{
			FileOutputStream fos=
				new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(boardList);
			// 수정 => boardList.set()
			// 삭제 => boardList.remove()
			// 추가 => boardList.add()
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}
	// 총페이지 구하기 
	public int boardTotalPage()
	{
		return (int)(Math.ceil(boardList.size()/10.0));
	}
	// 시퀀스 
	public int boardSequence() // 게시물 번호 자동 생성 
	{
		int max=0;
	    // 비정상 종료를 방지하는 프로그램 
		try
		{
			for(BoardVO vo:boardList)
			{
				if(vo.getNo()>max)
				{
					max=vo.getNo();
				}
			}
		}catch(Exception ex) {}
		
		return max+1;
	}
	// 게시물 번호를 자동 생성 => 시퀀스 Create Sequence
	// auto_increment()
}
