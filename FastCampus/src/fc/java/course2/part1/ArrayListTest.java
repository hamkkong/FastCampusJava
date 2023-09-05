package fc.java.course2.part1;

import fc.java.model2.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요.
        //Book[], Object[]
        // ArrayList = ObjectArray
      ArrayList list = new java.util.ArrayList(1); // 기본크기 10 : Object
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정보", "나길동"));

        Book vo=(Book)list.get(0); // Book <---(Book)Object = 다운캐스팅(형변환)
        System.out.println(vo.toString());

        vo=(Book)list.get(1); // Book <---(Book)Object = 다운캐스팅(형변환)
        System.out.println(vo.toString());

        vo=(Book)list.get(2); // Book <---(Book)Object = 다운캐스팅(형변환)
        System.out.println(vo.toString());
        System.out.println();
        for (int i =0; i<list.size();i++){
         // Book b = (Book)List.get(i);
          System.out.println(list.get(i)); // Object -> Book(JVM에서 자동으로 Book의 toString()출력해줌)
        }
    }
}