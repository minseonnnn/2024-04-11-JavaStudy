<<<<<<< HEAD
/*
 *   9.  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
         int[] arr = { 10, 20, 30, 50, 3, 60, -3 };  
 */
public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,50,3,60,-3};
		int index=0;
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==60)
			{
				index=i;
				break;
			}
		}
		System.out.println("index="+index); */
		for(int i:arr)
		{
			if(i==60)
			break;
			index++;
		}
		System.out.println("index="+index);
		// 인덱스 번호 사용법

	}

}
=======
/*
 *   9.  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
         int[] arr = { 10, 20, 30, 50, 3, 60, -3 };  
 */
public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,50,3,60,-3};
		int index=0;
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==60)
			{
				index=i;
				break;
			}
		}
		System.out.println("index="+index); */
		for(int i:arr)
		{
			if(i==60)
			break;
			index++;
		}
		System.out.println("index="+index);
		// 인덱스 번호 사용법

	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
