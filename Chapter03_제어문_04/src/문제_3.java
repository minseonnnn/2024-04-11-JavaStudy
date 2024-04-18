/*
 *   2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
 *   초기화 / 범위 / 증가식
 *   for(int i=2;i<=100;i+=2)
 */
public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
			System.out.println("i="+i+",sum="+sum);
		}
		System.out.print("2+4+...100의 합:"+sum);

	}

}
