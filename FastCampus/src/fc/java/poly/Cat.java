package fc.java.poly;

public class Cat extends Animal {

    public void night(){
        System.out.println("밤에 눈에서 빛이 난다");
    }

    @Override  // 어노테이션 기호 (재정의 완료됨)
    public void eat() {
        System.out.println("고양이처럼 먹다");
    }
}
