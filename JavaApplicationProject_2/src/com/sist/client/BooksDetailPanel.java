package com.sist.client;

import javax.swing.*;
import java.net.*;

import com.sist.commons.ImageChange;
import com.sist.dao.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;


public class BooksDetailPanel extends JPanel implements ActionListener, ItemListener {
    JLabel la1, la2, la3, la4, la5, la6, la7, la8;
    JButton b1, b2;
    JComboBox<Integer> box;
    JLabel pLa, tLa, noteLa;
    ControllPanel cp; // 화면 이동을 위한 ControllPanel 객체
    BooksDAO dao; // 데이터베이스 접근을 위한 GoodsDAO 객체
    int bnum=0;
    String myId;
    public BooksDetailPanel(ControllPanel cp) 
    {
    	
        dao=BooksDAO.newInstance(); // GoodsDAO 객체 생성
        this.cp = cp; // ControllPanel 객체 할당

        setLayout(null); // 레이아웃 설정

        // JLabel 초기화 및 위치 설정
        la1 = new JLabel();
        la1.setBounds(10, 15, 450, 550);
        add(la1);

        la2 = new JLabel();
        la2.setBounds(470, 15, 440, 110);
        la2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        add(la2);

        la3 = new JLabel();
        la3.setBounds(470, 125, 400, 30);
        la3.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        add(la3);

        la4 = new JLabel();
        la4.setBounds(470, 155, 400, 30);
        la4.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        add(la4);

        la5 = new JLabel();
        la5.setBounds(470, 190, 200, 30);
        la5.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        add(la5);

        la6 = new JLabel();
        la6.setBounds(470, 225, 400, 30); 
        la6.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        add(la6);

        la7 = new JLabel();
        la7.setBounds(470, 260, 400, 30); 
        la7.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        add(la7);

        la8 = new JLabel();
        la8.setBounds(470, 295, 300, 30); 
        la8.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        add(la8);

        pLa = new JLabel("수량: ");
        pLa.setBounds(470, 330, 40, 30);
        pLa.setFont(new Font("맑은 고딕",Font.PLAIN,15));
		add(pLa);

        // JButton 초기화 및 위치 설정
        b1 = new JButton("장바구니");
        b2 = new JButton("목록");
        JPanel p=new JPanel();
        b1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
        b2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
        b1.setBackground(new Color(255,150,157));
		b2.setBackground(new Color(156,156,156));
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		p.add(b1);p.add(b2);
		p.setBounds(400, 510, 450, 100);
		add(p);

        tLa = new JLabel("구매 총 가격: ");
        tLa.setBounds(470, 420, 380, 40);
        tLa.setFont(new Font("맑은 고딕",Font.BOLD,20));
        add(tLa);

        // JComboBox 초기화 및 위치 설정
        box = new JComboBox<Integer>();
        box.addItem(1);
        box.addItem(2);
        box.addItem(3);
        box.addItem(4);
        box.addItem(5);
        box.addItem(6);
        box.addItem(7);
        box.setBounds(530, 330, 100, 30);
        add(box);
        
        noteLa = new JLabel("최대 구매 가능 수량은 7개입니다."); 
		noteLa.setFont(new Font("맑은 고딕",Font.BOLD,13));
		noteLa.setForeground(Color.red);
		noteLa.setBounds(470, 370, 200, 30);
		add(noteLa);

        // ActionListener 및 ItemListener 등록
        b2.addActionListener(this);
        b1.addActionListener(this);
        box.addItemListener(this);
    }

    public void print(int num) 
    {
    	bnum=num;
        // 1. 오라클 데이터베이스에서 데이터를 가져온다
    	BooksVO vo=dao.BooksDetailData(num);

        // 2. 데이터를 GUI에 표시
        try {
            URL url = new URL(vo.getImage());
            Image img = ImageChange.getImage(new ImageIcon(url), 400, 500);
            la1.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        la2.setText("<html><font size= 5>"+vo.getBookname()+"</font></html>");
        la3.setText("지은이: "+ vo.getWriter());
        la4.setText("옮긴이: "+vo.getTranslator());
        la5.setText("페이지: "+vo.getPage());
        la6.setText("가격: "+vo.getPrice()+"원");
        la7.setText("발행일: "+vo.getPubdate());
        la8.setText("시리즈: "+vo.getSeries());

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // JComboBox의 선택이 변경될 때 호출되는 메서드
        if (e.getSource() == box) {
            String price = la6.getText();
            price = price.substring(price.indexOf(":") + 1);
            price = price.replaceAll("[^0-9]","");

            int account=box.getSelectedIndex()+1; // 선택된 수량
            int total=Integer.parseInt(price)*account; // 총 구매 가격 계산

            DecimalFormat df=new DecimalFormat("##,###,###");
            String s=df.format(total);
            tLa.setText("구매 총 가격:" + s + "원");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // JButton 클릭 시 호출되는 메서드
        if (e.getSource()==b2) {
            cp.card.show(cp, "HP"); // 목록 버튼 클릭 시 홈 패널로 화면 전환
        }
        else if(e.getSource()==b1)
		{
			CartVO vo=new CartVO();
			vo.setBnum(bnum);
			
			String id=cp.cMain.myId;
			
			vo.setId(id);
			
			int account=box.getSelectedIndex()+1;
			vo.setAccount(account);
			String price=tLa.getText();
			price=price.replaceAll("[^0-9]", "");
			vo.setPrice(Integer.parseInt(price));
			
			dao.bookCartInsert(vo);
			JOptionPane.showMessageDialog(this, "장바구니에 추가되었습니다\n마이페이지에서 확인하세요");
			// 이동 => 마이페이지 이동 
			cp.card.show(cp, price);
		}
    }
}