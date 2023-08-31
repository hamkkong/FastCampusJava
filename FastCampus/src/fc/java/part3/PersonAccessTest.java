package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Person 클래스에 이름, 나이 전화번호를 저장하고 출력하세요
        PersonDTO p = new PersonDTO();  // 지난 시간에 만들었던 클래스 정보를 호출
        p.name = "홍길동";
        p.age = 1000;  // 현재 접근제어자가 public 이므로 수정이 허용됨.
        p.phone = "010-1111-1111";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
    }
}
