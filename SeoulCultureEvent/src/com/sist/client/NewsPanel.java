<<<<<<< HEAD
package com.sist.client;

import javax.swing.*;
public class NewsPanel extends JPanel{
	public JTextField tf;
	public JButton b1;
	public NewsPanel()
	{
		tf=new JTextField();
		b1=new JButton("검색");
		
		setLayout(null); 
		tf.setBounds(20, 20, 300, 25);
		add(tf);

		JPanel p=new JPanel();
		p.add(b1);
		p.setBounds(120, 20, 480, 35);
		add(p);
	}

}
=======
package com.sist.client;

import javax.swing.*;
public class NewsPanel extends JPanel{
	public JTextField tf;
	public JButton b1;
	public NewsPanel()
	{
		tf=new JTextField();
		b1=new JButton("검색");
		
		setLayout(null); 
		tf.setBounds(20, 20, 300, 25);
		add(tf);

		JPanel p=new JPanel();
		p.add(b1);
		p.setBounds(120, 20, 480, 35);
		add(p);
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
