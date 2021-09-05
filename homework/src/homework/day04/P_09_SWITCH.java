package homework.day04;

import java.util.Scanner;

public class P_09_SWITCH {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int kor, eng, math, total;
        double avg;
        boolean flag = true;

        System.out.print("국어 : ");
        kor = sc.nextInt();
        System.out.print("영어 : ");
        eng = sc.nextInt();
        System.out.print("수학 : ");
        math = sc.nextInt();

        total = (kor + eng + math);
        avg = (double) total / 3;

        switch ((int) avg / 10) {
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
                String fail = "";
                if (kor <= 40) {
                    fail += "국어 ";
                    flag = false;
                }
                if (eng <= 40) {
                    fail += "영어 ";
                    flag = false;
                }
                if (math <= 40) {
                    fail += "수학 ";
                    flag = false;
                }
                if (flag) {
                    System.out.println("합격");
                } else {
                    System.out.println(fail + "점수가 40점 이하이므로 불합격");
                }
                break;

            default:
                System.out.println("평균 60점 미만이므로 불합격");
                break;
        }

        sc.close();
    }
}
