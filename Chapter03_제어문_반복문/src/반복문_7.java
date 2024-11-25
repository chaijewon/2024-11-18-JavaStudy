// 무한루프 
/*
 *    컴퓨터 => 난수 : 1~100사이의 정수 추출 
 *    => 맞추는 게임 => 힌트 : UP/DOWN
 *    난수 => 58
 *    사용자 입력> 50 => UP 
 */
import java.util.Scanner;
// 반복문 => if문 
public class 반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 임의의 수를 추출 
		int com=(int)(Math.random()*100)+1;
		
		// 사용자 입력 
		Scanner scan=new Scanner(System.in);
		for(;;) //for문의 무한루프 => while
		{
			System.out.print("1~100사이의 정수 입력:");
			int user=scan.nextInt();
			
			// 힌트 
			if(com>user)
			{
				System.out.println("높은 정수 입력!!");
			}
			else if(com<user)
			{
				System.out.println("작은 정수 입력!!");
			}
			else
			{
				System.out.println("정답입니다!!");
				System.exit(0);// 프로그램 종료 
				// 무한루프는 반드시 종료 조건을 첨부한다 
			}
		}
	}

}




