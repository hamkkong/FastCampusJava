package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        //Animal ---> Dog,Cat
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();  // 업캐스팅(Upcasting)
        ani.eat();
       // ani.night(); // 재정의가 안되는 상태(부모 클래스에 없어서...)  Animal --> Cat 으로 형변환
        // Cat c = (Cat)ani;
        // c.night();
        ((Cat)ani).night();
    }
}
