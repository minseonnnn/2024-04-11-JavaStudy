<<<<<<< HEAD
/*
 *   70page
 *   => for문과 동일한 반복문
 *   => 몇회 반복해서 원하는 값을 얻는다 
 *      ------- for
 *   => 반복 횟수가 명확하지 않는 경우
 *      ---------------- while
 *   => 개발자의 사용하는 %
 *   while 
 *   ----- 파일 읽기 , (데이터베이스 읽기) , 네트워크 서버 
 *         ------------------------------------ Back-End (while)
 *         화면 출력 , 페이지 나누기 ....
 *         ------------------------------------ Front-End (for) 
 *   형식)
 *        초기값
 *        while(조건식)
 *        {
 *           반복 수행 문장
 *           증가식 
 *        }
 *   순서)    
 *        초기값 -----------------------  1
 *        while(조건식)  ---------------  2
 *        {
 *           반복 수행 문장  ------------  3
 *           증가식   ------------------  4  --------> 2번으로 이동
 *        }       
 *        
 *        1 => 2-3-4 => 2-3-4 => 2-3-4 => 2번 false 종료
 *        => 1차 while
 *        
 *        주로 => while은 무한루프시에 주로 사용
 *               for(;;)
 *               while(true) *** 주로 사용
 *               
 *        1) 1~10까지 출력
 *           for(int i=1;i<=10;i++)
 *           {
 *              System.out.print(i+" ")
 *           }       
 *           
 *           int i=1;
 *           while(i<=10)
 *           {
 *              System.out.print(i+" ")
 *              i++;
 *           }
 */
/*
 *   자바 어렵다
 *   ---------
 *   오라클 => SQL
 *   ------------
 *   HTML/CSS/JavaScript
 *   --------------------
 *   JSP => 1차 => ERD,FlowChart => 설계 => 아이템 기획 
 *   ----
 *   Spring => 2차
 *   ------------------------
 *   Spring-Boot => 3차
 *   -----------
 *   Python
 *   -----------
 *   React
 *   ------------------------
 */
public class 자바제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== for문 =====");
		// => 개발자 80% 정도가 for
		for (int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n===== while문 =====");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}

	}

}
=======
/*
 *   70page
 *   => for문과 동일한 반복문
 *   => 몇회 반복해서 원하는 값을 얻는다 
 *      ------- for
 *   => 반복 횟수가 명확하지 않는 경우
 *      ---------------- while
 *   => 개발자의 사용하는 %
 *   while 
 *   ----- 파일 읽기 , (데이터베이스 읽기) , 네트워크 서버 
 *         ------------------------------------ Back-End (while)
 *         화면 출력 , 페이지 나누기 ....
 *         ------------------------------------ Front-End (for) 
 *   형식)
 *        초기값
 *        while(조건식)
 *        {
 *           반복 수행 문장
 *           증가식 
 *        }
 *   순서)    
 *        초기값 -----------------------  1
 *        while(조건식)  ---------------  2
 *        {
 *           반복 수행 문장  ------------  3
 *           증가식   ------------------  4  --------> 2번으로 이동
 *        }       
 *        
 *        1 => 2-3-4 => 2-3-4 => 2-3-4 => 2번 false 종료
 *        => 1차 while
 *        
 *        주로 => while은 무한루프시에 주로 사용
 *               for(;;)
 *               while(true) *** 주로 사용
 *               
 *        1) 1~10까지 출력
 *           for(int i=1;i<=10;i++)
 *           {
 *              System.out.print(i+" ")
 *           }       
 *           
 *           int i=1;
 *           while(i<=10)
 *           {
 *              System.out.print(i+" ")
 *              i++;
 *           }
 */
/*
 *   자바 어렵다
 *   ---------
 *   오라클 => SQL
 *   ------------
 *   HTML/CSS/JavaScript
 *   --------------------
 *   JSP => 1차 => ERD,FlowChart => 설계 => 아이템 기획 
 *   ----
 *   Spring => 2차
 *   ------------------------
 *   Spring-Boot => 3차
 *   -----------
 *   Python
 *   -----------
 *   React
 *   ------------------------
 */
public class 자바제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== for문 =====");
		// => 개발자 80% 정도가 for
		for (int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n===== while문 =====");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}

	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
