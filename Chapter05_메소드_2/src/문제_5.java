/*
 *   문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
 */
import java.util.*;
public class 문제_5 {
	static String upper(String str)
    {
		String res="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='A' && c<='Z')
			{
				res+=c;
			}
			else if(c>='a' && c<='z')
			{
				res+=(char)(c-32);
			}
			else
			{
				res+=c;
			}
		}
		//return str.toUpperCase();
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
        String str=scan.next();
        String res=upper(str);
        System.out.println(res);
        
	}

}
