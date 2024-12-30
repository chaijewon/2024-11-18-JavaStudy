package com.sist.client;
import java.util.*;
import java.net.*;
import java.awt.CardLayout;
import java.io.*;
import javax.swing.*;
import com.sist.commons.*;
public class ChatMain extends JFrame{
    Login login=new Login();
    WaitRoom wr=new WaitRoom();
    CardLayout card=new CardLayout();
    // <jsp:include>
    public ChatMain()
    {
    	setLayout(card);
    	add("WR",wr);
    	add("LOG",login);
    	
    	setSize(800, 600);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new ChatMain();
	}

}
