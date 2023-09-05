package fc.java.course2.part1;

import fc.java.model2.*;
import fc.java.model2.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        // A,B,C 객체를 배열(Object[])에 저장하고 출력하세요.
        // Book, Movie, Member 객체를 배열(Object[])에 저장하고 출력하세요.
        ObjectArray list = new ObjectArray();
        list.add(new A()); // Upcasting Object element = new A();
        list.add(new B()); // Upcasting Object element = new B();
        list.add(new C()); // Upcasting Object element = new C();

        A a=(A)list.get(0);  // A <= Object (다운캐스팅)
        a.display();

        B b=(B)list.get(1);  // B <= Object (다운캐스팅)
        b.display();

        C c=(C)list.get(2);  // c <= Object (다운캐스팅)
        c.display();

        System.out.println();  //공백 작성

        // 반복문으로 작성
        for(int i=0; i <list.size(); i++){
            if(list.get(i) instanceof A){
                ((A)list.get(i)).display();
            } else if (list.get(i) instanceof B) {
                ((B)list.get(i)).display();
            }else {
                ((C)list.get(i)).display();
            }
        }
    }
}
