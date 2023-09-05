package fc.java.course2.part1;

import fc.java.model2.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {
        // 정수 3개를 배열에 저장하고 출력하세요 => []
        IntArray list = new IntArray();  // 5크기의 정수형 배열
        list.add(1); // 숫자는 추가했지만 배열이 나오지 않는다
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); // 예외 발생 -> 배열의 길이(2배)를 늘려주어야 한다. -> Arrays.copyof()메서드로 해결함
        list.add(7);

       // System.out.println(list.get(0)); // 1
       // System.out.println(list.get(1)); // 2
       // System.out.println(list.get(2)); // 3

       // System.out.println(list.size()); // 3  배열의 총 개수

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
          }

    }
}
