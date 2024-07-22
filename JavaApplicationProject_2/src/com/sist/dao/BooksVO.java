package com.sist.dao;

import java.sql.Date;

import lombok.Data;

/*
 *  num                                               NUMBER(38)
    ISBN                                               NUMBER(38)
    bookname                                             VARCHAR2(4000)
    writer                                            VARCHAR2(4000)
    translator                                           VARCHAR2(4000)
    page                                              NUMBER(38)
    price                                               NUMBER(38)
    pubdate                                             DATE
    series                                             VARCHAR2(4000)
    paper                                             VARCHAR2(26)
    image                                               VARCHAR2(4000)
    detail                                           VARCHAR2(4000)
 */
@Data
public class BooksVO {
   private int num, page, price;
   private long isbn;
   private String bookname, writer, translator, series, paper, image, detail;
   private Date pubdate;
}
