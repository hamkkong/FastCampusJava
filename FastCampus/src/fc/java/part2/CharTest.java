package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        char  c = 'A';
        System.out.println("c = " + c); // A
        int a = 'A'; // 현재 A를 수치형 자료로 인식함 
        System.out.println("a = " + a);
        int b = 'B'+1;
     //   System.out.println("b = " + b); // B 를 수치형 자료로 인식하고 연산을 수행
        System.out.println("b = " + (char)b); // 연산 수행 후 문자로 형변환
        // Q1. ‘가’ 라는 한글 한 문자를 변수에 저장하고 출력하시오.
        
        char han = '가'; // 문자형으로 출력함 - 가 로 출력
        System.out.println("han = " + han);
        int hanD = '가'; //44032
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00';
        System.out.println("hanU = " + (char)hanU); // 가

       // Q2. 대문자 ‘A’를 문자 ‘a’로 변환하여 출력하시오(ASCII 코드 참고)
        char upper = 'A';
        char lower = (char)(upper+32); //캐스팅
        System.out.println("lower = " + lower);

        char lower1 = 'u'; // 117
        int upper1 = lower1-32;  //117 -32 = 85
        System.out.println("upper1 = " + (char)upper1); //85 캐스팅하여 대문자 U를 출력함

        // Q3. ‘1’ + ‘2’ = 3 이 나오도록 프로그래밍 하시오.
        int data ='1' + '2';
        System.out.println("data = " + data);  //99

        //'0' = 48
        char i = '1'; // 49-48 = 1
        char j = '2'; // 50-48 = 2
        //int sum = (i-48) + (j-48);
        int sum = (i-'0') + (j-'0');
        System.out.println("sum = " + sum); //3




    }
}
