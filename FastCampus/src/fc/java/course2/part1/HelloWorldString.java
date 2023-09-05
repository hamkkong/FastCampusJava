package fc.java.course2.part1;
import java.lang.*;
public class HelloWorldString {
    public static void main(String[] args) {
        String str = new String("Hello World"); // Heap 메모리에 생성
        System.out.println("str = " + str);
        String str1 ="Hello World"; // Literal pool
        System.out.println("str1 = " + str1);
    }
}
