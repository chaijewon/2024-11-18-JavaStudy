package com.sist.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.*;
public class MusicListPanel extends JPanel{
  JLabel la;
  JButton b1,b2;
  JTable table;
  DefaultTableModel model;
  public MusicListPanel()
  {
	  setLayout(null);
	  la=new JLabel("Music Top 50",JLabel.CENTER);
	  la.setFont(new Font("궁서체",Font.BOLD,35));
	  la.setBounds(10, 15, 760, 50);
	  add(la);
	  
	  
	  
	  String[] col={"순위","곡명","가수명","앨범"};
	  String[][] row=new String[0][4];
	  model=new DefaultTableModel(row,col);
	  table=new JTable(model);
	  JScrollPane js=new JScrollPane(table);
	  js.setBounds(10,70,760,400);
	  add(js);

	  
  }
}
