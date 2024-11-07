<<<<<<< HEAD
package com.sist.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.*;
import com.sist.dao.*;
import javax.swing.border.LineBorder; // LineBorder 추가

public class BoardDetailPanel extends JPanel implements ActionListener {
    JLabel titleLa, nameLa, noLa, subLa, dayLa, hitLa;
    JLabel name, no, sub, day, hit;
    JTextArea ta;
    JButton b1, b2, b3; // 수정 / 삭제 / 목록
    // nextJS , MSA , DevOps , CI/CD , Docker , 쿠바네티스 , 잰킨스
    // JavaScript => TypeScript
    ControllPanel cp;
    BoardDAO dao;

    public BoardDetailPanel(ControllPanel cp) {
        this.cp = cp;
        dao = BoardDAO.newInstance();

        titleLa = new JLabel("게시판", JLabel.CENTER);// <table>
        titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 25)); //<h3></h3>
        setLayout(null);
        titleLa.setBounds(155, 20, 620, 50);
        add(titleLa);

        noLa = new JLabel("번호", JLabel.CENTER);
        noLa.setOpaque(true);
        noLa.setBackground(new Color(192, 192, 192));
        noLa.setBounds(120, 95 , 80, 30);
        no = new JLabel("", JLabel.CENTER);
        no.setBounds(205, 95, 120, 30);
        // 테두리 추가
        //no.setBorder(new LineBorder(Color.GRAY));
        add(noLa);
        add(no);

        dayLa = new JLabel("작성일", JLabel.CENTER);
        dayLa.setBounds(450, 95 , 80, 30);
        dayLa.setOpaque(true);
        dayLa.setBackground(new Color(192, 192, 192));
        day = new JLabel("", JLabel.CENTER);
        day.setBounds(500, 95, 200, 30);
        // 테두리 추가
        //day.setBorder(new LineBorder(Color.GRAY));
        add(dayLa);
        add(day);

        nameLa = new JLabel("이름", JLabel.CENTER);
        nameLa.setBounds(120, 130 , 80, 30);
        nameLa.setOpaque(true);
        nameLa.setBackground(new Color(192, 192, 192));
        name = new JLabel("", JLabel.CENTER);
        name.setBounds(205, 130, 120, 30);
        // 테두리 추가
        //name.setBorder(new LineBorder(Color.GRAY));
        add(nameLa);
        add(name);

        hitLa = new JLabel("조회수", JLabel.CENTER);
        hitLa.setBounds(450, 130 , 80, 30);
        hitLa.setOpaque(true);
        hitLa.setBackground(new Color(192, 192, 192));
        hit = new JLabel("", JLabel.CENTER);
        hit.setBounds(495, 130, 200, 30);
        // 테두리 추가
        //hit.setBorder(new LineBorder(Color.GRAY));
        add(hitLa);
        add(hit);

        subLa = new JLabel("제목", JLabel.CENTER);
        subLa.setBounds(120, 165, 80, 30);
        subLa.setOpaque(true);
        subLa.setBackground(new Color(192, 192, 192));
        sub = new JLabel("");
        sub.setBounds(225, 165, 400, 30);
        // 테두리 추가
        //sub.setBorder(new LineBorder(Color.GRAY));
        add(subLa);
        add(sub);

        ta = new JTextArea();
        ta.setEditable(false); // 비활성화
        ta.setBounds(120, 200, 680, 300);
        ta.setMargin(new Insets(5, 5, 5, 5));
        // 테두리 추가
        //ta.setBorder(new LineBorder(Color.GRAY));
        add(ta);

        JPanel p = new JPanel();
        b1 = new JButton("수정");
        b2 = new JButton("삭제");
        b3 = new JButton("목록");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.setBounds(230, 540, 485, 35);
        add(p);

        b1.addActionListener(this); // 수정
        b2.addActionListener(this); // 삭제
        b3.addActionListener(this); // 목록

    }

    public void print(int no) {
        BoardVO vo = dao.boardDetailData(no);
        this.no.setText(String.valueOf(vo.getNo()));
        name.setText(vo.getName());
        sub.setText(vo.getSubject());
        hit.setText(String.valueOf(vo.getHit()));
        day.setText(vo.getRegdate().toString());
        ta.setText(vo.getContent());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == b3) {
            cp.bp.print();
            cp.card.show(cp, "LIST"); // <input type=button value="목록" onclick="javascript:history.back()">
        } else if (e.getSource() == b2) {
            cp.bdelP.pf.setText("");
            cp.bdelP.no = Integer.parseInt(no.getText());// <input type=hidden value="10">
            cp.card.show(cp, "DELETE");
        } else if (e.getSource() == b1) {
            BoardVO vo = dao.boardUpdateData(Integer.parseInt(no.getText()));
            cp.bup.no = vo.getNo();
            cp.bup.nameTf.setText(vo.getName());
            cp.bup.subTf.setText(vo.getSubject());
            cp.bup.ta.setText(vo.getContent());
            cp.card.show(cp, "UPDATE");
        }
    }
