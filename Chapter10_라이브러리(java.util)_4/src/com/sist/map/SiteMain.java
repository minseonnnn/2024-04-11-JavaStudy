<<<<<<< HEAD
package com.sist.map;
import java.util.*;
public class SiteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("1. 로그인 2. 회원가입 3. 공지사항 4. 게시판 5. 맛집:");
        int menu=scan.nextInt();
        if(menu==1)
        {
        	LoginModel model=new LoginModel();
        	System.out.println(model);
        	model.execute();
        }
        else if(menu==2)
        {
        	JoinModel model=new JoinModel();
        	model.execute();
        }
        else if(menu==3)
        {
        	NoticeModel model=new NoticeModel();
        	model.execute();
        }
        else if(menu==4)
        {
        	BoardModel model=new BoardModel();
        	model.execute();
        }
        else if(menu==5)
        {
        	FoodModel model=new FoodModel();
        	model.execute();
        }
        else
        {
        	System.out.println("메뉴가 존재하지 않습니다");
        }
	}

}
=======
package com.sist.map;
import java.util.*;
public class SiteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("1. 로그인 2. 회원가입 3. 공지사항 4. 게시판 5. 맛집:");
        int menu=scan.nextInt();
        if(menu==1)
        {
        	LoginModel model=new LoginModel();
        	System.out.println(model);
        	model.execute();
        }
        else if(menu==2)
        {
        	JoinModel model=new JoinModel();
        	model.execute();
        }
        else if(menu==3)
        {
        	NoticeModel model=new NoticeModel();
        	model.execute();
        }
        else if(menu==4)
        {
        	BoardModel model=new BoardModel();
        	model.execute();
        }
        else if(menu==5)
        {
        	FoodModel model=new FoodModel();
        	model.execute();
        }
        else
        {
        	System.out.println("메뉴가 존재하지 않습니다");
        }
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
