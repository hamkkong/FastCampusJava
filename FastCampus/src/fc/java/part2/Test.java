package fc.java.part2;

public class Test {
    public static void main(String[] args) {
       int sum = 0;
        for(int i=0;i<=10; i++){
           sum+=i; // i의 값이 1~10까지 1씩 증가하여 변하는 동안 i의 값을 누적해 sum에 저장한다.
       }
        System.out.println(sum);
    }
}
