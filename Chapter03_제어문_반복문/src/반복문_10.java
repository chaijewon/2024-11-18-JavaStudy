/*
 *   10개의 알파벳을 추출 
 *   사용자가 입력 => 몇번째 위치하고 있는지 확인 
 *   A C D F Z H O P Q K
 *   
 *   => D => 3번째 위치하고 있다 ==> index 구하는 방법 
 *           => 크롤링 (웹에서 데이터 수집) 
 *           
 *   => A~Z 사이 => 입력 => 몇번째 위치 
 */
import java.util.Scanner;
public class 반복문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("알파벳을 입력(대문자):");
        char c=scan.next().charAt(0); 
        // Scanner는 char를 가지고 오는 것은 없다 
        // => 문자열 => 첫번째 문자를 추출 => charAt(0) 
        System.out.println("c="+c);
        
        // 확인 
        //System.out.println("몇번째 위치:"+(c-64));
        int index=1;
        for(char ch='A';ch<='Z';ch++)
        {
        	if(ch==c)
        		break; // 종료 => 반복문을 중단 
        	index++;
        		
        }
        System.out.println(c+"는(은) "+index+"번째 위치하고 있습니다");
        /*
         *   구구단 => 2차
         *   페이징 => 1차 => 조건문 
         */
	}

}
