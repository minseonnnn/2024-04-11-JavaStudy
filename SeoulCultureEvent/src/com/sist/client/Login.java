<<<<<<< HEAD
package com.sist.client;
import javax.swing.*;
public class Login extends JFrame{
	public JLabel la1,la2;
	public JTextField tf;
	public JPasswordField pf;
	public JButton b1,b2;
	
	public Login()
	{
		setTitle("로그인");
		// 초기화
		la1=new JLabel("아이디");
		la2=new JLabel("비밀번호");
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		setLayout(null); 
		la1.setBounds(10, 15, 80, 30);
		tf.setBounds(100, 15, 200, 30);

		add(la1); add(tf);
		
		la2.setBounds(10, 50, 80, 30);
		pf.setBounds(100, 50, 200, 30);

		add(la2); add(pf);
		
		JPanel p=new JPanel();
		p.add(b1);p.add(b2); 
		
		p.setBounds(10, 90, 290, 35);
		add(p);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Login();
	}

}
	
=======
package com.sist.client;
import javax.swing.*;
public class Login extends JFrame{
	public JLabel la1,la2;
	public JTextField tf;
	public JPasswordField pf;
	public JButton b1,b2;
	
	public Login()
	{
		setTitle("로그인");
		// 초기화
		la1=new JLabel("아이디");
		la2=new JLabel("비밀번호");
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		setLayout(null); 
		la1.setBounds(10, 15, 80, 30);
		tf.setBounds(100, 15, 200, 30);

		add(la1); add(tf);
		
		la2.setBounds(10, 50, 80, 30);
		pf.setBounds(100, 50, 200, 30);

		add(la2); add(pf);
		
		JPanel p=new JPanel();
		p.add(b1);p.add(b2); 
		
		p.setBounds(10, 90, 290, 35);
		add(p);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Login();
	}

}
	
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
