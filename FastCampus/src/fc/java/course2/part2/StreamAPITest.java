package fc.java.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[]numbers = {1,2,3,4,5};
     /*   int even =0; // 총합 초기화
        for(int num : numbers){
            if(num%2==0){
                even+=num;
            }//
        }//*/ //(ctrl+shift+/) -> 주석처리 단축키
        
        IntStream stream = Arrays.stream(numbers);
        int sumOfEvens = Arrays.stream(numbers)
                        .filter(n -> n%2==0) // 람다식
                        .sum();
        System.out.println("sumOfEvens = " + sumOfEvens);
        
        int[] evenNumbers = Arrays.stream(numbers) // Stream 은 병렬처리가 가능하다
                        .filter(n -> n%2==0)
                        .toArray(); // 배열은 무조건 toArray()로 받음
        
        for(int even : evenNumbers){
            System.out.println("even = " + even);
        }
        
    }
}
