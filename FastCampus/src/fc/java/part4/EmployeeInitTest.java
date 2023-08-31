package fc.java.part4;

public class EmployeeInitTest {
    public static void main(String[] args) {
        RempVO vo = new RempVO("홍길동", 500,"010-1111-1111","2022-10-10","홍보부",true);
        System.out.println(vo.toString());  // 정보은닉이 잘못된 경우 부모클래스를 먼저 보호해야 한다.
    }
}
