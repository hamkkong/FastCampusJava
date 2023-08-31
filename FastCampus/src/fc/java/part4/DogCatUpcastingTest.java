package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Dog 객체를 사용해보자
        // Dog d = new Dog();
        // d.eat();
        // upcasting(업캐스팅)
        // 부모가 자식을 가리킨다.
        Animal ani = new Dog();
        ani.eat(); // 동물처럼 먹다 -> 개처럼 먹다(우리가 원하는 결과)

        ani = new Cat();
        ani.eat();  // 동물처럼 먹다 -> 고양이처럼 먹다(우리가 원하는 결과)
    }
}
