package homework.day06;

public class P_04 {
    private String name, grade, dept, phone;
    private int pay;

    public P_04() {
        name = "name_test";
        grade = "grade_test";
        dept = "dept_test";
        phone = "phone_test";
        pay = 0;
    }

    public P_04(String name, String grade, String dept, String phone, int pay) {
        this.name = name;
        this.grade = grade;
        this.dept = dept;
        this.phone = phone;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void output() {
        System.out.println("이름 : " + name);
        System.out.println("직급 : " + grade);
        System.out.println("부서 : " + dept);
        System.out.println("연락처 : " + phone);
        System.out.println("급여 : " + pay);
    }

    public static void main(String[] args) {
        P_04 s = new P_04();
        s.output();
    }
}
