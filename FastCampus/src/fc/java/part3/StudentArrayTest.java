package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        // 객체배열을 이용하여 4명의 학생 데이터를 만들어 저장하고 출력하시오.
        Student[] st = new Student[4];  //새 객체배열 생성 (4개의 기억공간)
        st[0] = new Student("홍길동", "컴공", 33, "bit@empas.com", 20230110, "010-1111-1111");
        st[1] = new Student("나길동", "전기", 43, "bit@empas.com", 20230111, "010-2222-2222");
        st[2] = new Student("김길동", "건축", 25, "bit@empas.com", 20230112, "010-3333-3333");
        st[3] = new Student("이길동", "통신", 51, "bit@empas.com", 20230113, "010-4444-4444");
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].toString());
        }
        for (Student std : st){  // 배열용 객체를 새로 만들어준 뒤 배열을 출력 (향상된 for문)
            System.out.println(std.toString());
        }

    }
}