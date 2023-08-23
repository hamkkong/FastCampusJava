package fc.java.part2;

public class ArrayMake {
    public static void main(String[] args) {
        // 정수 5개가 들어가는 배열을 생성하시오.
        int[] a = new int[5];
       // a[0] = 10;
       // a[1] = 10;
       // a[2] = 10;
       // a[3] = 10;
       // a[4] = 10;
        for (int i=0; i<a.length; i++){
            a[i] = 10; // 모든 배열의 값이 10으로 통일된다는 공통점이 있다.
            System.out.println(a[i]);
        }



        float[] f = new float[5]; //길이가 고정되므로 []안의 숫자가 빠지면 에러 발생

       Book b1, b2, b3;
        Book[] b = new Book[3]; // 책 3권을 저장할 배열을 생성
    }
}
