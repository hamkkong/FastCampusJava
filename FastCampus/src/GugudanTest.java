public class GugudanTest {
    public static void main(String[] args) {
      //  Q. 이중 반복문을 이용하여 아래와 같은 구구단(9X9)을 출력하세요.
       for (int i=2; i<=9; i++){
           System.out.print(i+"단"+"\t\t");
        } System.out.println();

        // 2x1=2  3x1=3  4x1=4 ~ 9x1=9
        for(int i=1; i<10; i++){
            for(int j=2; j<10; j++){
                System.out.print(j+"x"+i+"="+(j*i)+"\t");
            } System.out.println();
        }

    }
}
