<<<<<<< HEAD
package com.sist.chapter05;
/*
 *    변수 : 한개 저장 메모리 공간
 *     = 데이터형
 *         정수 : int , long , 배열(byte) => 네트워크 전송 , 파일읽기
 *         실수 : double
 *         논리 : boolean
 *         문자열 : String 
 *         => 사용자 정의 클래스 
 *         -------------------- 조합 
 *     = 배열 => 같은 데이터형의 변수 여러개를 한번에 저장 (이름이 한개) => 인덱스 (0...)
 *              같은 데이터형만 모아서 관리 / 저장갯수를 지정 (고정)
 *     = 클래스 => 다른 데이터형을 저장할 수 있다
 *               저장 갯수를 지정하지 않는다
 *               => 필요한 갯수만큼 new를 사용한다         
 *               => 한개에 대한 정보 
 *                  --- => new => 메모리에 저장 
 *                  영화정보 / 뮤직정보 ....
 *    -------------------------------------------------------------------
 *      연산처리 / 제어문
 *      ------------- 메소드 (기능처리) 
 *      프로그램은 묶음 => 다음 다시 활용 (재사용)
 *       => 변수 : 배열 / 클래스
 *       => 연산/제어문 => 명령문 => 메소드
 *       => 변수 => 초기화 (생성자)
 *       
 *      클래스 구성 요소
 *      1. 변수 (멤버변수)
 *         --------------------
 *      2. 메소드 => 변수에 대한 활용
 *      3. 생성자 => 변수에 초기화
 *      -----------------------
 *      
 *      클래스는 한가지 기능 => 프로그램에서는 여러기능이 필요
 *       => 클래스 여러개를 만든다
 *          --------- 연결 => 접근의 범위 (접근 지정어)
 *    -------------------------------------------------------------------
 *    재사용 기법
 *    --------
 *      = 상속 (변경해서 사용)
 *      class A
 *      class B extends A   => is-a
 *              -------
 *      class C
 *      {
 *         A a=new A();     => has-a
 *      }        
 *      = 포함 (있는 그대로)
 *      
 *      = 필요시에는 변경 / 새로운 기능 추가 => 유지보수
 *        오버라이딩       오버로딩 
 *    --------------------------------------- 객체지향의 3대 특성
 *        1. 캡슐화 : 데이터 보호 
 *        2. 상속/포함 : 재사용
 *        3. 다형성 : 오버라이딩 / 오버로딩
 *                  -------   -----
 *                  | 수정     | 새로운 기능
 *                    modify    new
 *        4. 추상화 : 사물을 단순화 => 클래스의 기본
 *           사원
 *            = 사번 , 이름 , 부서
 *           학번
 *            = 학번 , 이름 , 학교
 *           계산기 
 *            = 정수/정수 , 연산자
 *              ------- 문자열   
 *    --------------------------------------- 클래스의 종류
 *       일반 클래스
 *       추상 클래스 / 인터페이스 : 미완성 => 개발자가 완성해서 사용
 *         => 설계 
 *         => 게시판 만들어라
 *         => 게시판을 만드는데
 *            글쓰기
 *            상세보기
 *            찾기
 *            추가
 *            수정
 *            삭제
 *            
 *       ------------------
 *       메소드가 미구현 : 프로그램에 맞게 구현해서 사용 
 *       => 버튼 클릭 
 *       
 *    -------------------------------------- 프로그램의 안전성 => 종료하지 않는 프로그램 => 예외처리 (8장)
 *       라이브러리 => 조립 => 암기
 *       Math => random() ceil()
 *       => Class => 3~4
 *       => collection  
 *    ----------------------------
 *    
 *     세부적
 *      클래스 : 변수 , 메소드 , 생성자 , 접근지정어
 *             ---   ----   ----   ------
 *                                  private / public
 *                                  변수 => private
 *                                  나머지 => public
 *                           생성자 , 초기화 블록 => 동시에 사용하지는 않는다
 *                    인스턴스 메소드
 *                    static 메소드
 *                    선언만 하는 메소드
 *              인스턴스 변수
 *              static 변수
 *              지역변수 
 *              
 *       클래스의 구성 요소 : 무조건 다 사용하는 것은 아니다 
 *       ------------- 필요한 것만 사용한다 
 *       
 *       ** 순서는 상관없다
 *          권장사항
 *           => 변수
 *           => 생성자
 *           => 메소드
 *       class ClassName
 *       {
 *           -----------변수 선언-------------
 *            [접근지정어][옵션] 데이터형 변수명 => 노출방지 
 *            ---------
 *            private 
 *            옵션 
 *            static : 공통적인 
 *            final : 마지막 (보통 상수설정시 사용)
 *            abstract : 추상적인 , 구현이 안된 ... (메소드에서 사용)
 *            synchronized : 동기적인 (메소드에서 사용)
 *            
 *            인스턴스 변수 => 여러개를 동시에 저장 => new를 이용해서 생성 (new이용하면 메모리 공간이 따로 생성) => heap
 *                         영화정보 / 음악정보 ...
 *            정적변수 (static) => 공통으로 사용되는 변수 => Method Area => 메모리 공간을 한개만 사용 
 *                              전체 데이터 목록                       -------------------
 *                              학교명 / 학원명 / 사이트명 ....
 *            ****** 대부분은 인스턴스변수를 사용한다 
 *            *** 사용할 수 있는 변수
 *                = 기본형
 *                = 배열
 *                = 클래스 
 *            *** 클래스안에서는 변수가 없는 경우도 있다 (필요한 경우에만 사용)
 *            
 *            *** 변수 => 저장할때 반드시 값을 필요로 한다
 *                      -------------- 초기값
 *            클래스 영역에 설정되는 변수는 자동 초기값
 *            -----------------------------
 *              int = 0 , long = 0L , double = 0.0 , boolean = false , String(클래스) = null
 *              => 프로그램에 따라서 => 다른 초기값이 필요할 수도 있다 
 *              => int a=100; => 명시적인 초기화 
 *              => int a=난수발생 , 파일읽기 , 사용자 입력값 
 *                       --------------------------
 *                        클래스 블록에서는 사용이 불가능 (선언만 가능 => 구현이 불가능)                                 
 *           -----------생성자 선언------------
 *            => 명시적인 초기화가 안되는 경우 => 구현해서 값을 가지고 오는 경우 
 *            => 멤버변수의 초기화 
 *            => 시작과 동시에 처리하는 명령문이 존재할때 
 *               화면 UI / 자동 로그인 / 서버에 연결 / 서버 가동 / 데이터베이스 연결 
 *            => 없는 경우에는 생략할 수 있다 : 프로그램 구동시에는 반드시 생성자가 필요하다
 *                                      -------------------------------
 *                                        => 컴파일러에 의해 자동 추가 (디폴트 생성자)
 *                                                              ----------- 매개변수가 없는 생성자 
 *            => 특징
 *                = 클래스명과 동일
 *                = 리턴형이 없다 
 *                = 객체 생성시에 호출 => new를 동반한다
 *                = 여러개의 생성자를 만들 수 있다
 *                  ----------
 *                     같은 이름의 메소드를 제작 => 오버로딩
 *                     => 중복 함수 정의(오버로딩)
 *                     => 구분 => 매개변수로 구분
 *                              -------
 *                              1. 갯수가 다르다
 *                              2. 데이터형이 다르다
 *                              --------------------> JVM이 알아서 찾아준다
 *                     => 접근지정어 / 리턴형은 관계없다          
 *                     class A
 *                     {

 *                     }       
 *                     
 *                     new A(); // 생성자 호출 
 *                     
 *                => 오버로딩
 *                   void display(int a, char c, double d)                                                  
 *                  ^ void display(double a, char c, int b)
 *                   void display(double a, double b, double c)
 *                   void display(char a, int d, int b)
 *                   
 *                   display (10.5,'A',10) double char int 
 *                   해당 매개변수가 없는 경우 => 가장 가까운 메개변수를 찾아준다
 *                                                              
 *                   
 *                   class A
 *                   {
 *                      public void display(){}
 *                   }                         
 *                   
 *                   A a=new A()
 *                   a.display()
 *                   -----------
 *                   
 *                   new A().display()
 *                   
 *              ** 생성자는 다른 클래스에 연결시에 사용한다 => public 
 *              ** 객체지향 프로그램은 클래스 1개로 제작하는 것이 아니라 클래스 여러개를 만들어서 연결 
 *                               -----
 *                               클래스 => 레고블록 (부품)    
 *                                            
 *           -----------메소드 선언------------
 *             = 인스턴스 메소드
 *             public 리턴형 메소드명(매개변수목록) => 객체명.메소드명
 *             {
 *             }
 *             = 정적 메소드
 *             public static 리턴형 메소드명(매개변수목록) => 클래스명.메소드명
 *             {
 *             }
 *             
 *             = 추상 메소드
 *             public 리턴형 메소드명(매개변수목록); => 호출이 불가능 => 구현후에 사용
 *             
 *              = 기능 구현 => 사용자 입력을 받는 경우 : 매개변수 , 요청처리에 대한 결과 : 리턴형
 *                                                                       ---- void
 *                                                                       => 메소드 자체 처리
 *                => 입력값
 *                => 요청처리
 *                => 결과값
 *                
 *                => 게시판 
 *                    = 글쓰기
 *                    = 수정하기
 *                    = 목록출력
 *                    = 상세보기
 *                    = 삭제하기
 *                    = 검색하기
 *                    => 답하기 ==> 게시판을 상속 => 확장할 수 있다
 *                                             --- extends
 *                    => 댓글 
 *           -------------------------------
 *       }             
 *       
 *       접근지정어
 *       ------- private / public 
 *               | 멤버변수   | 생성자 , 클래스 , 메소드 => 공개 .. // 167page 24.05.10
 *                              
 *      
 *      
 */
