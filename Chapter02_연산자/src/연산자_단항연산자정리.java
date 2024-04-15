/*
 *     연산자 => 사용자 요청에 따라서 처리하는 기술
 *     
 *     프로그램
 *       데이터 저장 =========================> 데이터 처리 =================> 화면 출력
 *       = 한개 (변수)                     수정 / 삭제 / 읽기   
 *       ------------------               => 제어문 , 연산자
 *       = 여러개 (배열,클래스)               => 변수 / 제어문 / 연산자
 *       ------------------               같은 기능별 묶음
 *       = RAM에 저장 (휘발성 메모리)            게시판 , 댓글 , 회원가입 , 예약
 *        => 프로그램 종료시 자동으로 사라진다     => 재사용
 *       ------------------ 
 *       = 영구적인 저장 장치
 *        => 파일
 *        => RDBMS (오라클) 
 *        -----------------
 *        회원가입
 *        -------------------------------------------------------------------
 *        연산 처리
 *        
 *        1) 단항연산자 
 *            = 증감연산자 (1개 증가, 1개 감소) ++,--
 *              = 전치 연산자 (먼저 증가) ++a,--a
 *              = 후치 연산자 (나중에 증가) a++,a--
 *            = 부정연산자 => boolean에서만 사용이 가능 => ! (true=>false,false=>true)
 *              => 조건문에서 주로 사용 
 *            = 형변환연산자 => 숫자와 관련된 데이터만 가능
 *                   ---------------> UpCasting
 *              byte < char < int < long < float < double
 *                   <--------------- DownCasting
 *                   ** char는 연산시에 자동으로 정수로 변경
 *                   ** 각 문자마다 번호 = 아스키 코드값
 *              (데이터형)값
 *              -------- 변경     
 *            = 반전연산자 => 양수 => 음수 변경 (~)
 *        2) 이항연산자
 *           연산대상이 2개인 경우
 *           산술연산자  => 같은 데이터형 만들어 놓고 시작한다 (같은 데이터형끼리만 연산 가능)
 *           --------
 *           + , - , * , / , %
 *           => +
 *              1)  일반 산술 (더하기)
 *              2)  문자열 결합  "7"+7 => "77"
 *           => - , * (뺄셈 , 곱셈만 가능)
 *           => /
 *              1) 0으로 나눌 수 없다 (사용자가 0을 입력할 수 없게 제어)
 *              2) 정수 / 정수 = 정수 (소수점 => 정수 / 실수 = 실수)   
 *           => % 나누고 나머지 => 결과값의 부호 왼쪽과 동일
 *              - % + ==> -
 *              - % - ==> -
 *              + % + ==> +
 *              + % - ==> +
 *          --------------------- 가장 많이 사용되는 연산자
 *              => 우선순위 
 *                 *,/,% ==> +,-
 *              System.out.println(5+5+5*5)
 *                                     ====
 *                                      25
 *                                  5+5+25 => 35     
 *              "7"+7+7
 *              -----
 *                  --- "777"
 *              "7"+7*7
 *                  ---
 *              --- "749"                                
 *        3) 삼항연산자
 *        
 */
public class 연산자_단항연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("7"+7+7);
        System.out.println("7"+7*7);
        System.out.println("7"+(7+7));
        // 714 => 우선순위는 변경이 가능 => () : 최우선 순위 연산자 
        // byte , char => int이하 데이터형 ==> 연산 결과값은 int 
        byte b1=125;
        byte b2=125;
        int b3=b1+b2;
        byte b4=(byte)(b1+b2);
        System.out.println("b3="+b3);
        System.out.println("b4="+b4);
	}

}
