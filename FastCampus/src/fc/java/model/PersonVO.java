package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    // 생략된 생성자 메서드가 있다 ==>  기본 생성자 메서드(default Constructor)
    public PersonVO(String name, int age, String phone){  //기본 생성자는 void 안씀. 객체를 생성하는 코드는 내부에서 만들어진다.
        this.name = name;  // 초기화 동작을 넣어줄 수 있다. setter() 와 같은역할
        this.age = age;
        this.phone = phone;  // this 생략가능 (양변에 같은 이름이 들어갈땐 생략못함)
    }

    // setter method
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    //getter method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getPhone(){
        return phone;
    }
    public String toString(){
        return name+"\t"+age+"\t"+phone;
    }
}
