<<<<<<< HEAD
package com.sist.client;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.sist.dao.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.sist.commons.*;
import java.util.*;
import java.util.List;
import java.net.*;
public class HomePanel extends JPanel implements ActionListener, MouseListener{
    JPanel pan=new JPanel(); // 12개 이미지 출력 
    JButton b1,b2; // 이전 , 다음 
    JLabel la=new JLabel("0 page / 0 pages");
    JLabel[] imgs=new JLabel[12]; 
    
    JLabel titleLa;
	JTable bestTable;
	DefaultTableModel model;

    int curpage=1; // 현재 페이지 
    int totalpage=0; // 총페이지 
    // 데이터베이스 연결
    BooksDAO dao;
    // 초기화 
    TableColumn column;
    ControllPanel cp;
    String myId;
    int number=1;
    public HomePanel(ControllPanel cp)
    {
    	this.cp=cp;
    	dao=BooksDAO.newInstance();
    	pan.setLayout(new GridLayout(3,4,3,3));
    	pan.setBounds(20, 17, 650, 620);

    	setLayout(null);
	    add(pan);

    	b1=new JButton("이전");
    	b2=new JButton("다음");
    	setLayout(null);
    	JPanel p=new JPanel();
    	b1.setFont(new Font("맑은 고딕",Font.PLAIN,15));
    	b1.setFont(new Font("맑은 고딕",Font.PLAIN,15));
    	p.add(b1);p.add(la);p.add(b2);
    	p.setBounds(100, 640, 600, 30);
    	add(p);

    	print();
    	
		setLayout(null);
	    titleLa = new JLabel("베스트셀러");
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		titleLa.setBounds(720,25,130,50);
		add(titleLa);
		
		String[] col = {"순위","도서명","."};
		Object[][] row = new String[0][3];
		model = new DefaultTableModel(row,col)
		{
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};

		bestTable = new JTable(model);
		bestTable.setRowHeight(30);
		bestTable.getTableHeader().setBackground(Color.pink);
		JScrollPane js = new JScrollPane(bestTable);
		js.setBounds(670,75,230,400);
		add(js);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		bestTable.addMouseListener(this);
		
		for(int i=0;i<col.length;i++)
    	{
    		column=bestTable.getColumnModel().getColumn(i);
    		if(i==0)
    			column.setPreferredWidth(30);
    		else if(i==1)
    			column.setPreferredWidth(200);
    		else if(i==2)
    			column.setPreferredWidth(0);
    	}
			// 데이터 첨부
			BooksDAO dao = BooksDAO.newInstance();
			List<CartVO> list = dao.bestSeller();  
			for(CartVO vo: list)
			{
				try{
					Object[] data = {
						 
						number,
						vo.getGvo().getBookname(),
						vo.getBnum()
					};
					
					model.addRow(data);
				}catch(Exception ex) {ex.printStackTrace();}
				number++;
			}
			   
	}

    public void print()
    {
    	totalpage=dao.BooksTotalPage();
    	ArrayList<BooksVO> list=dao.BooksListData(curpage);
    	for(int i=0;i<list.size();i++)
    	{
    		BooksVO vo=list.get(i);
    		try
    		{
    			URL url=new URL(vo.getImage());
    			Image img=ImageChange.getImage(new ImageIcon(url), 110, 140);
    			// 이미지 크기 축소 
    			imgs[i]=new JLabel(new ImageIcon(img));
    			imgs[i].setToolTipText(vo.getBookname()+"^"+vo.getNum());
    			pan.add(imgs[i]);
    			imgs[i].addMouseListener(this);
    		}catch(Exception ex){}
    	}
    	la.setText(curpage+" page / "+totalpage+" pages");
    	la.setFont(new Font("맑은 고딕",Font.PLAIN,15));
    }
    public void init()
    {
    	for(int i=0;i<imgs.length;i++)
    	{
    		imgs[i]=new JLabel("");
    	}
    	pan.removeAll();
    	pan.validate();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			if(curpage>1)
			{
				curpage--;
				init();
				print();
			}
		}
		else if(e.getSource()==b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				init();
				print();
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				if(e.getClickCount()==2)
				{
					String no=imgs[i].getToolTipText();
					no=no.substring(no.lastIndexOf("^")+1);
					cp.dp.print(Integer.parseInt(no));
					cp.card.show(cp, "DP");
				}
			}
		}
		if(e.getSource()==bestTable)
		{
			if(e.getClickCount()==2)
			{
				int row=bestTable.getSelectedRow();
				String no=model.getValueAt(row, 2).toString();
				cp.dp.print(Integer.parseInt(no));
				cp.card.show(cp, "DP");
				
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				imgs[i].setBorder(new LineBorder(Color.blue,2));
			}
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				imgs[i].setBorder(null);
			}
		}
	}
    
}




