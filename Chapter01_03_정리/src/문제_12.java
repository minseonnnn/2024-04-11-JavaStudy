/*
 *   12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
 *       ----------------- ------------   ------------
 *          10 ==> 12  
 */

import java.util.Scanner;
public class 문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int count3=0,count5=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;//컴퓨터가 입력
			System.out.println("num="+num);
			if(num%3==0)
				count3++;
			if(num%5==0)
				count5++;
		}
		System.out.println("3의 배수의 갯수:"+count3);
		System.out.println("5의 배수의 갯수:"+count5);
		/*
		 *   합
		 *   sum+=i
		 *   갯수
		 *   ++
		 */

	}

}
