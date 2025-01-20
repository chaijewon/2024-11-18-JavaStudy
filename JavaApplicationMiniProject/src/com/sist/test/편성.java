package com.sist.test;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 편성 extends JFrame implements ActionListener{
    JButton[] btns=new JButton[16];
    String[] names={"김요한","박준현","유지수","김준수","방다혜","김채연","전현빈",
    		"오승준","배병우","김준홍","김기현","정주희","권혁준","문종호","양현욱,허정운"};
    public 편성()
    {
    	setLayout(new GridLayout(4,4,5,5));
    	for(int i=0;i<btns.length;i++)
    	{
    		btns[i]=new JButton(names[i]);
    		add(btns[i]);
    		btns[i].addActionListener(this);
    	}
    	setSize(450, 450);
    	setVisible(true);
    	setDefaultCloseOperation(ABORT);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
