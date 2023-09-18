package fc.java.part2;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; // st1 : Object
        Student st2; // st2 : Object
        Student st3; // st3 : Object

        st1 = new Student("홍길동","컴퓨터공학과", 37, "bit@empas.com",2023110, "010-1111-1111"); // st1 : Instance
        st2 = new Student("김길동", "컴퓨터공학과", 37, "bit@empas.com",2023110, "010-1111-1111"); // st1 : Instance
        st3 = new Student("나길동", "컴퓨터공학과", 37, "bit@empas.com",2023110, "010-1111-1111"); // st1 : Instance

        System.out.println(st1.toString()); // toString 생략가능
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
