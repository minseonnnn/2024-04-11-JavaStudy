package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;
// 기능별로 나눠서 처리 => 분업
import javax.swing.*;
public class ControllerPanel extends JPanel{
   public CardLayout card=new CardLayout();
   public HomePanel hp=new HomePanel();
   public FindPanel fp=new FindPanel();
   public NewsPanel np=new NewsPanel();
   public DetailPanel dp=new DetailPanel();
   
   
   public ControllerPanel()
   {
      setLayout(card);
      add("FIND",fp);
      add("HOME",hp);
      add("NEWS",np);
      add("REVIEW",dp);
      
   }
}
