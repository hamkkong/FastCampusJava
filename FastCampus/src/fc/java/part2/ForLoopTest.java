package fc.java.part2;

public class ForLoopTest {
    public static void main(String[] args) {
        // Q. 반복문을 이용하여 알파벳 대문자와 아스키 코드를 출력하세요.
        for (int i=1; i<=10;i++){
            System.out.println(i);
        }

        for(char c='A'; c<='Z';c++){
            System.out.println(c + " : " + (int)c);
        } // 소문자를 원할 경우 소괄호 안의 대문자를 소문자로 바꾸면 된다.

        for(int i = 65; i<= 90; i++){
            System.out.println(i + " : " + (char)i);
        }

        // int[] numbers={1,2,3,4,5,6,7,8,9,10}
        int[]numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]); // 인덱스 0~9까지 실행 (총 10개)
        }
        //foreach문 (향상된 for문)
        for(int su : numbers){
            System.out.println(su);
        }
    }
}
