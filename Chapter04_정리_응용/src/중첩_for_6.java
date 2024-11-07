<<<<<<< HEAD
/*
 *    1. 중복없는 난수 => 응용
 *    -------------------
 *    숫자 야구 게임 
 *    ----------
 *    1. 난수 => 3개  3 6 9
 *    2. 사용자 입력
 *       789 => 3 9 6 => 1S-2B
 *    3. 힌트 
 *       같은 자리 => S  ->  15
 *       다른 자리 => B  
 */
import java.util.Arrays;
import java.util.Scanner; // 사용자 입력
/*
 *   2장 / 3장 / 4장 
 *    |    |    -------------> 묶음
 *   연산자 제어문
 *   
 *    1. 묶음
 *       변수 여러개를 묶어서 관리
 *       변수 여러개 => 제어문 사용이 어렵다 ==> 배열 (이름이 1개 => 구분자는 인덱스)
 *       -------- 평문을 사용한다                                   |
 *                                                          0번부터 순차 
 *       *** 배열은 변수가 3개 이상일 경우 
 *           *** 3개 => 사용 용도가 같을 경우 ... 
 *           나이 , 학번 , 학년
 *       ==> 다음
 *           명령문 : 메소드    
 *           한개에 대한 정보 묶기
 *           클래스 
 *           ----------------- + 프로그램 1개 완성 
 *       
 *       난수 100개
 *       int a1=(int)(Math.random()*100)+1;
 *       ..
 *       ..
 *       int a100=(int)(Math.random()*100)+1;
 *       
 *       최대값 / 최소값
 *       int max=a1;
 *       if(max<a2)
 *         max=a2;
 *         
 *       ...
 *       ...
 *       if(max<a100)
 *         max=a100;  
 *         
 *    -------------------------------
 *    2장 연산자
 *    --------
 *    종류
 *    단항연산자
 *            [] , ()              연산방향(==>)  1
 *            ++ , -- (전치연산)      <==         2
 *            ++ , -- (후치연산)      <==         3
 *            ---------------- ! , (type)
 *            예)
 *               (int)Math.random()*100
 *                    -----------------
 *                 2      1
 *                    <=======
 *            ** (type) 형변환연산자 
 *            ------------------
 *            숫자와 관련 / 클래스 
 *            = UpCasting => 데이터형을 크게 만든다
 *               정수 => 실수
 *               문자 => 정수
 *            = DownCasting => 데이터형을 낮게 만든다            
 *               실수 => 정수
 *               정수 => 문자
 *            크기 순서
 *            -------
 *                   =========> UpCasting
 *            byte < char < int < long < float < double   
 *                   <========= DownCasting
 *                   
 *            ** 자동으로 변경 (자동 형변환)
 *               대입 / 연산
 *               int a='A'
 *                     --- 65
 *                     a=65
 *               double d=10  => int a=(int)10.5
 *                        ---
 *                        10.0
 *                      d=10.0
 *               --------------
 *               변경되는 조건
 *               데이터형 변수명 = 값 
 *               -----        --
 *                 | 값보다 큰 데이터형이어야 변경       
 *               왼쪽이 큰 경우에는 자동으로 변환
 *               왼쪽이 작은 경우에는 강제로 변환           
 *            ** 필요에 의해 강제 변경 (강제 형변환)
 *               int a=10.5
 *               ---   ----- int<10.5 => 오류
 *               int < (int)double       
 *               *** 예외
 *               char c=65; => char는 예외 
 *            ** 연산처리
 *               1) char는 자동으로 int로 변경
 *               2) 연산처리시에는 큰데이터형으로 변경 => 연산처리(같은 데이터형이어야 한다)
 *                  10 + 10.5
 *                  --   ----
 *                  10.0(double) => 연산처리 
 *                  'A'+1
 *                  ---
 *                  65 + 1
 *                  
 *                  *** int이하 데이터형은 연산시에 int값의 결과가 나온다 
 *                  char + char = int
 *                  byte + byte = int
 *                  
 *                  byte b1=100;
 *                  byte b2=30;
 *                  byte b3=b1+b2; ==> 오류
 *                  ----
 *                  int
 *                  ------------------
 *                  int + int = int
 *                  double + double = double   
 *    이항연산자
 *         산술연산자  *,/,%       ===>           4
 *                            왼쪽 => 오른쪽
 *                  + , -      ====>           5
 *               ** + 산술외의 문자열 결합 연산자
 *                          -------------
 *                          "7"+7 => "77"
 *                          7+"7" => "77"
 *                          ------------- JavaScript
 *               ** / => 정수/정수=정수
 *           비교연산자  < , > , <= , >= , == , !=  ====>  6
 *                   --------------------------
 *                    | 숫자,문자,논리 => 기본형 비교 
 *                   equals , instanceof       
 *                    | 문자열   | 클래스
 *                   => 모든 결과값은 true/false                        
 *           논리연산자
 *                    &&                  =======> 7
 *                    ||                  =======> 8
 *                    우선 순위를 모르는 경우 => ()
 *                    ==> 결과값은 true/false
 *                    
 *                    && => 범위에 포함
 *                          => 조건 2개가 동시에 true일때만 true => 나머지 false
 *                    || => 범위를 벗어나는 경우
 *                          => 조건 2개 중에 1개 true일때만 true
 *           ----------------------- if , for , while               
 *           
 *    삼항연산자                                   <==== 9
 *            조건 ? true:false  ==> if~else
 *            => 웹 / 게임 => 복잡도를 줄이기 위해 주로 사용
 *               -- 단점 : 자바+CSS+JavaScript+HTML
 *               
 *            login?"로그아웃":"로그인"
 *            
 *            if(login)
 *              로그아웃
 *            else
 *              로그인
 *    
 *    대입연산자 : = , += , -=            <======= 10  
 *    int a=10;  a라는 변수에 10을 대입한다 (X)  
 *               10을 a변수에 대입한다 (O)
 *    int a=10
 *    int b=20
 *    int c=a+b
 *          ---
 *           1
 *        --
 *        2
 *    ===> 가장 마지막에 처리되는 연산자
 *    
 *    ===> 산술연산자 ==> 대입연산자
 *    ===> 제어문 : 비교연산자 , 증감연산자 (반복문)
 *                -----------------   
 *                조건문 : 비교,논리
 *    -------------------------------------- 자바 연산자
 *    3장 제어문 : 프로그램을 제어
 *              = 반복 수행
 *               ---------------------------------
 *                for : 반복횟수가 있는 경우 => 2차 for
 *                while : 반복횟수를 모르는 경우  
 *               --------------------------------- 
 *                do~while : 반복횟수를 모르는 경우 => 반드시 한번이상 수행 
 *              = 건너뛴다 : 단일 조건문 
 *              = 선택한 내용만 처리 : 다중 조건문 , 선택문
 *              = 오류 처리 : 조건문 ==> 처리를 못하는 경우에 예외처리 
 *                throws / try~catch => 반드시 예외처리 => file관련 , 네트워크 
 *                                      ----------- 8장
 *                                      2장~8장 => 기본 문법
 *                                      9장~14장 => 라이브러리
 *                                      다른 프로그램 연결 : 네트워크 , SQL
 *              = 반복문에 제어
 *                종료 : break => 반복문 , 선택문에서만 사용이 가능
 *                제외 : continue => 반복문에서만 사용이 가능
 *       ------------------------------------------------------------
 *       => 조건문
 *       => 1. 단일조건문
 *       1. 제어문 형식
 *          if(조건) 조건 true일 경우에 실행  
 *          {
 *             조건이 true일때만 수행 서술
 *             false면 => 건너뛴다 
 *          }
 *       2. 동작 순서
 *          => 조건이 맞는 경우에만 실행
 *       3. 사용 위치
 *          => 오류처리 => 사용자 입력값을 받은 경우에 주로 처리
 *       4. 조건 설정                                
 *          => 비교연산자 / 논리연산자
 *                      -------- 범위 지정할 경우
 *       ** if를 여러개 사용하면 독립적이기 때문에 모든 조건을 검색 => 속도가 느려질 수 있다
 *       ** 여러 문장을 동시에 수행이 가능 
 *          if~else => 선택 조건문
 *          true/false에 해당되는 소스 코딩
 *          if(조건문)
 *          {
 *             조건 true일때 처리
 *          }
 *          else
 *          {
 *             조건 false일때 처리
 *          }
 *          ==> 한줄 : 삼항연산자
 *                    => combobox , 페이지 지정 ...
 *          ==> 두개로 나눠져 있는 경우
 *              로그인 / 아이디 중복 / 회원가입여부 / 검색어 입력여부 ...
 *              웹 => 무조건 동작 
 *              
 *          다중조건문 => 해당 조건문장만 수행 => 키보드 입력 (게임) , 메뉴 
 *            if(조건문)
 *            {
 *                조건문 true => 수행 => 종료
 *            }         | false 다음 조건문을 찾는다 
 *            else if(조건문)
 *            {
 *                조건 true => 수행 => 종료
 *            }         | false 다음 조건문을 찾는다
 *            else if(조건문)
 *            {
 *                조건 true => 수행 => 종료
 *            }         | false 다음 조건문을 찾는다
 *            else
 *            {
 *                해당 조건이 없는 경우에 처리 => 생략이 가능 
 *            }              
 *            ----------------- 단순화 => 선택문
 *            ==> 처리문장이 같은 경우
 *            case 10: case 9:
 *                'A'
 *            case 3: 
 *            case 4: 
 *            case 5: 
 *                 봄
 *                 break;
 *            switch(정수,문자,문자열)
 *            {
 *               case 1 :
 *                  처리문장
 *                  break;
 *               case 2:  ==> if(num==2 || num==3)
 *               case 3:
 *                 처리문장 
 *                 break;
 *               ....
 *               default: 생략이 가능  
 *            }
 *            
 *            ==> 웹에서 사용 빈도가 작다 => 네트워크의 경우의 수 , 게임
 *                                    ------- 미니 프로젝트 제작   
 *                                    
 *            => 반복문                                                            
 */
