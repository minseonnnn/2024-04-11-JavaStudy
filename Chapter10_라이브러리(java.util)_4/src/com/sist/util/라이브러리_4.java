package com.sist.util;
import java.util.*;
/*
 *   1. ArrayLIst
 *   -----------------
 *   2. HashSet
 *   3. HashMap
 *   ----------------- Iterator를 주로 이용한다
 *   4. Properties
 */
public class 라이브러리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<String> set=new HashSet<String>();
        set.add("사과");
        set.add("배");
        set.add("수박");
        set.add("오렌지");
        set.add("메론");
        // => 실무에서 주로 iterator() 사용 => set/map => list는 주로 for-each 사용
        Iterator<String> it=set.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
	}

}
