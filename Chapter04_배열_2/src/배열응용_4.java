/*
 *   정렬 
 *    = 선택정렬 / 버블정렬 
 *    = ASC / DESC =====> Oracle : Order by 
 *      ---   ----
 *            | 내림차순 (******) => 최신순 
 *      | 올림차순
 *      
 *   86~96page => 1차원 배열 
 *   알고리즘 => 정렬 알고리즘 => 108page 
 *   
 *   선택정렬 : 한개의 데이터를 선택한후에 기준점으로 변경 
 *   
 *   10 30 50 20 40   => 10 20 30 40 50 , 50 40 30 20 10
 *                       --------------   --------------
 *                         올림차순             내림차순 
 *   내림 차순 
 *   10  30  50  20  40 
 *   --  --
 *   30  10
 *   --      --
 *   50      30
 *   --          --
 *   50          20
 *   --              --
 *   50              40
 *   -------------------- 1round => for문 한번 수행 
 *   
 *   50    10  30  20  40
 *   --    --  --
 *   고정   30  10
 *         --      --
 *         30      20
 *         --          --
 *         40          30
 *   --------------------- 2round 
 *   50  40   10   20   30
 *   ------   --   --
 *    고정     20   10
 *            --        --
 *            30        20
 *   ---------------------- 3round
 *   50 40  30    10    20
 *   ---------    --    --
 *    고정         20    10
 *   ---------------------- 4round 
 *   50  40 30  20  10
 *   
 *   i  j
 *   1  4
 *   2  3
 *   3  2
 *   4  1   ==> i+j=5   j=5-i
 *                        -
 *                        arr.length-i
 *   
 *   앞에서부터 1개씩 고정하는 방법 
 *   
 *   
 *   
 */
public class 배열응용_4 {
    static void sort(int[] arr)
    {
    	for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]<arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        // 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("정렬 전:");
        // 출력
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        // 정렬 
        /*
         *    int a=10;
         *    int b=20;
         *    
         *    a=b ==> a=20
         *    b=a ==> b=20
         *    
         *    int temp=a;
         *    a=b;
         *    b=temp
         */
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]<arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        System.out.println("정렬 후:");
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
	}

}






