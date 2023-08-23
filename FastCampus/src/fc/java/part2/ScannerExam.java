package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 도서정보 입력받기
        Scanner scan = new Scanner(System.in);  // in은 inputStream의 약자
        System.out.print("제목 : ");
        String title = scan.nextLine();
        System.out.println("title = " + title);

        System.out.print("가격 : ");
        int price = scan.nextInt();
        scan.nextLine();  // 이전에 입력된 줄바꿈 문자를 소비
        System.out.println("price = " + price);

        System.out.print("저자 : ");
        String author = scan.nextLine();
        System.out.println("author = " +author);

        System.out.print("페이지수 : ");
        int page = scan.nextInt();
        scan.nextLine(); // 이전에 입력된 줄바꿈 문자를 소비
        System.out.println("page = " + page);

        System.out.print("ISBN : ");
        String isbn = scan.nextLine();
        System.out.println("isbn = " +isbn);

        scan.close();  // 종료구문
    }
}
