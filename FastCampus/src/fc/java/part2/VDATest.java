package fc.java.part2;

public class VDATest {
    public static void main(String[] args) {
        // Q. 정수 한 개를 저장하기 위해서 [변수를 선언] 하시오.
        int a ;   // 변수 선언 -> 기억공간이 만들어짐
        a = 10;
        System.out.println("a = " + a);  //soutv + spacebar (자동으로 변수에 해당하는 문자를 띄워줌)

        // Q.변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수 b에 10을 곱하여 변수 c에 저장하시오.
        a = 10; // 위에서 선언된 int a를 재사용
        int b = a; // a 에 저장된 값을 변수 b에 저장
        int c = b*10;
        System.out.println("c = " + c);  //soutv 는 바로 위의 계산식의 결과값만을 출력

        //Q. sum이라는 변수에 1부터 5까지의 수를 누적(accumulate)해서 출력하시오.
        int sum = 0;
        sum = sum + 1; // 0+1
        sum = sum + 2; // 1+2
        sum = sum + 3; // 3+3
        sum = sum + 4; // 6+4
        sum = sum + 5; // 10+5 
        System.out.println("sum = " + sum); //15 (누적의 가장 전형적인 방법)

        //Q. x = 10, y= 20을 저장하고 변수의 값을 서로 교환(swap) 하여 출력하시오.
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + " : " + "y = " + y);
        // 교환
        int tmp;   // 두 개의 기억공간을 바로 서로 치환할 수 없으므로 임시 기억공간을 1개 만들어 준 뒤 이동시킨다.
        tmp = y;
        y = x;
        x = tmp;
        System.out.println("x = " + x + " : " + "y = " + y);
    }
}
