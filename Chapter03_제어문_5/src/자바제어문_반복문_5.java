<<<<<<< HEAD
/*
 *    A~Z 사이에서 => 사용자가 입력한 알파벳이 몇번째 있는지 확인
 */
import java.util.Scanner;
public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("알파벳 입력:");
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        
        int i=1;// 위치 확인 
        for(char c='A';c<='Z';c++)
        {
        	if(ch==c)
        		break; // 종료 ==> i변수를 이용해서 ~번째 확인 => index
        	i++;
        }
        
        System.out.println(ch+"는(은) "+i+"번째 있습니다");
		
	}

}
=======
/*
 *    A~Z 사이에서 => 사용자가 입력한 알파벳이 몇번째 있는지 확인
 */
import java.util.Scanner;
public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("알파벳 입력:");
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        
        int i=1;// 위치 확인 
        for(char c='A';c<='Z';c++)
        {
        	if(ch==c)
        		break; // 종료 ==> i변수를 이용해서 ~번째 확인 => index
        	i++;
        }
        
        System.out.println(ch+"는(은) "+i+"번째 있습니다");
		
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
