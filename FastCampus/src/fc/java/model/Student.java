package fc.java.model;

public class Student {
    private String name;
    private String dept;
    private int age;
    private String email;
    private int year;
    private String phone;

    public Student(String name, String dept, int age, String email, int year, String phone) {
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.email = email;
        this.year = year;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getYear() {
        return year;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", year=" + year +
                ", phone='" + phone + '\'' +
                '}';
    }
}  // 마우스 오른쪽키 -> 생성으로 순서대로 빨리 만들 수 있다. (생성자 -> 세터 -> 게터 -> toString)
