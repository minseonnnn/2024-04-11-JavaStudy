<<<<<<< HEAD
package com.sist.io;
// FileReader
import java.io.*;
public class 라이브러리_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FileReader fr=null;
        try
        {
        	fr=new FileReader("c:\\java_data\\seoul_location.txt");
        	// 파일 생성이 안된다 => FileWriter/FileOutputStream
        	int i=0;
        	long start=System.currentTimeMillis();
        	String data="";
        	while((i=fr.read())!=-1)
        	{
        		data+=(char)i;
        	}
        	long end=System.currentTimeMillis();
        	System.out.println(data);
        	System.out.println("걸린 시간:"+(end-start));
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        finally
        {
        	try
        	{
        		fr.close();
        	}catch(Exception ex) {}
        }
	}

}
=======
package com.sist.io;
// FileReader
import java.io.*;
public class 라이브러리_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FileReader fr=null;
        try
        {
        	fr=new FileReader("c:\\java_data\\seoul_location.txt");
        	// 파일 생성이 안된다 => FileWriter/FileOutputStream
        	int i=0;
        	long start=System.currentTimeMillis();
        	String data="";
        	while((i=fr.read())!=-1)
        	{
        		data+=(char)i;
        	}
        	long end=System.currentTimeMillis();
        	System.out.println(data);
        	System.out.println("걸린 시간:"+(end-start));
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        finally
        {
        	try
        	{
        		fr.close();
        	}catch(Exception ex) {}
        }
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
