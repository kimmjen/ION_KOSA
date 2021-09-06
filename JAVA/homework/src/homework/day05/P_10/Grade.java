package homework.day05.P_10;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String flag;
        Student[] students = new Student[7];

        for (int i = 0; i < students.length; i++) {

            students[i] = new Student();
            students[i].input(sc);
            students[i].total();
            students[i].average();
            students[i].grade();
            students[i].output();

            System.out.println("계속 하시겠습니까?(Y/N) : ");
            flag = sc.next();

            if (flag.toUpperCase().equals("N")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (flag.toUpperCase().equals("Y")) {
                System.out.println();
                continue;
            } else {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
        sc.close();
    }
}
