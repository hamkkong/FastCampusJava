package fc.java.model;

public class Dog extends Animal {
    public Dog(){
        super(); // new Animal() -> super() 는 메서드 내용문의 가장 첫번째 줄에 생성되어야 한다.
    }

    public void eat(){  // Override 기능
        System.out.println("개처럼 먹다");
    }
}

