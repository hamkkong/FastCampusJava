package fc.java.part3;

import com.google.gson.Gson;
import fc.java.model3.Person;

public class GsonMemAddFromJson {
    public static void main(String[] args) {
        String json = " {\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@empas.com\"" +
                ",\"address\":{\"city\":\"서울\",\"country\":\"대한민국\"}}";

        Gson gson = new Gson();
        //Json -> Person
        Person member = gson.fromJson(json,Person.class);  // member 라는 객체는 json이며 person.class를 참조
        System.out.println("member = " + member);
    }
}
