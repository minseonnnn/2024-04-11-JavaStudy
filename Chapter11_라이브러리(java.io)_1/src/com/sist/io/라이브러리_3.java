<<<<<<< HEAD
package com.sist.io;
import java.io.*;
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 폴더 생성
		File dir=new File("c:\\java_project");
		// 존재 여부 확인
		/*if(!dir.exists())
		{
			dir.mkdir();
			System.out.println("폴더가 생성되었습니다!!");
		}
		else
		{
			System.out.println("이미 폴더가 존재합니다!!");
		}*/
		if(dir.exists())
		{
			dir.delete();
			System.out.println("폴더가 삭제되었습니다!!");
		}
		else
		{
			System.out.println("존재하지 않는 폴더입니다!!");
		}
	}

}
=======
package com.sist.io;
import java.io.*;
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 폴더 생성
		File dir=new File("c:\\java_project");
		// 존재 여부 확인
		/*if(!dir.exists())
		{
			dir.mkdir();
			System.out.println("폴더가 생성되었습니다!!");
		}
		else
		{
			System.out.println("이미 폴더가 존재합니다!!");
		}*/
		if(dir.exists())
		{
			dir.delete();
			System.out.println("폴더가 삭제되었습니다!!");
		}
		else
		{
			System.out.println("존재하지 않는 폴더입니다!!");
		}
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
