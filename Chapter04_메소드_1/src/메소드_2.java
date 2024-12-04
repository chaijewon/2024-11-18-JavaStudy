// 사칙연산자 ==> 4개의 메소드 
// 회원가입 - 회원탈퇴 
import java.util.Scanner;
public class 메소드_2 {
    // 1) 리턴형 / 매개변수 => O
	// + 
	static int plus(int a,int b)
	{
		int c=a+b;
		
		return c;
	}
	// - 
	static int minus(int a,int b)
	{
		int c=a-b;
		return c;
	}
	static int gop(int a,int b)
	{
		int c=a*b;
		return c;
	}
	static String div(int a,int b)
	{
		String result="";
		if(b==0)
			result="0으로 나눌수 없습니다";
		else
			result=String.valueOf(a/(double)b);
		           // String으로 변환 
		
		return result; // 리턴형에 선언된 데이터형과 일치 
	}
	// 조립 => 다른 클래스에서 사용이 가능 
	static void process()
	{
		// main 
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		String op=scan.next();
		
		// switch , 다중조건문 
		if(op.equals("+"))
		{
			//int c=10;
			int c=plus(num1,num2);
			System.out.println(num1+"+"+num2+"="+c);
		}
		else if(op.equals("-"))
		{
			int c=minus(num1,num2);
			System.out.println(num1+"-"+num2+"="+c);
		}
		else if(op.equals("*"))
		{
			int c=gop(num1,num2);
			System.out.println(num1+"*"+num2+"="+c);
		}
		else if(op.equals("/"))
		{
			String c=div(num1,num2);
			System.out.println(c);
		}
		else
		{
			System.out.println("사용할 수 없는 연산자 입니다");
		}
		// 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
