public class BinaryExamTest {
    public static void main(String[] args) {
        
        // Q. 123 을 10진수, 2진수, 8진수, 16진수로 출력하시오. 
        int data = 123;  // 10진수
        System.out.println("data = " + data);
        String binary = java.lang.Integer.toBinaryString(data);  // API사용(2진수)
        System.out.println("binary = " + binary); //0b111011 (2진수)
        String octal = java.lang.Integer.toOctalString(data);  // API사용(8진수)
        System.out.println("octal = " + octal); //0173 - 8진수는 숫자앞에 0을 붙임
        String hexa = java.lang.Integer.toHexString(data);  // API사용(16진수)
        System.out.println("hexa = " + hexa);  // 0x7B (16진수)
        
        // 우리가 배웠던 방식으로 출력 
        int x = 123;
        System.out.println("x = " + x);
        int y = 0b1111011;
        System.out.println("y = " + y);
        int z = 0173;
        System.out.println("z = " + z);
        int u = 0x7B;  // B 는 소문자로 해도 상관없음
        System.out.println("u = " + u);

    }
}
