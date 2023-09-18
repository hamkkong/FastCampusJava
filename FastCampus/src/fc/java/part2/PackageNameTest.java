package fc.java.part2;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;   // 이렇게 단일구문만 임포트하기보다 *을 사용해 접근하면 더 효율적임
// import fc.java.model.* 과 같은 식으로 입력해주면 된다.
import java.util.Scanner;
// import java.lang.*   // 이 생략되어 있음. (디폴트 패키지)
public class PackageNameTest {
    public static void main(String[] args) {
        // Q. 지금까지 자바에서 제공해주어서 사용하는 클래스틀의 이름을 적어보자?
        String str = "홍길동";   // String 클래스
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World"); // System 클래스
        //우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자.
       // fc.java.model.CarDTO car = new fc.java.model.CarDTO();  // 클래스 풀네임
        // 혹은 아까의 Scanner 처럼 클래스가 있는 위치를 임포트 시켜주면 해결할 수 있다.
        CarDTO car = new CarDTO();
        CarDAO dao = new CarDAO();

    }
}
