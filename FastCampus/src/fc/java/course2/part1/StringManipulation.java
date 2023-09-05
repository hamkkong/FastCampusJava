package fc.java.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        // HelloWorld 라는 문자열을 생성하세요.
        int a = 10;
        String str = "HelloWorld";
        System.out.println(str.charAt(1));  // 'e'
        System.out.println(str.replaceAll("o","x")); // 각각의 문자에는 쌍따옴표 처리
        System.out.println(str.length()); // 10
        System.out.println(str.toUpperCase()); // HELLOWORLD
        System.out.println(str.toLowerCase());  // helloworld
        System.out.println(str.substring(5,8)); //Wor 을 가져옴
        System.out.println(str.indexOf("W"));  // 5 (Wor 처럼 일련된 문자열을 묻는 것은 괜찮지만, Wr 같은 없는 문자열은 -1 을 반환// )
        for(int i =0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }


}
