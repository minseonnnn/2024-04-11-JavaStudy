<<<<<<< HEAD
/*
 *  여러줄 주석
 *  2page
 *    자바언어의 특징
 *     1) 프로그램 언어 실행하는 방식
 *        = 컴파일 방식 => 컴퓨터가 인식하는 언어로 변경 (2진파일 => 0,1)
 *          class MainClass
 *          {
 *             public static void main(String[] args) {
 *             }
 *          }
 *          
 *          010010010
 *          001011001
 *          000110111
 *          
 *          'A'  =>  65   100001           
 *          => 프로그램 언어 => 컴파일 방식을 이용
 *             C/C++ , C#, Java
 *                           |     
 *                          One Write
 *          = 인터프리터 방식 : 한줄씩 번역해서 처리
 *             HTML / CSS                
 *          = 컴파일 / 인터프리터를 동시에 사용 => 보안 (소스검증)
 *            --------------
 *            | 제임스 고슬링 => 자바언어는 절대 보안 노출되지 않는다 
 *            
 *            자바소스 (.java)
 *              |
 *             JVM ==> .class 번역 
 *              |
 *          ---------------------------
 *          |     |      |     |      |
 *        리눅스  유닉스  솔라리스  Mac  Windows  => 동일한 실행 결과
 *        ==================================================      
 *          
 *        java ==> class
 *        
 *        ===> 실행 과정
 *        A.java 파일 만들기
 *          | javac
 *        A.class 생성
 *          |
 *        실행 결과    
 *          
 *       6page 개발환경 구축
 *       1) JDK => 17버전 => jdk17.0.2 => jdk.java.net/14
 *          * 높은 버전에서는 실행 => 낮은 버전에서는 실행이 안된다
 *          * 실무 : jdk1.8 (SUN의 마지막 버전) => 호환성이 좋다
 *          * Spring-Boot : 17ver이상
 *            SpringFramework : 14ver이하 *****
 *          * 오픈소스를 이용 => 호환성 => 단점
 *       2) 환경설정 
 *          => classpath : 라이브러리 읽기 => .;c:\jdk-17.0.2\lib
 *          => path      : 실행바일 등록 =>  c:\jdk-17.0.2\bin
 *       3) 11page => 편집기
 *                       | eclipse => eclipse.org => 최신
 *                         => Back-End
 *                       | 인텔리J 
 *                         => FullStack => 최근에 트라이얼로 변경
 *          = 프로젝트 폴더 만들기
 *          = src에 자바 클래스 생성
 *            ------------------
 *            주의점)
 *                 1. 파일명과 클래스명이 동일
 *                 2. 대소문자를 구분
 *                 3. 명령문(CPU) => 끝나면 반드시 ;
 *                 4. 클리스 영문 외에 한글 사용이 가능 -> 
 *                    리눅스나 다른 운영체제에서는 한글 인식이 안될 때도 있다(권장:영문)
 *               --------------------------------------------------------
 *               = 문법은 아니고 약솟 사항
 *                 1) 클래스명은 대문자로 시작
 *                    MainClass
 *                    -   -
 *                 2) 변수 : 소문자 시작
 *                          id, password 
 *                 3) 상수 : 모든 단어를 대문자로 한다
 *                          ID, PASSWORD
 *                 4) 메소드 : 소문자 시작 
 *                 
 *               --------------------------------------------------------
 *               모든 자바파일 실행 시에는 만드시 main()
 *                                        ------- 실행 시작점 / 종료점
 *               주석 : ctrl+shift+/
 *                     ctrl+shift+\
 *                     --------------
 *               자바의 구성요소
 *               class className => 클래스 시작
 *               {
 *                 public static void main(String[] arg) => 프로그램 시작점 
 *                 {
 *                 
 *                 }
 *               }                                  
 *               객체 지향 프로그램 (5장)   
 *               ----------- class ----------    
 *               
 *               ----------------------------
 *                => 변수
 *               ----------------------------
 *                => 생성자
 *               ----------------------------
 *                => 메소드
 *               ----------------------------
 *               
 *               ----------------------------
 *           
 *          
 *          
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
=======
/*
 *  여러줄 주석
 *  2page
 *    자바언어의 특징
 *     1) 프로그램 언어 실행하는 방식
 *        = 컴파일 방식 => 컴퓨터가 인식하는 언어로 변경 (2진파일 => 0,1)
 *          class MainClass
 *          {
 *             public static void main(String[] args) {
 *             }
 *          }
 *          
 *          010010010
 *          001011001
 *          000110111
 *          
 *          'A'  =>  65   100001           
 *          => 프로그램 언어 => 컴파일 방식을 이용
 *             C/C++ , C#, Java
 *                           |     
 *                          One Write
 *          = 인터프리터 방식 : 한줄씩 번역해서 처리
 *             HTML / CSS                
 *          = 컴파일 / 인터프리터를 동시에 사용 => 보안 (소스검증)
 *            --------------
 *            | 제임스 고슬링 => 자바언어는 절대 보안 노출되지 않는다 
 *            
 *            자바소스 (.java)
 *              |
 *             JVM ==> .class 번역 
 *              |
 *          ---------------------------
 *          |     |      |     |      |
 *        리눅스  유닉스  솔라리스  Mac  Windows  => 동일한 실행 결과
 *        ==================================================      
 *          
 *        java ==> class
 *        
 *        ===> 실행 과정
 *        A.java 파일 만들기
 *          | javac
 *        A.class 생성
 *          |
 *        실행 결과    
 *          
 *       6page 개발환경 구축
 *       1) JDK => 17버전 => jdk17.0.2 => jdk.java.net/14
 *          * 높은 버전에서는 실행 => 낮은 버전에서는 실행이 안된다
 *          * 실무 : jdk1.8 (SUN의 마지막 버전) => 호환성이 좋다
 *          * Spring-Boot : 17ver이상
 *            SpringFramework : 14ver이하 *****
 *          * 오픈소스를 이용 => 호환성 => 단점
 *       2) 환경설정 
 *          => classpath : 라이브러리 읽기 => .;c:\jdk-17.0.2\lib
 *          => path      : 실행바일 등록 =>  c:\jdk-17.0.2\bin
 *       3) 11page => 편집기
 *                       | eclipse => eclipse.org => 최신
 *                         => Back-End
 *                       | 인텔리J 
 *                         => FullStack => 최근에 트라이얼로 변경
 *          = 프로젝트 폴더 만들기
 *          = src에 자바 클래스 생성
 *            ------------------
 *            주의점)
 *                 1. 파일명과 클래스명이 동일
 *                 2. 대소문자를 구분
 *                 3. 명령문(CPU) => 끝나면 반드시 ;
 *                 4. 클리스 영문 외에 한글 사용이 가능 -> 
 *                    리눅스나 다른 운영체제에서는 한글 인식이 안될 때도 있다(권장:영문)
 *               --------------------------------------------------------
 *               = 문법은 아니고 약솟 사항
 *                 1) 클래스명은 대문자로 시작
 *                    MainClass
 *                    -   -
 *                 2) 변수 : 소문자 시작
 *                          id, password 
 *                 3) 상수 : 모든 단어를 대문자로 한다
 *                          ID, PASSWORD
 *                 4) 메소드 : 소문자 시작 
 *                 
 *               --------------------------------------------------------
 *               모든 자바파일 실행 시에는 만드시 main()
 *                                        ------- 실행 시작점 / 종료점
 *               주석 : ctrl+shift+/
 *                     ctrl+shift+\
 *                     --------------
 *               자바의 구성요소
 *               class className => 클래스 시작
 *               {
 *                 public static void main(String[] arg) => 프로그램 시작점 
 *                 {
 *                 
 *                 }
 *               }                                  
 *               객체 지향 프로그램 (5장)   
 *               ----------- class ----------    
 *               
 *               ----------------------------
 *                => 변수
 *               ----------------------------
 *                => 생성자
 *               ----------------------------
 *                => 메소드
 *               ----------------------------
 *               
 *               ----------------------------
 *           
 *          
 *          
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
