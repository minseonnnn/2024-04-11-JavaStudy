<<<<<<< HEAD
/*
 *   7.	1~30 짝수합,홀수합을 출력하는 프로그램을 작성
 */
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0,odd=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("1~30 짝수합:"+even);
		System.out.println("1~30 홀수합:"+odd);

	}

}
=======
/*
 *   7.	1~30 짝수합,홀수합을 출력하는 프로그램을 작성
 */
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0,odd=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("1~30 짝수합:"+even);
		System.out.println("1~30 홀수합:"+odd);

	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
