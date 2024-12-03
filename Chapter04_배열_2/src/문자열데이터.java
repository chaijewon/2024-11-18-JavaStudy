import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *   {"HOME SWEET HOME (Feat. 태양 & 대성)|G-DRAGON|HOME SWEET HOME|유지|0"
 *   ,"APT.|로제 (ROSÉ) & Bruno Mars|APT.|유지|0",
 *   "Whiplash|aespa|Whiplash - The 5th Mini Album|유지|0",
 *   "POWER|G-DRAGON|POWER|유지|0",
 *   "나는 반딧불|황가람|나는 반딧불|유지|0",
 *   "HAPPY|DAY6 (데이식스)|Fourever|유지|0",
 *   "내 이름 맑음|QWER|2nd Mini Album 'Algorithm's Blossom'|유지|0"
 *   ,"UP (KARINA Solo)|aespa|SYNK : PARALLEL LINE - Special Digital Single|유지|0",
 *   "Mantra|제니 (JENNIE)|Mantra|유지|0",
 *   "Welcome to the Show|DAY6 (데이식스)|Fourever|유지|0",
 *   "한 페이지가 될 수 있게|DAY6 (데이식스)|The Book of Us : Gravity|유지|0",
 *   "내게 사랑이 뭐냐고 물어본다면|로이킴|내게 사랑이 뭐냐고 물어본다면|유지|0",
 *   "Supernova|aespa|Armageddon - The 1st Album|상승|1","소나기|이클립스 (ECLIPSE)|선재 업고 튀어 OST Part 1|상승|1",
 *   "고민중독|QWER|1st Mini Album 'MANITO'|하강|1",
 *   "예뻤어|DAY6 (데이식스)|Every DAY6 February|하강|1",
 *   "슬픈 초대장|순순희 (지환)|슬픈 초대장|상승|1",
 *   "Drowning|WOODZ|OO-LI|상승|1",
 *   "천상연|이창섭|천상연 (웹툰 '선녀외전' X 이창섭 (LEE CHANGSUB))|하강|1",
 *   "How Sweet|NewJeans|How Sweet|하강|1",
 *   "나는 아픈 건 딱 질색이니까|(여자)아이들|2|상승|1",
 *   "에피소드|이무진|에피소드|상승|1",
 *   "너와의 모든 지금|재쓰비 (JAESSBEE)|너와의 모든 지금|하강|1",
 *   "어떻게 이별까지 사랑하겠어, 널 사랑하는 거지|AKMU (악뮤)|항해|하강|1",
 *   "사랑은 늘 도망가|임영웅|신사와 아가씨 OST Part.2|유지|0",
 *   "Small girl (Feat. 도경수 (D.O.))|이영지|16 Fantasy|유지|0",
 *   "첫 만남은 계획대로 되지 않아|TWS (투어스)|TWS 1st Mini Album 'Sparkling Blue'|유지|0",
 *   "Love wins all|아이유 (IU)|The Winning|유지|0",
 *   "클락션 (Klaxon)|(여자)아이들|I SWAY|유지|0",
 *   "비의 랩소디|임재현|비의 랩소디|유지|0",
 *   "All I Want for Christmas Is You|Mariah Carey|Merry Christmas (Deluxe Anniversary Edition)|상승|1",
 *   "number one girl|로제 (ROSÉ)|number one girl|상승|1",
 *   "첫 눈|EXO|겨울 스페셜 앨범 '12월의 기적 (Miracles in December)'|하강|1",
 *   "이제 나만 믿어요|임영웅|내일은 미스터트롯 우승자 특전곡|하강|1",
 *   "Magnetic|아일릿 (ILLIT)|SUPER REAL ME|유지|0",
 *   "우리들의 블루스|임영웅|IM HERO|유지|0",
 *   "청춘만화|이무진|만화 (滿花)|유지|0",
 *   "헤어지자 말해요|박재정|1집 Alone|유지|0",
 *   "해야 (HEYA)|IVE (아이브)|IVE SWITCH|상승|2",
 *   "모래 알갱이|임영웅|모래 알갱이|상승|2",
 *   "너의 모든 순간|성시경|별에서 온 그대 OST Part.7 (SBS 수목드라마)|하강|1",
 *   "SPOT! (Feat. JENNIE)|지코 (ZICO)|SPOT!|하강|1",
 *   "다시 만날 수 있을까|임영웅|IM HERO|상승|1",
 *   "녹아내려요|DAY6 (데이식스)|Band Aid|상승|1",
 *   "그대만 있다면 (여름날 우리 X 너드커넥션 (Nerd Connection))|너드커넥션 (Nerd Connection)|그대만 있다면 (여름날 우리 X 너드커넥션 (Nerd Connection))|상승|1",
 *   "Supernatural|NewJeans|Supernatural|상승|1",
 *   "무지개|임영웅|IM HERO|상승|4",
 *   "밤양갱|비비 (BIBI)|밤양갱|상승|4",
 *   "Home|임영웅|온기|하강|4",
 *   "온기|임영웅|온기|하강|4"}

 */
public class 문자열데이터 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String data="{";
        Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
        Elements title=doc.select("table.list-wrap td.info a.title");
        Elements singer=doc.select("table.list-wrap td.info a.artist");
        Elements album=doc.select("table.list-wrap td.info a.albumtitle");
        Elements etc=doc.select("table.list-wrap td.number span.rank");
        for(int i=0;i<title.size();i++)
        {
        	//System.out.println(title.get(i).text());
        	//System.out.println(singer.get(i).text());
        	//System.out.println(album.get(i).text());
        	String s=etc.get(i).text();
        	String state="",idcrement="";
        	if(s.equals("유지"))
        	{
        		state="유지";
        		idcrement="0";
        	}
        	else
        	{
        		state=s.replaceAll("[^가-힣]", "");
        		idcrement=s.replaceAll("[^0-9]", "");
        	}
        	//System.out.println(state);
        	//System.out.println(idcrement);
        	//System.out.println("=============================");
        	data+="\""+title.get(i).text()+"|"
        	      +singer.get(i).text()+"|"
        	      +album.get(i).text()+"|"
        	      +state+"|"+idcrement+"\",";
        	      
        }
        data=data.substring(0,data.lastIndexOf(","));
        data+="}";
        System.out.println(data);
        
	}

}
