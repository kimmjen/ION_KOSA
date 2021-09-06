package homework.day07.P_03_Emp_inherit;

import java.util.Scanner;

public abstract class Emp {
    // member
    private String name, phone, dept, grade;

    //
    public Emp(Scanner sc) {
        inputInfo(sc);
    }
    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // 정보입력
    public void inputInfo(Scanner sc) {
        System.out.println("사원 정보 입력");

        System.out.print("이름 : ");
        name = sc.next();

        System.out.print("연락처 : ");
        phone = sc.next();

        System.out.print("부서 : ");
        dept = sc.next();

        System.out.print("직급 : ");
        grade = sc.next();
    }

    // 출력
    public abstract void outputInfo();

}
