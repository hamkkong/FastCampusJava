package fc.java.part2;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // 한 사람의 [회원] 정보를 저장할 [객체를 생성]하세요.
        PersonVO vo = new PersonVO("홍길동",35,"010-1111-1111");
        //vo.setName();
        //vo.setAge(50); // 정보은닉 되지 않음
       // vo.setPhone("010-1111-1111");

        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone()); // getter 3번사용
        System.out.println(vo.toString());  // 축약해서 이렇게 사용한다.
        System.out.println(vo); // toString도 축약할 수 있다.
    }
}
