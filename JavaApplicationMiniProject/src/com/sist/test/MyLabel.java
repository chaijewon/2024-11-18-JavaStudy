package com.sist.test;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
public class MyLabel extends JFrame{
    JLabel[] la=new JLabel[20];
    JPanel pan;
    JScrollPane pane;
    public MyLabel()
    {
    	pan=new JPanel();
    	pan.setLayout(new GridLayout(20,1,5,5));
    	String html="<html><body><div style='color:orange'>경주 여행, 신라의 숨결을 따라가는 문화유산 탐방</div>"
    			   +"<div>전통과 현대가 공존하는 분위기 속에서 산책과 맛집 탐방을 즐길 수 있다. 경주는 이외에도 대릉원, 경주국립박물관, 문무대왕릉 등 다양한 역사적 명소들이 가득하다. 신라의 천년 역사를 느끼며 고대와 현대가 어우러진</div>"
    			   +"<div style='text-align:right'>투어코리아뉴스6분 전</div>"
    			   +"</body></html>";
    	for(int i=0;i<20;i++)
    	{
    		la[i]=new JLabel(html);
    		pan.add(la[i]);
    		//la[i].setText(html);
    	}
    	pan.setPreferredSize(new Dimension(750,2000));
 	    pane=new JScrollPane(pan);
 	    pane.setPreferredSize(new Dimension(720,650));
 	    pane.setBounds(10, 55, 720, 650);
    	add("Center",pane);
    	setSize(650, 730);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MyLabel();
	}

}
