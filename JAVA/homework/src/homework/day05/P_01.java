package homework.day05;

import java.util.Scanner;

// 

public class P_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] b = new int[2][3];
        int[] sum = new int[b.length];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print("b[" + i + "][" + j + "] = ");

                b[i][j] = sc.nextInt();
                sum[i] += b[i][j];
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println((i + 1) + " 행 : " + sum[i]);
        }
        sc.close();
    }
}
