import com.sist.data.*;
import java.util.*;
public class 배열테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] fdata=ArrayData.korEng;
        Scanner scan=new Scanner(System.in);
        System.out.print("과일명을 입력하세요:");
        String name=scan.next();
        for(String f:fdata)
        {
        	if(f.contains(name))
        	{
        	  String eng=f.substring(f.indexOf(":")+1);
        	  System.out.println(name+"의 영어는 "+eng);
        	  break;
        	}
        }
	}

}
