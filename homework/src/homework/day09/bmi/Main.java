package homework.day09.bmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        bmiManager bm = new bmiManager();
        System.out.println("bmi 측정 프로그램");
        System.out.println(" 1. 추가\n 2. 삭제\n 3. 출력\n 4. 저장\n 5. 프로그램 종료");

        try {
            int num;
            while (true) {
                do {
                    System.out.print("원하는 작업의 번호 입력 (1 ~ 5) : ");
                    num = sc.nextInt();
                } while (num < 1 || num > 5);

                switch (num) {
                    case 1:
                        bm.insertInfo();
                        break;
                    case 2:
                        bm.deleteInfo();
                        break;
                    case 3:
                        bm.listInfo();
                        break;
                    case 4:
                        bm.saveInfo();
                        break;

                    default:
                        System.out.println("시스템 종료");
                        System.exit(0);
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}