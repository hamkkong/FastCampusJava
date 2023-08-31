package fc.java.part4;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글입니다");
        //System.out.println(b.getTitle());
        System.out.println(b.toString());  // 객체의 번지수를 출력 : fc.java.poly.Board@3f0ee7cb -> 재정의해주먼 "게시글입니다" 가 출력
        System.out.println(b); // toString을 축약한 형태로 결과는 동일 : fc.java.poly.Board@3f0ee7cb-> 재정의해주먼 "게시글입니다" 가 출력
    }
}
