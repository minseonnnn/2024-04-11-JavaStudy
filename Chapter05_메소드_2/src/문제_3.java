<<<<<<< HEAD
/*
 *   1~n까지 합을 구하는 메소드를 구현하시오
 */
// 리턴형 (O) 매개변수 (O) ==> n => 사용자의 요청값
import java.util.*;
public class 문제_3 {
	static int b(int n)
    {   
		int sum=0;
    	for(int i=1;i<=n;i++)
    	{
    		sum=sum+i; // sum+=i
    		
    	}
    	return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int n=scan.nextInt();
        int sum=b(n);
        System.out.println("sum="+sum);
	}

}
=======
/*
 *   1~n까지 합을 구하는 메소드를 구현하시오
 */
// 리턴형 (O) 매개변수 (O) ==> n => 사용자의 요청값
import java.util.*;
public class 문제_3 {
	static int b(int n)
    {   
		int sum=0;
    	for(int i=1;i<=n;i++)
    	{
    		sum=sum+i; // sum+=i
    		
    	}
    	return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int n=scan.nextInt();
        int sum=b(n);
        System.out.println("sum="+sum);
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
