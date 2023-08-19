public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.movieName = "아바타";
        m1.day ="2022.12.14";
        m1.hero = "제이크 설리";
        m1.runningTime = 192;
        m1.grade = 12;

        System.out.println(m1.movieName+"\t"+m1.day+"\t"+m1.hero+"\t"+m1.runningTime+"\t"+m1.grade);

    }
}
