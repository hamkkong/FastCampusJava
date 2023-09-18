package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana","cherry","Orange");

        List<String> upperCase = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("upperCase = " + upperCase);

        // 반복문 형식으로 정리
        for(String str : upperCase){
            System.out.println(str);
        }

    }
}
