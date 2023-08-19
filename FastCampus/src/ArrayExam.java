public class ArrayExam {

    public static void main(String[] args) {
        //정수 1개를 저장할 변수를 선언하세요.
        int a;
        a= 10;  // a 가 메모리에 저장됨

        //정수 3개를 저장할 [변수를 선언]하세요.
        int[]b = new int[3];
        b[0]=10;
        b[1]=20;
        b[2]=30;
        System.out.println(b[0]);

        int i; // 만약에 For문 안에서 int를 정의 안해줄 경우 이렇게 외부에서 쳐주어야 한다. 주의! (그리고 중복도 안됨)
        int[] x={1,2,3,4,5,};  // 초기화
        for( i=0; i<x.length; i++){  // 1~5까지를 length로 표현 가능
            System.out.println(x[i]);
        }

        // 아래 char[] 배열에 APPLE 이라는 문자가 저장되어 있다. 대문자로 된 APPLE를 소문자 apple로 출력하세요.

        char[] c ={'A','P','P','L','E'};   //APPLE
        for(int j=0;j<c.length;j++){
            System.out.print((char)(c[j]+32));  //apple
        }
    }
}
