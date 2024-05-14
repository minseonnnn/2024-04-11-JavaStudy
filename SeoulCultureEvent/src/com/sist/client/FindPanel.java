package com.sist.client;
import java.awt.Color;

import javax.swing.*;
public class FindPanel extends JPanel{
   public JTextField tf;
   public JButton b1;
   public FindPanel()
   {
	   tf=new JTextField();
		
	   b1=new JButton("검색");
	   
	   setLayout(null); 
	   tf.setBounds(400, 20, 300, 25);
	   
	   add(tf);
	   
	   JPanel p=new JPanel();
	   p.add(b1);
	   
	   p.setBounds(500, 20, 480, 25);
	   add(p);
      
   }
}
