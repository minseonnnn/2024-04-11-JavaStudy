package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ClientMain extends JFrame implements ActionListener{
    public MenuPanel mp=new MenuPanel();
    public ControllerPanel cp=new ControllerPanel();
    public ClientMain()
    {
    	setTitle("SeoulCultureEvent");
    	
    	setLayout(null);
        mp.setBounds(150, 15, 600, 30);
        add(mp);
        cp.setBounds(0, 50, 800, 530);
        add(cp);

        setSize(800, 600);
    	setVisible(true);

    	setResizable(false);

    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	mp.b1.addActionListener(this);// b1버튼을 클릭하면 => actionPeformed를 호출
    	mp.b2.addActionListener(this);
    	mp.b6.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		    UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");	
		}catch(Exception ex){}
        new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(mp.b1==e.getSource()) // 메뉴 1번 버튼 클릭
		{
			cp.card.show(cp, "HOME");
		}
		else if(mp.b2==e.getSource()) // 메뉴 2번 버튼 클릭
		{
			cp.card.show(cp, "FIND");
		}
		else if(mp.b6==e.getSource())
		{
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다");
			System.exit(0);
		}
		
	}

}

