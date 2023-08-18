public class CastingTest {
    public static void main(String[] args) { //main, psvm 으로 쳐도 나옴
        float f1 = .10f; //0.10
        System.out.println("f1 = " + f1);
        
        float f2 = 15f; // 15.0
        System.out.println("f2 = " + f2);

        float f3 = 3.14f; // (float)3.14 로 써도 됨
        System.out.println("f3 = " + f3);

        double d1 = 123.4567;
        System.out.println("d1 = " + d1);

        float x = 15.6f;
        int y = (int)x;  //타입에 형변환이 필요 : 캐스팅하여 소수점을 날려버려야 함 (강제형변환; 손실)
        System.out.println("y = " + y);

        char c = 'A';
        int cc = c; //자동형변환 (4byte -> 4byte)
        System.out.println("cc = " + cc);  //65

        int dd = 5;
        double ddd = dd; // 자동 형변환 (4byte -> 8byte)
        System.out.println("ddd = " + ddd);  // 5.0 (실수)

        double dx = 14.67;
        int dy = (int)dx;  //강제형변환 (8byte -> 4byte)
        System.out.println("dy = " + dy);  // 14 (정수)

    }
}
