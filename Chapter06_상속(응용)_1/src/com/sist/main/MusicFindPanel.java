package com.sist.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MusicFindPanel extends JPanel{
	  JLabel la;
	  JButton b1,b2;
	  JTable table;
	  DefaultTableModel model;
	  JTextField tf;
	  public MusicFindPanel()
	  {
		  setLayout(null);
		  tf=new JTextField();
		  la=new JLabel("Music 검색",JLabel.CENTER);
		  la.setFont(new Font("궁서체",Font.BOLD,35));
		  la.setBounds(10, 15, 760, 50);
		  add(la);
		  
		  tf.setBounds(10, 70, 200, 30);
		  add(tf);
		  
		  String[] col={"순위","곡명","가수명","앨범"};
		  String[][] row=new String[0][4];
		  model=new DefaultTableModel(row,col);
		  table=new JTable(model);
		  JScrollPane js=new JScrollPane(table);
		  js.setBounds(10,105,760,400);
		  add(js);
		  
	  }
}
