package fc.java.poly;

public class Dog extends Animal { // Animal -> eat(); 추상메서드 -> 부모의 메서드의 바디를 만들어라.
    //재정의를 반드시 해야 한다. --> 구현해야 한다. 바디({ })를 만들면 된다.
    public void eat(){  // Override 기능
        System.out.println("개처럼 먹다");
    }
}

