package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NoneStaticTest st = new NoneStaticTest(); // Heap area에 강제로 생성함
        int sum = st.hap(a,b);  // main의 hap 과 하단 메서드의 hap이 자동으로 연결되지 않음 (static X)
                                //강제로 연결한 메서드는 반드시 객체의 .(dot)연산자를 사용하여 연결해야 한다.
        System.out.println("sum = " + sum);

    }
    public int hap(int a, int b){
        int v = a+b;
        return v;
    }
}
