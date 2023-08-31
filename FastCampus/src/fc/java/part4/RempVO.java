package fc.java.part4;

//일반사원
public class RempVO extends Employee{
    public RempVO(){ //RempVO의 생성자 메서드
       super();  // 부모의 생성자 호출 (인자값이 비어있는 함수)
     }
    public RempVO(String name, int age, String phone,String empDate, String dept, boolean marriage ){
        // 초기화(자식이 부모의 기억공간에 초기화를 하는 경우)
        super(name, age, phone, empDate, dept, marriage);  // 부모의 생성자 호출
    }


}
