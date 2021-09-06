package homework.day04;

import java.util.Scanner;

public class P_10_FOR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, n;

        System.out.println("1. 원하는 단을 입력 받아서 구구단 출력");
        System.out.println("2. 구구단 전체 출력");
        num = sc.nextInt();

        if (num == 1) {
            System.out.print("원하는 단 입력 : ");
            n = sc.nextInt();
            multiplication01(n);
        } else if (num == 2) {
            multiplication02();
        } else {
            System.out.println("잘못 입력했어요.");
        }
        sc.close();
    }

    // 1.
    public static void multiplication01(int n) {

        System.out.println(n + " 단 출력");

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    // 2.
    public static void multiplication02() {

        System.out.println("구구단 전체 출력");

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " 단");

            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
