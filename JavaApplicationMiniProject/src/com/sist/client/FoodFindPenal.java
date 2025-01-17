package com.sist.client;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;//Image , Layout
import java.awt.event.*;
import com.sist.vo.*;
import com.sist.dao.*;
// => 서버 연동 (X) 
public class FoodFindPenal extends JPanel{
     ControlPanel cp; // 상세보기 
     JTable table; // 모양관리 
     DefaultTableModel model; // 데이터 관리
     // MVC구조 
     JTextField tf; 
     JButton b;// 검색 
     TableColumn column;
     public FoodFindPenal(ControlPanel cp)
     {
    	 this.cp=cp;
    	 String[] col={
    		"번호","","업체명","주소","음식종류","평점"
    	 };
    	 Object[][] row=new Object[0][6];
    	 model=new DefaultTableModel(row,col)
    	 {
            // 클릭시 => 편집 방지 
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
            // 이미지 출력 <?> => 와일드카드 : 어떤 클래스든 사용이 가능
			/*
			 *   Class<Integer> => ?
			 *   Class<String>
			 *   Class<ImageIcon>
			 *   Class<Double>
			 */
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
    		 // 오버라이딩 사용 => 라이브러리 변경 
			 // 상속없이 오버라이딩이 가능 => 익명의 클래스 (내부 클래스의 일종)
    		 
    	 };
    	 table=new JTable(model);
    	 JScrollPane js1=new JScrollPane(table);
    	 
    	 for(int i=0;i<col.length;i++)
     	 {
     		column=table.getColumnModel().getColumn(i);
     		if(i==0)
     			column.setPreferredWidth(80);
     		else if(i==1)
     			column.setPreferredWidth(80);
     		else if(i==2)
     			column.setPreferredWidth(180);
     		else if(i==3)
     			column.setPreferredWidth(350);
     		else if(i==4)
     			column.setPreferredWidth(160);
     		else if(i==5)
     			column.setPreferredWidth(80);
     	 }
    	 
    	 b=new JButton("검색");
    	 tf=new JTextField();
    	 
    	 setLayout(null);
    	 
    	 tf.setBounds(20, 20, 200, 30);
    	 b.setBounds(225, 20, 80, 30);
    	 
    	 js1.setBounds(20, 60, 800, 500);
    	 
    	 add(tf); add(b); 
    	 add(js1);
    	 
     }
     
}
