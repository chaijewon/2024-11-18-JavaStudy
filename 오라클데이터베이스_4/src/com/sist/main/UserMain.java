package com.sist.main;
import javax.swing.*;

import com.sist.dao.EmpDAO;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import com.sist.vo.*;
public class UserMain extends JFrame{
    CardLayout card=new CardLayout();
    JMenuItem empItem=new JMenuItem("사원관리");
    JMenuItem foodItem=new JMenuItem("맛집관리");
    JMenuItem eFindItem=new JMenuItem("사원검색");
    JMenuItem fFindItem=new JMenuItem("맛집검색");
    JMenuItem exit=new JMenuItem("종료");
    
    // 화면을 모아서 관리 
    EmpListPanel ep=new EmpListPanel();
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
    	
    	add("EP",ep);
    	
    	
    	empDataPrint();
    	
    	setSize(800, 600);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    }
    public void empDataPrint()
    {
    	// 오라클 연결 
    	EmpDAO dao=EmpDAO.newInstance();
    	List<EmpVO> list=dao.empListData();
    	for(EmpVO vo:list)
    	{
    		String[] data= {
    			String.valueOf(vo.getEmpno()),
    			vo.getEname(),
    			vo.getJob(),
    			vo.getHiredate().toString(),
    			vo.getDvo().getDname(),
    			vo.getDvo().getLoc()
    		};
    		ep.model.addRow(data);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new UserMain();
	}

}
