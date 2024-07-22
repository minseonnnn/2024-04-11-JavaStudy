package com.sist.main;
/*
 *    => 변수 / 배열 / 연산자 / 제어문 / 메소드 
 *    클래스 구성요소 
 *    => 접근지정어 
 *       ------------------------------------------------------
 *         private : 자신의 클래스 안에서 접근이 가능
 *                   멤버변수에서 주로 사용 
 *       ------------------------------------------------------
 *         default : 같은 패키지에서 다른 클래스에서 사용이 가능
 *                   => 윈도우 => 컴포넌트 (JButton , JTextField..)
 *       ------------------------------------------------------
 *         protected : 같은 패키지에서 다른 클래스에서 사용이 가능
 *                     상속이 있는 경우 => 다른 패키지까지 접근이 가능 
 *       ------------------------------------------------------
 *         public : 모든 클래스에서 사용이 가능
 *       ------------------------------------------------------
 *         1) class 선언
 *            [접근지정어] class ClassName => public => 다른 클래스와 연동 
 *            [접근지정어] 데이터형 변수명      => 데이터 보호 => private
 *            [접근지정어] 생성자()          => public => 다른 클래스와 연동
 *            [접근지정어] 리턴형 메소드명()    => public => 다른 클래스와 통신
 *            [접근지정어] interface 인터페이스명  => public => 다른 클래스에서 구현 후 사용
 *            => private / public 
 *    => 제어어 
 *       static : 공통적인 => 모든 객체가 공통으로 사용
 *       abstract : 미완성된 => 상속을 내려서 => 구현한 클래스를 이용한다 
 *       final : 마지막 => 클래스(종단=상속을 내릴 수 없는 클래스)
 *                       메소드(종단=오버라이딩이 불가능)
 *                       변수(상수=값을 변경할 수 없다)
 *       [접근지정어][제어어] ~~
 *       ---------------
 *       [제어어][접근지정어] ~~
 *       ---------------
 *          접근 범위 
 *          <--------------------------
 *          private < default < protected < public
 *          --------------------------> 확장                
 *          => 오버라이딩 => 접근지정어의 확장은 가능 / 축소는 불가능 
 *            -----------------------------------------
 *      => static 메소드 / static 블록에서는 인스턴스를 사용할 수 없다
 *           => 인스턴스를 사용하기 위해서는 반드시 메모리 할당시 사용
 *              --------------------------------------- 매개변수
 *           => 인스턴스 메소드 / 인스턴스 블록 => 인스턴스 변수, static 변수 사용이 가능    
 *      예)
 *           class A
 *           {
 *               int a;
 *               public static void display()
 *               {
 *                   a=200; // 오류
 *                   A aa=new A();// 메모리 할당시 사용
 *                   aa.a=200;
 *               }
 *           }    
 *           
 *           A aa=new A();
 *           aa.a=100;          
 *                   오버로딩          오버라이딩  ===> 99.9% 면접 
 *                => 새로운 기능추가   => 기존의 기능을 변경   
 *    ===========================================         
 *     메소드명          동일                동일
 *    ===========================================         
 *     리턴형          관계없음               동일
 *    ===========================================         
 *     매개변수   갯수/데이터형이 다르다           동일 
 *    ===========================================         
 *     접근지정어       관계없다               확장만 가능
 *    ===========================================         
 *      상태        같은 클리스 내             상속
 *                                       => 포함 => 익명의 클래스
 *    ===========================================
 *       미완성퇸 클래스 => 반드시 상속 내려서 구현 후에 사용
 *       ----------
 *               => 공통적인 기능 설계 => 표준화
 *               => 서로 다른 클래스 연결 (리모콘)
 *               => 관련된 클래스를 여러개 묶어서 사용
 *               => 결합성이 낮은 프로그램 제작 가능
 *               => 요구사항 분석 => 설계도
 *                추상 클래스           인터페이스    ===> 75%    
 *    ===========================================
 *     상속         단일 상속            다중 상속 ======> 추상 클래스의 단점을 보완               
 *    ===========================================
 *     사용 방법
 *                extends 추상클래스명  implements 인터페이스명
 *                -------           ----------
 *    ===========================================
 *     변수         멤버변수              상수
 *    ===========================================
 *    메소드       구현된 메소드
 *               구현이 안된 메소드      구현이 안된 메소드
 *                                  1.8 => 구현된 메소드 사용이 가능
 *                                         default
 *                                         static
 *    ===========================================
 *     접근지정어    접근지정어 전체 사용이 가능   public만 사용이 가능
 *    ===========================================
 *    *** 인터페이스가 중심
 *        ------------
 *         = 컬렉션
 *         = 데이터베이스
 *               컬렉션
 *               ----
 *               
 *                  Collection
 *                       |
 *             ----------------------------
 *             |            |             |
 *            List         Set           Map
 *            ----
 *            | ArrayList / LinkedList / Vector
 *            
 *            => ArrayList list=new ArrayList()
 *               LinkedList list=new LinkedList()
 *               Vector list=new Vector()
 *               ---------------------------------      
 *               
 *               List list=new ArrayList()
 *                    list=new Vector()
 *                    list=new LinkedList()
 *               ---------------------------------
 *            => 이벤트 처리 (윈도우) => 행위를 했을때 처리
 *                                 ---------- 키보드 입력 / 버튼 클릭 / 마우스 클릭
 *               => ActionListener : JButton , JMenu , JRadio...
 *               -----------------------
 *               => MouseListener : JTable
 *               => KeyListener : JTextField                           
 *               ----------------------- 모든 컴포넌트가 가능 
 *               
 *           *** 구현을 하지 않고 내려주는 이유
 *               => 프로그램마다 구현하는 기능이 다르기 때문에 ...
 *               => 버튼
 *                  ---
 *                  로그인 / 취소 / 회원가입 / 계산기 / 검색 ...
 *               => 프로그램에 맞게 구현해서 사용해라
 *                  설계된 메소드만 전송 
 *                  --------------- 구현이 안된 메소드    
 *                  
 *           객체지향의 객체란> ==> 90%
 *           캡슐화 VS 은닉화
 *           상속 VS 포함
 *           ----------------------
 *           예외처리의 종류 . 목적 
 *           컬렉션       
 *           ----------------------
 *    class ClassName
 *    {
 *         ------------------------
 *          변수 : 필요 데이터 => 출력 화면
 *                => 목록 (X) => 요약 
 *                => 상세보기 
 *         ------------------------
 *          메소드 : 어떤 기능 => 메뉴
 *         ------------------------
 *          생성자 : 오버로딩 
 *                 초기화 / 시작과 동시에 처리 => 자동 로그인 / 보안 ... / 데이터베이스 드라이버 등록 
 *         ------------------------
 *    }
 *    
 *    ===============================================================
 *    예외처리
 *    ======
 *      목적 : 서전에 에러를 방지하는 프로그램
 *      정의 : 비정상 종료를 방지하고 정상 종료를 수행하게 만든다 
 *      
 *      => 직접 처리 : 프로그래머가 직접 에러를 처리 => 에러 복구
 *         try ~ catch ~ finally => 거의 대부분 사용 
 *                                  ------------
 *                                   웹 => DB연동 (java.sql => CheckedException)
 *      => 간접 처리 : 에러 발생에 대한 선언 => 사용시에 반드시 예외처리 후에 사용 
 *         throws 에러 떠넘기기
 *      -------------------------------------------------------------------------
 *        try ~ catch는 여러개 사용이 가능 
 *              -------------------- 순서가 존재
 *              상속 => 위로 올라갈 수록 크다 => 위로 올라갈 수록 예외처리하는 범위가 커진다 
 *                      상속
 *                      ---
 *                      
 *                     Object
 *                       |
 *                   Throwable : Exception / Error
 *                       |    
 *              --------------------------
 *              |                        |
 *            Error                  Exception
 *            처리가 불가능               처리가 가능 => 소스상에서 변경이 가능 
 *                                    => 서버 IP / 파일명이 틀리다 / 배열 범위 초과 / 0으로 나눈다 ...
 *                                       |
 *                           --------------------------
 *                           |                        |
 *                    CheckedException        UnCheckedException
 *                           |                        |
 *                        java.io                RuntimeException
 *                        IOException             => NumberFormatException 
 *                        FileNotFoundException      Integer.parseInt()
 *                        java.sql                => NullPointException
 *                        SQLException            => ArrayIndexOutOfBoundsException
 *                        java.lang                  StringTokenizer
 *                        ClassNotFoundException
 *                        Class.forName()
 *                        InterruptedException   
 *                                             
 *            오라클 연동 : 예외처리를 가지고 있다
 *            --------
 *            JDBC : 자바에서 제공하는 라이브러리
 *              |
 *            DBCP : 웹에서 주로 사용하는 기술 
 *              |
 *             ORM : => 실무에서 사용하는 기술 
 *             --- MyBatis (85%) , JPA (15%)    
 *                   
 *             JavaScript 
 *             ----------
 *                 |      
 *              JQuery (AJax)
 *                 |
 *                Vue
 *                 |
 *               React
 *                 |
 *               Redux
 *                 |
 *            React-Query
 *                 |         
 *               NextJS NuxtJS=> TypeScript       
 *            --------------------------------
 *            throws => 순서가 없다 
 *            =================== Exception / Throwable     
 *    라이브러리
 *       9장 ~ 11장
 *       java.lang
 *         Object : 최상위 클래스
 *           = toString() => 객체를 문자열로 변경
 *           = finalize() => 소멸자
 *           = clone() => 복제
 *         String : 문자열 저장
 *           = equals() => 문자열이 같은 경우 (==은 주소값 비교)
 *           = contains() => 검색 (포함된 단어)
 *           = startsWith() => 서제스트 (자동완성기)
 *           = indexOf()/lastIndexOF() => 지정된 문자 위치를 찾는 경우 => 인덱스 번호
 *           = valueOf() => 모든 데이터형을 문자열형으로 변경 
 *           = substring() => 문자열을 자르는 경우
 *           = length() => 문자 갯수 확인 
 *           = trim() => 좌우의 공백 제거
 *           ------------------------------ 웹 => 문자열
 *         StringBuffer : 문자열 결합   
 *           = append() => 최적화
 *           = toString() => 저장된 모든 데이터를 문자열 
 *         Math : 수학
 *           = random() : 임의로 값 추출
 *           = ceil() : 올림
 *         Wrapper : 기본형을 클래스화 => 제네릭에서 사용 
 *                                  ------ 클래스만 지정이 가능
 *            ***Integer  ====> int   ===> parseInt() => 문자열을 정수로 변환
 *            ***Double   ====> double ==> parseDouble() => 문자열을 실수로 변환
 *            Boolean  ====> boolean => parseBoolean() => 문자열을 논리형으로 변환
 *            Byte     ====> byte  ===> parseByte() => 문자열을 바이트로 변환
 *            
 *            Integer i=10; 오토박싱
 *            int ii=i; 언박싱
 *            ------------------------------ 호환이 된다 
 *             => 웹 , 윈도우는 모든 데이터를 문자열로 인식 (기본형은 없다)
 *             
 *       java.util : 프로그램에서 많이 사용하는 클래스의 집합
 *          Random : Math.random() => 보완
 *                   => nextInt(int bounds)
 *                              ----------- 마지막은 제외
 *                      nextInt(100) => 0~99        
 *          StringTokenizer : 문자열을 구분자별로 자르는 경우
 *                            => split() 를 보완
 *                   => nextToken() => 자른 단어를 읽어 올 때
 *                   => hasMoreTokens() => 자른 갯수만큼 루프
 *                   => countTokens() => 자른 갯수           
 *          Date => 오라클의 데이터형과 호환 => 기능이 없다
 *          Calendar => Date에 없는 기능을 보완 => 요일 , 마지막날 => 달력
 *          Collection => 배열의 단점을 보완 => 고정적 => 가변형
 *          
 *             List  /  Set  /  Map
 *             ----             ---
 *             ArrayList        HashMap
 *                           => 중복제거 => HashSet => 웹소켓
 *                           
 *             List : 데이터 중복 허용
 *                    순서가 있다 => 인덱스 (삭제 , 추가 => 자동 변경) ==> 순차적으로 유지
 *                                0번부터 시작
 *                    ArrayList : 데이터 베이스 => 추출한 데이터를 브라우저로 전송 , 윈도우 
 *                    ---------
 *                      add() : 추가
 *                      size() : 저장갯수
 *                      get() : 데이터 읽기
 *                      clear() : 전체 삭제
 *                      isEmpty() : 존재
 *                      --------------------
 *             Set : 데이터 중복을 허용하지 않는다
 *                   순서가 없다
 *                   HashSet : 웹소켓 = 브라우저에서 채팅, 접속자마다 쪽지 전송 => 접속자가 중복이 되면 안된다 
 *                   -------
 *                     add(값) : 추가
 *                     size() : 갯수
 *                     get() : 데이터 읽기
 *                     clear() : 전체 삭제
 *                     isEmpty() : 존재여부 확인 
 *             Map : 키, 값을 동시에 저장
 *                   키는 중복할 수 없다, 값을 중복이 가능
 *                   HashMap : 클래스를 모아서 관리 , 웹에 전송 , 웹에서 응답 , 쿠키 저장 , 세션에 저장 
 *                   -------  ?page=1
 *                    put(키,값) : 추가
 *                    size() : 저장 갯수
 *                    get() : 데이터 읽기
 *                    clear() 
 *                    isEmpty()
 *                    
 *           **** 저장된 데이터형 => 프로그래머가 어떤 데이터를 저장할지 모른다
 *                              ------------------------------
 *                               => 어떤 데이터든 상관없이 받을 수 있게 제장 => Object
 *                               => 리턴형 / 매개변수 => Object로 되어 있다
 *                                                  -------
 *                                                  | 가장 큰 데이터형이다 => 형변환을 해서 사용
 *           **** Object를 전체 변경이 가능하게 만든다 (프로그램에 맞는 데이터형으로 변경)
 *                => 데이터형을 통일화
 *                => 가독성 => 데이터 확인이 가능
 *                => 형변환이 없기 때문에 간결
 *                => 제네릭
 *                   <클래스> => <int>(X) => <Integer>
 *           컬렉션은 => 제네릭을 이용해서 제어한다
 *                                                                                                                
 *          
 *       java.text
 *          DecimalFormat : 숫자 변환  new DecimalFormat("##,###,###,###")
 *          SimpleDateFormat : 날짜 변환 new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
 *          -------------------- format() : 변경
 *          String.format("%d%d",1,2) => printf()와 동일
 *                 ------------------
 *       java.io : 입출력
 *          FileInputStream / FileOutputStream => 다운로드 / 업로드
 *          FileReader / FileWriter => 파일에 한글이 있는 경우에 제어
 *          BufferedReader / BufferedWriter => 메모리에 파일의 내용을 읽어놓고 제어 
 *          ------------------------------- 제어 속도가 빠르다 ...
 *             read()/close()    write()
 *             
 *             ==> -1 : EOF (파일의 끝)
 *       *****java.sql
 *            1. 드라이버 등록
 *               Class.forName(드라이버명)
 *            2. 오라클 연결 
 *               Connection
 *            3. 오라클로 명령어 전송 : 오라클을 배우는 것이 아니라 => 자바에서 오라클을 제어하는 언어를 배운다 
 *                     -----
 *                      SQL : 구조화된 질의 언어 
 *                     -----
 *                       -----------------------------------
 *                       DML
 *                         데이터 조작언어 => 프로그래머가 주로 사용
 *                       -----------------------------------
 *                            DBA => 담당 
 *                       DDL
 *                         정의 언어
 *                       DCL
 *                         제어 언어
 *                       -----------------------------------
 *                       TCL
 *                         트랜잭션 언어 (일괄처리)
 *                       -----------------------------------
 *               PreparedStatement
 *            4. 결과값 얻기
 *               ResultSet
 *          -----------------------------              
 *       -------------------------------- javax.servlet.http.... JSP
 *       -------------------------------- org.springframework... Spring 
 */
class Sawon
{
	// static보다 => instance를 사용해야 편리하다
	// static은 공통메소드
	// 인스턴스 => 멤버메소드 => 멤버는 멤버만 사용이 가능하게 만든다 
	// => 윈도우 => this
	int sabun;
	String name;
	public static void setData(Sawon s) // static에서는 동일한 객체를 사용하기 위해서 매개변수를 이용해서 
	{
		s.sabun=10;
		s.name="홍길동";
	}
	public Sawon()
	{
		setData(this);
	}
}
public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon ss=new Sawon();
        ss.setData(ss);
        System.out.println("ss.sabun="+ss.sabun);// 0
        System.out.println("ss.name="+ss.name);// null
	}

}
