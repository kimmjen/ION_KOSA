package home;

import java.util.Scanner;

public class Quiz_Multi_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 원하는 답을 입력 받아서 구구단 출력
		System.out.println("구구단을 원하는 숫자를 입력 : ");
		int num1 = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
		System.out.println();
		// 2. 전체 구구단 출력
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}