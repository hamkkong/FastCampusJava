public class BinaryExamTest {
    public static void main(String[] args) {
        
        // Q. 123 을 10진수, 2진수, 8진수, 16진수로 출력하시오. 
        int decimal = 123;  // 10진수
        System.out.println("decimal = " + decimal);

        int binary = 0b01111011;  // 2진수
        System.out.println("binary = " + binary);

        int octal = 0173; //8진수 (0을 숫자 앞에 붙여준다)
        System.out.println("octal = " + octal);

        int hexa = 0x7B; //16진수
        System.out.println("hexa = " + hexa);
    }
}
