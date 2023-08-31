package fc.java.poly;

public class Radio implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("Radio의 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("Radio의 채널이 내려간다.");
    }

    @Override
    public void volUp() {
        System.out.println("Radio의 소리가 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("Radio의 소리가 내려간다.");
    }

    @Override
    public void InterNet() {
        System.out.println("Radio에서는 인터넷이 되지 않습니다.");  // 재정의 가능
    }
    // chUp(), chDown(), volUp(), volDown()
}
