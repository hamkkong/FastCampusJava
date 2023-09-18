package fc.java.part2;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // setter.getter 메서드를 통해 PersonVO 객체에 이름 나이 전화번호를 저장하고 출력하세요.
        PersonVO vo = new PersonVO("홍길동",28,"010-1234-5678");
        //vo.name = "홍길동";
       // vo.setName("홍길동");
       // vo.setAge(50);
       // vo.setPhone("010-1111-1111");  // 정보를 입력할떄는 set 메서드
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
    }  // 정보를 출력할 때는 get 메서드
}
