package fc.java.model;

public class AllStatic {
  //  private AllStatic(){  // 인위적으로 private로 사용할 수 있다 .


    public static int hap(int a, int b){
        int v = a + b;
        return v;
    }
    public static int max(int a, int b){
        return a > b ? a : b;
    }
    public static int min(int a,int b){
        return a < b ? a : b;
    }

}
