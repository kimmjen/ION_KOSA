package homework;

import java.util.Scanner;
/*
 * 조건문 반복문
 * */
public class Quiz_For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요(1~9) :");
		int n = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d \n", n, i, n * i);
		}
		System.out.println("\n============================\n");
		// 구구단 전체
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d X %d = %d \t", j, i, i * j);
			}
			System.out.println();
		}
	}
}
