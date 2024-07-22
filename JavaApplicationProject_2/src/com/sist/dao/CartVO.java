package com.sist.dao;
/*
 *   BNO                                       NOT NULL NUMBER
     ID                                                 VARCHAR2(20)
     Bnum                                                NUMBER
     ACCOUNT                                            NUMBER
     PRICE                                              NUMBER
     REGDATE                                            DATE
 */
import java.util.*; // 자바 <=> 오라클 ===> 데이터를 모아서 관리 (송수신)

import lombok.Data;
// DTO => Data Transfor Object 
// => 서브쿼리 , 조인 => 해당 VO를 포함
// => VO는 반드시 테이블 한개만 연결 
@Data
public class CartVO {
  private int bno, bnum, price, account;
  private String id;
  private Date regdate;
  private BooksVO gvo=new BooksVO(); 
}
