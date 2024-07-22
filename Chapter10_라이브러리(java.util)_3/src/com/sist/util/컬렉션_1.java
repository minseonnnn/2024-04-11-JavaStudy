package com.sist.util;
/*
 *   컬렉션(Collection)
 *     => 데이터가 많은 경우에 처리를 쉽고 효율적으로 관리 가능하게 만드는 자료구조
 *        => 라이브러리 => 표준화 (모든 개발자가 같은 코딩으로 사용)
 *                     -----
 *        => 자료구조 : 데이터 수정 , 데이터 추가 , 데이터 삭제 , 데이터 읽기 => CRUD
 *        => 배열은 고정적 => 선언과 동시 저장 갯수를 지정 (추가,삭제 => 불가능)
 *           --------- 추가 => 큰 배열을 다시 만들어야 한다
 *           --------- 삭체 => 작은 배열을 다시 만들어야 한다 
 *           --------- 보완 (가변형) => 자동 증가 , 자동 축소 
 *                     ---------- 데이터 관리 => 사용법 
 *     => 컬렉션의 구조 => 검색 가능
 *                    Collection ===> interface
 *                         |
 *       -------------------------------------------
 *       |                    |                    |
 *      List                 Set                  Map
 *     일자배열                 묶음
 *     -------------
 *       1   2   3..                                                        
 *     -------------
 *     => 데이터 중복 허용
 *     => 데이터 구분을 인덱스
 *        (순서가 존재)
 *        *** 인덱스는 자동 추가
 *            ---- 추가 (인덱스 자동 증가)
 *            ---- 삭제 (인덱스 조정)
 *            ---- 0번 시작
 *      => 구현된 클래스
 *         ---------
 *         **ArrayList
 *           => 데이터베이스의 저장된 값을 저장후 브라우저에 전송
 *              -----------------------------------
 *                웹 프로그램 , Vector의 단점 보완 
 *                => 비동기적인 방식 => 접속 속도를 빠르게 개선  
 *                   -----------
 *                    단점 : 데이터가 순서적으로 저장이 안된다
 *                         -------------------------
 *                          => 정렬을 해서 저장후 사용   
 *                          => 오라클에서 정렬
 *                             ----------- ORDER BY no
 *                             = 데이터 검색(읽기) : SELECT
 *                             = 데이터 추가 : INSERT
 *                             = 데이터 수정 : UPDATE
 *                             = 데이터 삭제 : DELETE
 *              사용처 => 웹 프로그램에서 주로 사용 (******)                
 *         Vector
 *           => 네트워크의 접속자 정보 저장 
 *              -------------------
 *               => 동기적인 방식 => 접속 속도가 늦다 
 *               => 한번 (네트워크 => 서버) 
 *         Stack : LIFO 구조 
 *                 (Last IN First OUT)
 *                 => 변수저장 
 *                 => 사용을 권장하지 않는다 
 *         LinkedList : 추가 , 삭제가 빠르다
 *                      접근 속도가 늦다 
 *                      C언어 호환 
 *             |       
 *           Queue : FIFO 구조
 *                  => 네트워크 전송 , 운영체제 스케줄러  
 *     0
 *     1
 *     2 => 삭제
 *     3 => 2
 *     4 => 3
 *     --------
 *     0
 *     1
 *     2
 *     3       
 *     
 *     Set : 인터페이스
 *      |
 *    ---------- 구현된 클래스
 *     HashSet : 중복 제거
 *     TreeSet : 검색 => 속도 빠르다 (binary search) 
 *       => 자바 자체 프로그램 개발 
 *         -> 오라클 : 기능 (검색,중복 제어하는 기능)
 *            ---- 명령어를 이용해서 데이터 수집 
 *     => 데이터 중복이 없다 => ArrayList에서 중복된 데이터를 제거
 *        지니 / 멜론 => 중복이 안된 노래만 출력 
 *     => 데이터가 중복이 없기 때문에 => 검색이 가능(데이터만 가지고)
 *        => 순서가 없다 (인덱스번호가 필요가 없다)
 *        
 *     *** 프로그램
 *       -----------------------------------
 *         이해 , 형식 => 명령문     흐름
 *                  => 명령문에 대한 연습 (1000문제) *** =>    
 *         자바      오라클      HTML/CSS
 *         ---     ------    --------- 
 *          |        |           | 
 *          ----------           |
 *              |                |
 *          연동(JDBC)            |
 *              |                |
 *              ------------------
 *                      |
 *                     JSP
 *       --------------------------------- 통합 => 프레임워크(스프링) => 라이브러리(MyBatis,JPA)
 *        => 기본 조립 => 라이브러리 + 메소드 사용법 
 *                     -------------------- 저장할 변수 설정
 *                     
 *       Map
 *       ---- 사용빈도가 적다
 *       ---- 라이브러리에서는 Map 사용빈도 상당하다
 *       ---- 두개를 동시에 저장
 *            ---
 *             구분자 데이터
 *             --------- 구분자 : key , 데이터 : value
 *                       ----------   ------------
 *                       | 중복이 없다    | 중복이 가능
 *             => name="홍길동"
 *                ----  ----
 *                key   value
 *             => 웹에서 주로 사용 
 *                ?page=1
 *                 ---- -    => getParameter("page") => 1 
 *                 => request : 사용자가 보내준 값을 받을때 사용 
 *                 => response
 *                 => session
 *                 => cookie 
 *             => 스프링 : 클래스 관리 
 *             => MyBatis : SQL 관리 
 *      => ***HashMap , Hashtable
 *         -------   ---------
 *         | 비동기    | 동기
 *         -------
 *         Hashtable을 보완
 *         
 *                 => 저장 put(key,value)
 *                 => 읽기 get(key)
 *      => ArrayList, HashSet, HashMap ==> 일반 기본값을 저장 , 클래스 저장이 가능
 *                                         -----------------------------
 *         => 모든 데이터 저장이 가능하게 만든다
 *            -----------
 *            | 매개변수 / 리턴형 => Object
 *              Object가 있는 경우 
 *              ------ 모든 데이터의 가장 큰 데이터형 => 형변환을 해서 사용한다
 *         => 필요시에는 매개변수 / 리턴형을 프로그램에 맞게 변경이 가능하게 만들어준다
 *            ----------------------------------------------------
 *             => 제네릭
 *               => 데이터형을 한번에 통일화 (라이브러리 자체 매개변수/리턴형)
 *               => 간결하다 , 가독성 (어떤 데이터를 저장해서 관리하는지 알 수 있다) , 형변환이 필요 없다 
 *                                                                    -------------
 *               
 *             ArrayList list=new ArrayList()
 *                       ----
 *             ArrayList<String> list=new ArrayList<String>()
 *                               -----
 *                                => String을 저장                                                                 
 *             ArrayList<Movie> list=new ArrayList<Movie>()
 *             *** 데이터를 모아서 관리 => 한개를 저장 권장  
 *             
 *         자료구조 : 메모리에서 데이터 관리
 *                 ***=> 추가 : add() => 데이터베이스(오라클) => 데이터 담기
 *                 => 삭제 : remove()
 *                 ***=> 읽기 : get() => 화면 => 데이터 읽기 => HTML을 이용해서 브라우저 출력
 *                 => 수정 : set()
 *                 => 전체 삭제 : clear()
 *                 ***=> 저장 갯수 : size() => for을 이용해서 출력 횟수 확인 
 *                 --------> 대부분은 데이터가 오라클에 저장 => 오라클안에서 제어 
 *                 ---------------------
 *                
 */
import java.util.*;
public class 컬렉션_1 {
    // 데이터를 모아서 처리 => 같은 데이터형을 모아서 처리 => 효율적 => 제네릭 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        // 문자열만 저장해서 관리
        // add(Object) => add(String) => 사용자 정의 데이터형으로 변경이 가능 
        // => 가급적이면 1개의 데이터형을 저장한다 
        //           ----------- 데이터형이 통일 => 반복문 수행이 가능하다 
        list.add("홍길동");//0
        list.add(10);//1
        list.add(10.5);//2
        list.add(true);//3
        list.add('A');//4
        
        for(int i=0;i<list.size();i++)
        {
        	if(i==0)
        	{
        		String name=(String)list.get(i);
        		System.out.println(name);
        	}
        	else if(i==1)
        	{
        		int no=(int)list.get(i);
        		System.out.println(no);
        	}
        	else if(i==2)
        	{
        		double d=(double)list.get(i);
        		System.out.println(d);
        	}
        	else if(i==3)
        	{
        		boolean b=(boolean)list.get(i);
        		System.out.println(b);
        	}
        	else if(i==4)
        	{
        		char c=(char)list.get(i);
        		System.out.println(c);
        	}
        }
        
	}

}
