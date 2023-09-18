package fc.java.course2.part2;

import fc.java.model2.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase = s->s.toUpperCase();  // 람다식으로 메서드를 축약
        StringOperation toLowerCase = s->s.toLowerCase();

        String input = "Lambda Expressions";  // 변수를 저장하는 메서드:이 문자열을 각각 대문자, 소문자로 출력한다.

        System.out.println(proessString(input, toUpperCase)); // 파라미터(매개변수),메서드(구현체)
        System.out.println(proessString(input, toLowerCase));
    }
    // 대소문자를 변환해주는 메서드
    public static String proessString(String input, StringOperation operation){
        return operation.apply(input);
    } //processString에 input과 StringOperation의 기능(메서드)을 한번에 넣어서 람다식으로 축약
    // return에서는 operation 이 구현기능이 되고 , 괄호 안에 input을 변환한다는 뜻이 됨 
}
