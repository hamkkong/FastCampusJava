package fc.java.model;

public class CarDAO {
    // C.R.U.D 기능을 구현
    // Create = insert(저장)
    public void carInsert(CarDTO car){
        // DB연결, insert SQL
        System.out.println("car 정보가 DB에 저장이 되었습니다.");
    }
    public void carSelect(CarDTO car){
        System.out.println("car 정보가 출력이 되었습니다.");
    }
}
