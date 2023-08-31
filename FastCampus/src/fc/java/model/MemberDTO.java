package fc.java.model;

public class MemberDTO {   // class와 메서드는 public 이외의 접근제한자는 에러가 남!
    public String name;
    private int age;
    public String phone;

    public void play(){
        System.out.println("운동을 한다.");
    }
}
