package homework.day05;

import java.util.Scanner;

public class P_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] water = { 0, 33.3, 29.8, 0, 0, 6.4, 61.0, 0, 1.3, 3.9, 1.2, 5.7, 0, 0.0, 0, 0.3, 0, 0, 0.3, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 38.3 };

        // int day = sc.nextInt();
        // int sum = 0;
        double sum = 0;
        for (int i = 0; i < 30; i++) {
            // System.out.printf("%d일의 강수량을 입력 : ", i + 1);
            // water[i] = sc.nextDouble();
            sum += water[i];
        }
        // for (int i = 0; i < water.length; i++) {
        // System.out.print((i + 1) + "일차 강수량 : ");
        // water[i] = sc.nextInt();
        // sum += water[i];
        // }
        // avg = (double) sum / 30;

        System.out.printf("평균 강수량 : %.2f", sum / 30);
        sc.close();
    }
}
