
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1~10 까지 출력 
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		// A~Z
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c);
		}
		System.out.println();
		// Z~A
		for(char c='Z';c>='A';c--)
		{
			System.out.print(c);
		}
	}

}
