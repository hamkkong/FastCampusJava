package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class FunctionInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        MathOperation mo = new FunctionInterfaceTest();  // 부모 클래스 = 자식 클래스로 객체 생성함
        int result = mo.operation(10,20);
        System.out.println("result = " + result); //30
    }

    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