public class 클래스_1 {
	/*static void display(char a)
	{
		System.out.println("char");
	}
	static void display(int a)
	{
		System.out.println("int");
	}*/
    void display(double d)
    {
    	System.out.println("display call...");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		클래스_1 a=new 클래스_1();
		//     - ------------- 동일   
		a.display(100);
		new 클래스_1().display(100);
		new 클래스_1().display('A');

		int aa=10;
		System.out.println(aa);
		System.out.println(10);
	}

}
=======
package com.sist.chapter05;
/*
 *    변수 : 한개 저장 메모리 공간
 *     = 데이터형
 *         정수 : int , long , 배열(byte) => 네트워크 전송 , 파일읽기
 *         실수 : double
 *         논리 : boolean
 *         문자열 : String 
 *         => 사용자 정의 클래스 
 *         -------------------- 조합 
 *     = 배열 => 같은 데이터형의 변수 여러개를 한번에 저장 (이름이 한개) => 인덱스 (0...)
 *              같은 데이터형만 모아서 관리 / 저장갯수를 지정 (고정)
 *     = 클래스 => 다른 데이터형을 저장할 수 있다
 *               저장 갯수를 지정하지 않는다
 *               => 필요한 갯수만큼 new를 사용한다         
 *               => 한개에 대한 정보 
 *                  --- => new => 메모리에 저장 
 *                  영화정보 / 뮤직정보 ....
 *    -------------------------------------------------------------------
 *      연산처리 / 제어문
 *      ------------- 메소드 (기능처리) 
 *      프로그램은 묶음 => 다음 다시 활용 (재사용)
 *       => 변수 : 배열 / 클래스
 *       => 연산/제어문 => 명령문 => 메소드
 *       => 변수 => 초기화 (생성자)
 *       
 *      클래스 구성 요소
 *      1. 변수 (멤버변수)
 *         --------------------
 *      2. 메소드 => 변수에 대한 활용
 *      3. 생성자 => 변수에 초기화
 *      -----------------------
 *      
 *      클래스는 한가지 기능 => 프로그램에서는 여러기능이 필요
 *       => 클래스 여러개를 만든다
 *          --------- 연결 => 접근의 범위 (접근 지정어)
 *    -------------------------------------------------------------------
 *    재사용 기법
 *    --------
 *      = 상속 (변경해서 사용)
 *      class A
 *      class B extends A   => is-a
 *              -------
 *      class C
 *      {
 *         A a=new A();     => has-a
 *      }        
 *      = 포함 (있는 그대로)
 *      
 *      = 필요시에는 변경 / 새로운 기능 추가 => 유지보수
 *        오버라이딩       오버로딩 
 *    --------------------------------------- 객체지향의 3대 특성
 *        1. 캡슐화 : 데이터 보호 
 *        2. 상속/포함 : 재사용
 *        3. 다형성 : 오버라이딩 / 오버로딩
 *                  -------   -----
 *                  | 수정     | 새로운 기능
 *                    modify    new
 *        4. 추상화 : 사물을 단순화 => 클래스의 기본
 *           사원
 *            = 사번 , 이름 , 부서
 *           학번
 *            = 학번 , 이름 , 학교
 *           계산기 
 *            = 정수/정수 , 연산자
 *              ------- 문자열   
 *    --------------------------------------- 클래스의 종류
 *       일반 클래스
 *       추상 클래스 / 인터페이스 : 미완성 => 개발자가 완성해서 사용
 *         => 설계 
 *         => 게시판 만들어라
 *         => 게시판을 만드는데
 *            글쓰기
 *            상세보기
 *            찾기
 *            추가
 *            수정
 *            삭제
 *            
 *       ------------------
 *       메소드가 미구현 : 프로그램에 맞게 구현해서 사용 
 *       => 버튼 클릭 
 *       
 *    -------------------------------------- 프로그램의 안전성 => 종료하지 않는 프로그램 => 예외처리 (8장)
 *       라이브러리 => 조립 => 암기
 *       Math => random() ceil()
 *       => Class => 3~4
 *       => collection  
 *    ----------------------------
 *    
 *     세부적
 *      클래스 : 변수 , 메소드 , 생성자 , 접근지정어
 *             ---   ----   ----   ------
 *                                  private / public
 *                                  변수 => private
 *                                  나머지 => public
 *                           생성자 , 초기화 블록 => 동시에 사용하지는 않는다
 *                    인스턴스 메소드
 *                    static 메소드
 *                    선언만 하는 메소드
 *              인스턴스 변수
 *              static 변수
 *              지역변수 
 *              
 *       클래스의 구성 요소 : 무조건 다 사용하는 것은 아니다 
 *       ------------- 필요한 것만 사용한다 
 *       
 *       ** 순서는 상관없다
 *          권장사항
 *           => 변수
 *           => 생성자
 *           => 메소드
 *       class ClassName
 *       {
 *           -----------변수 선언-------------
 *            [접근지정어][옵션] 데이터형 변수명 => 노출방지 
 *            ---------
 *            private 
 *            옵션 
 *            static : 공통적인 
 *            final : 마지막 (보통 상수설정시 사용)
 *            abstract : 추상적인 , 구현이 안된 ... (메소드에서 사용)
 *            synchronized : 동기적인 (메소드에서 사용)
 *            
 *            인스턴스 변수 => 여러개를 동시에 저장 => new를 이용해서 생성 (new이용하면 메모리 공간이 따로 생성) => heap
 *                         영화정보 / 음악정보 ...
 *            정적변수 (static) => 공통으로 사용되는 변수 => Method Area => 메모리 공간을 한개만 사용 
 *                              전체 데이터 목록                       -------------------
 *                              학교명 / 학원명 / 사이트명 ....
 *            ****** 대부분은 인스턴스변수를 사용한다 
 *            *** 사용할 수 있는 변수
 *                = 기본형
 *                = 배열
 *                = 클래스 
 *            *** 클래스안에서는 변수가 없는 경우도 있다 (필요한 경우에만 사용)
 *            
 *            *** 변수 => 저장할때 반드시 값을 필요로 한다
 *                      -------------- 초기값
 *            클래스 영역에 설정되는 변수는 자동 초기값
 *            -----------------------------
 *              int = 0 , long = 0L , double = 0.0 , boolean = false , String(클래스) = null
 *              => 프로그램에 따라서 => 다른 초기값이 필요할 수도 있다 
 *              => int a=100; => 명시적인 초기화 
 *              => int a=난수발생 , 파일읽기 , 사용자 입력값 
 *                       --------------------------
 *                        클래스 블록에서는 사용이 불가능 (선언만 가능 => 구현이 불가능)                                 
 *           -----------생성자 선언------------
 *            => 명시적인 초기화가 안되는 경우 => 구현해서 값을 가지고 오는 경우 
 *            => 멤버변수의 초기화 
 *            => 시작과 동시에 처리하는 명령문이 존재할때 
 *               화면 UI / 자동 로그인 / 서버에 연결 / 서버 가동 / 데이터베이스 연결 
 *            => 없는 경우에는 생략할 수 있다 : 프로그램 구동시에는 반드시 생성자가 필요하다
 *                                      -------------------------------
 *                                        => 컴파일러에 의해 자동 추가 (디폴트 생성자)
 *                                                              ----------- 매개변수가 없는 생성자 
 *            => 특징
 *                = 클래스명과 동일
 *                = 리턴형이 없다 
 *                = 객체 생성시에 호출 => new를 동반한다
 *                = 여러개의 생성자를 만들 수 있다
 *                  ----------
 *                     같은 이름의 메소드를 제작 => 오버로딩
 *                     => 중복 함수 정의(오버로딩)
 *                     => 구분 => 매개변수로 구분
 *                              -------
 *                              1. 갯수가 다르다
 *                              2. 데이터형이 다르다
 *                              --------------------> JVM이 알아서 찾아준다
 *                     => 접근지정어 / 리턴형은 관계없다          
 *                     class A
 *                     {

 *                     }       
 *                     
 *                     new A(); // 생성자 호출 
 *                     
 *                => 오버로딩
 *                   void display(int a, char c, double d)                                                  
 *                  ^ void display(double a, char c, int b)
 *                   void display(double a, double b, double c)
 *                   void display(char a, int d, int b)
 *                   
 *                   display (10.5,'A',10) double char int 
 *                   해당 매개변수가 없는 경우 => 가장 가까운 메개변수를 찾아준다
 *                                                              
 *                   
 *                   class A
 *                   {
 *                      public void display(){}
 *                   }                         
 *                   
 *                   A a=new A()
 *                   a.display()
 *                   -----------
 *                   
 *                   new A().display()
 *                   
 *              ** 생성자는 다른 클래스에 연결시에 사용한다 => public 
 *              ** 객체지향 프로그램은 클래스 1개로 제작하는 것이 아니라 클래스 여러개를 만들어서 연결 
 *                               -----
 *                               클래스 => 레고블록 (부품)    
 *                                            
 *           -----------메소드 선언------------
 *             = 인스턴스 메소드
 *             public 리턴형 메소드명(매개변수목록) => 객체명.메소드명
 *             {
 *             }
 *             = 정적 메소드
 *             public static 리턴형 메소드명(매개변수목록) => 클래스명.메소드명
 *             {
 *             }
 *             
 *             = 추상 메소드
 *             public 리턴형 메소드명(매개변수목록); => 호출이 불가능 => 구현후에 사용
 *             
 *              = 기능 구현 => 사용자 입력을 받는 경우 : 매개변수 , 요청처리에 대한 결과 : 리턴형
 *                                                                       ---- void
 *                                                                       => 메소드 자체 처리
 *                => 입력값
 *                => 요청처리
 *                => 결과값
 *                
 *                => 게시판 
 *                    = 글쓰기
 *                    = 수정하기
 *                    = 목록출력
 *                    = 상세보기
 *                    = 삭제하기
 *                    = 검색하기
 *                    => 답하기 ==> 게시판을 상속 => 확장할 수 있다
 *                                             --- extends
 *                    => 댓글 
 *           -------------------------------
 *       }             
 *       
 *       접근지정어
 *       ------- private / public 
 *               | 멤버변수   | 생성자 , 클래스 , 메소드 => 공개 .. // 167page 24.05.10
 *                              
 *      
 *      
 */
public class 클래스_1 {
	/*static void display(char a)
	{
		System.out.println("char");
	}
	static void display(int a)
	{
		System.out.println("int");
	}*/
    void display(double d)
    {
    	System.out.println("display call...");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		클래스_1 a=new 클래스_1();
		//     - ------------- 동일   
		a.display(100);
		new 클래스_1().display(100);
		new 클래스_1().display('A');

		int aa=10;
		System.out.println(aa);
		System.out.println(10);
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
