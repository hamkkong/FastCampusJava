package fc.java.part2;

public class CallByReferenceExam {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5};
    int result = addArray(a);  // 번지전달(Call by Reference)
        System.out.println("result = " + result);
    }
    // 매개변수로 정수형 배열을 받아서 배열의 총합을 구하여 리턴하는 메서드를 정의하시오.
    public static int addArray(int[]a){  // 이쪽 변수의 이름은 a 외에도 x, y 로 대입할 수 있다.이쪽에서만!
        int sum = 0;
        for(int i =0; i<a.length;i++){
            sum = sum+a[i];  // sum+=a[1];
        }
        return sum;
    }

}