public class 중첩_for_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //1. 컴퓨터가 난수 발생 => 1~9 사이의 중복이 없는 숫자 => 3개
		int[] com=new int[3];
		for(int i=0;i<com.length;i++) // 3번 반복
		{
			com[i]=(int)(Math.random()*9)+1; // 1~9
			// 중복여부 확인
			for(int j=0;j<i;j++) // 생성된 난수만큼만 비교
			{
				if(com[i]==com[j]) // 같은 수가 있는지 확인 => 비교연산 / 논리연산만
				{
					i--; // 다시 난수를 발생한다
					break; // j가 있는 for만 종료 ==> i++로 이동한다
				}
			}
		}
		// System.out.println(Arrays.toString(com));
		// 사용자가 입력한 데이터 저장
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		//2. 사용자 입력 요청
		while(true) // 반복횟수가 없다 => 정답에 종료 => 무한루프 
		{
			System.out.print("세자리 정수를 입력하세요>>");
			int input=scan.nextInt();
			// 오류 처리 => 세자리 정수가 입력이 안된 경우 
			if(input<100 || input>999)
			{
				System.out.println("알림 ☞ 세자리 정수만 입력해야 합니다");
				// while의 처음으로 이동
				continue;
				/*
				 *   continue 
				 *   while => 조건식으로 이동 
				 *   for => 증가식으로 이동 
				 *           |------
				 *   while(조건식)   |
				 *   {             |   처음으로 다시 시작
				 *      continue----
				 *   }
				 *                   |=====   
				 *   for(초기값;조건식;증가식)  |  => 제외
				 *   {                    | 
				 *      continue ==========
				 *   }
				 *   
				 *   break는 while, for 상관없이 반복문을 중단
				 */
			}
			// 세자리 정수를 입력한 경우
			/*
			 *   369/100 => 3
			 *   369%100 => 69/10 => 6
			 *   369%10 => 9
			 *   => 이런 경우에 주로 사용 ==> %
			 */
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 오류 처리 ==> 2개
			// 1. 같은 수인 경우는 안된다
			if(user[0]==user[1] ||
			   user[1]==user[2] ||
			   user[0]==user[2])
			{
				System.out.println("알림 ☞ 중복된 수는 사용할 수 없습니다");
				continue; // 다시 입력
				// if => 단일 조건문 => 사용자 입력 , 오류 
			}
			// 2. 0을 입력하면 안된다 ==> 036
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("알림 ☞ 0을 사용하면 안됩니다");
				continue;
			}
			// 정상적으로 입력이 되었다면
			// 힌트
			int s=0,b=0; //s는 숫자와 자리수가 맞는 경우 , b는 숫자는 있고 자리수가 맞지 않는 경우
		    for(int i=0;i<3;i++)
		    {
		    	for(int j=0;j<3;j++) //user
		    	{
		    		if(com[i]==user[j]) // 같은 수가 존재하는지 확인
		    		{
		    			if(i==j) // 같은 자리면 
		    				s++;
		    			else     // 다른 자리면
		    				b++;
		    		}
		    	}
		    }
		    // 힌트 제공
		    System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
		    // 종료 여부
		    if(s==3)
		    {
		    	System.out.println("Game Over!!");
		    	break;
		    }
		}
		//3. 비교 => 힌트
		//4. 정답 여부 확인 => 정답이면 종료 / 오답이면 => 다시 입력이 가능
		//                 break       continue

	}

}
=======
/*
 *    1. 중복없는 난수 => 응용
 *    -------------------
 *    숫자 야구 게임 
 *    ----------
 *    1. 난수 => 3개  3 6 9
 *    2. 사용자 입력
 *       789 => 3 9 6 => 1S-2B
 *    3. 힌트 
 *       같은 자리 => S  ->  15
 *       다른 자리 => B  
 */
