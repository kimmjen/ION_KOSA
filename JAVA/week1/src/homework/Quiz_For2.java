package homework;

import java.util.Scanner;

/*
 * 3의 배수 갯수와 합
 * */
public class Quiz_For2 {
	public static void main(String[] args) {
		int cnt = 0, sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				cnt++;
				sum += i;
			}
		}
		System.out.printf("3의 배수의 개수 : %d, 합 : %d", cnt, sum);
	}
}