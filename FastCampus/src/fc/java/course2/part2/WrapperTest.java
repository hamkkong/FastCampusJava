package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장하세요.
        int a = 10;  // 기본자료형
        //Integer aa = new Integer(10); // 사용자 정의 자료형
        Integer aa = 10; // Auto-Boxing
        System.out.println(aa.intValue());  //Unboxing(Integer -> int)

        Integer bb = 20;  // Auto-boxing
        int b = bb;  // Auto - Unboxing  (형변환 필요없음)

        float f = 10.5f;
        //Float ff = new Float(10.5f);
        Float ff = 45.6f;  // new Float(45.6f); Auto-boxing
        System.out.println("ff = " + ff.floatValue()); // Auto-unboxing

        Float af = 49.1f;
        System.out.println("af = " + af.floatValue()); // Auto-unboxing
        float aff = af; //af.floatValue() -> Auto-boxing (형변환 없이 새 객체에 객체값을 바로 대입해줌)
        System.out.println("aff = " + aff);
    }

}
