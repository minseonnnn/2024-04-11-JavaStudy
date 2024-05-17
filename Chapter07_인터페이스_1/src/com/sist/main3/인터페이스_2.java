package com.sist.main3;
/*
 *    1. 클래스 구성요소
 *       변수 : 기본형 , 클래스 , 배열 
 *       메소드 => 연산자/제어문
 *       -------------------------
 *    2. 클래스 연결 => 인터페이스
 *                  -------------- 
 *    3. 프로그램 종료 방지 => 예외처리
 *                  -------------- 사용자가 입력값을 잘못 넘겨준 경우 처리 
 *    ------------------------- 웹 
 *    => 못만드는 클래스가 존재 
 *       ----------------
 *       오라클 연결 / 브라우저 연결 / 파일 연결 => 라이브러리 
 *       System.out.println() => API => C 
 *       => 조립 => 객체지향 프로그램 
 *       => 레고블록 => class 
 *       => class는 1개의 기능만 수행 
 *                 -------- 게시판 (메소드 기능 => 여러개 기능) => 컴포넌트 
 *                                                        ------ 여러개 관리 => 컨테이너 
 *    ----------------------------------------------------------------------------
 *     => 7장
 *        클래스의 종류
 *        일반 클래스 
 *          => 일반 기능이 있는 클래스 
 *          => 조립 => main()
 *          => 변수 설정
 *             ------ 활용, 초기화 
 *                    ---  ----
 *                         | 생성자 => 초기화가 필요없는 경우에는 생략가능 
 *                    | 메소드 
 *             => 변수 / 메소드
 *                ---------- 상속이 있는 경우 
 *          [접근지정어][제어어] class ClassName
 *          -------- -----
 *                   | static : 공통 기반 , abstract : 추상클래스 , final : 절판 => 확장이 안되는 클래스 
 *                                       --------- 
 *           public : 다른 클래스에서 사용 
 *          {
 *               ----------------------
 *                 변수 => 데이터 => 모든 프로그램은 데이터 관리
 *                                           -------- 자바스크립트 (Vue,React)
 *                 => 여러개 저장 => 인스턴스 변수 => new를 이용해서 따로 저장 
 *                 => 한개 저장 => 정적변수 (static)                          
 *               ----------------------
 *                 생성자 => 없는 경우에는 컴파일러가 자동 추가 
 *               ----------------------
 *                 메소드 => 리턴형 / 매개변수
 *                               -------
 *                               | 사용자 요청값 => 여러개 사용이 가능 
 *                         ----
 *                         | 요청 처리 결과값 => 한개만 가능 (여러개 : 배열, 클래스)      
 *               ----------------------
 *          }             
 *        추상 클래스 
 *         => 재사용 => 설계 => 공통으로 사용되는 내용을 설계 => 개발기간이 단축 
 *         6개월
 *           설계 (요구사항분석) => 3개월 
 *           데이터베이스 설계 => 1개월
 *           화면 UI => 1개월
 *           -------------------
 *           개발 구현 => 15일 
 *           ------------------- 재사용 (상속=변경할 내용이 있다,포함=변경할 내용이 없는 경우) 
 *                               .jar
 *           테스트 => 15일
 *           배포 => 1개월
 *        추상 클래스 구성 요소 / 형식
 *        -------- 메모리 할당이 불가능 => 상속을 내려서 사용
 *        [접근지정어] abstract class ClassName
 *        {
 *            ---------------------
 *              변수 => 멤버변수
 *            ---------------------
 *              생성자
 *            ---------------------
 *              메소드 : 구현된 메소드
 *            ---------------------
 *              메소드 : 선언만 메소드
 *              [접근지정어] abstract 리턴형 메소드명(매개변수);
 *                => 추상 메소드 : 상속받은 클래스마다 기능은 동일 / 구현 내용이 다른 경우
 *            ---------------------
 *            자바 => 추상 : 공통적인 
 *        }   
 *           => 관련된 클래스를 묶어서 관리 
 *        인터페이스 : 추상클래스 보완 => 추상클래스의 일종
 *            => 설계와 관련 => 개발기간 단축
 *            => 표준화 => 모든 개발자가 같은 메소드를 사용한다 
 *            => 독립적으로 사용이 가능
 *            => 클래스를 묶어서 관리
 *            => 결합성이 낮은 프로그램 => 에러시 다른 클래스에 영향이 없다 
 *            => 1. 윈도우 : 이벤트 처리 
 *                        ----------
 *                        버튼 클릭 / 마우스 클릭 / 키보드 입력...
 *               2. 컬렉션 : 데이터를 모아서 쉽게 관리 => 자료구조 
 *               3. 데이터베이스 => 연결, 닫기, SQL문장 ... 
 *               4. 웹 프로그램에서 => 요청 받기 , 요청 처리 , 결과값 전송 
 *            => 확인 => new를 사용하지 않고 객체 생성하면 인터페이스 
 *            => 추상 클래스와 인터페이스는 객체 생성이 불가능 => new를 사용하지 않는다 
 *          형식/구성요소
 *          [접근지정어] interface interface명
 *          --------- 다른 클래스와 연결 => public => 생성자가 없다 => 변수가 없다 (상수)
 *          {
 *              ----------------------
 *                상수 => 변수는 존재하지 않는다 
 *                
 *                (public static final) 데이터형 상수명=값
 *                ---------------------       ------- 명시적인 초기화
 *                  없는 경우에는 자동 추가 (생략이 가능)
 *              ----------------------
 *                구현이 안된 메소드 : 핵심
 *                (public abstract) 리턴형 메소드명(매개변수..);
 *                -----------------
 *                 없는 경우에 자동 추가 (생략이 가능) 
 *              ----------------------
 *                구현된 메소드 => default 메소드
 *                (public) default 리턴형 메소드명(매개변수..)
 *                         ------- 반드시 서술 
 *                -------- 없는 경우에는 자동 추가
 *                {
 *                    구현
 *                }
 *                
 *                (public) static 리턴형 메소드명(매개변수...)
 *                {
 *                
 *                }
 *                => default / static => 구현이 가능 ==> JDK 1.8 이상에서만 가능
 *                => 유지보수 => 전에 개발이 된 경우에는 사용할 수 없다 
 *                => 권장 => 메소드 선언만 한다 
 *              ----------------------
 *          }         
 *          => 인터페이스도 상위 클래스 개념
 *             ---------------------
 *                        extends
 *             1) 인터페이스 =======> 인터페이스     
 *                => 다중 상속이 가능
 *                interface A
 *                interface B
 *                interface C extends A,B
 *                                    ---
 *                        implements            
 *             2) 인터페이스 =======> 클래스                       
 *                => 다중 상속이 가능
 *                interface A 
 *                interface B
 *                class C implements A,B
 *                
 *                     extends
 *             3) 클래스 ======> 클래스
 *                => 단일 상속만 지원
 *                class A
 *                class B extends A
 *                
 *             4) 혼합 
 *                interface A
 *                interface B 
 *                class C
 *                class D (클래스 상속) (인터페이스 상속)
 *                class D extends C implements A,B => 윈도우에서만 등장 
 *                        --------- --------------       
 *                *** 특별한 경우가 아닌 경우 => 웹은 주로 사용하는 것 => 클래스를 묶어서 관리 
 *                                        -------
 *                                        서로 다른 클래스 연결해서 사용 
 *                                                
 *        내부 클래스 => 네트워크 , 게임 
 *                   -------
 *                    => 접속을 받는 클래스 / 클라이언트 통신
 *                       -------------  -----------
 *                             |             |
 *                             --------------- IP,PORT => 클래스와 클래스간의 공통으로 사용되는 변수, 메소드가 있는 경우 사용                                                     
 */
public class 인터페이스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
