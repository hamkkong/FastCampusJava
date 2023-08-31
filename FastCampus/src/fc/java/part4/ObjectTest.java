package fc.java.part4;

import fc.java.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        // A객체를 Upcasting 으로 생성하세요.
       // A a = new A();
       // a.display();  --> 나는 A이다.
        Object obj = new A(); // Upcasting
        ((A)obj).display(); // Downcasting
    }
}
