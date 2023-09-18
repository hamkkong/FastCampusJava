package fc.java.part2;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO mv = new MovieVO("아바타","2022.12.14","제이크 설리","action",192,12 );  //객체 생성
        //System.out.println(mv.toString());
        System.out.println(mv);
    }
}
