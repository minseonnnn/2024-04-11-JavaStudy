<<<<<<< HEAD
/*
 *   1.	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
 *                            ----------------------------- 변수
        십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

        결과)
            2자리수 정수 입력(10~99) >> 77 
            10의 자리와 1의 자리가 같습니다.
            ---------------------------
            
            if(조건문)
            {
               true => 10의 자리와 1의 자리가 같습니다
            }
            else
            {
               false => 10의 자리와 1의 자리가 같지 않습니다
            }

 */
import java.util.Scanner;
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.print("두자리 정수 입력 >>");
        int num=scanner.nextInt();
        if(num%11==0)
        {
        	System.out.println("10의 자리와 1의 자리가 같습니다");
        }
        else
        {
        	System.out.println("10의 자리와 1의 자리가 같지 않습니다");
        }
        
	}

}
=======
/*
 *   1.	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
 *                            ----------------------------- 변수
        십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

        결과)
            2자리수 정수 입력(10~99) >> 77 
            10의 자리와 1의 자리가 같습니다.
            ---------------------------
            
            if(조건문)
            {
               true => 10의 자리와 1의 자리가 같습니다
            }
            else
            {
               false => 10의 자리와 1의 자리가 같지 않습니다
            }

 */
import java.util.Scanner;
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.print("두자리 정수 입력 >>");
        int num=scanner.nextInt();
        if(num%11==0)
        {
        	System.out.println("10의 자리와 1의 자리가 같습니다");
        }
        else
        {
        	System.out.println("10의 자리와 1의 자리가 같지 않습니다");
        }
        
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
