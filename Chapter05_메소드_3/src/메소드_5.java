<<<<<<< HEAD
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 메소드_5 {
    static void find(int type,String fd) throws Exception
    {
    	Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
		Elements title=doc.select("div.wrap_song_info div.rank01");
		Elements singer=doc.select("div.wrap_song_info div.rank02 span.checkEllipsis");
		// Jsoup => 미리보기에 데이터 출력된 경우에만 읽는다
		for(int i=0;i<title.size();i++)
		{
			boolean bCheck=false;
			if(type==1)
				bCheck=title.get(i).text().contains(fd);
			else 
				bCheck=singer.get(i).text().contains(fd);
			
			if(bCheck)
				System.out.println((i+1)+"."+title.get(i).text()
    					+"["+singer.get(i).text()+"]");
		}
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        while(true)
        {
        	System.out.println("===== 메뉴 =====");
        	System.out.println("1. 뮤직 목록"); // 멜론
        	System.out.println("2. 노래명 검색");
        	System.out.println("3. 가수명 검색");
        	System.out.println("4. 프로그램 종료");
        	System.out.println("===============");
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	if(menu==1)
        	{
        		Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
        		Elements title=doc.select("div.wrap_song_info div.rank01");
        		Elements singer=doc.select("div.wrap_song_info div.rank02");
        		for(int i=0;i<title.size();i++)
        		{
        			System.out.println((i+1)+"."+title.get(i).text());
        		}
        	}
        	else if(menu==2)
        	{
        		System.out.print("검색어 입력:");
        		String fd=scan.next();
        		find(1,fd);
        	}
        	else if(menu==3)
        	{
        		System.out.print("가수 입력:");
        		String fd=scan.next();
        		find(2,fd);
        	}
        	else if(menu==4)
        	{
        		System.out.println("프로그램 종료");
        		break; // for,while => 바로 종료
        	}
        	else
        	{
        		System.out.println("메뉴가 존재하지 않습니다");
        		continue;
        		/*
        		 *   for(초기값;조건식;증가식)
        		 *      continue; ==> 증가식 이동 => 특정부분 제외
        		 *   while(조건식)
        		 *   {
        		 *      continue; ==> 조건식 이동 => 처음부터 다시 시작  
        		 */
        	}
        }
	}

}
=======
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 메소드_5 {
    static void find(int type,String fd) throws Exception
    {
    	Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
		Elements title=doc.select("div.wrap_song_info div.rank01");
		Elements singer=doc.select("div.wrap_song_info div.rank02 span.checkEllipsis");
		// Jsoup => 미리보기에 데이터 출력된 경우에만 읽는다
		for(int i=0;i<title.size();i++)
		{
			boolean bCheck=false;
			if(type==1)
				bCheck=title.get(i).text().contains(fd);
			else 
				bCheck=singer.get(i).text().contains(fd);
			
			if(bCheck)
				System.out.println((i+1)+"."+title.get(i).text()
    					+"["+singer.get(i).text()+"]");
		}
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        while(true)
        {
        	System.out.println("===== 메뉴 =====");
        	System.out.println("1. 뮤직 목록"); // 멜론
        	System.out.println("2. 노래명 검색");
        	System.out.println("3. 가수명 검색");
        	System.out.println("4. 프로그램 종료");
        	System.out.println("===============");
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	if(menu==1)
        	{
        		Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
        		Elements title=doc.select("div.wrap_song_info div.rank01");
        		Elements singer=doc.select("div.wrap_song_info div.rank02");
        		for(int i=0;i<title.size();i++)
        		{
        			System.out.println((i+1)+"."+title.get(i).text());
        		}
        	}
        	else if(menu==2)
        	{
        		System.out.print("검색어 입력:");
        		String fd=scan.next();
        		find(1,fd);
        	}
        	else if(menu==3)
        	{
        		System.out.print("가수 입력:");
        		String fd=scan.next();
        		find(2,fd);
        	}
        	else if(menu==4)
        	{
        		System.out.println("프로그램 종료");
        		break; // for,while => 바로 종료
        	}
        	else
        	{
        		System.out.println("메뉴가 존재하지 않습니다");
        		continue;
        		/*
        		 *   for(초기값;조건식;증가식)
        		 *      continue; ==> 증가식 이동 => 특정부분 제외
        		 *   while(조건식)
        		 *   {
        		 *      continue; ==> 조건식 이동 => 처음부터 다시 시작  
        		 */
        	}
        }
	}

}
>>>>>>> 04934d19558c0e09418ecde1327b3ca6bf76c2c1
