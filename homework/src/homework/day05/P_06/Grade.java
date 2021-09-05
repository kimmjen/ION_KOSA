package homework.day05.P_06;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String flag;
        Student[] students = new Student[7];

        for (int i = 0; i < students.length; i++) {

            students[i] = new Student();
            System.out.println("성적 프로그램");
            System.out.print("이름 : ");
            students[i].setName(sc.next());

            while (true) {
                try {
                    System.out.print("국어 : ");
                    if (students[i].setKor(sc.nextInt())) {
                        continue;
                    }
                    System.out.print("영어 : ");
                    if (students[i].setEng(sc.nextInt())) {
                        continue;
                    }
                    System.out.print("수학 : ");
                    if (students[i].setMath(sc.nextInt())) {
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    System.out.println("숫자만 입력해주세요.");
                    e.printStackTrace();
                }
            }
            students[i].getResult();
            students[i].printGrade();

            System.out.print("계속 하시겠습니까? (Y/N) : ");
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