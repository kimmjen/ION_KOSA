package homework.day07.P_03_Emp_inherit;

import java.util.Scanner;

public class PartTime extends Emp {
    private final int pay = 10000; // 만원
    private int sal; // 급여

    public PartTime(Scanner sc, int time) {
        super(sc);
        parSal(time);
    }

    //

    public int getPay() {
        return pay;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void parSal(int time) {
        sal = time * pay;
    }

    @Override
    public void outputInfo() {
        System.out.println("사원 정보 출력");
        System.out.println("이름 : " + super.getName());
        System.out.println("연락처 : " + super.getPhone());
        System.out.println("부서 : " + super.getDept());
        System.out.println("직급 : " + super.getGrade());
        System.out.println("급여 : " + sal);
    }
}
