package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name = "홍길동";
        //dto.age = 1000; // 에러발생  (해결방법은 메서드를 생성한 뒤에 값을 수정할 수 있게 제어가능)
        dto.phone = "010-1111-1111";
        System.out.println(dto.name+"\t"+dto.phone); // age를 출력하면 오류발생
        dto.play(); // 메서드의 접근제한자가 public 이므로 출력이 가능
    }
}
