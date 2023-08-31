package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        // Dog, Cat 을 저장할 배열을 생성하시오.
        //Animal[] ani ={new Dog(), new Cat()};  -> 배열과 동시에 초기화
        // [다형성 배열]
        Animal[] ani = new Animal[2];
        ani[0] = d;
        ani[1] = c;
        display(ani);  // 메서드를 따로 빼주었음을 선언
    }
        public static void display(Animal[] ani){ // display() 메서드로 분리
        for (int i=0; i<ani.length;i++) {
            ani[i].eat(); // ani[0] = Dog, ani[1] = Cat
            if (ani[i] instanceof Cat) {
                ((Cat) ani[i]).night();   // instanceof 를 사용한 형변환 필요
            }

        }
    }
}
