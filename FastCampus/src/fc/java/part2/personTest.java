package fc.java.part2;

public class personTest {
    public static void main(String[] args) {
        //한 사람의 데이터를 저장할 변수를 선언하세요.
        // 모델링 된 PersonDTO 클래스를 이용하여 [객체를 메모리에 저장]하시오.
        // [인스턴스를 만드는 과정]
        PersonDTO p = new PersonDTO();  // p가 인스턴스변수화 되었음
        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-111-1111";

        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();
    }
}
