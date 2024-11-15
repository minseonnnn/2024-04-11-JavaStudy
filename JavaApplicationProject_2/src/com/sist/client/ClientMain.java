<<<<<<< HEAD
package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.commons.Function;
import com.sist.dao.*;

// 네트워크 연결 
import java.io.*;
import java.net.*;
import java.util.*;
/*
 *   => 서버에서 전송된 데이터 읽기 => 프로그램을 별도로 동작 => 쓰레드 
 *   => 클라이언트 요청을 하는 프로그램 
 */

public class ClientMain extends JFrame implements ActionListener,MouseListener,Runnable{
    CardLayout card=new CardLayout();
    LoginPanel lp=new LoginPanel();
    JoinPanel jp=new JoinPanel();
    PostFindFrame post=new PostFindFrame();// 우편번호 검색 
    IdCheckFrame idfrm=new IdCheckFrame();
    JLabel logo;
    ControllPanel cp;
    MenuPanel mp=new MenuPanel();
    // 네트워크에 필요한 객체
    Socket s; // 통신기기 => 핸드폰 
    OutputStream out; // 서버로 전송 
    BufferedReader in; // 서버로부터 값을 받는다 
    /*
     *   1. 클라이언트 : 서버의 정보 (IP,PORT)
     *      -- PORT는 자동 생성 => 유동이 가능 
     *   2. 서버 : 클라이언트의 정보 
     *      --- PORT/IP을 직접 결정 => 고정이여야 한다 
     */
    // 개인마다 필요한 변수 
    String myId;
    int selRow=-1;
    public ClientMain()
    {
    	
    	ImageIcon logo_img=new ImageIcon("c:\\project_image\\bookstore_logo.png");
        logo=new JLabel(logo_img);
        logo.setBounds(40, 15, 220, 55);
        add(logo);

    	cp=new ControllPanel(this);
    	setLayout(null);
    	
    	mp.setBounds(280, 25, 650, 35);
    	add(mp);
    	cp.setBounds(10, 70, 930, 680);
    	add(cp);
    	
    	
    	setSize(960, 800);
    	setResizable(false);
    	//setVisible(true);
    	
    	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	//setDefaultCloseOperation(EXIT_ON_CLOSE);
    	lp.loginBtn.addActionListener(this);// 로그인 
    	lp.joinBtn.addActionListener(this);// 회원가입 
    	lp.cancelBtn.addActionListener(this);// 종료
    	
    	jp.idCheck.addActionListener(this); // 아이디 중복체크 버튼 
    	jp.cancel.addActionListener(this);// 취소
    	jp.postFind.addActionListener(this);// 우편번호 검색 
    	jp.join.addActionListener(this);
    	
    	post.b1.addActionListener(this);// 우편 검색 버튼 
    	post.b2.addActionListener(this);// 취소 
    	post.tf.addActionListener(this);// 우편번호 입력창 
    	
    	post.table.addMouseListener(this);
    	
    	idfrm.b1.addActionListener(this);// 아이디 체크
    	idfrm.b2.addActionListener(this);// 확인 
    	
    	mp.exitBtn.addActionListener(this);
    	mp.chatBtn.addActionListener(this);
    	mp.homeBtn.addActionListener(this);
    	mp.findBtn.addActionListener(this);
    	mp.boardBtn.addActionListener(this);
    	mp.myBtn.addActionListener(this);
    	mp.newsBtn.addActionListener(this);
    	
    	
    	cp.chatP.tf.addActionListener(this);
    	cp.chatP.b1.addActionListener(this);
    	cp.chatP.sendTf.addActionListener(this);
    	cp.chatP.table.addMouseListener(this);
    	cp.chatP.b2.addActionListener(this); // 정보보기
    	cp.chatP.ob.addActionListener(this); // 1:1 나가기

    	
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
		if(e.getSource()==lp.cancelBtn)
		{
			dispose();// window메모리 해제 
			System.exit(0);// 프로그램 종료
		}
		else if(e.getSource()==mp.newsBtn)
		{
			cp.card.show(cp, "NEWS");
		}
		// 마이페이지
		else if(e.getSource()==mp.myBtn)
		{
			cp.mpp.print();
			cp.card.show(cp, "MYPAGE");
		}
		else if(e.getSource()==lp.joinBtn)
		{
			lp.setVisible(false);
			jp.setVisible(true);
			
		}
		else if(e.getSource()==mp.boardBtn)
		{
			cp.card.show(cp, "LIST");// <a href="list.jsp">
		}
		else if(e.getSource()==mp.findBtn)
		{
			cp.card.show(cp, "FP");
		}
		else if(e.getSource()==cp.chatP.ob)
	      {
	         try
	         {
	            String youId=cp.chatP.youTf.getText();
	            out.write((Function.ONEEXIT+"|"+youId+"\n").getBytes());
	         }catch(Exception ex) {}
	      }
		else if(e.getSource()==cp.chatP.tf)
		{
			String msg=cp.chatP.tf.getText();
			if(msg.length()<1)
				return;
			
			String color=cp.chatP.box1.getSelectedItem().toString();
			
			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex){}
			
			cp.chatP.tf.setText("");
			cp.chatP.tf.requestFocus();
		}
		else if(e.getSource()==mp.exitBtn)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex){}
		}
		else if(e.getSource()==cp.chatP.b1)
		{
			String you=cp.chatP.box2.getSelectedItem().toString();
			if(!you.equals("상담자"))
			{
				try
				{
					out.write((Function.ONEINIT+"|"+you+"|"+myId+"\n").getBytes());
				}catch(Exception ex) {}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "상담자를 선택하세요!!");
			}
		}
		else if(e.getSource()==cp.chatP.sendTf)
		{
			String youId=cp.chatP.youTf.getText();
			String message=cp.chatP.sendTf.getText();
			if(message.length()<1)
				return;
			
			try
			{
				out.write((Function.ONETOONE+"|"+youId+"|"+message+"\n").getBytes());
			}catch(Exception ex) {}
			cp.chatP.sendTf.setText("");
			cp.chatP.sendTf.requestFocus();
		}
		else if(e.getSource()==mp.chatBtn)
		{
			cp.card.show(cp, "CHAT");
		}else if(e.getSource()==cp.chatP.tf) {

			String msg=cp.chatP. tf.getText();
			if(msg.length()<1) {
				return;
			}
			String color=cp.chatP.box1.getSelectedItem().toString();
			try {
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex) {}
			cp.chatP. tf.setText("");
			cp.chatP. tf.requestFocus();
		}else if(e.getSource()==cp.chatP.b2) {
			if(selRow==-1) {
				JOptionPane.showMessageDialog(this, "정보를 볼 회원을 선택하세요");
				return;
			}
			String yid=cp.chatP.model.getValueAt(selRow, 0).toString();
			try {
				out.write((Function.INFO+"|"+yid+"\n").getBytes());
			}catch(Exception ex) {}
		}else if(e.getSource()==cp.chatP.b1) {
			String you=cp.chatP.box2.getSelectedItem().toString();
			if(!you.equals("상담자")){
				try{
					out.write((Function.ONEINIT+"|"+you+"|"+myId+"\n").getBytes());
				}catch(Exception ex){}
			}
			else{
				JOptionPane.showMessageDialog(this, "상담자를 선택하세요!!");
			}
		}else if(e.getSource()==cp.chatP.sendTf) {
			String youId=cp.chatP.youTf.getText();
			String message=cp.chatP.sendTf.getText();
			if(message.length()<1)
				return;

			try
			{
				out.write((Function.ONETOONE+"|"+youId+"|"+message+"\n").getBytes());
			}catch(Exception ex) {}
			cp.chatP.sendTf.setText("");
			cp.chatP.sendTf.requestFocus();
		}
		else if(e.getSource()==mp.homeBtn)
		{
			cp.hp.myId=myId;
			cp.card.show(cp, "HP");
		}
		else if(e.getSource()==jp.idCheck)// 아이디 중복 체크 
		{
			idfrm.tf.setText("");
			idfrm.b2.setVisible(false);
			idfrm.la3.setText("");
			idfrm.setVisible(true);
		}
		else if(e.getSource()==jp.join)
		{
			String id=jp.idF.getText();
			if(id.length()<1)
			{
				jp.idF.requestFocus();
				return;
			}
			
			String pwd=String.valueOf(jp.pwF.getPassword());
			if(pwd.length()<1)
			{
				jp.pwF.requestFocus();
				return;
			}
			
			String name=jp.nameF.getText();
			if(name.length()<1)
			{
				jp.nameF.requestFocus();
				return;
			}
			
			String sex="";
			if(jp.genderM.isSelected())
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			
			String birthday=jp.birthF.getText();
			if(birthday.length()<1)
			{
				jp.birthF.requestFocus();
				return;
			}
			
			String post=jp.postF.getText();
			if(post.length()<1)
			{
				jp.postF.requestFocus();
				return;
			}
			
			String addr1=jp.addr1F.getText();
			if(addr1.length()<1)
			{
				jp.addr1F.requestFocus();
				return;
			}
			
			String phone1=jp.phoneF1.getText();
			String phone2=jp.phoneF2.getText();
			String phone3=jp.phoneF3.getText();
			if(phone1.length()<1) {
				jp.phoneF1.requestFocus();
				return;
			}
			String phone=phone1+"-"+phone2+"-"+phone3;
			String emailId=jp.emailF.getText();
			String emailSite=jp.emailCombo.getSelectedItem().toString();
			if(emailId.length()<1) {
				jp.emailF.requestFocus();
				return;
			}
			String email=emailId+"@"+emailSite;
			
			String addr2=jp.addr2F.getText();
			String content=jp.conT.getText();
			// phone => NOT NULL => 반드시 입력...
			MemberVO vo=new MemberVO();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setName(name);
			vo.setSex(sex);
			vo.setBirthday(birthday);
			vo.setPost(post);
			vo.setAddr1(addr1);
			vo.setAddr2(addr2);
			vo.setEmail(email);
			vo.setPhone(phone);
			vo.setContent(content);
			
			MemberDAO dao=MemberDAO.newInstance();
			String res=dao.memberInsert(vo);
			
			if(res.equals("yes"))
			{
				JOptionPane.showMessageDialog(this, "회원 가입에 축하합니다");
				card.show(getContentPane(), "LOGIN");
			}
			else
			{
				JOptionPane.showMessageDialog(this, "회원 가입에 실패하셨습니다\n"+res);
			}
		}
		else if(e.getSource()==idfrm.b1)
		{
			String id=idfrm.tf.getText(); 
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");// alert()
				idfrm.tf.requestFocus();// tf.focus()
				return;
			}
			// 입력된 상태 
			// 오라클 연결 
			MemberDAO dao=MemberDAO.newInstance();
			int count=dao.memberIdCheck(id);
			
			if(count==0)
			{
				idfrm.la3.setText(id+"는(은) 사용 가능한 아이디입니다");
				idfrm.b2.setVisible(true);
			}
			else
			{
				idfrm.la3.setText(id+"는(은) 이미 사용중인 아이디입니다");
				idfrm.b2.setVisible(false);
				idfrm.tf.setText("");
				idfrm.tf.requestFocus();
			}
		}
		else if(e.getSource()==idfrm.b2)
		{
			String id=idfrm.tf.getText();
			jp.idF.setText(id);
			idfrm.setVisible(false);
		}
		else if(e.getSource()==post.b2)
		{
			post.setVisible(false);
		}
		else if(e.getSource()==post.b1 || e.getSource()==post.tf)
		{
			String dong=post.tf.getText();
			if(dong.length()<1)// 입력이 안된 경우
			{
				JOptionPane.showMessageDialog(this, "동/읍/면을 입력하세요");
				post.tf.requestFocus();
				return;
			}
			MemberDAO dao=MemberDAO.newInstance();
			ArrayList<ZipcodeVO> list=dao.postFindData(dong);
			if(list.size()==0)
			{
				JOptionPane.showMessageDialog(this, "검색된 결과가 없습니다");
				post.tf.setText("");
				post.tf.requestFocus();
			}
			else
			{
				for(int i=post.model.getRowCount()-1;i>=0;i--)
				{
					post.model.removeRow(i);
				}
				
				for(ZipcodeVO vo:list)
				{
					String[] data={vo.getZipcode(),vo.getAddress()};
					post.model.addRow(data);
				}
			}
		}
		else if(e.getSource()==jp.postFind)
		{
			for(int i=post.model.getRowCount()-1;i>=0;i--)
			{
				post.model.removeRow(i);
			}
			post.tf.setText("");
			post.setVisible(true);
		}
		else if(e.getSource()==jp.cancel)
		{
			jp.setVisible(false);
			lp.setVisible(true);
		}
		
		else if(e.getSource()==lp.loginBtn)
		{
			//1. 입력한 사번 / 이름을 가지고 온다 
			try
			{
				// 유효성 검색 => 오라클 
				String id=lp.idField.getText();
				if(id.length()<1)
				{
					JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
					lp.idField.requestFocus();
					return;
				}
				String pwd=String.valueOf(lp.pwField.getPassword());
				if(pwd.length()<1)
				{
					JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
					lp.pwField.requestFocus();
					return;
				}
				
				// 오라클 연결 
				MemberDAO dao=MemberDAO.newInstance();
				String result=dao.memberLogin(id, pwd);
				// 웹 => 자바스크립트로 처리 
				if(result.equals("NOID"))
				{
					// 사번이 없는 경우 
					JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
					lp.idField.setText("");
					lp.pwField.setText("");
					lp.idField.requestFocus();
				}
				else if(result.equals("NOPWD"))
				{
					// 이름이 틀린 경우
					JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
					lp.pwField.setText("");
					lp.pwField.requestFocus();
				}
				else
				{
					// 로그인 ==> 서버로 전송 
					try
					{
						//1. 소켓 => 전화 걸기 
						s=new Socket("192.168.0.126",7777); // 조별 
						out=s.getOutputStream();
						System.out.println("id="+id);
						in=new BufferedReader(new InputStreamReader(s.getInputStream()));
						out.write((Function.LOGIN+"|"+id+"\n").getBytes());
						
					}catch(Exception ex) {ex.printStackTrace();}
					
					// 서버로 들어오는 값을 받아서 출력 
					new Thread(this).start(); // run을 호출 
				}
			}catch(Exception ex)
			{
				ex.printStackTrace();
				
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==post.table) {
			if(e.getClickCount()==2) {
				int row=post.table.getSelectedRow();
				String zip=post.model.getValueAt(row, 0).toString();
				String addr=post.model.getValueAt(row, 1).toString();
				
				jp.postF.setText(zip);
				jp.addr1F.setText(addr);
				
				post.setVisible(false);
			}
		}
	    else if (e.getSource() == cp.chatP.table) {
	        if (e.getClickCount() == 2) {
	            int row = cp.chatP.table.getSelectedRow();
	            selRow = row;
				String id=cp.chatP.model.getValueAt(row, 0).toString();
				if(id.equals(myId))
				{
					cp.chatP.b2.setEnabled(false);
					cp.chatP.b1.setEnabled(false);
				}
				else
				{
					cp.chatP.b2.setEnabled(true);
					cp.chatP.b1.setEnabled(true);
				}
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
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				String msg=in.readLine(); //서버 응답값
				StringTokenizer st=new StringTokenizer(msg, "|");
				int delimit=Integer.parseInt(st.nextToken());
				switch(delimit) {
					case Function.LOGIN:{
						String[] data={
								st.nextToken(),
								st.nextToken(),
								st.nextToken()
						};
						cp.chatP.model.addRow(data);
						String admin=st.nextToken();

						if(!myId.equals(data[0]) && admin.equals("y"))
						{

							cp.chatP.box2.addItem(data[0]);
						}
					}
					break;
					case Function.MYLOG:{
						myId=st.nextToken();
						String name=st.nextToken();
						String admin=st.nextToken();
						if(admin.equals("y"))
						{
							cp.chatP.b1.setEnabled(false);
						}
						setTitle(name+"님의 페이지");
						lp.setVisible(false);
						setVisible(true);
					}
					break;
					case Function.CHAT:{
						String message=st.nextToken();
						String color=st.nextToken();
						cp.chatP.initStyle();
						cp.chatP.append(message, color);
						cp.chatP.chatBar.setValue(cp.chatP.chatBar.getMaximum());
					}
					break;
					// 상담
					  case Function.ONEINIT:
					  {
						  String userId=st.nextToken();
						  int sel=JOptionPane.showConfirmDialog(this,userId+"님이 상담을 요청하셨습니다",
								  "상담요청",JOptionPane.YES_NO_OPTION);
						  if(sel==JOptionPane.YES_OPTION)
						  {
							  out.write((Function.ONEYES+"|"+userId+"\n").getBytes());
						  }
						  else
						  {
							  out.write((Function.ONENO+"|"+userId+"\n").getBytes());
						  }
					  }
					  break;
					  case Function.ONENO:
					  {
						  String adminId=st.nextToken();
						  JOptionPane.showMessageDialog(this, adminId+"님이 거절하셨습니다");
					  }
					  break;
					  case Function.ONEYES:
					  {
						  String id=st.nextToken();
						  cp.chatP.youTf.setText(id);
						  cp.chatP.pan.setVisible(true);
					  }
					  break;
					  case Function.ONETOONE:
					  {
						  cp.chatP.ta.append(st.nextToken()+"\n"); 
					  }
					  break;
					  case Function.INFO:{
						  String info="이름: "+st.nextToken()+"\n"
								  +"성별: "+st.nextToken()+"\n"
								  +"주소: "+st.nextToken()+"\n"
								  +"이메일: "+st.nextToken()+"\n"
								  +"전화: "+st.nextToken()+"\n"
								  +"소개: "+st.nextToken();
						JOptionPane.showMessageDialog(this, info);
						selRow=-1;
					  }
					  break;
					  case Function.ONEEXIT:
					  {
						  JOptionPane.showMessageDialog(this, "상담을 종료합니다");
						  cp.chatP.pan.setVisible(false);
					  }
					  break;
					  case Function.MYEXIT:
					  {
						System.exit(0);
					}
					break;
					case Function.EXIT:{
						String yid=st.nextToken();
						for(int i=0;i<cp.chatP.model.getRowCount();i++) {
							String s=cp.chatP.model.getValueAt(i, 0).toString(); //테이블에 등록된 아이디 읽기
							if(s.equals(yid)) {
								cp.chatP.model.removeRow(i);
								break;
							}
						}
						  for(int i=0;i<cp.chatP.box2.getItemCount();i++)
						  {
							  String s=cp.chatP.box2.getItemAt(i);
							  if(s.equals(yid))
							  {
								  cp.chatP.box2.removeItemAt(i);
								  break;
							  }
						  }
						  
					  }
					  break;
				}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
=======
package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.commons.Function;
import com.sist.dao.*;

// 네트워크 연결 
import java.io.*;
import java.net.*;
import java.util.*;
/*
 *   => 서버에서 전송된 데이터 읽기 => 프로그램을 별도로 동작 => 쓰레드 
 *   => 클라이언트 요청을 하는 프로그램 
 */

public class ClientMain extends JFrame implements ActionListener,MouseListener,Runnable{
    CardLayout card=new CardLayout();
    LoginPanel lp=new LoginPanel();
    JoinPanel jp=new JoinPanel();
    PostFindFrame post=new PostFindFrame();// 우편번호 검색 
    IdCheckFrame idfrm=new IdCheckFrame();
    JLabel logo;
    ControllPanel cp;
    MenuPanel mp=new MenuPanel();
    // 네트워크에 필요한 객체
    Socket s; // 통신기기 => 핸드폰 
    OutputStream out; // 서버로 전송 
    BufferedReader in; // 서버로부터 값을 받는다 
    /*
     *   1. 클라이언트 : 서버의 정보 (IP,PORT)
     *      -- PORT는 자동 생성 => 유동이 가능 
     *   2. 서버 : 클라이언트의 정보 
     *      --- PORT/IP을 직접 결정 => 고정이여야 한다 
     */
    // 개인마다 필요한 변수 
    String myId;
    int selRow=-1;
    public ClientMain()
    {
    	
    	ImageIcon logo_img=new ImageIcon("c:\\project_image\\bookstore_logo.png");
        logo=new JLabel(logo_img);
        logo.setBounds(40, 15, 220, 55);
        add(logo);

    	cp=new ControllPanel(this);
    	setLayout(null);
    	
    	mp.setBounds(280, 25, 650, 35);
    	add(mp);
    	cp.setBounds(10, 70, 930, 680);
    	add(cp);
    	
    	
    	setSize(960, 800);
    	setResizable(false);
    	//setVisible(true);
    	
    	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	//setDefaultCloseOperation(EXIT_ON_CLOSE);
    	lp.loginBtn.addActionListener(this);// 로그인 
    	lp.joinBtn.addActionListener(this);// 회원가입 
    	lp.cancelBtn.addActionListener(this);// 종료
    	
    	jp.idCheck.addActionListener(this); // 아이디 중복체크 버튼 
    	jp.cancel.addActionListener(this);// 취소
    	jp.postFind.addActionListener(this);// 우편번호 검색 
    	jp.join.addActionListener(this);
    	
    	post.b1.addActionListener(this);// 우편 검색 버튼 
    	post.b2.addActionListener(this);// 취소 
    	post.tf.addActionListener(this);// 우편번호 입력창 
    	
    	post.table.addMouseListener(this);
    	
    	idfrm.b1.addActionListener(this);// 아이디 체크
    	idfrm.b2.addActionListener(this);// 확인 
    	
    	mp.exitBtn.addActionListener(this);
    	mp.chatBtn.addActionListener(this);
    	mp.homeBtn.addActionListener(this);
    	mp.findBtn.addActionListener(this);
    	mp.boardBtn.addActionListener(this);
    	mp.myBtn.addActionListener(this);
    	mp.newsBtn.addActionListener(this);
    	
    	
    	cp.chatP.tf.addActionListener(this);
    	cp.chatP.b1.addActionListener(this);
    	cp.chatP.sendTf.addActionListener(this);
    	cp.chatP.table.addMouseListener(this);
    	cp.chatP.b2.addActionListener(this); // 정보보기
    	cp.chatP.ob.addActionListener(this); // 1:1 나가기

    	
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
		if(e.getSource()==lp.cancelBtn)
		{
			dispose();// window메모리 해제 
			System.exit(0);// 프로그램 종료
		}
		else if(e.getSource()==mp.newsBtn)
		{
			cp.card.show(cp, "NEWS");
		}
		// 마이페이지
		else if(e.getSource()==mp.myBtn)
		{
			cp.mpp.print();
			cp.card.show(cp, "MYPAGE");
		}
		else if(e.getSource()==lp.joinBtn)
		{
			lp.setVisible(false);
			jp.setVisible(true);
			
		}
		else if(e.getSource()==mp.boardBtn)
		{
			cp.card.show(cp, "LIST");// <a href="list.jsp">
		}
		else if(e.getSource()==mp.findBtn)
		{
			cp.card.show(cp, "FP");
		}
		else if(e.getSource()==cp.chatP.ob)
	      {
	         try
	         {
	            String youId=cp.chatP.youTf.getText();
	            out.write((Function.ONEEXIT+"|"+youId+"\n").getBytes());
	         }catch(Exception ex) {}
	      }
		else if(e.getSource()==cp.chatP.tf)
		{
			String msg=cp.chatP.tf.getText();
			if(msg.length()<1)
				return;
			
			String color=cp.chatP.box1.getSelectedItem().toString();
			
			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex){}
			
			cp.chatP.tf.setText("");
			cp.chatP.tf.requestFocus();
		}
		else if(e.getSource()==mp.exitBtn)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex){}
		}
		else if(e.getSource()==cp.chatP.b1)
		{
			String you=cp.chatP.box2.getSelectedItem().toString();
			if(!you.equals("상담자"))
			{
				try
				{
					out.write((Function.ONEINIT+"|"+you+"|"+myId+"\n").getBytes());
				}catch(Exception ex) {}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "상담자를 선택하세요!!");
			}
		}
		else if(e.getSource()==cp.chatP.sendTf)
		{
			String youId=cp.chatP.youTf.getText();
			String message=cp.chatP.sendTf.getText();
			if(message.length()<1)
				return;
			
			try
			{
				out.write((Function.ONETOONE+"|"+youId+"|"+message+"\n").getBytes());
			}catch(Exception ex) {}
			cp.chatP.sendTf.setText("");
			cp.chatP.sendTf.requestFocus();
		}
		else if(e.getSource()==mp.chatBtn)
		{
			cp.card.show(cp, "CHAT");
		}else if(e.getSource()==cp.chatP.tf) {

			String msg=cp.chatP. tf.getText();
			if(msg.length()<1) {
				return;
			}
			String color=cp.chatP.box1.getSelectedItem().toString();
			try {
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex) {}
			cp.chatP. tf.setText("");
			cp.chatP. tf.requestFocus();
		}else if(e.getSource()==cp.chatP.b2) {
			if(selRow==-1) {
				JOptionPane.showMessageDialog(this, "정보를 볼 회원을 선택하세요");
				return;
			}
			String yid=cp.chatP.model.getValueAt(selRow, 0).toString();
			try {
				out.write((Function.INFO+"|"+yid+"\n").getBytes());
			}catch(Exception ex) {}
		}else if(e.getSource()==cp.chatP.b1) {
			String you=cp.chatP.box2.getSelectedItem().toString();
			if(!you.equals("상담자")){
				try{
					out.write((Function.ONEINIT+"|"+you+"|"+myId+"\n").getBytes());
				}catch(Exception ex){}
			}
			else{
				JOptionPane.showMessageDialog(this, "상담자를 선택하세요!!");
			}
		}else if(e.getSource()==cp.chatP.sendTf) {
			String youId=cp.chatP.youTf.getText();
			String message=cp.chatP.sendTf.getText();
			if(message.length()<1)
				return;

			try
			{
				out.write((Function.ONETOONE+"|"+youId+"|"+message+"\n").getBytes());
			}catch(Exception ex) {}
			cp.chatP.sendTf.setText("");
			cp.chatP.sendTf.requestFocus();
		}
		else if(e.getSource()==mp.homeBtn)
		{
			cp.hp.myId=myId;
			cp.card.show(cp, "HP");
		}
		else if(e.getSource()==jp.idCheck)// 아이디 중복 체크 
		{
			idfrm.tf.setText("");
			idfrm.b2.setVisible(false);
			idfrm.la3.setText("");
			idfrm.setVisible(true);
		}
		else if(e.getSource()==jp.join)
		{
			String id=jp.idF.getText();
			if(id.length()<1)
			{
				jp.idF.requestFocus();
				return;
			}
			
			String pwd=String.valueOf(jp.pwF.getPassword());
			if(pwd.length()<1)
			{
				jp.pwF.requestFocus();
				return;
			}
			
			String name=jp.nameF.getText();
			if(name.length()<1)
			{
				jp.nameF.requestFocus();
				return;
			}
			
			String sex="";
			if(jp.genderM.isSelected())
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			
			String birthday=jp.birthF.getText();
			if(birthday.length()<1)
			{
				jp.birthF.requestFocus();
				return;
			}
			
			String post=jp.postF.getText();
			if(post.length()<1)
			{
				jp.postF.requestFocus();
				return;
			}
			
			String addr1=jp.addr1F.getText();
			if(addr1.length()<1)
			{
				jp.addr1F.requestFocus();
				return;
			}
			
			String phone1=jp.phoneF1.getText();
			String phone2=jp.phoneF2.getText();
			String phone3=jp.phoneF3.getText();
			if(phone1.length()<1) {
				jp.phoneF1.requestFocus();
				return;
			}
			String phone=phone1+"-"+phone2+"-"+phone3;
			String emailId=jp.emailF.getText();
			String emailSite=jp.emailCombo.getSelectedItem().toString();
			if(emailId.length()<1) {
				jp.emailF.requestFocus();
				return;
			}
			String email=emailId+"@"+emailSite;
			
			String addr2=jp.addr2F.getText();
			String content=jp.conT.getText();
			// phone => NOT NULL => 반드시 입력...
			MemberVO vo=new MemberVO();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setName(name);
			vo.setSex(sex);
			vo.setBirthday(birthday);
			vo.setPost(post);
			vo.setAddr1(addr1);
			vo.setAddr2(addr2);
			vo.setEmail(email);
			vo.setPhone(phone);
			vo.setContent(content);
			
			MemberDAO dao=MemberDAO.newInstance();
			String res=dao.memberInsert(vo);
			
			if(res.equals("yes"))
			{
				JOptionPane.showMessageDialog(this, "회원 가입에 축하합니다");
				card.show(getContentPane(), "LOGIN");
			}
			else
			{
				JOptionPane.showMessageDialog(this, "회원 가입에 실패하셨습니다\n"+res);
			}
		}
		else if(e.getSource()==idfrm.b1)
		{
			String id=idfrm.tf.getText(); 
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");// alert()
				idfrm.tf.requestFocus();// tf.focus()
				return;
			}
			// 입력된 상태 
			// 오라클 연결 
			MemberDAO dao=MemberDAO.newInstance();
			int count=dao.memberIdCheck(id);
			
			if(count==0)
			{
				idfrm.la3.setText(id+"는(은) 사용 가능한 아이디입니다");
				idfrm.b2.setVisible(true);
			}
			else
			{
				idfrm.la3.setText(id+"는(은) 이미 사용중인 아이디입니다");
				idfrm.b2.setVisible(false);
				idfrm.tf.setText("");
				idfrm.tf.requestFocus();
			}
		}
		else if(e.getSource()==idfrm.b2)
		{
			String id=idfrm.tf.getText();
			jp.idF.setText(id);
			idfrm.setVisible(false);
		}
		else if(e.getSource()==post.b2)
		{
			post.setVisible(false);
		}
		else if(e.getSource()==post.b1 || e.getSource()==post.tf)
		{
			String dong=post.tf.getText();
			if(dong.length()<1)// 입력이 안된 경우
			{
				JOptionPane.showMessageDialog(this, "동/읍/면을 입력하세요");
				post.tf.requestFocus();
				return;
			}
			MemberDAO dao=MemberDAO.newInstance();
			ArrayList<ZipcodeVO> list=dao.postFindData(dong);
			if(list.size()==0)
			{
				JOptionPane.showMessageDialog(this, "검색된 결과가 없습니다");
				post.tf.setText("");
				post.tf.requestFocus();
			}
			else
			{
				for(int i=post.model.getRowCount()-1;i>=0;i--)
				{
					post.model.removeRow(i);
				}
				
				for(ZipcodeVO vo:list)
				{
					String[] data={vo.getZipcode(),vo.getAddress()};
					post.model.addRow(data);
				}
			}
		}
		else if(e.getSource()==jp.postFind)
		{
			for(int i=post.model.getRowCount()-1;i>=0;i--)
			{
				post.model.removeRow(i);
			}
			post.tf.setText("");
			post.setVisible(true);
		}
		else if(e.getSource()==jp.cancel)
		{
			jp.setVisible(false);
			lp.setVisible(true);
		}
		
		else if(e.getSource()==lp.loginBtn)
		{
			//1. 입력한 사번 / 이름을 가지고 온다 
			try
			{
				// 유효성 검색 => 오라클 
				String id=lp.idField.getText();
				if(id.length()<1)
				{
					JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
					lp.idField.requestFocus();
					return;
				}
				String pwd=String.valueOf(lp.pwField.getPassword());
				if(pwd.length()<1)
				{
					JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
					lp.pwField.requestFocus();
					return;
				}
				
				// 오라클 연결 
				MemberDAO dao=MemberDAO.newInstance();
				String result=dao.memberLogin(id, pwd);
				// 웹 => 자바스크립트로 처리 
				if(result.equals("NOID"))
				{
					// 사번이 없는 경우 
					JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
					lp.idField.setText("");
					lp.pwField.setText("");
					lp.idField.requestFocus();
				}
				else if(result.equals("NOPWD"))
				{
					// 이름이 틀린 경우
					JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
					lp.pwField.setText("");
					lp.pwField.requestFocus();
				}
				else
				{
					// 로그인 ==> 서버로 전송 
					try
					{
						//1. 소켓 => 전화 걸기 
						s=new Socket("192.168.0.126",7777); // 조별 
						out=s.getOutputStream();
						System.out.println("id="+id);
						in=new BufferedReader(new InputStreamReader(s.getInputStream()));
						out.write((Function.LOGIN+"|"+id+"\n").getBytes());
						
					}catch(Exception ex) {ex.printStackTrace();}
					
					// 서버로 들어오는 값을 받아서 출력 
					new Thread(this).start(); // run을 호출 
				}
			}catch(Exception ex)
			{
				ex.printStackTrace();
				
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==post.table) {
			if(e.getClickCount()==2) {
				int row=post.table.getSelectedRow();
				String zip=post.model.getValueAt(row, 0).toString();
				String addr=post.model.getValueAt(row, 1).toString();
				
				jp.postF.setText(zip);
				jp.addr1F.setText(addr);
				
				post.setVisible(false);
			}
		}
	    else if (e.getSource() == cp.chatP.table) {
	        if (e.getClickCount() == 2) {
	            int row = cp.chatP.table.getSelectedRow();
	            selRow = row;
				String id=cp.chatP.model.getValueAt(row, 0).toString();
				if(id.equals(myId))
				{
					cp.chatP.b2.setEnabled(false);
					cp.chatP.b1.setEnabled(false);
				}
				else
				{
					cp.chatP.b2.setEnabled(true);
					cp.chatP.b1.setEnabled(true);
				}
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
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				String msg=in.readLine(); //서버 응답값
				StringTokenizer st=new StringTokenizer(msg, "|");
				int delimit=Integer.parseInt(st.nextToken());
				switch(delimit) {
					case Function.LOGIN:{
						String[] data={
								st.nextToken(),
								st.nextToken(),
								st.nextToken()
						};
						cp.chatP.model.addRow(data);
						String admin=st.nextToken();

						if(!myId.equals(data[0]) && admin.equals("y"))
						{

							cp.chatP.box2.addItem(data[0]);
						}
					}
					break;
					case Function.MYLOG:{
						myId=st.nextToken();
						String name=st.nextToken();
						String admin=st.nextToken();
						if(admin.equals("y"))
						{
							cp.chatP.b1.setEnabled(false);
						}
						setTitle(name+"님의 페이지");
						lp.setVisible(false);
						setVisible(true);
					}
					break;
					case Function.CHAT:{
						String message=st.nextToken();
						String color=st.nextToken();
						cp.chatP.initStyle();
						cp.chatP.append(message, color);
						cp.chatP.chatBar.setValue(cp.chatP.chatBar.getMaximum());
					}
					break;
					// 상담
					  case Function.ONEINIT:
					  {
						  String userId=st.nextToken();
						  int sel=JOptionPane.showConfirmDialog(this,userId+"님이 상담을 요청하셨습니다",
								  "상담요청",JOptionPane.YES_NO_OPTION);
						  if(sel==JOptionPane.YES_OPTION)
						  {
							  out.write((Function.ONEYES+"|"+userId+"\n").getBytes());
						  }
						  else
						  {
							  out.write((Function.ONENO+"|"+userId+"\n").getBytes());
						  }
					  }
					  break;
					  case Function.ONENO:
					  {
						  String adminId=st.nextToken();
						  JOptionPane.showMessageDialog(this, adminId+"님이 거절하셨습니다");
					  }
					  break;
					  case Function.ONEYES:
					  {
						  String id=st.nextToken();
						  cp.chatP.youTf.setText(id);
						  cp.chatP.pan.setVisible(true);
					  }
					  break;
					  case Function.ONETOONE:
					  {
						  cp.chatP.ta.append(st.nextToken()+"\n"); 
					  }
					  break;
					  case Function.INFO:{
						  String info="이름: "+st.nextToken()+"\n"
								  +"성별: "+st.nextToken()+"\n"
								  +"주소: "+st.nextToken()+"\n"
								  +"이메일: "+st.nextToken()+"\n"
								  +"전화: "+st.nextToken()+"\n"
								  +"소개: "+st.nextToken();
						JOptionPane.showMessageDialog(this, info);
						selRow=-1;
					  }
					  break;
					  case Function.ONEEXIT:
					  {
						  JOptionPane.showMessageDialog(this, "상담을 종료합니다");
						  cp.chatP.pan.setVisible(false);
					  }
					  break;
					  case Function.MYEXIT:
					  {
						System.exit(0);
					}
					break;
					case Function.EXIT:{
						String yid=st.nextToken();
						for(int i=0;i<cp.chatP.model.getRowCount();i++) {
							String s=cp.chatP.model.getValueAt(i, 0).toString(); //테이블에 등록된 아이디 읽기
							if(s.equals(yid)) {
								cp.chatP.model.removeRow(i);
								break;
							}
						}
						  for(int i=0;i<cp.chatP.box2.getItemCount();i++)
						  {
							  String s=cp.chatP.box2.getItemAt(i);
							  if(s.equals(yid))
							  {
								  cp.chatP.box2.removeItemAt(i);
								  break;
							  }
						  }
						  
					  }
					  break;
				}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
