package homework.day07.P_03_Emp_inherit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // local
        Scanner sc = new Scanner(System.in);
        Emp[] emp = new Emp[3];

        // 사원 정보 입력
        for (int i = 0; i < emp.length; i++) {

            System.out.println((i + 1) + " 번째 사원 입력");
            System.out.println("1. 정규직, 2. 계약직, 3. 파트타임");
            System.out.print("입력 : ");

            switch (sc.nextInt()) {
                case 1:
                    emp[i] = new Regular(sc);
                    break;
                case 2:
                    emp[i] = new Sales(sc);
                    break;
                case 3:
                    System.out.println("파트타임 사원");
                    System.out.println("일한 시간을 입력");
                    System.out.print("시간 : ");
                    emp[i] = new PartTime(sc, sc.nextInt());
                    break;

                default:
                    i--;
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("다시 입력해주세요.\n");
                    break;
            }
            System.out.println();
        }
        //
        for (int i = 0; i < emp.length; i++) {
            emp[i].outputInfo();
            System.out.println();
        }
    }
}
