package fc.java.course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "World";

        if (str.equals(str1)){
            System.out.println("str == str1");
        } else {
            System.out.println("str != str1");
        }

        String str2 = "apple";
        String str3 = "banana";

        int result = str2.compareTo(str3);
        if(result==0){
            System.out.println("str2 == str3");
        } else if (result<0) {
            System.out.println("str2 < str3");
        } else {
            System.out.println("str2 > str3");
        }
    }
}
