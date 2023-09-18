package fc.java.part2;
// object = 상태정보(멤버변수) + 행위정보(멤버메서드)
public class PersonDTO {  // 상태정보
    public String name;
    public int age;

    public String phone;
    //기본 생성자 메서드
    public PersonDTO(){
        // 내용은 없지만 생성자가 존재한다 (디폴트 생성자)
    }

      public void play() {  // 행위정보
          System.out.println("운동을 한다");
      }
      public void eat() {
          System.out.println("밥을 먹는다");
      }
      public void walk(){
      System.out.println("걷는다");
    }
}
