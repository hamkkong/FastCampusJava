package fc.java.part2;

public class LoopLoopTest {
    public static void main(String[] args) {
        int index = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(index);
                index++;
            } //_j

        } //_x

        int[][] a = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        for (int i = 0; i < a.length; i++) { // i 는 행을 표시
            for (int j = 0; j < a[i].length; j++) { // j는 열을 표시
                System.out.print(a[i][j] + "\t");  // '\t' 는 다른 결과가 출력되니 쓰지말것!
            }
            System.out.println();  // 줄바꿈



        }
    }
}
