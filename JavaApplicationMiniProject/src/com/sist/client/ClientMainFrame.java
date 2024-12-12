package com.sist.client;
//   McWinLookAndFeel  
import javax.swing.*;
//                         상속 => 재사용 => 변경 
public class ClientMainFrame extends JFrame{
	MenuForm mf=new MenuForm(); // 포함 클래스 => 있는 그대로 사용
    ControlPanel cp=new ControlPanel();
	// 배치 
	public ClientMainFrame()
	{
		setLayout(null); // 사용자 정의 => 직접 배치
		mf.setBounds(10, 15, 800, 50);
		add(mf);
		cp.setBounds(10, 75, 820, 570);
		add(cp);
		setSize(850,700);
		setVisible(true);
	}
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainFrame();
	}
}
