package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
      // String str = "Hello World Java";
       // String str = "Hello,World,Java";
      //  String[] strArray = str.split(",");
        // String[] strArray=str.split("\\s+");
        Scanner scanner = new Scanner(System.in);  // 키보드를 통해 직접 문자열을 입력
        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine();
        String[] strArray = str.split("\\s+");  // 일반 " " 같은 경우도 실행이 되지만 일정하게 자르려면 "\\s+" 를 사용해야 함
        for(String s: strArray){
            System.out.println(s.toString());
        }
    }
}
