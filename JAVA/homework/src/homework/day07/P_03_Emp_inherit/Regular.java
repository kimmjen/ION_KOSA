package homework.day07.P_03_Emp_inherit;

import java.util.Scanner;

public class Regular extends Emp {

    // member
    private int sal;

    public Regular(Scanner sc) {
        super(sc);
        regularSal();
    }
    //

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    //
    public void regularSal() {
        sal = 1000000; // 백만원

        switch (super.getGrade()) {
            case "사원":
                sal *= 2;
                break;
            case "대리":
                sal *= 3;
                break;
            case "과장":
                sal *= 4;
                break;
            case "차장":
                sal *= 5;
                break;
            case "부장":
                sal *= 6;
                break;
            case "팀장":
                sal *= 7;
                break;
            case "사장":
                sal *= 8;
                break;

            default:
                sal = 0;
                break;
        }
    }

    //
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
