<<<<<<< HEAD
package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControllPanel extends JPanel{
   CardLayout card=new CardLayout();
   //EmpListPanel ep=new EmpListPanel();
   HomePanel hp;
   BooksDetailPanel dp;
   BookFindPanel fp;
   BoardListPanel bp;
   BoardInsertPanel bip;
   BoardDetailPanel bdp;
   BoardDeletePanel bdelP;
   BoardUpdatePanel bup;
   MyPagePanel mpp;
   NewsPanel np;
   ChatPanel chatP=new ChatPanel();
   // 웹에서 => 화면 변경 => Controller 
   /*
    *    처리 : Model 
    *    화면 : View 
    *    화면변경 : Controller ==> MVC
    *    
    *    최근 => Spring MVC가 사라졌다
    *          ----------- JSP 
    *                      ThymeLeaf / Vue / React => HTML
    */
   ClientMain cMain;
   public ControllPanel(ClientMain cm)
   {
	   cMain=cm;
	   setLayout(card);
	   //add("EP",ep);
	   hp=new HomePanel(this);
	   dp=new BooksDetailPanel(this);
	   fp=new BookFindPanel(this);
	   bp=new BoardListPanel(this);
	   bip=new BoardInsertPanel(this);
	   bdp=new BoardDetailPanel(this);
	   bdelP=new BoardDeletePanel(this);
	   bup=new BoardUpdatePanel(this);
	   mpp=new MyPagePanel(this);
	   np=new NewsPanel(this);
	   add("HP",hp);
	   add("CHAT",chatP);
	   add("DP",dp);
	   add("FP",fp);
	   add("LIST",bp);
	   add("INSERT",bip);
	   add("DETAIL",bdp);
	   add("DELETE",bdelP);
	   add("UPDATE",bup);
	   add("MYPAGE",mpp);
	   add("NEWS",np);
	   
	  
   }
=======
package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControllPanel extends JPanel{
   CardLayout card=new CardLayout();
   //EmpListPanel ep=new EmpListPanel();
   HomePanel hp;
   BooksDetailPanel dp;
   BookFindPanel fp;
   BoardListPanel bp;
   BoardInsertPanel bip;
   BoardDetailPanel bdp;
   BoardDeletePanel bdelP;
   BoardUpdatePanel bup;
   MyPagePanel mpp;
   NewsPanel np;
   ChatPanel chatP=new ChatPanel();
   // 웹에서 => 화면 변경 => Controller 
   /*
    *    처리 : Model 
    *    화면 : View 
    *    화면변경 : Controller ==> MVC
    *    
    *    최근 => Spring MVC가 사라졌다
    *          ----------- JSP 
    *                      ThymeLeaf / Vue / React => HTML
    */
   ClientMain cMain;
   public ControllPanel(ClientMain cm)
   {
	   cMain=cm;
	   setLayout(card);
	   //add("EP",ep);
	   hp=new HomePanel(this);
	   dp=new BooksDetailPanel(this);
	   fp=new BookFindPanel(this);
	   bp=new BoardListPanel(this);
	   bip=new BoardInsertPanel(this);
	   bdp=new BoardDetailPanel(this);
	   bdelP=new BoardDeletePanel(this);
	   bup=new BoardUpdatePanel(this);
	   mpp=new MyPagePanel(this);
	   np=new NewsPanel(this);
	   add("HP",hp);
	   add("CHAT",chatP);
	   add("DP",dp);
	   add("FP",fp);
	   add("LIST",bp);
	   add("INSERT",bip);
	   add("DETAIL",bdp);
	   add("DELETE",bdelP);
	   add("UPDATE",bup);
	   add("MYPAGE",mpp);
	   add("NEWS",np);
	   
	  
   }
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
}