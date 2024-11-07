<<<<<<< HEAD
package com.sist.client;
import java.awt.GridLayout;

import javax.swing.*;
// 홈 검색 채팅 게시판 뉴스 ...
public class MenuPanel extends JPanel{
   public JButton b1,b2,b3,b4,b5,b6;
   // 초기화 => 배치
   public MenuPanel()
   {
	   setLayout(new GridLayout(1,5,5,5)); 
	   b1=new JButton("홈"); 
	   b2=new JButton("검색");
	   b3=new JButton("뉴스");
	   b4=new JButton("행사후기");
	   b5=new JButton("채팅");
	   b6=new JButton("나가기");
	   // 추가
	   add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
   }
}
=======
package com.sist.client;
import java.awt.GridLayout;

import javax.swing.*;
// 홈 검색 채팅 게시판 뉴스 ...
public class MenuPanel extends JPanel{
   public JButton b1,b2,b3,b4,b5,b6;
   // 초기화 => 배치
   public MenuPanel()
   {
	   setLayout(new GridLayout(1,5,5,5)); 
	   b1=new JButton("홈"); 
	   b2=new JButton("검색");
	   b3=new JButton("뉴스");
	   b4=new JButton("행사후기");
	   b5=new JButton("채팅");
	   b6=new JButton("나가기");
	   // 추가
	   add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
   }
}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
