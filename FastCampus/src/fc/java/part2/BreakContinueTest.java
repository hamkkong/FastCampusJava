package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        // Q. char[]c={’s’,’h’,’u’,’t’,’d’,’o’,’w’,’n’}; 위 배열의 값을 출력 중
       //  ‘o’ 라는 문자를 만나면 반복을 중지하세요.
        char[] c = {'s', 'h', 'u', 't', 'd', 'o', 'w', 'n'};
        for (int i = 0; i < c.length; i++) {
           if (c[i] == 'o')
                break;    // 'o'를 만나게 되면 반복문을 탈출함
            System.out.print(c[i]);

        }
        System.out.println();

        // Q. 1~10까지의 수 중 3의 배수의 개수를 구하여 출력하세요.
        int count = 0;
        for (int i = 1; i <= 10; i++) {  // 각각의 i 는 독립적이므로 에러가 발생하지 않음 (지역변수)
            if (i % 3 != 0) continue;  // 3의 배수가 아닌 경우 건너뛰어버림(걸러내기)

            count++;   // 3,6,9 의 3가지만 실행됨

        }
        System.out.println(count);


    }
}
