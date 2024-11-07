<<<<<<< HEAD
/*
 *    문자열을 거꾸로 출력하는 메소드를 구현하시오
 */
import java.util.*;
public class 문제_7 {
    static void a(String msg)
    {
    	for(int i=msg.length()-1;i>=0;i--)
    	{
    		System.out.print(msg.charAt(i));
    	}
    	System.out.println();
    	System.out.println(new StringBuffer(msg).reverse());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
        a(str);
	}

}
=======
/*
 *    문자열을 거꾸로 출력하는 메소드를 구현하시오
 */
import java.util.*;
public class 문제_7 {
    static void a(String msg)
    {
    	for(int i=msg.length()-1;i>=0;i--)
    	{
    		System.out.print(msg.charAt(i));
    	}
    	System.out.println();
    	System.out.println(new StringBuffer(msg).reverse());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
        a(str);
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
