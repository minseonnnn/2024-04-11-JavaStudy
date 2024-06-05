package com.sist.client;
import java.awt.Color;

import javax.swing.*;
public class FindPanel extends JPanel{
	JButton search, entire, add, edit, del;
	JTextField searchT;
	JTextArea list;
   public FindPanel()
   {
	   setBackground(Color.white);
	   
	   searchT=new JTextField();
	   search=new JButton("검색");

	   JPanel p=new JPanel();
	   p.add(search);
	   p.setBounds(650, 615, 265, 35);
	   add(p);
	   
	   list=new JTextArea();
	   
	   entire=new JButton("전체보기");
	   add=new JButton("추가");
	   edit=new JButton("삭제");
	   del=new JButton("수정");
   }
}