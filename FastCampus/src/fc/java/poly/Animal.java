package fc.java.poly;
// 추상클래스(불완전한 클래스)  --> 단독 사용(객체생성) 불가! 부모 클래스 역할은 가능
public abstract class Animal {
   public abstract void eat();   // 메서드의 구현부를 빼버린 메서드 : 추상 메서드(불완전한 메서드)
    public void move(){  // 일반메서드
        System.out.println("무리를 지어서 이동한다");
    }
}
