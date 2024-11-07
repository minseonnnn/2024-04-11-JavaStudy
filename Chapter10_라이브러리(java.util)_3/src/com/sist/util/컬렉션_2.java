<<<<<<< HEAD
package com.sist.util;
import java.util.*;
public class 컬렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> names=new ArrayList<String>(); // 가변형
        // 추가 => 문자열만 추가
        names.add("홍길동");//0
        names.add("박문수");//1
        names.add("심청이");//2
        names.add("이순신");//3
        names.add("강감찬");//4
        
        System.out.println("===== 저장된 데이터 출력 =====");
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        System.out.println("===== 데이터 추가 후에 인덱스 확인 =====");
        // 추가 => 마지막에 추가해야 속도가 빨라진다
        names.add("춘향이");//5
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        System.out.println("===== 지정된 위치에 추가 =====");
        // add() => 오버로딩 ==> add(String) , add(int index,String)
        names.add(3, "이산"); // 인덱스 3번 추가 => 뒤에있는 데이터는 인덱스가 1개씩 증가 (자동)
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        System.out.println("===== 데이터 수정 =====");
        // set(int index,String)
        names.set(1, "박문수 수정");
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        // 3번 => 수정
        names.set(3, "이산 수정");
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        
        System.out.println("===== 데이터 삭제 =====");
        names.remove(2); // 2번 이상 => 인덱스 번호가 감소
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        System.out.println("현재 인원:"+names.size());
        System.out.println("===== 전체 삭제 =====");
        names.clear();
        System.out.println("현재 인원:"+names.size());
        
	}

}
=======
package com.sist.util;
import java.util.*;
public class 컬렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> names=new ArrayList<String>(); // 가변형
        // 추가 => 문자열만 추가
        names.add("홍길동");//0
        names.add("박문수");//1
        names.add("심청이");//2
        names.add("이순신");//3
        names.add("강감찬");//4
        
        System.out.println("===== 저장된 데이터 출력 =====");
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        System.out.println("===== 데이터 추가 후에 인덱스 확인 =====");
        // 추가 => 마지막에 추가해야 속도가 빨라진다
        names.add("춘향이");//5
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        System.out.println("===== 지정된 위치에 추가 =====");
        // add() => 오버로딩 ==> add(String) , add(int index,String)
        names.add(3, "이산"); // 인덱스 3번 추가 => 뒤에있는 데이터는 인덱스가 1개씩 증가 (자동)
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        System.out.println("===== 데이터 수정 =====");
        // set(int index,String)
        names.set(1, "박문수 수정");
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        // 3번 => 수정
        names.set(3, "이산 수정");
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        
        System.out.println("===== 데이터 삭제 =====");
        names.remove(2); // 2번 이상 => 인덱스 번호가 감소
        for(int i=0;i<names.size();i++)
        {
        	String name=names.get(i);
        	System.out.println(i+":"+name);
        }
        System.out.println("현재 인원:"+names.size());
        System.out.println("===== 전체 삭제 =====");
        names.clear();
        System.out.println("현재 인원:"+names.size());
        
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
