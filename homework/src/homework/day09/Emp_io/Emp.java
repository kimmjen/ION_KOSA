package homework.day09.Emp_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public abstract class Emp {

    private String name, phone, dept, grade;

    public Emp(Scanner sc) {
        inputInfo(sc);
    }

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

    //
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

    //
    public abstract void outputInfo();

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        FileOutputStream fos = new FileOutputStream("employee.txt");

        System.out.print("이름 : ");
        sb.append("이름 : " + sc.nextLine() + "\r\n");
        System.out.print("부서 : ");
        sb.append("부서 : " + sc.next() + "\r\n");
        System.out.print("직급 : ");
        sb.append("직급 : " + sc.next() + "\r\n");

        fos.write(sb.toString().getBytes());

        System.out.println("파일 저장 완료");
    }

}
