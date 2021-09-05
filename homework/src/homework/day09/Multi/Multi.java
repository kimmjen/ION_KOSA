package homework.day09.Multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multi {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y;
        String op;

        System.out.print("정수 x : ");
        x = Integer.parseInt(br.readLine());
        System.out.print("정수 y : ");
        y = Integer.parseInt(br.readLine());
        System.out.print("연산자 (+, -, *, /) : ");
        op = br.readLine();

        System.out.print("결과 : ");

        switch (op) {
            case "+":
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            case "-":
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case "*":
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            case "/":
                System.out.println(x + " / " + y + " = " + (x / y));
                break;

            default:
                System.out.println("연산자 잘못 입력");
                break;
        }
    }
}
