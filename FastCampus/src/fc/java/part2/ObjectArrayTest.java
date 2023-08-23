package fc.java.part2;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[]b = new Book[3];   // 객체배열 (데이터처리의 효율성을 위해)
        b[0]=new Book();
        b[0].title="자바";  //  배열 안에 들어있는 객체의 값이 달라도 for문에서 한번에 처리가능
        b[0].price=30000;
        b[0].company="한빛";
        b[0].author="박매일";
        b[0].page=500;
        b[0].isbn="11889900";

        //System.out.println(b[0].title+" "+b[0].price+" "+b[0].company+" "+b[0].author+" "+b[0].page+" "+b[0].isbn);

        b[1]=new Book();
        b[1]=new Book();
        b[1].title="오라클";
        b[1].price=30000;
        b[1].company="한빛";
        b[1].author="박매일";
        b[1].page=500;
        b[1].isbn="11889900";

        //System.out.println(b[1].title+" "+b[1].price+" "+b[1].company+" "+b[1].author+" "+b[1].page+" "+b[1].isbn);

        b[2]=new Book();
        b[2]=new Book();
        b[2].title="인공지능";
        b[2].price=30000;
        b[2].company="한빛";
        b[2].author="박매일";
        b[2].page=500;
        b[2].isbn="11889900";

        //System.out.println(b[2].title+" "+b[2].price+" "+b[2].company+" "+b[2].author+" "+b[2].page+" "+b[2].isbn);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].title+" "+b[i].price+" "+b[i].company+" "+b[i].author+" "+b[i].page+" "+b[i].isbn);
        }
    }
}
