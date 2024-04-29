/*
 *    클래스
 *    -----
 *     구성요소
 *      class ClassName
 *      {
 *         ---------------
 *          변수 ================> 클래스 전체 (전역변수)
 *           = 멤버변수
 *           = 공유변수
 *           = 메소드안에 선언되는 변수 => 매개변수 , 지역변수
 *           = 객체지향 프로그램 핵심 => 캡슐화 (데이터 보호) 
 *         ---------------
 *          생성자 : 변수의 초기화 , 클래스 저장시에 호출
 *                => 필요시에만 사용
 *         ---------------
 *          메소드 : 기능 수행 ==> 수정 (오버라이딩) => 가독성 => 유지보수
 *                예) 게시판
 *                   = 글쓰기
 *                   = 상세보기
 *                   = 조회수 증가
 *                   = 수정
 *                   = 추가
 *                   = 삭제
 *                   = 검색
 *         ---------------
 *      }
 *      
 *      = 기존의 프로그램을 기능별로 나눠서 작업(분업화)
 *                                   ------ 메소드
 *      = 메소드는 반드시 한개의 기능만 수행 => 재사용하기 편리하다
 *                   -------------
 *       예) 게시판 + 댓글 (X) => 게시판 / 댓글
 *       모든 프로그램 세분화
 *       --------------
 *       1. 입력
 *       2. 처리
 *       3. 출력 
 *       -------------- 
 *       메소드 
 *         = 선언부 => 추상메소드
 *           접근지정어
 *             전체 프로그램에 사용 => public
 *             상속받은 클래스 => protected
 *             같은 폴더까지 => default
 *             -------------------------
 *             클래스안에서 접근 => private
 *           옵션
 *            공유하는 메소드 : static => 자동 메모리에 저장 
 *                         -------
 *            선언하는 메소드 : abstract
 *            수정할 수 없는 메소드 : final
 *           리턴형 : 사용자 요청에 따른 처리 후 결과값
 *             기본형 (byte , int , char , String , double , long)
 *             => 결과값이 1개일때 사용
 *             배열 => 결과값이 여러개 있는 경우 => sort 
 *             클래스 => 일반 웹 => 상세보기 
 *             *** 결과값 없이 메소드 자체 처리 => 결과값 없다 (void)
 *           메소드명 : 변수 식별자와 동일
 *                   ** 소문자로 시작한다
 *           매개변수 : 사용자가 보내준 값 (요청)
 *           ------ 여러개 사용이 가능 
 *                  => 기본형 , 배열 , 클래스
 *                           -----------
 *                           매개변수가 33개 이상이면 사용
 *           [접근지정어][옵션] 리턴형 메소드명(매개변수...)
 *                         -----
 *         = 구현부 => 일반메소드                    
 *           {
 *              구현부
 *              => 반드시 결과값을 보내준다
 *              return 값;
 *                     --
 *           }      
 *         = 메소드 사용하는 목적
 *           1. main에 소스 코딩 => 한번 쓰고 버린다 (절차적 언어)
 *           ==> 재사용 (수정 편리) *********
 *               사이트 기능 => 게시판 , 공지사항 , 회원가입 , 예약 , 결재
 *                           장바구니 ==> JSP ==> 2003
 *                           => 1차 
 *                           2차 => 재사용 (보안...)
 *                           --------------------
 *               자바 == 오라클 = HTML/CSS = JavaScript
 *               JSP == Spring = 파이썬 = AWS
 *                                 
 *               -----------------------------------
 *               
 *               MyBatis / JPA / Ajax / VueJS / React / Redux / Next
 *               ----------------------------------------------------
 *               | Spring-Boot / MSA             
 *                           
 *           ==> 가독성
 *           ==> 중복코드 제거
 *     
 *     1. 원형
 *     리턴형 메소드명(매개변수) => 라이브러리 => 기능           
 *     ---- ----- ------     --------------
 *     
 *     2. 유형
 *     --------------
 *       리턴형 매개변수
 *     --------------
 *        O     O  => String
 *                    String substring(int start)
 *                    ------           ----------
 *     --------------
 *        O     X  => String trim() => 공백만 제거
 *                    double random() => 임의의 수 추출
 *     --------------
 *        X     O  => void print("")
 *     --------------
 *        X     X  => 빈도수가 거의 없다
 *                    다음줄
 *                    System.out.println()
 *     --------------
 *       ** 리턴형이 없는 경우에는 메소드 자체 처리
 *          => 출력할 경우
 *          => 브라우저나 핸드폰에 전송 => 리턴형 
 *          => 리턴형 => 오라클 자체 처리 (Insert,Update,Delete)
 *          
 */
// 2단 ~ 9단까지 구구단 출력 
public class 메소드_1 {
    static void gugudan()
    {
    	for(int i=1;i<=9;i++) // 줄수
    	{
    		for(int j=2;j<=9;j++) // 출력 => 구구단
    		{
    			System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
    		}
    		System.out.println();
    	}
    }
    /*
     *    void aaa();
     *      => aaa()
     *    int bbb(int a);
     *    ----    ------> a=10
     *      => int a=bbb(10)
     *         -----    ----
     *    void ccc(char c);
     *      => ccc('A')
     *    double rand(int num)
     *    ------
     *      => double d=rand(3)
     *         -------- 리턴한 값을 받는다 (데이터형 일치)
     *    String getName()
     *      => String name=getName()
     *    String setName(String name)
     *      => String name=setName("홍길동")
     *      
     *    ** 메소드는 호출시에 무조건 메소드의 시작부터 끝까지 수행한다
     *                   -----       ---------------
     *       메소드()
     *       {
     *         --------
     *         
     *         --------
     *       } 
     *       
     *       수행이 종료가 되면 호출된 위치로 복귀                
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan();// 호출 => 메소드명(실제 값)
		

	}

}
