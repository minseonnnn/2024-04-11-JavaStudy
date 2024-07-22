package com.sist.model;
import java.io.*;
// ObjectInputSTream / ObjectOutputStream
// 저장되는 데이터 
import java.util.*;
public class Board implements Serializable{
   private int no; // 구분자 => 상세,수정,삭제
   private String name;
   private String subject;
   private String content;
   private String pwd;
   private Date regdate=new Date();
   private int hit; // 조회수
   public int getNo() {
	   return no;
   }
   public void setNo(int no) {
	   this.no = no;
   }
   public String getName() {
	   return name;
   }
   public void setName(String name) {
	   this.name = name;
   }
   public String getSubject() {
	   return subject;
   }
   public void setSubject(String subject) {
	   this.subject = subject;
   }
   public String getContent() {
	   return content;
   }
   public void setContent(String content) {
	   this.content = content;
   }
   public String getPwd() {
	   return pwd;
   }
   public void setPwd(String pwd) {
	   this.pwd = pwd;
   }
   public Date getRegdate() {
	   return regdate;
   }
   public void setRegdate(Date regdate) {
	   this.regdate = regdate;
   }
   public int getHit() {
	   return hit;
   }
   public void setHit(int hit) {
	   this.hit = hit;
   }

}
