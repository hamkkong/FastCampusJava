package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        // 생성자 메서드를 통해 PersonVO객체에 이름, 나이, 전화번호를 저장하고 출력하세요.
        PersonVO vo = new PersonVO("홍길동",24,"010-1111-2222");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());

        PersonVO vo1 = new PersonVO("김길동",30,"010-3333-4444");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());

        // 개발자가 원하는 값으로 초기화를 하는 방법을 알아야 한다!! (vo의 초기값 형태로만 출력이 가능한 상태임)
    }
}
