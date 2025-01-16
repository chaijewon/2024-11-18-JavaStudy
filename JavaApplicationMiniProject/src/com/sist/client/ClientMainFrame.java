package com.sist.client;
//   McWinLookAndFeel  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.sist.vo.*;
import com.sist.dao.*;
///////////////// 네트워크 통신 
import java.io.*;
import java.util.*;
import java.net.*;
//                         상속 => 재사용 => 변경 
/*
 *   사용자 동작 => 로그인 , 채팅 보내기
 *   메소드 => 무조건 종료 => 다른 메소드가 호출 
 *   -----------------------------------
 *   서버에서 보내는 값 : 자동화 처리 
 *                   ----------- 쓰레드  
 *   
 */
public class ClientMainFrame extends JFrame
implements ActionListener,Runnable
{
	/// 네트워크 통신 
	Socket s;
	OutputStream out;
	BufferedReader in;
	//  로그인이 되면 서버에 등록 
	MenuForm mf=new MenuForm(); // 포함 클래스 => 있는 그대로 사용
    ControlPanel cp=new ControlPanel();
    Login login=new Login();
	// 배치 
    // 데이터베이스 
    MemberDAO mDao=MemberDAO.newInstance();
	public ClientMainFrame()
	{
		setLayout(null); // 사용자 정의 => 직접 배치
		mf.setBounds(10, 15, 800, 50);
		add(mf);
		cp.setBounds(10, 75, 820, 570);
		add(cp);
		setSize(850,700);
		
		// 등록 
		// 로그인 
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
	}
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainFrame();
	}
	// 서버에서 응답 받기 => 쓰레드 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	// 서버에 요청 => 로그인 / 채팅 보내기 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)
		{
			dispose();// 윈도우 메모리 해제 
			System.exit(0); // 프로그램 종료
		}
		else if(e.getSource()==login.b1)
		{
			// 유효성 검사 
			String id=login.tf.getText();
			if(id.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this,
						"아이디를 입력하세요");
				login.tf.requestFocus();
				return;
			}
			String pwd=String.valueOf(login.pf.getPassword());
			if(pwd.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this,
						"비밀번호를 입력하세요");
				login.pf.requestFocus();
				return;
			}
			// 로그인 검색 
			MemberVO vo=mDao.isLogin(id, pwd);
			if(vo.getMsg().equals("NOID"))
			{
				JOptionPane.showMessageDialog(this, 
						"아이디가 존재하지 않습니다");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
			}
			else if(vo.getMsg().equals("NOPWD"))
			{
				JOptionPane.showMessageDialog(this, 
						"비밀번호가 틀립니다");
				login.pf.setText("");
				login.pf.requestFocus();
			}
			else
			{
				JOptionPane.showMessageDialog(this, 
						"로그인되었습니다\n서버로 연결합니다");
				login.setVisible(false);
				setVisible(true);
			}
		}
	}
}
