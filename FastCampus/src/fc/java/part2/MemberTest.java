package fc.java.part2;

public class MemberTest {
    public static void main(String[] args) {
        //Q. 아래에 예시된 한 명의 헬스클럽회원 데이터를 저장하고 출력하시오 (fc.java.part2.MemberTest)
      Member m = new Member();
      m.name = "홍길동";
      m.age = 30;
      m.tel = "010-1111-1111";
      m.email = "fc@nave.com";
      m.weight = 57.6f;

        System.out.println(m.name+"\t"+m.age+"\t"+m.tel+"\t"+m.email+"\t"+m.weight);
    }
}
