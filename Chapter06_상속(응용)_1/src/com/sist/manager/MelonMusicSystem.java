package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.MusicVO;

public class MelonMusicSystem extends GenieMusicSystem{
	//public MusicVO[] musics=new MusicVO[50];
	public String title="멜론 Top50";
	{
		
		  try
		  {
			  // 정상적으로 수행하는 문장 
			  // int a=10/0; // 프로그램 종료
			  Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			  Elements title=doc.select("div.wrap_song_info div.rank01");
			  Elements singer=doc.select("div.wrap_song_info div.rank02");
			  Elements album=doc.select("div.wrap_song_info div.rank03");
			  
			  for(int i=0;i<50;i++)
			  {
				  System.out.println(title.get(i).text());
				  System.out.println(singer.get(i).text());
				  System.out.println(album.get(i).text());
				  System.out.println("==========================");
				  musics[i]=new MusicVO();
				  musics[i].setNo(i+1);
				  musics[i].setTitle(title.get(i).text());
				  musics[i].setSinger(singer.get(i).text());
				  musics[i].setAlbum(album.get(i).text());
			  }
			  
		  }catch(Exception ex) {
			  // 에러 발생시에 복구 / 에러출력 
			  // 에러를 건너뛴다 
		  }
		  
	  }
	  // musicAllData()
}
