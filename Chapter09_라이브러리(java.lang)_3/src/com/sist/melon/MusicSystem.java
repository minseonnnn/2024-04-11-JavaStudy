package com.sist.melon;
import java.io.*;
public class MusicSystem {
   private static Music[] musics=new Music[100];
   static
   {
	   FileReader fr=null;
	   try
	   {
		   fr=new FileReader("c:\\javaDev\\melon.txt");
		   int i=0;
		   StringBuffer sb=new StringBuffer();
		   while((i=fr.read())!=-1)
		   {
			   sb.append((char)i);
		   }

		   String data=sb.toString();

		   String[] temp=data.split("\n");
		   i=0;
		   for(String s:temp)
		   {
			   String[] m=s.split("\\|"); 
			   
			   musics[i]=new Music();
			   musics[i].setMno(Integer.parseInt(m[0]));
			   musics[i].setTitle(m[1]);
			   musics[i].setSinger(m[2]);
			   musics[i].setAlbum(m[3]);
			   musics[i].setPoster(m[4]);
			   i++;
		   }
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
   public int musicTotalPage()
   {
	   return (int)(Math.ceil(musics.length/20.0));
   }
   public Music[] musicListData()
   {
	   return musics;
   }
   public Music musicDetailData(int mno)
   {
	   Music m=new Music();
	   for(Music mm:musics)
	   {
		   if(mm.getMno()==mno)
		   {
			   m=mm;
			   break;
		   }
	   }
	   return m;
   }
   public Music[] musicFindData(int type,String fd)
   {
	   int count=0;
	   for(Music m:musics)
	   {
		   boolean bCheck=false;
		   if(type==0)
		       bCheck=m.getTitle().contains(fd);
		   else if(type==1)
			   bCheck=m.getSinger().contains(fd);
		   else if(type==2)
			   bCheck=m.getAlbum().contains(fd);
		   
		   if(bCheck)
		   {
			   count++;
		   }
	   }
	   
	   Music[] mm=new Music[count];
	   int i=0;
	   for(Music m:musics)
	   {
		   boolean bCheck=false;
		   if(type==0)
		       bCheck=m.getTitle().contains(fd);
		   else if(type==1)
			   bCheck=m.getSinger().contains(fd);
		   else if(type==2)
			   bCheck=m.getAlbum().contains(fd);
		   
		   if(bCheck)
		   {
			   mm[i]=m;
			   i++;
		   }
	   }
	   return mm;
	   
   }
}