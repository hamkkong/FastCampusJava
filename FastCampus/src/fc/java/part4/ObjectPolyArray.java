package fc.java.part4;
import fc.java.poly.*;

import static fc.java.part4.PolyArrayTest.display;

public class ObjectPolyArray {
    public static void main(String[] args) {
        // A, B 클래스를 저장할 배열을 생성하세요.
        // 다형성 배열
        Object[] obj = new Object[2];
        obj[0] = new A();
        // ((A)obj[0]).printGo();
        obj[1] = new B();
        // ((B)obj[1]).printGo();  // 따로쓰면 귀찮으니 반복문으로 처리해보자

        display(obj);  //메서드 처리해서 for문을 넘김

        /* for(int i=0; i<obj.length;i++){  // 사용자가 직접 처리
            if (obj[i] instanceof A) {  // obj[] : 배열 이라는 것을 잊지 않도록 주의!!
                ((A) obj[i]).printGo();
            } else {
                ((B) obj[i]).printGo();
            }
        }

         */
    }

    private static void display(Object[] obj) { // 메서드로 불러온 뒤 사용자 처리부분을 넣음
        for(int i=0; i<obj.length;i++){
            if (obj[i] instanceof A) {  // obj[] : 배열 이라는 것을 잊지 않도록 주의!!
                ((A) obj[i]).printGo();
            } else {
                ((B) obj[i]).printGo();
            }
        }
    }
}
