package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30}";  // 따옴표 사이마다 역슬래시가 들어가야 에러가 안남
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class); // 변환할 파일 타입과 우리가 변환하고 싶은 파일 클래스명 적는다
        System.out.println(p.getName()); // John
        System.out.println(p.getAge());  // 30
        System.out.println(p.toString()); // 좀 더 디테일한 결과물을 출력

    }
}
