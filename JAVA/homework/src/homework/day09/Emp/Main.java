package homework.day09.Emp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.println("직원 관리 프로그램");
        System.out.println("1.추가 2.전체회원정보보기 3.삭제 4.종료");
        try {

            int nInput;
            while (true) {

                // System.out.println("원하는 번호를 입력하세요.(1 ~ 6) : ");

                do {
                    System.out.print("원하시는 작업의 번호 입력(1 ~ 4) : ");
                    nInput = sc.nextInt();
                } while (nInput < 1 || nInput > 4);
                switch (nInput) {
                    case 1:
                        emp.addEmployee();
                        break;
                    case 2:
                        emp.listEmployee();
                        break;
                    case 3:
                        emp.removeEmployee();
                        break;

                    default:
                        System.out.println("시트템 종료");
                        System.exit(0);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}