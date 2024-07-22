/*
 *    1) 형식
 *    2) 동작 순서 ==> 이미지
 *    3) 출력물 
 *    -------------
 *    조건문 : 프로그램을 제어 => 사용자 입력 => 처리 (검색) , 맛집, 여행지, 우편번호 
 *      = 단일조건문
 *        if => 단독으로 사용 
 *        형식) 
 *             if(조건문) => 부정연산자, 비교연산자, 논리연산자 => 결과값:true/false
 *             {
 *                조건이 true일 경우에 처리하는 문장
 *             }
 *             false => 건너뛴다 
 *             예) 검색어가 없다 , 없는 페이지 ...
 *      = 선택조건문
 *        두개를 나눠서 처리 => true/false
 *        예) 로그인 처리
 *           로그인된 경우 / 로그인이 안된 경우 
 *           아이디 중복 / 아이디 중복(X)
 *           -----------------------
 *           *** 프로그램 : 웹 (사용자에게 뭔가를 보여준다)
 *        형식) 
 *             if(조건문)
 *             {
 *                조건 => 로그인된 경우 => main으로 이동
 *                 |
 *                true 
 *             }
 *             else
 *             {
 *                조건 => 로그인이 안된 경우 => 다시 로그인처리
 *                 |
 *               false일 경우   
 *             }   
 *             *** 가장 많이 사용되는 조건문 
 *      = 다중조건문 : 조건에 맞는 경우에만 1번 수행 
 *        => 메뉴 , 화면 이동
 *        형식) 
 *             if(조건문)
 *             {
 *                조건이 true일 경우에 수행 ==> 종료
 *             }  false일때
 *                      |
 *             else if(조건문)
 *             {
 *                조건이 true일 경우에 수행 ==> 종료
 *             }  false일때
 *                      |
 *             else if(조건문)
 *             {
 *                조건이 true일 경우에 수행 ==> 종료
 *             }  false일때
 *                      |
 *             else
 *             {
 *                생략이 가능
 *                조건이 없는 경우에 무조건 수행
 *             }
 *             ------------------------------
 *             1개의 조건만 수행
 *             => 여러개의 조건을 수행 => 단일 조건문을 여러개 사용 
 *    반복문 :  여러개의 반복적인 소스코딩이 있는 경우 사용 
 *             => 상품 목록 , 영화 목록 ...
 *                출력내용이 같은 겻이 아니라 => 출력 형식이 같은 경우에 
 *             => 10개만 출력 => for : 반복횟수가 지정된 경우 
 *             => 웹 화면 UI는 보통 for을 주로 이용한다
 *             => 무한스크롤 : 반복횟수가 없는 경우 => while
 *             => 웹 => for / while
 *             => do~while => 반드시 한번 이상 수행 (조건 => 후조건)
 *             
 *             1) for => 2차 for (중첩 for)
 *                       ================> 코딩 테스트
 *                = 반복횟수 지정 
 *                = 형식)
 *                        1    2     4
 *                  for(초기값;조건문;증가식)
 *                  {          |
 *                     반복 수행문 3
 *                  }
 *                = 순서)
 *                  1 => 2 => 3 => 4  2 => 3 => 4 ....... 2번이 false면 종료
 *                      ------------- ------------
 *                      for 1바퀴          2바퀴   
 *              2) 예:
 *                 1~10까지 출력
 *                 초기값 : 시작 (어디부터 시작)
 *                 조간식 : 어디까지 증가할지 지정
 *                 증가식 : 시작값부터 증가
 *                 실행문장 : true일때마다 수행
 *                 
 *              for(int i=1;i<=10;i++) => 10번 반복
 *                  -----------------
 *                                 증가식 => 1씩 증가하는 것은 아니다
 *                                         i+=3 , i+=5 ...
 *                      정수 / 문자          
 *              for(char c='A';c<='Z';c++) A~Z
 *              
 *              for(int i=10;i>=10;i--) => 감소 => 최신에 등록된 데이터 읽기
 *              
 *              for(char c='Z';c>='A';c--)
 */
public class 자바제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1~10
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=10;i>=1;i--) // 감소
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		System.out.println();// 다음줄 출력
		for(char c='Z';c>='A';c--)
		{
			System.out.print(c+" ");// 반복은 한다 => 출력물이 다르다
		}
		// 어디부터 시작 : 초기값
		// 어디까지 끝  : 조건식으로 표현
		// 몇바퀴 수행 : 증감식 
		// true => 수행하는 문장 
		// 웹 => 주로 일차 for문 중심 ...
		// 초기값 => 0,1  int i=0;i<=10;i++ , int i=1;i<=10;i++
		//                   ---------          ----------   
	}

}
