package fc.java.course2.part3;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    private static JsonObject JsonObjectweatherData;

    public static void main(String[] args) {

        String apiKey="778e8ecbcf505efadb4c9a6d2c2bd86f";
        String city="Seoul";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q="+ city + "&appid="+ apiKey+ "&units=metric";
        try{ // 스트림 정보교환 도중 예외상황이 생길 경우를 대비해 예외처리 구문을 만들어 두어야 함
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");  // 메서드를 get, set 형태중 get 형태로 받아옴
        connection.setRequestProperty("Accept", "application/json");

        int ResponseCode =connection.getResponseCode();  // 특정 숫자 코드를 불러오기 위해 연결하는 코드 /200으로 뜨면 정상작동
           if(ResponseCode==200){
               // 스트림(Stream = 입력, 출력)의 연결
              BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
              String inputLine;
              StringBuffer content = new StringBuffer(); // StringBuffer 는 받은 문자 자료들을 쌓아두는 역할
               while ((inputLine=in.readLine())!= null){
                   content.append(inputLine);
               }
               in.close();
               System.out.println("content.toString() = " + content.toString());
               JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
               JsonObject mainData = weatherData.getAsJsonObject("main");
               double temp = mainData.get("temp").getAsDouble();   // 컨텐츠의 범위를 조금씩 좁혀나간다.
               System.out.println("temp = " + temp);
               connection.disconnect();


           }else {
                // 오류 ~~~~
           }
       }catch (IOException e){
           e.printStackTrace();  // 오류발생시 에러메시지 출력
       }
    }
}
