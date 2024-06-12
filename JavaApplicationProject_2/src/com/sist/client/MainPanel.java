package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class MainPanel extends JPanel{
     MenuPanel menuP=new MenuPanel();
     ControllPanel ctrP=new ControllPanel();
     
     //EmpListPanel ep=new EmpListPanel();
     public MainPanel()
     {
    	 setLayout(new BorderLayout());
    	 add("MENU", menuP);
    	 add("Center",ctrP);
    	 
     }
}