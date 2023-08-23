package fc.java.part2;

public class whileLoopTest {
    public static void main(String[] args) {

        //0~5 까지 수를 출력하세요.
        int i=0; // 초기식
        while (i<=5){
            System.out.println(i);
            i++;  //증감식
        }
        //Q. int[]numbers = {1,2,3,4,5,6,7,8,9,10} 주어진 배열의 모든 원소를 출력하세요.
        int []numbers={1,2,3,4,5,6,7,8,9,10};
        i=0; // 초기화 실행
        while(i<numbers.length){ // i<=10 과 같음
            System.out.println(numbers[i]);
            i++;
        }
        System.out.println(i); // 인덱스 9(10)의 값을 가진채로 탈출
        i =1;
        do{
            System.out.println(i);
            i++;
        }while (i<=5);  //  한번 실행한 뒤에 조건을 확인하는 경우는 do ~while문을 사용함
    }
}
