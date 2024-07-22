package com.sist.main;
/*
 *    1. 클래스의 구성
 *       데이터 + 기능
 *       ----   ---
 *              | 멤버메소드
 *       | 멤버변수
 *         ----- 초기화 (값을 저장) : 초기화 블록 / 생성자
 *                                         ------
 *       데이터
 *       ----
 *        = 클래스에서는 다른 데이터형을 모아서 관리 / 전송(브라우저,윈도우) => 한번에 모아서 전송 
 *        ------------------------------------------------------------------------
 *        = 인스턴스 변수 : new를 사용할때마다 메모리에 따로 저장되는 변수  (*****)
 *        = 정적 변수 : 컴파일러에 의해서 자동으로 저장 => 메모리 공간 1개 (모든 클래스에서 공유)       
 *          1) 자동으로 기본 초기화
 *             int, long=0 , double=0.0 , boolean=false , class => null
 *             --------------------------------------------------------
 *             사용 가능
 *             ------- 기본형 , 클래스 , 배열 
 *        ---------------------------------- 다른 클래스에서도 연결해서 사용이 가능 (프로그램 종료시까지 유지)
 *        = 지역 변수 : 메소드안에서만 사용이 가능한 변수
 *                   => 지역변수, 매개변수
 *                   => 루프변수, 임시변수
 *                   ----------------------- 메소드가 종료가 되면 자동으로 사라지는 변수                
 *                   *** 변수의 초기화가 없다 (반드시 초기화 후에 사용)
 *        = 객체 생성시 호출해야되는 메소드 : 생성자
 *          생성자는 필요시에 사용한다 
 *          ** 멤버변수 , 정적변수 , 메소드 , 생성자 => 필요한 것만 골라서 사용이 가능 
 *             ---------------------------- 구성요소는 다 필요한 것이 아니다 
 *             => 변수
 *             => 메소드
 *             => 변수 + 메소드 
 *             => 변수 + 생성자 
 *             => 변수 + 메소드 + 생성자 
 *           생성자는 변수에 대한 초기화
 *           생성자는 시작과 동시에 동작하는 내용 
 *           ------------------------- 화면 UI , 웹 (데이터베이스 연결,자동 로그인,쿠키읽기,권한부여)
 *           생성자 
 *           ----
 *             여러개 사용이 가능 , 없는 경우 (자동으로 컴파일러가 첨부 = 매개변수가 없는 생성자 : 디폴트 생성자)
 *             => 상속의 예외 조건
 *                ============
 *             => 클래스명과 동일 
 *             => 리턴형이 없다
 *             => 객체 생성시에 호출되는 메소드
 *             => 다른 클래스에서도 사용이 가능 => public 
 *             => 여러개가 있는 경우 => 오버로딩 
 *                오버로딩 : 중복 함수 정의 => 같은 이름의 메소드를 여러개 만든다
 *                => 메소드 동일
 *                => 매개변수의 갯수나 데이터형이 다르다
 *                => 리턴형은 관계없다
 *                => 접근지정어는 관계없다
 *         => 메소드
 *           ------
 *            인스턴스 메소드 : new에 의해 따로 저장 ******
 *            공통 메소드 : static => 웹 (데이터베이스 연동 , 한글변환 , 암호화 , 복호화)                  
 *            ------------------------ 접근지정어 => public (다른 클래스와 연결)
 *            형식) 
 *                public 리턴형 메소드형(매개변수...)
 *                                  ---------- 사용자 요청한 내용 (id,pwd,검색어)
 *                                   => 입력/동작 
 *                                         ---- 마우스 클릭, 버튼 클릭 ....                                    
 *                       ---- 사용자 요청 처리 결과 => 목록 / 상세보기 / 홈페이지 ...
 *                            출력 형태 : 목록 / 상세보기
 *                                     []    클래스 
 *                {
 *                   구현 ...
 *                   결과값 전송
 *                   --------
 *                   return ...
 *                }
 *                *** 메소드는 호출시마다 처음부터 실행해서 메소드가 종료가되는 원래 호출된 위치로 돌아온다 
 *                          -----------------   --------------------------
 *                *** 메소드 사용 이유
 *                => 반복 제거 (반복적인 코딩)
 *                           ---------- 반복문 가능 => 메소드 => 코드의 간소화
 *                => 관련된 명령문을 모아서 관리 => 가독성 (구조화된 프로그램) => 기능 분리
 *                   --------- 입력 / 출력 ...                     
 *                => 재사용 (수정,추가)    
 *
 *             => 호출
 *                멤버변수 / 메소드
 *                인스턴스
 *                  객체명.변수명 , 객체명.메소드
 *                static
 *                  클래스명.변수명 , 클래스명.메소드
 *                  
 *            *** 사용법 (코딩)
 *                변수 => 인스턴스 변수
 *                       데이터보호 => private 변수 , 다른 클래스에서 연결 
 *                                  변수의 기능 설정 => public getter/setter => 캡슐화
 *                메소드 => 인스턴스 메소드
 *                        다른 클래스와 연결 => public
 *                생성자 => 필요시에만 사용 => 자동으로 추가 : public 
 *            -------------------------- 웹사이트 => 변수 추출 / 기능 추출
 *                                                         -------- 메뉴 
 *                                       ------------------------------- 요구사향 분석
 *                                                                       ----------  
 *              어떤 데이터를 사용자에게 보여줄지 / 데이터를 보여주기 위해 어떤 기능을 설정할지
 *                => 멤버 변수                  => 멤버 메소드 
 *              시작과 동시에 어떤 화면을 보여줄지                
 *                => 생성자                            
 *              
 *                                                          
 *                                      
 */
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
