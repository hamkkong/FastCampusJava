package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x= 10;
        if(x>0)
            System.out.println("0 or 양수입니다.");
        else
            System.out.println("음수입니다.");

        // 정수 1개를 입력받아 짝수인지 홀수인지 판단하는 프로그램을 만드시오.

        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int su = scan.nextInt();
        if (su%2==0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }

        // 입력받은 수가 12의 배수인지를 출력하는 프로그램을 만드세요
        System.out.println("정수를 입력하세요");
        int num = scan.nextInt();
        if (num%12==0){
            System.out.println("12의 배수입니다.");
        }else{
            System.out.println("12의 배수가 아닙니다.");
        }

        //년도를 입력받아서 해당 년도가 윤년인지 아닌지를 판단하여 출력하는 코드를 작성하세요.
        // 윤년 : 4의 배수의 해이면서 100으로 나누어 떨어지지 않는 해 또는 400의 배수인 해
        System.out.println("년도를 입력하세요");
        int y = scan.nextInt();
        if ((y%4==0&&y%100!=0)||(y%400==0)){
            System.out.println( y+"년은 윤년입니다.");
        }else{
            System.out.println( y+"년은 윤년이 아닙니다.");
        }

    }
}
