package com.sist.main;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,Integer> map=new HashMap<String,Integer>();
        String[] str={"사과","배","참외","귤","수박"};
        while(true)
        {
	        System.out.println("1.사과");
	        System.out.println("2.배");
	        System.out.println("3.참외");
	        System.out.println("4.귤");
	        System.out.println("5.수박");
	        
	        Scanner scan=new Scanner(System.in);
	        System.out.print("과일 선택:");
	        int f=scan.nextInt();
	        if(f==9)
	        {
	        	break;
	        }
	        map.put("f_"+f, f);
        }
        
        if(map.isEmpty())
        {
        	System.out.println("장바구니에 상품이 없습니다");
        }
        else
        {
        	System.out.println("=== 장바구니 내역 ===");
        	for(String key:map.keySet())
        	{
        		int value=map.get(key);
        		System.out.println(str[value-1]);
        	}
        }
	}

}
