// 입력 => 사칙연산 
import java.util.Scanner;
public class 자바선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 클래스 저장 
		Scanner scan=new Scanner(System.in);
		// 지역변수 (stack) => 메모리  , new 생성 (heap) 개발용
		// 메소드 : 메소드Area....(static)
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		// 키보드를 이용해서 정수값 받기
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();// 명령 => 정수한개를 가지고 와라
		
		// 정수 : nextInt() , 실수 : nextDouble() 
		// 문자열 : next() => 문자 한개를 자르는 경우 charAt()
		// => 한개의 기능을 가지고 있는 것 : 메소드 
		
		System.out.print("연산자 입력(+,-,*,/):");
		
		switch(scan.next()) // 문자열 , 문자 
		{
		  case "+": // "" => String 
			  System.out.println(num1+"+"+num2+"="+(num1+num2));
			  break;
		  case "-": // "" => String 
			  System.out.println(num1+"-"+num2+"="+(num1-num2));
			  break;
		  case "*": // "" => String 
			  System.out.println(num1+"*"+num2+"="+(num1*num2));
			  break;
		  case "/":
			  if(num2==0)
				  System.out.println("0으로 나눌 수 없습니다");
			  else
				  System.out.println(num1+"/"+num2+"="+
			                         num1/num2);
		      break;
		      /*
		       *   switch(num2)
		       *   {
		       *     case 0:
		       *       System.out.println("0으로 나눌 수 없습니다");
		       *       break;
		       *     default:
		       *        System.out.println(num1+"/"+num2+"="+
			                         num1/num2);
		       *   }
		       */
		      default:
		    	  System.out.println("잘못된 연산자 입력입니다!!");
		    	  
		      // 다중 조건문과 유사 => 선택문 
		      /*
		       *    if(조건문)
		       *    {
		       *      if(){
		       *      }
		       *      else{
		       *      }
		       *    }
		       *    
		       *    if(조건문)
		       *    {
		       *       switch()
		       *       {
		       *       }
		       *    }
		       *    
		       *    switch()
		       *    {
		       *      case 값:
		       *        switch()
		       *        {
		       *        }
		       *    }
		       *    switch()
		       *    {
		       *       case 값:
		       *          if()
		       *          {
		       *          }
		       *          else
		       *          {
		       *          }
		       *    }
		       */
		    	  // 제어문은 1개만 사용하는 것이 아니라 여러개의 다른 제어문 사용이 가능 
		    	  /*
		    	   *   주로 사용 
		    	   *     if => 단독으로 주로 사용 
		    	   *     for => if를 주로 사용 : 반복문 
		    	   */
			  
		}
	}

}
