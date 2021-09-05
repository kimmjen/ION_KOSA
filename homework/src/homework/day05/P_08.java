package homework.day05;

import java.util.Scanner;

public class P_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        System.out.println("절댓값 : " + abs(n));
        sc.close();
    }

    public static int abs(int x) {

        if (x < 0) {
            x *= -1;
        }
        return x;
    }
}
