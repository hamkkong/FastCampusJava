package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동", 30, "bit@empas.com");
        //JSON -> {"name" : "홍길동", "age":30,"email":"bit@empas.com"}
        Gson gson=new Gson();  //Gson의 객체 생성
        String json = gson.toJson(mvo); // json은 문자 파일이므로 String 자료형을 사용한다.
        System.out.println("json = " + json);
    }
}