=======
package com.sist.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.*;
import com.sist.dao.*;
import javax.swing.border.LineBorder; // LineBorder 추가

public class BoardDetailPanel extends JPanel implements ActionListener {
    JLabel titleLa, nameLa, noLa, subLa, dayLa, hitLa;
    JLabel name, no, sub, day, hit;
    JTextArea ta;
    JButton b1, b2, b3; // 수정 / 삭제 / 목록
    // nextJS , MSA , DevOps , CI/CD , Docker , 쿠바네티스 , 잰킨스
    // JavaScript => TypeScript
    ControllPanel cp;
    BoardDAO dao;

    public BoardDetailPanel(ControllPanel cp) {
        this.cp = cp;
        dao = BoardDAO.newInstance();

        titleLa = new JLabel("게시판", JLabel.CENTER);// <table>
        titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 25)); //<h3></h3>
        setLayout(null);
        titleLa.setBounds(155, 20, 620, 50);
        add(titleLa);

        noLa = new JLabel("번호", JLabel.CENTER);
        noLa.setOpaque(true);
        noLa.setBackground(new Color(192, 192, 192));
        noLa.setBounds(120, 95 , 80, 30);
        no = new JLabel("", JLabel.CENTER);
        no.setBounds(205, 95, 120, 30);
        // 테두리 추가
        //no.setBorder(new LineBorder(Color.GRAY));
        add(noLa);
        add(no);

        dayLa = new JLabel("작성일", JLabel.CENTER);
        dayLa.setBounds(450, 95 , 80, 30);
        dayLa.setOpaque(true);
        dayLa.setBackground(new Color(192, 192, 192));
        day = new JLabel("", JLabel.CENTER);
        day.setBounds(500, 95, 200, 30);
        // 테두리 추가
        //day.setBorder(new LineBorder(Color.GRAY));
        add(dayLa);
        add(day);

        nameLa = new JLabel("이름", JLabel.CENTER);
        nameLa.setBounds(120, 130 , 80, 30);
        nameLa.setOpaque(true);
        nameLa.setBackground(new Color(192, 192, 192));
        name = new JLabel("", JLabel.CENTER);
        name.setBounds(205, 130, 120, 30);
        // 테두리 추가
        //name.setBorder(new LineBorder(Color.GRAY));
        add(nameLa);
        add(name);

        hitLa = new JLabel("조회수", JLabel.CENTER);
        hitLa.setBounds(450, 130 , 80, 30);
        hitLa.setOpaque(true);
        hitLa.setBackground(new Color(192, 192, 192));
        hit = new JLabel("", JLabel.CENTER);
        hit.setBounds(495, 130, 200, 30);
        // 테두리 추가
        //hit.setBorder(new LineBorder(Color.GRAY));
        add(hitLa);
        add(hit);

        subLa = new JLabel("제목", JLabel.CENTER);
        subLa.setBounds(120, 165, 80, 30);
        subLa.setOpaque(true);
        subLa.setBackground(new Color(192, 192, 192));
        sub = new JLabel("");
        sub.setBounds(225, 165, 400, 30);
        // 테두리 추가
        //sub.setBorder(new LineBorder(Color.GRAY));
        add(subLa);
        add(sub);

        ta = new JTextArea();
        ta.setEditable(false); // 비활성화
        ta.setBounds(120, 200, 680, 300);
        ta.setMargin(new Insets(5, 5, 5, 5));
        // 테두리 추가
        //ta.setBorder(new LineBorder(Color.GRAY));
        add(ta);

        JPanel p = new JPanel();
        b1 = new JButton("수정");
        b2 = new JButton("삭제");
        b3 = new JButton("목록");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.setBounds(230, 540, 485, 35);
        add(p);

        b1.addActionListener(this); // 수정
        b2.addActionListener(this); // 삭제
        b3.addActionListener(this); // 목록

    }

    public void print(int no) {
        BoardVO vo = dao.boardDetailData(no);
        this.no.setText(String.valueOf(vo.getNo()));
        name.setText(vo.getName());
        sub.setText(vo.getSubject());
        hit.setText(String.valueOf(vo.getHit()));
        day.setText(vo.getRegdate().toString());
        ta.setText(vo.getContent());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == b3) {
            cp.bp.print();
            cp.card.show(cp, "LIST"); // <input type=button value="목록" onclick="javascript:history.back()">
        } else if (e.getSource() == b2) {
            cp.bdelP.pf.setText("");
            cp.bdelP.no = Integer.parseInt(no.getText());// <input type=hidden value="10">
            cp.card.show(cp, "DELETE");
        } else if (e.getSource() == b1) {
            BoardVO vo = dao.boardUpdateData(Integer.parseInt(no.getText()));
            cp.bup.no = vo.getNo();
            cp.bup.nameTf.setText(vo.getName());
            cp.bup.subTf.setText(vo.getSubject());
            cp.bup.ta.setText(vo.getContent());
            cp.card.show(cp, "UPDATE");
        }
    }
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
}