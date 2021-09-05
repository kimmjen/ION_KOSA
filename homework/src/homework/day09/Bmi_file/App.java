package homework.day09.Bmi_file;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("BMI 측정 프로그램");
        System.out.println("1.추가\n2.삭제\n3.출력\n4.종료\n");
        Scanner sc = new Scanner(System.in);
        BmiManager bm = new BmiManager();
        try {
            int n;
            while (true) {
                do {
                    System.out.print("원하는 작업 선택(1 ~ 4) : ");
                    n = sc.nextInt();
                } while (n < 1 || n > 4);

                switch (n) {
                    case 1:
                        bm.add();
                        break;
                    case 2:
                        bm.del();
                        break;
                    case 3:
                        bm.show();
                        break;
                    default:
                        System.out.println("프로그램 종료");
                        System.exit(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}