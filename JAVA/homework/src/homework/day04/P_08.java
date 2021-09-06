package homework.day04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("두 개의 정수 입력");
            System.out.print("첫 번째 정수 : ");
            int a = sc.nextInt();
            System.out.print("두 번째 정수 : ");
            int b = sc.nextInt();

            // float avg = (float) (a / b);
            System.out.printf("%d / %d = %d", a, b, (a / b));

        } catch (InputMismatchException e1) {

            System.out.println("잘못 입력이요.");
            e1.printStackTrace();

        } catch (ArithmeticException e2) {

            System.out.println("0으로 나눌 수 없습니다.");
            e2.printStackTrace();

        } catch (Exception e3) {

            e3.printStackTrace();
        }
        sc.close();

    }
}