import java.util.Arrays;
import java.util.Scanner; // 사용자 입력
/*
 *   2장 / 3장 / 4장 
 *    |    |    -------------> 묶음
 *   연산자 제어문
 *   
 *    1. 묶음
 *       변수 여러개를 묶어서 관리
 *       변수 여러개 => 제어문 사용이 어렵다 ==> 배열 (이름이 1개 => 구분자는 인덱스)
 *       -------- 평문을 사용한다                                   |
 *                                                          0번부터 순차 
 *       *** 배열은 변수가 3개 이상일 경우 
 *           *** 3개 => 사용 용도가 같을 경우 ... 
 *           나이 , 학번 , 학년
 *       ==> 다음
 *           명령문 : 메소드    
 *           한개에 대한 정보 묶기
 *           클래스 
 *           ----------------- + 프로그램 1개 완성 
 *       
 *       난수 100개
 *       int a1=(int)(Math.random()*100)+1;
 *       ..
 *       ..
 *       int a100=(int)(Math.random()*100)+1;
 *       
 *       최대값 / 최소값
 *       int max=a1;
 *       if(max<a2)
 *         max=a2;
 *         
 *       ...
 *       ...
 *       if(max<a100)
 *         max=a100;  
 *         
 *    -------------------------------
 *    2장 연산자
 *    --------
 *    종류
 *    단항연산자
 *            [] , ()              연산방향(==>)  1
 *            ++ , -- (전치연산)      <==         2
 *            ++ , -- (후치연산)      <==         3
 *            ---------------- ! , (type)
 *            예)
 *               (int)Math.random()*100
 *                    -----------------
 *                 2      1
 *                    <=======
 *            ** (type) 형변환연산자 
 *            ------------------
 *            숫자와 관련 / 클래스 
 *            = UpCasting => 데이터형을 크게 만든다
 *               정수 => 실수
 *               문자 => 정수
 *            = DownCasting => 데이터형을 낮게 만든다            
 *               실수 => 정수
 *               정수 => 문자
 *            크기 순서
 *            -------
 *                   =========> UpCasting
 *            byte < char < int < long < float < double   
 *                   <========= DownCasting
 *                   
 *            ** 자동으로 변경 (자동 형변환)
 *               대입 / 연산
 *               int a='A'
 *                     --- 65
 *                     a=65
 *               double d=10  => int a=(int)10.5
 *                        ---
 *                        10.0
 *                      d=10.0
 *               --------------
 *               변경되는 조건
 *               데이터형 변수명 = 값 
 *               -----        --
 *                 | 값보다 큰 데이터형이어야 변경       
 *               왼쪽이 큰 경우에는 자동으로 변환
 *               왼쪽이 작은 경우에는 강제로 변환           
 *            ** 필요에 의해 강제 변경 (강제 형변환)
 *               int a=10.5
 *               ---   ----- int<10.5 => 오류
 *               int < (int)double       
 *               *** 예외
 *               char c=65; => char는 예외 
 *            ** 연산처리
 *               1) char는 자동으로 int로 변경
 *               2) 연산처리시에는 큰데이터형으로 변경 => 연산처리(같은 데이터형이어야 한다)
 *                  10 + 10.5
 *                  --   ----
 *                  10.0(double) => 연산처리 
 *                  'A'+1
 *                  ---
 *                  65 + 1
 *                  
 *                  *** int이하 데이터형은 연산시에 int값의 결과가 나온다 
 *                  char + char = int
 *                  byte + byte = int
 *                  
 *                  byte b1=100;
 *                  byte b2=30;
 *                  byte b3=b1+b2; ==> 오류
 *                  ----
 *                  int
 *                  ------------------
 *                  int + int = int
 *                  double + double = double   
 *    이항연산자
 *         산술연산자  *,/,%       ===>           4
 *                            왼쪽 => 오른쪽
 *                  + , -      ====>           5
 *               ** + 산술외의 문자열 결합 연산자
 *                          -------------
 *                          "7"+7 => "77"
 *                          7+"7" => "77"
 *                          ------------- JavaScript
 *               ** / => 정수/정수=정수
 *           비교연산자  < , > , <= , >= , == , !=  ====>  6
 *                   --------------------------
 *                    | 숫자,문자,논리 => 기본형 비교 
 *                   equals , instanceof       
 *                    | 문자열   | 클래스
 *                   => 모든 결과값은 true/false                        
 *           논리연산자
 *                    &&                  =======> 7
 *                    ||                  =======> 8
 *                    우선 순위를 모르는 경우 => ()
 *                    ==> 결과값은 true/false
 *                    
 *                    && => 범위에 포함
 *                          => 조건 2개가 동시에 true일때만 true => 나머지 false
 *                    || => 범위를 벗어나는 경우
 *                          => 조건 2개 중에 1개 true일때만 true
 *           ----------------------- if , for , while               
 *           
 *    삼항연산자                                   <==== 9
 *            조건 ? true:false  ==> if~else
 *            => 웹 / 게임 => 복잡도를 줄이기 위해 주로 사용
 *               -- 단점 : 자바+CSS+JavaScript+HTML
 *               
 *            login?"로그아웃":"로그인"
 *            
 *            if(login)
 *              로그아웃
 *            else
 *              로그인
 *    
 *    대입연산자 : = , += , -=            <======= 10  
 *    int a=10;  a라는 변수에 10을 대입한다 (X)  
 *               10을 a변수에 대입한다 (O)
 *    int a=10
 *    int b=20
 *    int c=a+b
 *          ---
 *           1
 *        --
 *        2
 *    ===> 가장 마지막에 처리되는 연산자
 *    
 *    ===> 산술연산자 ==> 대입연산자
 *    ===> 제어문 : 비교연산자 , 증감연산자 (반복문)
 *                -----------------   
 *                조건문 : 비교,논리
 *    -------------------------------------- 자바 연산자
 *    3장 제어문 : 프로그램을 제어
 *              = 반복 수행
 *               ---------------------------------
 *                for : 반복횟수가 있는 경우 => 2차 for
 *                while : 반복횟수를 모르는 경우  
 *               --------------------------------- 
 *                do~while : 반복횟수를 모르는 경우 => 반드시 한번이상 수행 
 *              = 건너뛴다 : 단일 조건문 
 *              = 선택한 내용만 처리 : 다중 조건문 , 선택문
 *              = 오류 처리 : 조건문 ==> 처리를 못하는 경우에 예외처리 
 *                throws / try~catch => 반드시 예외처리 => file관련 , 네트워크 
 *                                      ----------- 8장
 *                                      2장~8장 => 기본 문법
 *                                      9장~14장 => 라이브러리
 *                                      다른 프로그램 연결 : 네트워크 , SQL
 *              = 반복문에 제어
 *                종료 : break => 반복문 , 선택문에서만 사용이 가능
 *                제외 : continue => 반복문에서만 사용이 가능
 *       ------------------------------------------------------------
 *       => 조건문
 *       => 1. 단일조건문
 *       1. 제어문 형식
 *          if(조건) 조건 true일 경우에 실행  
 *          {
 *             조건이 true일때만 수행 서술
 *             false면 => 건너뛴다 
 *          }
 *       2. 동작 순서
 *          => 조건이 맞는 경우에만 실행
 *       3. 사용 위치
 *          => 오류처리 => 사용자 입력값을 받은 경우에 주로 처리
 *       4. 조건 설정                                
 *          => 비교연산자 / 논리연산자
 *                      -------- 범위 지정할 경우
 *       ** if를 여러개 사용하면 독립적이기 때문에 모든 조건을 검색 => 속도가 느려질 수 있다
 *       ** 여러 문장을 동시에 수행이 가능 
 *          if~else => 선택 조건문
 *          true/false에 해당되는 소스 코딩
 *          if(조건문)
 *          {
 *             조건 true일때 처리
 *          }
 *          else
 *          {
 *             조건 false일때 처리
 *          }
 *          ==> 한줄 : 삼항연산자
 *                    => combobox , 페이지 지정 ...
 *          ==> 두개로 나눠져 있는 경우
 *              로그인 / 아이디 중복 / 회원가입여부 / 검색어 입력여부 ...
 *              웹 => 무조건 동작 
 *              
 *          다중조건문 => 해당 조건문장만 수행 => 키보드 입력 (게임) , 메뉴 
 *            if(조건문)
 *            {
 *                조건문 true => 수행 => 종료
 *            }         | false 다음 조건문을 찾는다 
 *            else if(조건문)
 *            {
 *                조건 true => 수행 => 종료
 *            }         | false 다음 조건문을 찾는다
 *            else if(조건문)
 *            {
 *                조건 true => 수행 => 종료
 *            }         | false 다음 조건문을 찾는다
 *            else
 *            {
 *                해당 조건이 없는 경우에 처리 => 생략이 가능 
 *            }              
 *            ----------------- 단순화 => 선택문
 *            ==> 처리문장이 같은 경우
 *            case 10: case 9:
 *                'A'
 *            case 3: 
 *            case 4: 
 *            case 5: 
 *                 봄
 *                 break;
 *            switch(정수,문자,문자열)
 *            {
 *               case 1 :
 *                  처리문장
 *                  break;
 *               case 2:  ==> if(num==2 || num==3)
 *               case 3:
 *                 처리문장 
 *                 break;
 *               ....
 *               default: 생략이 가능  
 *            }
 *            
 *            ==> 웹에서 사용 빈도가 작다 => 네트워크의 경우의 수 , 게임
 *                                    ------- 미니 프로젝트 제작   
 *                                    
 *            => 반복문                                                            
 */
