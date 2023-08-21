public class SwitchCaseTest {
    public static void main(String[] args) {
        // switch ~ case 문을 활용하여 요일에 해당하는 운동을 출력하세요.
        String day = "Friday"; //야구하기
        switch (day){
            case"Sunday" :
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("농구하기");
                break;
            case "Tuesday":  // 같은 내용이 들어가는 다른 지문은 브레이크 X
            case "Wednesday":
                System.out.println("수영하기");
                break;
            default:  // 나머지 요일들을 출력 (상단 지문에 없는거)
                System.out.println("휴식");
        }
    }
}