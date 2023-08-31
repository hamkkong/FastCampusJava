package fc.java.part4;

import fc.java.model.*;


public class OverrideTest {
    public static void main(String[] args) {
        // Upcasting(업캐스팅) : Dog.java(x), Animal <---> Dog.class(o)
        Animal ani = new Dog();
        ani.eat();  // Animal ---(동적바인딩) ---Dog

       ani = new Cat();  // 혹은 Animal ani1 = new Cat(); 으로 써도 된다.
        ani.eat();
    }
}
