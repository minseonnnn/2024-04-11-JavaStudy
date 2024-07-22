/*
 *   프로그램 
 *     1) 데이터를 저장 (변수/상수)
 *     2) 사용자 요청에 맞게 가공 
 *        연산자 / 제어문 
 *        연산자 
 *         단항연산자 
 *           = 증감연산자  ( ++ , -- ) : 1증가 , 1감소 => 반복문 
 *           = 부정연산자  (!) => 조건문 => true=>false , false=>true
 *           = 형변환연산자 : 필요시에 형을 변경해서 사용 
 *             => (데이터형) 
 *             => (char)65 , (int)10.5
 *                 'A'          10
 *                 ** boolean은 포함하지 않는다 
 *             => 클래스 형변환 
 *         이항연산자
 *           = 산술연산자 (+ , - , * , / , %)
 *             + :
 *               => 1) 산술기능 
 *                     10+10 = 20
 *                     10+10.5=20.5
 *                     --
 *                     10.0
 *                     
 *                     'A'+1
 *                     ---
 *                      65 +1 = 66
 *                      
 *                     int + char = int 
 *                     int + double = double
 *                     ----------------------
 *                     char + char = int 
 *                     byte + char = int 
 *                     byte + byte = int 
 *                     ---------------------
 *                     int + int = int
 *                     int + long = long
 *                     long + double = double
 *                  2) 문자열 결합 
 *                     "7"+7  ==> "77"
 *                     7+"7"  ==> "77"
 *                     => 문자열이 있으면 결과값은 문자열이다 
 *                     "7"+10.5  ==> "710.5"
 *                     "7"+true ==> "7true"
 *              / : 
 *                  1) 0으로 나눌수 없다 => 오류발생 
 *                  2) 정수 / 정수 = 정수 
 *              % : 나누고 나머지 => 배수 
 *                  1) 결과값은 왼쪽 부호에 따라 다르다 
 *                                ---( + , - )
 *                     5%2 = 1   1+4/2
 *                     5%-2 = 1  1+4/-2
 *                     -5%2 = -1   -1+-4/2
 *                     -5%-2 = -1  -1-4/-2
 *                     
 *                     5/2 = 2
 *                     5/-2 = -2
 *                     -5/2 = -2
 *                     -5/-2 = 2
 *           = 비교연산자 (==,!=,< , > , <= , >=)
 *             => 숫자(정수,실수)/문자
 *             => boolean은 == , !=
 *             => 모든 결과값이 true/false => 조건문 
 *             => 문자열은 비교할 수 없다  
 *           = 논리연산자 ( && , || )
 *             => 범위,기간에 포함 => && (이고) ~부터 ~까지 => &&
 *             => 범위,기간을 벗어난 경우 => || (이거나)  
 *             (조건) && (조건) 
 *             -----    -----
 *               |        |
 *               ----------
 *                   |
 *                 결과값  ==> 조건 2개가 동시에 true일때만 true가 된다
 *                 
 *             (조건) || (조건) 
 *             -----    -----
 *               |        |
 *               ----------
 *                   |
 *                 결과값  ==> 조건 1개 이상 true일때만 true가 된다   
 *                 
 *                             &&     ||
 *           ------------------------------
 *            true true       true    true 
 *           ------------------------------
 *            true false      false   true 
 *           ------------------------------
 *            false true      false   true
 *           ------------------------------
 *            false false     false  false 
 *           ------------------------------ => 조건문 , 반복문 
 *           = 대입연산자 ( = , += , -= ) 
 *              int a = 10
 *                => 10을 a에 대입 ==> 오른쪽 => 왼쪽 (우선순위는 가장 낮은 순서)
 *                => += 여러개를 증가 
 *                   int a=10;
 *                   a++ ==> a는 1개 증가 
 *                   a+=10; a는 10개 증가 
 *                   -----
 *                    a=a+10
 *                => -= 여러개를 감소
 *                   int a=10;
 *                   a-- => a는 1개 감소 
 *                   a-=5 => a값을 5개 감소 
 *                   ----
 *                    a=a-5;
 *                => 누적 , 크롤링 => 문자열 결합  
 *         삼항연산자 
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
