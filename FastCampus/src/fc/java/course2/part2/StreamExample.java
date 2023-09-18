package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
    public static boolean isEven(int number){  // boolean 타입인 것에 주의할것! -> 참조방식
        return number%2==0;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven = n -> n%2==0;
        int sumOfSqures = numbers.stream()
                //.filter(isEven) //n->n%2==0 isEven.test() 공식 대신에 변수명 넣어줄것
                .filter(StreamExample::isEven)
                .sorted()
                .map(n->n*n)
                .reduce(0,Integer::sum);
        System.out.println("sumOfSquares = " + sumOfSqures);

    }
}