=======
package com.sist.client;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.sist.dao.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.sist.commons.*;
import java.util.*;
import java.util.List;
import java.net.*;
public class HomePanel extends JPanel implements ActionListener, MouseListener{
    JPanel pan=new JPanel(); // 12개 이미지 출력 
    JButton b1,b2; // 이전 , 다음 
    JLabel la=new JLabel("0 page / 0 pages");
    JLabel[] imgs=new JLabel[12]; 
    
    JLabel titleLa;
	JTable bestTable;
	DefaultTableModel model;

    int curpage=1; // 현재 페이지 
    int totalpage=0; // 총페이지 
    // 데이터베이스 연결
    BooksDAO dao;
    // 초기화 
    TableColumn column;
    ControllPanel cp;
    String myId;
    int number=1;
    public HomePanel(ControllPanel cp)
    {
    	this.cp=cp;
    	dao=BooksDAO.newInstance();
    	pan.setLayout(new GridLayout(3,4,3,3));
    	pan.setBounds(20, 17, 650, 620);

    	setLayout(null);
	    add(pan);

    	b1=new JButton("이전");
    	b2=new JButton("다음");
    	setLayout(null);
    	JPanel p=new JPanel();
    	b1.setFont(new Font("맑은 고딕",Font.PLAIN,15));
    	b1.setFont(new Font("맑은 고딕",Font.PLAIN,15));
    	p.add(b1);p.add(la);p.add(b2);
    	p.setBounds(100, 640, 600, 30);
    	add(p);

    	print();
    	
		setLayout(null);
	    titleLa = new JLabel("베스트셀러");
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		titleLa.setBounds(720,25,130,50);
		add(titleLa);
		
		String[] col = {"순위","도서명","."};
		Object[][] row = new String[0][3];
		model = new DefaultTableModel(row,col)
		{
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};

		bestTable = new JTable(model);
		bestTable.setRowHeight(30);
		bestTable.getTableHeader().setBackground(Color.pink);
		JScrollPane js = new JScrollPane(bestTable);
		js.setBounds(670,75,230,400);
		add(js);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		bestTable.addMouseListener(this);
		
		for(int i=0;i<col.length;i++)
    	{
    		column=bestTable.getColumnModel().getColumn(i);
    		if(i==0)
    			column.setPreferredWidth(30);
    		else if(i==1)
    			column.setPreferredWidth(200);
    		else if(i==2)
    			column.setPreferredWidth(0);
    	}
			// 데이터 첨부
			BooksDAO dao = BooksDAO.newInstance();
			List<CartVO> list = dao.bestSeller();  
			for(CartVO vo: list)
			{
				try{
					Object[] data = {
						 
						number,
						vo.getGvo().getBookname(),
						vo.getBnum()
					};
					
					model.addRow(data);
				}catch(Exception ex) {ex.printStackTrace();}
				number++;
			}
			   
	}

    public void print()
    {
    	totalpage=dao.BooksTotalPage();
    	ArrayList<BooksVO> list=dao.BooksListData(curpage);
    	for(int i=0;i<list.size();i++)
    	{
    		BooksVO vo=list.get(i);
    		try
    		{
    			URL url=new URL(vo.getImage());
    			Image img=ImageChange.getImage(new ImageIcon(url), 110, 140);
    			// 이미지 크기 축소 
    			imgs[i]=new JLabel(new ImageIcon(img));
    			imgs[i].setToolTipText(vo.getBookname()+"^"+vo.getNum());
    			pan.add(imgs[i]);
    			imgs[i].addMouseListener(this);
    		}catch(Exception ex){}
    	}
    	la.setText(curpage+" page / "+totalpage+" pages");
    	la.setFont(new Font("맑은 고딕",Font.PLAIN,15));
    }
    public void init()
    {
    	for(int i=0;i<imgs.length;i++)
    	{
    		imgs[i]=new JLabel("");
    	}
    	pan.removeAll();
    	pan.validate();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			if(curpage>1)
			{
				curpage--;
				init();
				print();
			}
		}
		else if(e.getSource()==b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				init();
				print();
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				if(e.getClickCount()==2)
				{
					String no=imgs[i].getToolTipText();
					no=no.substring(no.lastIndexOf("^")+1);
					cp.dp.print(Integer.parseInt(no));
					cp.card.show(cp, "DP");
				}
			}
		}
		if(e.getSource()==bestTable)
		{
			if(e.getClickCount()==2)
			{
				int row=bestTable.getSelectedRow();
				String no=model.getValueAt(row, 2).toString();
				cp.dp.print(Integer.parseInt(no));
				cp.card.show(cp, "DP");
				
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				imgs[i].setBorder(new LineBorder(Color.blue,2));
			}
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				imgs[i].setBorder(null);
			}
		}
	}
    
}




>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
