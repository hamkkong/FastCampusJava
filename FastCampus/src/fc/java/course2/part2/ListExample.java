package fc.java.course2.part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple"); // new String("apple")
        list.add("banana");
        list.add("cherry");
        list.add("banana");

        // 인덱스로 표현 가능 , 중복 가능
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1));

        list.remove(0); // 인덱스 자체를 삭제함
        list.set(1,"orange"); // cherry 를 orange 로 대체함

        for( String str : list){
            System.out.println(str);
        }
    }
}
