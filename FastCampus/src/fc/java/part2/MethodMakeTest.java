package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) { // static 메서드는 같은 static 만 호출
        int a = 3;
        int b = 5;
        // add 라는 메서드를 호출하여 두 수의 합의 결과를 받아보자.
        int result = add(a, b);
        System.out.println("result = " + result);
    }
    // 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 구하시오.
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
