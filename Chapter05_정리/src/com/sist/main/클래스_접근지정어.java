package com.sist.main;
/*
 *    변수 / 메소드 / 생성자
 *    -----------------
 *     접근 범위
 *     => private : 멤버변수 (데이터를 보호하는 목적) => 접근 거부
 *     => public : 다른 클래스 연결              => 접근 승낙 
 *                 메소드 / 클래스 / 생성자 
 *     라이브러리에서 제공
 *     접근지정어는 멤버에서만 사용이 가능
 *              --- 클래스 영역에 선언
 *              ===================================
 *              --- 인스턴스 변수 , 정적 변수
 *              --- 메소드
 *              --- 생성자
 *              --- 클래스
 *              =================================== 다른 클래스에 사용하기 때문에 접근 범위 설정
 *              --- 지역변수는 접근지정어를 사용할 수 없다 (메소드안에서 사용)             
 *                 ------ final (접근지정어 , static은 사용할 수 없다)
 *     ---------------------------------------------------------
 *      ***private : 자신의 클래스에서만 사용이 가능 (접근 금지) => 개인정보 , 회사정보...
 *                   ---------
 *                   ** 모든 멤버변수는 데이터 보호 => private 
 *     ---------------------------------------------------------
 *      default : 같은 패키지에서 접근이 가능 => 키워드 없는 상태
 *                class A
 *                {
 *                   int a; => default
 *                }
 *     ---------------------------------------------------------
 *      protected : 같은 패키지에서 접근이 가능 + 상속을 받은 경우 다른 패키지까지 접근이 가능     
 *     ---------------------------------------------------------
 *      ***public : 모든 클래스에서 접근이 가능하게 만든다
 *                  클래스 , 메소드 , 인터페이스 , 상수 , 생성자 
 *     ---------------------------------------------------------
 *     
 *     => private < default < protected < public
 *        --------------------------------------
 *          |                               |
 *          ---------------------------------
 *                         | 중요
 *    => 지역변수
 *       ----- final 외의 다른 키워드는 사용이 불가능하다
 *       ----- 멤버변수는 기본 초기화 => 바로 사용이 가능
 *                    --------- 프로그램에 필요한 경우에는 초기화 후 사용
 *                    생성자 (X) , 초기화블록 (X)
 *                    --------- 생략하는 경우 => 자동 추가  
 *             지역변수는 반드시 초기화 후 사용               
 *             
 *             모든 멤버변수 => private을 사용하는 것이 아니라 => 권장 
 *                
 *     => 메소드 : 기능 수행 
 *        형식)
 *           [접근지정어][옵션] 리턴형 메소드명(매개변수목록)
 *                    ----
 *                     static , abstract
 *                     ------ 클래스에서 모든 영역에 공통 적용 
 *           --------- 다른 클래스와 통신 => public 
 *           {
 *                --- 사용자 요청에 대한 처리
 *                결과값 전송 => return 
 *           }
 *           
 *           
 *           1. 접근지정어
 *              메소드 => 통신 담당 (소프트웨어 => 메세지) => 클래스와 클래스를 연결 => 모든 클래스에서 사용이 가능
 *                      public 
 *              옵션 => static : 클래스 전체에서 동일한 기능을 가지고 있는 경우 (극히 드물다 => 프로그램에서 1~2개 정도)
 *                     웹) 한글변환 , 암호화 , 복호화 
 *              리턴형 => 기본형 , 배열 , 클래스
 *                                   | 정보 출력 (변수여러개인 경우) => 상세보기 
 *                             | 전송하는 데이터가 여러개 => 목록
 *                      | 데이터값이 한개인 경우 => 장바구니의 갯수               
 *              메소드명 : 식별자 => 소문자 시작 (가급적이면 => 한글은 사용하지 않는다)
 *                                                   => 운영체제에 따라 한글 인식이 다르다 
 *              매개변수 : 여러개 사용이 가능 => 3개이상 초과 금지 (배열,클래스)
 *                      사용자가 보내는 요청값의 갯수를 모르는 경우 (... 가변형)
 *              ** 리턴형 (요청에 대한 결과값)
 *              ** 매개변수 (사용자 요청한 값) => 로그인 요청 (ID,PWD) , 검색 (검색어) 
 *              ** 메소드는 호출하게 되면 처음부터 끝까지 수행 
 *                 -------------------------------
 *                 { => 시작
 *                 
 *                 } => 끝 
 *                 --------------> 반복 제거 
 *                 --------------> 재사용
 *                 --------------> 구조적인 프로그램 (단락) => 수정 , 추가                                                       
 *           
 *        호출)       
 *            class A
 *            {
 *               int a=10;
 *               ---------------
 *               static b=20; 
 *               --------------- 저장 
 *               public void aaa(){}
 *               public int bbb(){}
 *               -----------------------------
 *               public static void ccc(){}
 *               public static int ddd(){}
 *               ----------------------------- 저장
 *            }
 *            
 *            A aa=new A()
 *            
 *            -- aa --
 *             0x100
 *            --------  0x100  --------------
 *                                10 => a  ====> aa.a
 *                             --------------
 *                                aaa()    ====> aa.aaa()
 *                             --------------
 *                                bbb()    ====> aa.bbb()
 *                             --------------
 *         =========A=============                    
 *            -------------           
 *               20 ==> b  => A.b    
 *            -------------      
 *               ccc()     => A.ccc()     
 *            -------------          
 *               ddd()     => A.ddd() 
 *            -------------           
 *         =======================   
 *         
 *         class A
 *         {
 *            static int a;
 *            static void aaa(){}
 *         }                 
 *         class B
 *         {
 *            static int b;
 *            static void bbb(){}
 *         }
 *         
 *         =====A=====
 *          --------
 *            0 => a  ==> A.a
 *          --------
 *            aaa()   ==> A.aaa()
 *          --------
 *          
 *         ===========
 *         
 *         =====B=====
 *          ---------
 *              0 => b  ==> B.b
 *          ---------
 *            bbb()     ==> B.bbb()  
 *          ---------
 *         ===========
 *         => 인스턴스 
 *           객체명.변수명 , 객체명.메소드명 ===> 메모리 주소 
 *                       ----- 메모리 주소를 가지고 있다 
 *        => static 
 *           클래스명.변수명 , 클래스명.메소드명  ===> 클래스명 
 *                  
 *                  
 */
public class 클래스_접근지정어 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
