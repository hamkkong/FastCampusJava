public class FourArithmetic {
    public static void main(String[] args) {
       //두 개의 정수를 사칙연산(+,-,*,/)하여 출력하는 JavaSE 프로그램을 만들어보자.

        int a,b,sum,min,mul,div;
        a=12;
        b=2;
        sum = a+b;
        min = a-b;
        mul = a*b;
        div = a/b;

        System.out.println("a+b = " + sum); // ("a+b = " + (a+b)) ; 이렇게 표현해도 된다.
        System.out.println("a-b = " + min);
        System.out.println("a*b = " + mul);
        System.out.println("a/b = " + div);
    }
}
