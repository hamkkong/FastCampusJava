package kr.news;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupParser {
    public static void main(String[] args) throws IOException {
        //Jsoup을 이용해서 네이버 뉴스 크롤링
        String url = "https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=100&firstLoad=Y";
        Document doc = null;

        try{
            doc = Jsoup.connect(url).get();
        }catch (IOException e){
            e.printStackTrace();
        }
        // 주요 뉴스로 나오는 태그 가져오기
        Elements elements = doc.select("div[id =\"main_content\"]");

        //헤더 부분의 제목 가져오기
        String title = elements.select("h2").text();
        if (title.length()>=4){
            title= title.substring(0,4);
        }
        System.out.println("================================================");
        System.out.println(title);
        System.out.println("================================================");

        for( Element el : elements.select("li")) { // 하위 뉴스 기사들을 for문으로 출력
           System.out.println(el.text());
        }
        System.out.println("================================================= ");

    }
}