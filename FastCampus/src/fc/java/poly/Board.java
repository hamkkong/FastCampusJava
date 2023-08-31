package fc.java.poly;

public class Board extends Object{  // toString 사용가능
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {  // 메서드를 재정의해주어야 메인에서 코드값이 아닌 문자열이 제대로 출력됨
        //super.toString(); // 상위클래스의 메서드 호출
        System.out.println(super.toString());  // 부모의 메서드를 출력해주세요
        return "Board{" +   // 문자열을 출력해주세요
                "title='" + title + '\'' +
                '}';
    }
}
