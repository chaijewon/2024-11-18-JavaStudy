package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
public class ChatPenal extends JPanel{
    JTextArea ta;
    JTextField tf;
    JTable table;
    DefaultTableModel model;
    JButton b1,b2;
    
    ControlPanel cp;
    public ChatPenal(ControlPanel cp)
    {
    	this.cp=cp;
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	ta.setEditable(false);
    	
    	tf=new JTextField();
    	b1=new JButton("쪽지보내기");
    	b2=new JButton("정보보기");
    	
    	String[] col={"아이디","이름","성별"};
    	String[][] row=new String[0][3];
    	model=new DefaultTableModel(row,col);
    	table=new JTable(model);
    	JScrollPane js1=new JScrollPane(table);
    	
    	// 배치 
    	setLayout(null);
    	
    }
}
