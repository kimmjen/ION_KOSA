package homework.day05;

import java.util.Scanner;

public class P_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x 입력 : ");
        int x = sc.nextInt();

        System.out.print("y 입력 : ");
        int y = sc.nextInt();

        System.out.println("x, y 중 큰 수 : " + max(x, y));
        sc.close();
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }
}
