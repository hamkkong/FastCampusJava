package fc.java.part2;

public class CallByReference {
    public static void main(String[] args) {
        float a = 56.7f;
        float b = 78.9f;
        // a + b = ?
        floatadd(a,b); // a, b의 제어권이 하단의 메서드로 넘어가게 됨 (Call by Value)
        System.out.println("종료");  // 제어권이 라인 6 아래로 이동하기 때문에 자동적으로 호출됨
    }
    // 매개변수로 두 개의 실수를 받아서 / 총합을 구하여 / 출력하는 메서드를 정의하세요.

    public static void floatadd(float a, float b){
        float sum = a+b;
        System.out.println("sum = " + sum);
        //return; 리턴문이 없어도 메서드가 호출이 되면 다시 제어권이 라인 6으로 이동한다.

    }

}
