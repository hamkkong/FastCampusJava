import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요 :");
        int num = scan.nextInt();  // 블럭상태 (키보드가 숫자를 입력받을 때까지 멈춤)
        System.out.println("num = " + num);

        System.out.println("실수를 입력하세요 :");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.println("문자를 입력하세요 :"); //"A", "ABC"
        String str = scan.next();
        System.out.println("str = " + str);

        scan.nextLine();  // 버퍼비우기 (스트림 비우기)

        System.out.println("문자열 입력하세요 :"); //"A", "ABC"
        String str1 = scan.nextLine();
        System.out.println("str1 = " + str1);
    }
}
