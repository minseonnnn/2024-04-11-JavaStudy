<<<<<<< HEAD
package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class PostFindFrame extends JFrame{
     JTextField tf;
     JButton b1,b2;
     JTable table;
     DefaultTableModel model;
     public PostFindFrame()
     {
    	 setLayout(new BorderLayout());
    	 tf=new JTextField(15);
    	 b1=new JButton("검색");
    	 b2=new JButton("취소");
    	 JPanel p=new JPanel();
    	 p.add(tf); p.add(b1); p.add(b2);
    	 add("North",p);
    	 
    	 String[] col= {"우편번호","주소"};
    	 String[][] row=new String[0][2];
    	 model=new DefaultTableModel(row,col)
         {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    		 
         };
         table=new JTable(model);
         JScrollPane js=new JScrollPane(table);
         add("Center",js);
         
         setSize(450, 300);
     }
}
=======
package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class PostFindFrame extends JFrame{
     JTextField tf;
     JButton b1,b2;
     JTable table;
     DefaultTableModel model;
     public PostFindFrame()
     {
    	 setLayout(new BorderLayout());
    	 tf=new JTextField(15);
    	 b1=new JButton("검색");
    	 b2=new JButton("취소");
    	 JPanel p=new JPanel();
    	 p.add(tf); p.add(b1); p.add(b2);
    	 add("North",p);
    	 
    	 String[] col= {"우편번호","주소"};
    	 String[][] row=new String[0][2];
    	 model=new DefaultTableModel(row,col)
         {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    		 
         };
         table=new JTable(model);
         JScrollPane js=new JScrollPane(table);
         add("Center",js);
         
         setSize(450, 300);
     }
}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
