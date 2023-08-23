package fc.java.part2;

public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f; //f 를 써주지 않으면 double로 자동 형변환이 일어남
        boolean b = false;
        char c = 'A';
        String s = "APPLE";  // 문자열을 사용할땐 String / 사용자 정의 자료형(class)
        
        //Q. 69를 10진수, 2진수, 8진수, 16진수로 출력하시오.
        int decimal = 69;  // 10진수
        System.out.println("decimal = " + decimal);
        
        int binary = 0b01000101;  // 2진수
        System.out.println("binary = " + binary);

        int octal = 0105; //8진수
        System.out.println("octal = " + octal);
        
        int hexa = 0x45; //16진수
        System.out.println("hexa = " + hexa);
    }
}
