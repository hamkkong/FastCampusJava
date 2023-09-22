package fc.java.course2.part2;

import fc.java.model2.Movie;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>(5); //Object[] --> Movie[] 로 바뀜
        list.add(new Movie("괴물", "봉준호", "2006","한국"));
        list.add(new Movie("기생충", "봉준호", "2019","한국"));
        //list.add("Hello,World!");  // X

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}