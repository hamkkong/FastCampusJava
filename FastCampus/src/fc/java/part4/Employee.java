package fc.java.part4;

    // 사원(VO,DTO)
    public  class Employee {
        private String name;
        private    int age;
        private String phone;
        private String empDate;
        private String dept;
        private boolean marriage;

        public Employee(){ //생성자 메서드
              super(); // 상위 클래스의 생성자를 호출 -> new Object()  // 생략가능
        }

        public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) { // 생성자
            this.name = name;
            this.age = age;
            this.phone = phone;
            this.empDate = empDate;
            this.dept = dept;
            this.marriage = marriage;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", phone='" + phone + '\'' +
                    ", empDate='" + empDate + '\'' +
                    ", dept='" + dept + '\'' +
                    ", marriage=" + marriage +
                    '}';
        }
    }

