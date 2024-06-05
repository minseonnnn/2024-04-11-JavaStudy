package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControllPanel extends JPanel{
   public CardLayout card=new CardLayout();	
   public ControllPanel()
   {
	   setLayout(card);
	   setBackground(Color.LIGHT_GRAY);
   }
}
