/*
 *   2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
 *   초기화 / 범위 / 증가식
 *   for(int i=2;i<=100;i+=2)
 *   
 *   
 *   for => 반복문 => 반복횟수가 있는 경우에 주로 사용 
 *                  ----------------
 *   1) 형식
 *          for(초기값;조건식;증가식) => 정수 , 문자
 *          {
 *            반복 실행문장
 *          }  
 *   2) 순서            | false면 종료    
 *                1    2 <-- 4
 *          for(초기값;조건식;증가식) => 정수 , 문자
 *          {          | true | 
 *            반복 실행문장 ----- 3
 *          }  
 *                       false면 종료  
 *                         |    true
 *          초기값 ------> 조건식 ------> 실행문장 -----> 증가식
 *                         |                            |
 *                         ------------------------------                           
 *   3) 초기값 : 시작점 => int i=0 , int i=1 , int i='A' ...
 *   4) 조건식 : 어디까지 출력 (범위)  i<=10
 *   5) 증가 : 2씩,1씩,....               
 */
public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
			
		}
		System.out.print("2+4+...100의 합:"+sum);
		/*
		 *   수열이 아닌 경우에는 for을 사용할 수 없다
		 *   --- 패턴
		 *    1 2 3 4 5
		 *    2 4 6..
		 *    1 1 1 2 2 2 3 3 3 4 4 4
		 */

	}

}
