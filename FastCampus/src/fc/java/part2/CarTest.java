package fc.java.part2;

public class CarTest {
    public static void main(String[] args) {
        // 자동차의 정보를 저장하려고 한다. 변수를 만들어 보시오 (fc.java.part2.CarTest 클래스)
        String model = "BMW528i"; // 문자열 데이터는 String 자료형(API) , 문자형 변수는 "" (쌍따옴표) 저장
        System.out.println("model = " + model); //soutv 를 치면 변수명까지 깔끔하게 만들어줌
        long distance = 100000; // 21억이 넘어가는 경우 숫자에 L을 붙이면 컴파일러가 8byte로 해석해준다.
        System.out.println("distance = " + distance+ "km");
        int price = 9000000;
        System.out.println("price = " + price);
        String company = "BMW";
        System.out.println("company = " + company);
        char type = 'A';
        System.out.println("type = " + type);
        boolean auto = true;  //boolean 값을 초기화 시켜줌
        System.out.println("auto = " + auto);
        int year = 2000;
        System.out.println("year = " + year);
        float gasmi = 12.5F; // 실수는 기본형 double(8byte)로 인식한다. float형으로 인식히게 하고 싶으면 숫자에 F를 붙인다.
        System.out.println("gasmi = " + gasmi +"L");
    }
}  // 자동차 정보를 저장하기 위해서 8개의 독립적인 변수가 사용되었다,바람직한가? 해결방법은 있는가?
