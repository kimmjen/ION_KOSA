package Quiz;

import java.util.Scanner;

public class Q_switch2_T {

	public static void main(String[] args) {
		// 사칙 연산 프로그램 작성 = 연산자 1개, 정수숫자 2개
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수: ");
		int x = sc.nextInt();
		
		System.out.println("등호 선택 ( +, - , *, /) 중 하나를 선택");
		String n = sc.next();
		
		System.out.println("두 번째 수: ");
		int y = sc.nextInt();
		
		int value = 0;

		switch (n) {
		case "+":
			value = (x + y);
			break;
		case "-":
			value = (x - y);
			break;
		case "*":
			value = (x * y);
			break;
		case "/":
			value = (x / y);
			break;

		default:
			break;
		}
		System.out.println(x + n + y + " = " + value);
	}

}
