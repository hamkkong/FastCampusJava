package fc.java.part2;

public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");    // 메서드의 오버로딩 (다양한 변수값을 출력 가능하게 함)

        int max = maxValue(7,9);
        System.out.println("max = " + max);

        int min = minValue(3,8);
        System.out.println("min = " + min);
    }
    // 두 개의 정수를 매개변수로 받아서 큰 수를 리턴하는 메서드를 정의하시오.  (삼항 연산자 사용)

    public static int maxValue(int a, int b){
        return (a>b) ? a : b ;
    }

    // 두 개의 정수를 매개변수로 받아서 더 작은 수를 리턴하는 메서드를 정의하시오. (삼항 연산자 사용)
    public static int  minValue(int a, int b){
        return (a<b)? a:b;
    }


}
