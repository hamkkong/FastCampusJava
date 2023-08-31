package fc.java.poly;

public class TV implements RemoCon{
    @Override
    public void chUp() {
        System.out.println("TV 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("TV 채널이 내려간다.");
    }

    @Override
    public void volUp() {
        System.out.println("TV 소리가 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("TV 소리가 내려간다.");
    }

    @Override
    public void InterNet() {
        System.out.println("TV에서 인터넷이 실행된다."); // 재정의 가능
    }
    // chUp(), chDown(), volUp(), volDown()
}
