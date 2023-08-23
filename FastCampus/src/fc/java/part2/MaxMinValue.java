package fc.java.part2;

public class MaxMinValue {
    public static void main(String[] args) {
        // 삼항 연산자를 이용하여 정수 2개 중 max value 와 min value 를 출력
        int a = 10;
        int b = 20;
        //min value
        int min = (a<b)? a:b;
        System.out.println("min = " + min); // 10;

        //max value
        int max = (a>b)?a:b;
        System.out.println("max = " + max); //20;
    }
}
