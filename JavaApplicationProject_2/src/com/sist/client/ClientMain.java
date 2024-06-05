package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ClientMain extends JFrame implements ActionListener{
    CardLayout card=new CardLayout();
    LoginPanel lp=new LoginPanel();
    MainPanel mp=new MainPanel();
    MenuPanel me=new MenuPanel();
    FindPanel fp=new FindPanel();
    public ControllPanel cp=new ControllPanel();
    public ClientMain()
    {
    	
    	setLayout(card);
    	add("MP",mp);
    	add("LOGIN",lp);
    	add("MENU",me);
    	add("FIND",fp);
    	
    	setSize(960, 700);
    	setResizable(false);
    	setVisible(true);
    	
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	me.homeBtn.addActionListener(this);
    	me.findBtn.addActionListener(this);
    	me.exitBtn.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
        new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(me.homeBtn==e.getSource()) 
		{
			cp.card.show(cp, "HOME");
		}
		else if(me.findBtn==e.getSource()) 
		{
			cp.card.show(cp, "FIND");
		}
		else if(me.exitBtn==e.getSource())
		{
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다");
			System.exit(0);
		}
		
	}

	
}
