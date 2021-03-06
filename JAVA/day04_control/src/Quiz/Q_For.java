package Quiz;

import java.util.Scanner;

/*1. 원하는 단을 입력 받아서 구구단 출력
 * 
 * 2. 전체 구구단 출력
 * */
public class Q_For {
	public static void main(String[] args) {
		// 1. 원하는 답을 입력 받아서 구구단 출력

		System.out.print("구구단을 원하는 숫자를 입력하세요: ");
		int num = new Scanner(System.in).nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		System.out.println();
		
		// 2. 전체 구구단 출력

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}

