<<<<<<< HEAD
/*
 *  5.	100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
 *                   ----------------
 */
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)//7의 배수
			{
				sum+=i;// i값을 누적
				count++;// 갯수
			}
		}
		System.out.println("7의 배수의 갯수:"+count);
		System.out.println("7의 배수의 합:"+sum);

	}

}
=======
/*
 *  5.	100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
 *                   ----------------
 */
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)//7의 배수
			{
				sum+=i;// i값을 누적
				count++;// 갯수
			}
		}
		System.out.println("7의 배수의 갯수:"+count);
		System.out.println("7의 배수의 합:"+sum);

	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
