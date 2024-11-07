<<<<<<< HEAD
package com.sist.temp;
/*
 *   EMPNO                                     NOT NULL NUMBER(4)
     ENAME                                     VARCHAR2(10)
     JOB                                       VARCHAR2(9)
     MGR                                       NUMBER(4)
     HIREDATE                                  DATE
     SAL                                       NUMBER(7,2)
     COMM                                      NUMBER(7,2)
     DEPTNO                                    NUMBER(2)
 */
import java.util.*;

import lombok.Data;
@Data
public class EmpVO {
   private int empno;
   private String ename;
   private String job;
   private int mgr;
   private Date hiredate;
   private int sal;
   private int comm;
   private int deptno;
}
=======
package com.sist.temp;
/*
 *   EMPNO                                     NOT NULL NUMBER(4)
     ENAME                                     VARCHAR2(10)
     JOB                                       VARCHAR2(9)
     MGR                                       NUMBER(4)
     HIREDATE                                  DATE
     SAL                                       NUMBER(7,2)
     COMM                                      NUMBER(7,2)
     DEPTNO                                    NUMBER(2)
 */
import java.util.*;

import lombok.Data;
@Data
public class EmpVO {
   private int empno;
   private String ename;
   private String job;
   private int mgr;
   private Date hiredate;
   private int sal;
   private int comm;
   private int deptno;
}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
