package fc.java.part2;

public class CharExam {
    public static void main(String[] args) {
        // Q4. ‘1’+’2’+’3’+’4’+’5’ = 15 이 나오도록 프로그래밍 하시오(fc.java.part2.CharExam 클래스)
        // int sum = 0; 으로 선언하고
        int i = '1';    // sum = sum +('1'-'0');
        int j = '2';    // sum = sum +('2'-'0');
        int k = '3';    // sum = sum +('3'-'0');
        int l = '4';    // sum = sum +('4'-'0');
        int m = '5';    // sum = sum +('5'-'0');

        int sum = (i-'0')+(j-'0')+(k-'0')+(l-'0')+(m-'0');

        System.out.println("'1'+'2'+'3'+'4'+'5'= " + sum);
    }
}
