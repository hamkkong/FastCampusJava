public class IfElseIfTest {
    public static void main(String[] args) {
        // 80점 이상의 학생 중에서 90점 이상은 A반, 85점 이상은 B반, 그렇지 않으면 C반으로 편성하고
        // 점수가 80미만이면 불합격 처리하는 프로그램을 작성하세요.
        //단, 점수는 0~100 사이로 입력받는다.
        int jumsu = 80;
        if (jumsu >= 0 && jumsu <= 100) { // if 를 밖에 한번 더 걸어주어야 하는 경우가 있음!!
          if (jumsu>=80) {
              if (jumsu >= 90) {
                  System.out.println("A반");
              } else if (jumsu >= 85) {
                  System.out.println("B반");
              } else {  // else는 반드시 if와 짝을 이루어야 한다. 짝이 없으면 에러!
                  System.out.println("C반");
              }
          } else {
              System.out.println("불합격"); // 79~0
          }
        }else {
            System.out.println("유효한 점수가 아닙니다.");
        }
    }
}
