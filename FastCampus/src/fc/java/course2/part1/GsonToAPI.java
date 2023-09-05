package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("John", 30); //다운로드한 GsonAPI를 Json파일로 변환
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json); //JSON : {"name":"John","age":30}
    }   // json 포멧으로 출력 완료함!
}
