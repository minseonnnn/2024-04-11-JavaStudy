/*
 *    연산자
 *    ------
 *     1. 단항연산자
 *        = 증감연산자 : 반복문에서 주로 사용 
 *          ++ , -- : 1증가 , 1감소
 *          ---------
 *          전치 연산자
 *            ++a ===> 먼저 증가 나중에 다른 연산 처리 
 *            int a=10;
 *            int b= ++a;
 *            -----------
 *             a=a+1;
 *             b=a;
 *          후치 연산자
 *            a++ ===> 다른 연산처리후에 증가 
 *            int a=10;
 *            int b=a++;
 *            -------------
 *            b=a;
 *            a=a+1
 *            
 *            ** ++a , a++ => a는 무조건 1개 증가한다
 *            int a=10;
 *            System.out.println(a++); => 출력후에 증가 => 10
 *            System.out.println(++a); => 증가후에 출력 => 11
 *        = 부정연산자 : 조건문에서 주로 사용 
 *           무조건 결과값 : true/false ==> !
 *           6==8  => !(6==8) ==> 반대값
 *           !(6==8 && 6>5)
 *           => 예약일이 아닌 날 ... 비활성
 *        = 형변환 연산자 : 실수-> 정수 , 문자 -> 정수 , 정수 -> 문자 ...
 *          ----------
 *          데이터형에 대한 형변환 ==> 클래스 형변환 (is-a , has-a) 
 *          -----------------
 *           데이터형의 크기 
 *               ------------> 데이터형을 크게 (UpCasting)
 *           byte < char < int < long < double
 *               <------------ 데이터형을 작게 (DownCasting)
 *           => 기본 UpCasting => 자동 변경
 *           =>     DownCasting => 강제변경 => 형변환 연산자
 *           예)
 *                int a='A'
 *                      --- char=>int변경
 *                double d=10
 *                         -- int=> double변경
 *                int a=(int)10.5
 *                           ----  double => int로 변경이 안된다
 *           => 연산처리시에 주로 형변환이 많다
 *              연산 => 데이터형 같은 것끼리 연산
 *              10 + 10.5 => 연산처리가 안된다 
 *              ---
 *              10.0
 *              ---------
 *              10.0+10.5=> 20.5
 *              
 *              'A'+1
 *              char+int (X)
 *              ----
 *              int변경
 *              --------
 *              65+1 ==> 66
 *           --------------------------- 자동으로 큰 데이터형으로 변경후에 연산처리
 *           형변환 : (데이터형)
 *                   = byte변경 ==> (byte)10 ==> 10
 *                   = char    ==> (char)65 ==> 'A'
 *                   = double  ==> (double)10   ==> 10.0
 *                   ** boolean은 형변환이 없다 (숫자와 관련)
 *                   ** 필요시에만 형변환을 한다     
 *           => 단항연산자 : 연산대상(피연산자) => 1개
 *              int a=10; ++a,--a
 *              boolean bCheck=true ==> !bCheck
 *              int a=65; ==> (char)a                                  
 *     2. 이항연산자 => 연산 대상이 2개인 경우
 *            => 산술연산자
 *               = 비트연산자(& , | , ^),쉬프트연산자(<<,>>),반전연산자(-):양수->음수,음수->양수
 *               => + , - , * , / , % => 5개의 연산
 *               +
 *               => 덧셈
 *                  10+10=20 
 *               => 문자열 결합
 *                  "Hello "+"Java" => "Hello Java"
 *               /
 *               => 0으로 나눌 수 없다
 *               => 정수/정수=정수
 *               %
 *               => 부호(-,+)는 왼쪽편의 부호만 남는다   
 *               
 *               *** 연산처리가 될때
 *                   다른 데이터형일 경우에는 => 큰 데이터형으로 결과값이 나온다
 *                   int + double = double
 *                   int + char = int
 *                   long + int + double = double
 *                   ** int이하 (byte,char)는 연산결과는 int
 *                   byte+byte=int
 *                   byte+char=int
 *                   char+char=int
 *                   
 *            => 비교연산자 => 기준은 왼쪽
 *               => 결과값 : boolean => 조건문 , 반복문에서 주로 사용
 *                  == 같다 
 *                  != 같지 않다
 *                  < 작다
 *                  > 크다
 *                  <= 작거나 같다 => < || ==
 *                  >= 크거나 같다 => > || ==
 *                  => 숫자 (int , char , byte , long , double)
 *                     boolean일 경우에는 ==, !=
 *            => 논리연산자 : 결과값 boolean
 *               && , ||
 *               (조건) && (조건)
 *               -----    -----
 *                 |        |
 *                 ----------
 *                      |
 *                    결과값
 *               (조건) || (조건)
 *               -----    -----
 *                 |        |
 *                 ----------
 *                      |
 *                    결과값
 *             *** &&가 ||보다는 우선순위 ==> ()는 최우선 순위 연산자
 *             ==> 3+4*5 = 23
 *                   ---
 *                    20
 *                  3+20  
 *             조건 || 조건 && 조건 => (조건 || 조건) && 조건
 *                    ----------
 *                         1
 *             ------------------
 *                 2                       
 *             ---------------------------------------
 *              (조건)   (조건)        &&        ||
 *             ---------------------------------------
 *              true    true        true     true
 *             ---------------------------------------
 *              true    false       false    true
 *             ---------------------------------------
 *              false   true        false    true
 *             ---------------------------------------
 *              false   false       false    false
 *             ---------------------------------------
 *             &&는 두개의 조건이 true일때만 true 나머지 false
 *             --- 범위포함 , 로그인(id,pwd)
 *             ||는 둘중에 1개가 true면 true
 *             --- 범위를 벗어나는 경우
 *            => 대입연산자
 *               = 대입
 *               += => 여러개 증가
 *               int a=10;
 *               a+=10 ===> a=a+10
 *               -= => 여러개 감소
 *               int a=10;
 *               a-=5  ==> a=a-5 ==>5
 *               
 *               => 1개 증가
 *                  a++
 *                  ++a
 *                  a+=1
 *                  a=a+1
 *               => 1개 감소
 *                  a--
 *                  --a
 *                  a-=1
 *                  a=a-1
 *                  
 *                  *= , /= , %= ==> 사용빈도가 없다 
 *     3. 삼항연산자 => 소스를 줄이기 위해 주로 사용  
 *        (조건) ? 값1 : 값2
 *        -----
 *        true  => 값1
 *        false => 값2
 *        ---------------------------- if~else
 *        
 *        HTML => 자바연결
 *        <%
 *           if(curpage>1)
 *           {
 *        %> 
 *             <a href="list.jsp?page=<%=curpage-1%>">
 *        <%
 *           }
 *           else
 *           {
 *        %>
 *             <a href="list.jsp?page=<%=curpage%>">
 *        <%
 *           }
 *        %>
 *        
 *        <a href="list.jsp?page=<%=curpage1?curpage-1:curpage%>">  
 *        
 *        => 산술연산자 = 형변환연산 결합 => 통계,평균 => 단독으로 사용
 *        => 비교연산자,논리연산자 => 제어문에서 주로 사용
 *                               if / for
 *        --------------------------------------------------
 *        
 *        자바 => 기본 => 누가 빨리 찾기
 *        80% 이미 제작 => 20%
 *        ------------------ 조립
 *                                
 */
public class 자바연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=10;
		//System.out.println(a++);
		//System.out.println(++a);
	}

}
