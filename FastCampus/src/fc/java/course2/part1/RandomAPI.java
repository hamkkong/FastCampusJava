package fc.java.course2.part1;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[6];
        int i=0; // 저장위치(pos)
        while (i<6){
            int num = rand.nextInt(45)+1;  //1~45
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){ // 동일한 난수가 들어있는지 체크 (중복방지)
                if (arr[j]==num){
                    isDuplicate=true; // 같은 수가 있다
                    break;  // 같은 수가 있으면 저장하지 말고 밖으로 탈출
                }
            }
            if(!isDuplicate){ // 만약 동일한 난수가 아니면
                arr[i++]=num;  // 베열 안에 저장해라.
            }
        }
        for(int num :arr){ // 향상된 for 문으로 정렬 for(꺼낼 자료형 : 배열이름)
            System.out.print(num+" ");
        }
    }
}
