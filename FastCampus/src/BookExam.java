public class BookExam {
    public static void main(String[] args) {
        // [정수] 1 개를 저장할 [변수를 선언]하시오
        //int a ;

        // 책 1권을 저장할 변수를 선언하시오.
        //Book b; //Book 이라는 클래스를 이미 만들어 놓았다.
        // book b = new Book();
        // 한 권의 책 데이터를 저장하기 위해서 객체(인스턴스)를 생성하시오

        Book b = new Book();

        b.title = "자바";
        b.price = 30000;
        b.company = "패스트캠퍼스";
        b.author = "박매일";
        b.page = 700;
        b.isbn = "1199110";

        System.out.println(b.title+"\t"+b.price+"\t"+b.company+"\t"+b.author+"\t"+b.page+"\t"+b.isbn+"\t");

    }

}