<<<<<<< HEAD
// contains 
/*
 *   JDBC => DBCP => MyBatis => (JPA)
 *   Ajax => Vue => React => Redux => React-Query => Next
 *   1차     2차     3차 ==========================    4차
 *   MSA
 */
import java.util.Scanner;

import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 문자열_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// Jsoup 셀레니즘 
        Scanner scan=new Scanner(System.in);
        System.out.print("1. 노래명 검색  2. 가수명 검색:");
        int menu=scan.nextInt();
        int k=1;
        if(menu==1)
        {
        	System.out.print("노래명 입력:");
        	String fd=scan.next();
        	for(int i=1;i<=4;i++)
        	{
        		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
        		Elements title=doc.select("table.list-wrap a.title");
        		Elements singer=doc.select("table.list-wrap a.artist");
        		for(int j=0;j<title.size();j++)
        		{
        			// 포함여부 확인 
        			if(title.get(j).text().contains(fd))
        			{
        		    	System.out.println(k+"."+title.get(j).text()
        		    	  +"("+singer.get(j).text()+")"
        		    	);
        			    k++;
        			}
        		}
        	}
        }
        else if(menu==2)
        {
        	System.out.print("가수명 입력:");
        	String fd=scan.next();
        	for(int i=1;i<=4;i++)
        	{
        		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
        		Elements title=doc.select("table.list-wrap a.title");
        		Elements singer=doc.select("table.list-wrap a.artist");
        		for(int j=0;j<title.size();j++)
        		{
        			// 포함여부 확인 
        			if(singer.get(j).text().contains(fd))
        			{
        		    	System.out.println(k+"."+title.get(j).text()
        		    	  +"("+singer.get(j).text()+")"
        		    	);
        			    k++;
        			}
        		}
        	}
        }
	}

=======
// contains 
/*
 *   JDBC => DBCP => MyBatis => (JPA)
 *   Ajax => Vue => React => Redux => React-Query => Next
 *   1차     2차     3차 ==========================    4차
 *   MSA
 */
import java.util.Scanner;

import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 문자열_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// Jsoup 셀레니즘 
        Scanner scan=new Scanner(System.in);
        System.out.print("1. 노래명 검색  2. 가수명 검색:");
        int menu=scan.nextInt();
        int k=1;
        if(menu==1)
        {
        	System.out.print("노래명 입력:");
        	String fd=scan.next();
        	for(int i=1;i<=4;i++)
        	{
        		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
        		Elements title=doc.select("table.list-wrap a.title");
        		Elements singer=doc.select("table.list-wrap a.artist");
        		for(int j=0;j<title.size();j++)
        		{
        			// 포함여부 확인 
        			if(title.get(j).text().contains(fd))
        			{
        		    	System.out.println(k+"."+title.get(j).text()
        		    	  +"("+singer.get(j).text()+")"
        		    	);
        			    k++;
        			}
        		}
        	}
        }
        else if(menu==2)
        {
        	System.out.print("가수명 입력:");
        	String fd=scan.next();
        	for(int i=1;i<=4;i++)
        	{
        		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
        		Elements title=doc.select("table.list-wrap a.title");
        		Elements singer=doc.select("table.list-wrap a.artist");
        		for(int j=0;j<title.size();j++)
        		{
        			// 포함여부 확인 
        			if(singer.get(j).text().contains(fd))
        			{
        		    	System.out.println(k+"."+title.get(j).text()
        		    	  +"("+singer.get(j).text()+")"
        		    	);
        			    k++;
        			}
        		}
        	}
        }
	}

>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
}