package fc.java.part4;

import fc.java.poly.*;


public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 TV를 동작시켜보자.
        // 다형성이 100% 보장된다.
        // 부모가 인터페이스면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬 수가 있다.
        //Remocon r = new Remocon();  객체생성 불가
        //부모의 역할을 할 수 있다.
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.InterNet();  //? 오동작

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.InterNet();  //? 오동작  --> 구현된 메서드를 사용하지 못하도록 할 필요가 있다.
    }
}
