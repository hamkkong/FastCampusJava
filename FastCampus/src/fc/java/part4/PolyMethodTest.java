package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;


public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    //  private static void display(Cat c) {  // Cat의  display(c) 에서 호출 (오버로딩)
    //      c.eat();
    //  }

    //  private  static void  display(Dog d){  // Dog의  display(d) 에서 호출 (오버로딩)
    //      d.eat();
    //  }

    private static void display(Animal ani) {
        ani.eat();
        // Cat 타입으로 받은 경우에만 실행가능 -> if
        if (ani instanceof Cat) {   // 이 부분을 써주지 않으면 컴파일러는 Dog 객체와 동일한 것으로 취급해 에러발생
            ((Cat) ani).night();  // Cat - 지금은 에러남
        }
    }
}