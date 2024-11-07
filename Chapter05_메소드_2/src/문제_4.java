<<<<<<< HEAD
/*
 *   두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
 */
import java.util.*;
public class 문제_4 {
    static double div(int a,int b)
    {
    	double d=0.0;
    	try
    	{
    		d=a/(double)b; // 정상 수행
    	}catch(Exception e)
    	{
    		System.out.println("0으로 나눌 수 없습니다!!");//오류 발생
    	}
    	return d;
		
    }
   
    	
    	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
    	System.out.print("1 정수 입력:");
    	int num1=scan.nextInt();
    	System.out.print("2 정수 입력:");
    	int num2=scan.nextInt();
    	double res=div(num1,num2);
    	System.out.println("res="+res);
	}

}
=======
/*
 *   두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
 */
import java.util.*;
public class 문제_4 {
    static double div(int a,int b)
    {
    	double d=0.0;
    	try
    	{
    		d=a/(double)b; // 정상 수행
    	}catch(Exception e)
    	{
    		System.out.println("0으로 나눌 수 없습니다!!");//오류 발생
    	}
    	return d;
		
    }
   
    	
    	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
    	System.out.print("1 정수 입력:");
    	int num1=scan.nextInt();
    	System.out.print("2 정수 입력:");
    	int num2=scan.nextInt();
    	double res=div(num1,num2);
    	System.out.println("res="+res);
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