public class 중첩_for_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //1. 컴퓨터가 난수 발생 => 1~9 사이의 중복이 없는 숫자 => 3개
		int[] com=new int[3];
		for(int i=0;i<com.length;i++) // 3번 반복
		{
			com[i]=(int)(Math.random()*9)+1; // 1~9
			// 중복여부 확인
			for(int j=0;j<i;j++) // 생성된 난수만큼만 비교
			{
				if(com[i]==com[j]) // 같은 수가 있는지 확인 => 비교연산 / 논리연산만
				{
					i--; // 다시 난수를 발생한다
					break; // j가 있는 for만 종료 ==> i++로 이동한다
				}
			}
		}
		// System.out.println(Arrays.toString(com));
		// 사용자가 입력한 데이터 저장
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		//2. 사용자 입력 요청
		while(true) // 반복횟수가 없다 => 정답에 종료 => 무한루프 
		{
			System.out.print("세자리 정수를 입력하세요>>");
			int input=scan.nextInt();
			// 오류 처리 => 세자리 정수가 입력이 안된 경우 
			if(input<100 || input>999)
			{
				System.out.println("알림 ☞ 세자리 정수만 입력해야 합니다");
				// while의 처음으로 이동
				continue;
				/*
				 *   continue 
				 *   while => 조건식으로 이동 
				 *   for => 증가식으로 이동 
				 *           |------
				 *   while(조건식)   |
				 *   {             |   처음으로 다시 시작
				 *      continue----
				 *   }
				 *                   |=====   
				 *   for(초기값;조건식;증가식)  |  => 제외
				 *   {                    | 
				 *      continue ==========
				 *   }
				 *   
				 *   break는 while, for 상관없이 반복문을 중단
				 */
			}
			// 세자리 정수를 입력한 경우
			/*
			 *   369/100 => 3
			 *   369%100 => 69/10 => 6
			 *   369%10 => 9
			 *   => 이런 경우에 주로 사용 ==> %
			 */
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 오류 처리 ==> 2개
			// 1. 같은 수인 경우는 안된다
			if(user[0]==user[1] ||
			   user[1]==user[2] ||
			   user[0]==user[2])
			{
				System.out.println("알림 ☞ 중복된 수는 사용할 수 없습니다");
				continue; // 다시 입력
				// if => 단일 조건문 => 사용자 입력 , 오류 
			}
			// 2. 0을 입력하면 안된다 ==> 036
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("알림 ☞ 0을 사용하면 안됩니다");
				continue;
			}
			// 정상적으로 입력이 되었다면
			// 힌트
			int s=0,b=0; //s는 숫자와 자리수가 맞는 경우 , b는 숫자는 있고 자리수가 맞지 않는 경우
		    for(int i=0;i<3;i++)
		    {
		    	for(int j=0;j<3;j++) //user
		    	{
		    		if(com[i]==user[j]) // 같은 수가 존재하는지 확인
		    		{
		    			if(i==j) // 같은 자리면 
		    				s++;
		    			else     // 다른 자리면
		    				b++;
		    		}
		    	}
		    }
		    // 힌트 제공
		    System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
		    // 종료 여부
		    if(s==3)
		    {
		    	System.out.println("Game Over!!");
		    	break;
		    }
		}
		//3. 비교 => 힌트
		//4. 정답 여부 확인 => 정답이면 종료 / 오답이면 => 다시 입력이 가능
		//                 break       continue

	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
