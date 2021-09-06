package homework.day06;

import java.util.Random;
import java.util.Scanner;

public class P_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        int result;
        boolean flag = true;

        System.out.println("업/ 다운 게임");

        for (int i = 1; i <= 5; i++) {
            System.out.print("정답 입력 : ");
            result = sc.nextInt();

            if (result == num) {
                System.out.println("정답");
                flag = false;
                break;
            } else if (result > num) {
                System.out.println("내리세요");
            } else if (result < num) {
                System.out.println("올리세요");
            }
            System.out.println("남은 기회 : " + (5 - i));
        }

        if (flag) {
            System.out.println("정답은 " + num + "입니다.");
        }

        sc.close();
    }
}
