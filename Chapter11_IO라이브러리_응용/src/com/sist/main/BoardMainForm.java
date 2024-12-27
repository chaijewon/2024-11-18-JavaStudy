package com.sist.main;
import javax.swing.*;
import java.awt.*;
public class BoardMainForm extends JFrame{
    CardLayout card=new CardLayout();
    public BoardMainForm()
    {
    	setLayout(card);
    	setSize(640, 480);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new BoardMainForm();
	}

}
