<<<<<<< HEAD
/*
 *    정렬
 *    --- 버블 정렬 (인접한 수끼리 비교) ==> 뒤에 부터 고정
 *    14  1  24  18  36  3 ==> 1  3  14  18  24  36  ASC(오름차순)
 *    
 *    14  1  24  18  36  3
 *    --  --
 *    1   14
 *        -- --
 *        14 24
 *           --  --
 *           18  24
 *               --  --
 *               24  36
 *                   --  --
 *                    3  36     =====================> 1-5
 *    -------------------------------- 1round (for 1)
 *    1  14  18  24  3  (36)
 *    -- --
 *    1  14
 *       --  --
 *       14  18
 *           --  --
 *           18  24
 *               --  --
 *               18  3          =====================> 2-4
 *    -------------------------------- 2round (for 2)
 *    1  14  18  3  (24 36)
 *    -- --
 *    1  14
 *       --  --
 *       14  18
 *           -- --
 *           14  3              =====================> 3-3
 *    -------------------------------- 3round (for 3)       
 *    1  14  3  (18 24 36)
 *    -- --
 *    1  14
 *       --  --
 *        1   3                 =====================> 4-2
 *    -------------------------------- 4round (for 4)    
 *    1  3  (14 18 24 36)     
 *    -- --
 *    1  3                      =====================> 5-1
 *    -------------------------------- 5round (for 5)
 *    1  3  14  18  24  36
 *    -------------------------------- 버블정렬
 *    
 *    i   j
 *    1   5  ==> 6
 *    2   4  ==> 6
 *    3   3  ==> 6
 *    4   2  ==> 6
 *    5   1  ==> 6
 *    
 *    i+j=6 ===> j=6-i
 *        
 *                           
 */
import java.util.*;
public class 중첩_for_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {14,1,24,18,36,3};
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬 후:");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				// 0 1   1 2  2 3
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println((i+1)+"Round:"+Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// DESC
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				// 0 1   1 2  2 3
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println((i+1)+"Round:"+Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
			
		

	}

}
=======
/*
 *    정렬
 *    --- 버블 정렬 (인접한 수끼리 비교) ==> 뒤에 부터 고정
 *    14  1  24  18  36  3 ==> 1  3  14  18  24  36  ASC(오름차순)
 *    
 *    14  1  24  18  36  3
 *    --  --
 *    1   14
 *        -- --
 *        14 24
 *           --  --
 *           18  24
 *               --  --
 *               24  36
 *                   --  --
 *                    3  36     =====================> 1-5
 *    -------------------------------- 1round (for 1)
 *    1  14  18  24  3  (36)
 *    -- --
 *    1  14
 *       --  --
 *       14  18
 *           --  --
 *           18  24
 *               --  --
 *               18  3          =====================> 2-4
 *    -------------------------------- 2round (for 2)
 *    1  14  18  3  (24 36)
 *    -- --
 *    1  14
 *       --  --
 *       14  18
 *           -- --
 *           14  3              =====================> 3-3
 *    -------------------------------- 3round (for 3)       
 *    1  14  3  (18 24 36)
 *    -- --
 *    1  14
 *       --  --
 *        1   3                 =====================> 4-2
 *    -------------------------------- 4round (for 4)    
 *    1  3  (14 18 24 36)     
 *    -- --
 *    1  3                      =====================> 5-1
 *    -------------------------------- 5round (for 5)
 *    1  3  14  18  24  36
 *    -------------------------------- 버블정렬
 *    
 *    i   j
 *    1   5  ==> 6
 *    2   4  ==> 6
 *    3   3  ==> 6
 *    4   2  ==> 6
 *    5   1  ==> 6
 *    
 *    i+j=6 ===> j=6-i
 *        
 *                           
 */
import java.util.*;
public class 중첩_for_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {14,1,24,18,36,3};
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬 후:");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				// 0 1   1 2  2 3
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println((i+1)+"Round:"+Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// DESC
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				// 0 1   1 2  2 3
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println((i+1)+"Round:"+Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
			
		

	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
