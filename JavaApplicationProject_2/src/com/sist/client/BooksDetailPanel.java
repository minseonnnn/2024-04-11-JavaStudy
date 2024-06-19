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
    JLabel pLa, tLa;
    ControllPanel cp; // 화면 이동을 위한 ControllPanel 객체
    BooksDAO dao; // 데이터베이스 접근을 위한 GoodsDAO 객체

    public BooksDetailPanel(ControllPanel cp) {
        dao=BooksDAO.newInstance(); // GoodsDAO 객체 생성
        this.cp = cp; // ControllPanel 객체 할당

        setLayout(null); // 레이아웃 설정

        // JLabel 초기화 및 위치 설정
        la1 = new JLabel();
        la1.setBounds(10, 15, 450, 550);
        add(la1);

        la2 = new JLabel();
        la2.setBounds(470, 15, 400, 45);
        add(la2);

        la3 = new JLabel();
        la3.setBounds(470, 70, 350, 30);
        add(la3);

        la4 = new JLabel();
        la4.setBounds(470, 110, 350, 30);
        add(la4);

        la5 = new JLabel();
        la5.setBounds(470, 150, 120, 30);
        add(la5);

        la6 = new JLabel();
        la6.setBounds(470, 190, 250, 30); 
        add(la6);

        la7 = new JLabel();
        la7.setBounds(470, 230, 300, 30); 
        add(la7);

        la8 = new JLabel();
        la8.setBounds(470, 270, 250, 30); 
        add(la8);

        // JButton 초기화 및 위치 설정
        b1 = new JButton("장바구니");
        b1.setBounds(470, 400, 100, 30); 
        b2 = new JButton("목록");
        b2.setBounds(590, 400, 100, 30); 

        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);
        p.setBounds(470, 500, 350, 35);
        add(p);

        // JLabel 초기화 및 위치 설정
        pLa = new JLabel("가격:");
        pLa.setBounds(470, 310, 200, 30);
        add(pLa);

        tLa = new JLabel("구매 총 가격: ");
        tLa.setBounds(470, 350, 200, 30);
        add(tLa);
        Font font = new Font("SansSerif", Font.BOLD, 15); 
        tLa.setFont(font);

        // JComboBox 초기화 및 위치 설정
        box = new JComboBox<Integer>();
        box.addItem(1);
        box.addItem(2);
        box.addItem(3);
        box.addItem(4);
        box.addItem(5);
        box.addItem(6);
        box.addItem(7);
        box.setBounds(470, 270, 200, 30);
        add(box);

        // ActionListener 및 ItemListener 등록
        b1.addActionListener(this);
        b2.addActionListener(this);
        box.addItemListener(this);
    }

    public void print(int no) {
        // 1. 오라클 데이터베이스에서 데이터를 가져온다
    	BooksVO vo=dao.BooksDetailData(no);

        // 2. 데이터를 GUI에 표시
        try {
            URL url = new URL(vo.getImage());
            Image img = ImageChange.getImage(new ImageIcon(url), 400, 500);
            la1.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        la2.setText("<html><font size= 5>"+vo.getBookname()+"</font></html>");
        la3.setText("<html><font color=gray>" +"시리즈명: "+ vo.getSeries() + "</font></html>");
        la4.setText("지은이: "+ vo.getWriter());
        la5.setText("가격: "+String.valueOf(vo.getPrice()));
        la6.setText("페이지 수: " + vo.getPage());
        la7.setText("출간일: " + vo.getPubdate());

        pLa.setText("가격: " + vo.getPrice());
        tLa.setText("구매 총 가격:" + vo.getPrice());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // JComboBox의 선택이 변경될 때 호출되는 메서드
        if (e.getSource() == box) {
            String price = pLa.getText();
            price = price.substring(price.indexOf(":") + 1);
            price = price.replaceAll("[^0-9]","");

            int account = (int) box.getSelectedItem(); // 선택된 수량
            int total = Integer.parseInt(price) * account; // 총 구매 가격 계산

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
    }
}