<<<<<<< HEAD
package com.sist.commons;
import java.util.*;
import java.awt.*;
import java.net.*;
import javax.swing.*;
// https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87864/87864_320.jpg
public class MainClass extends JFrame{
    JLabel la;
    public MainClass()
    {
    	setLayout(null);
    	la=new JLabel();
    	la.setBounds(30, 50, 300, 450);
    	add(la);
    	try
    	{
    		URL url=new URL("https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87864/87864_320.jpg");
    		Image img=ImageChange.getImage(new ImageIcon(url), 300, 450);// 이미지 크기 맞추기
    		la.setIcon(new ImageIcon(img));
    	}catch(Exception ex) {}
    	setSize(370, 550);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass();
	}

}
=======
package com.sist.commons;
import java.util.*;
import java.awt.*;
import java.net.*;
import javax.swing.*;
// https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87864/87864_320.jpg
public class MainClass extends JFrame{
    JLabel la;
    public MainClass()
    {
    	setLayout(null);
    	la=new JLabel();
    	la.setBounds(30, 50, 300, 450);
    	add(la);
    	try
    	{
    		URL url=new URL("https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87864/87864_320.jpg");
    		Image img=ImageChange.getImage(new ImageIcon(url), 300, 450);// 이미지 크기 맞추기
    		la.setIcon(new ImageIcon(img));
    	}catch(Exception ex) {}
    	setSize(370, 550);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass();
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
