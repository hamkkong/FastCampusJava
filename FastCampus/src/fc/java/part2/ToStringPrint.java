package fc.java.part2;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        // 생성자 메서드를 통해 PersonVO 객체에 원하는 이름, 나이, 전화번호를 저장하고 출력하세요.
        PersonVO vo = new PersonVO("홍길동",34,"010-1111-1111");

        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone()); // getter 3번사용
        System.out.println(vo.toString());  // 축약해서 이렇게 사용한다.
        System.out.println(vo); // toString도 축약할 수 있다.
    }
}
