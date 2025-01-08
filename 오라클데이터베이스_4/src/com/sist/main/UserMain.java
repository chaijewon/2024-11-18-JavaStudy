package com.sist.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UserMain extends JFrame{
    CardLayout card=new CardLayout();
    JMenuItem empItem=new JMenuItem("사원관리");
    JMenuItem foodItem=new JMenuItem("맛집관리");
    JMenuItem eFindItem=new JMenuItem("사원검색");
    JMenuItem fFindItem=new JMenuItem("맛집검색");
    JMenuItem exit=new JMenuItem("종료");
    public UserMain()
    {
    	setLayout(card);
    	JMenu menu1=new JMenu("관리");
    	menu1.add(empItem);
    	menu1.addSeparator();
    	menu1.add(foodItem);
    	menu1.addSeparator();
    	menu1.add(exit);
    	
    	JMenu menu2=new JMenu("검색");
    	menu2.add(eFindItem);
    	menu2.add(fFindItem);
    	
    	JMenuBar bar=new JMenuBar();
    	bar.add(menu1);
    	bar.add(menu2);
    	
    	setJMenuBar(bar);
    	setSize(800, 600);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new UserMain();
	}

}
