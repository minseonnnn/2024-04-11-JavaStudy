// 비교연산자 (true/false) => 조건문 (if / if~else / 삼향연산자)
/*
 *   == , != , < , > , <= , >=
 *   숫자(정수,실수) , 문자
 *   boolean => == , !=
 *   
 *   boolean b=true
 *   boolean c=false
 *   
 *   b==c b!=c (b<c , b>c , b<=c , b>=c) 사용불가
 *   
 *   학점 => score>=90 A
 *          score>=80 B
 *          score>=70 C
 *          score>=69 D
 *          score<90  F
 *          
 */
public class 연산자_비교연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		double d=30.5;
		double e=20.0;
		
		System.out.println("d="+d+",e="+e);
		System.out.println(d+"=="+d+":"+(d==e));
		System.out.println(d+"!="+d+":"+(d!=e));
		System.out.println(d+"<"+d+":"+(d<e));
		System.out.println(d+">"+d+":"+(d>e));
		System.out.println(d+"<="+d+":"+(d<=e));
		System.out.println(d+">="+d+":"+(d>=e));

	}

}
