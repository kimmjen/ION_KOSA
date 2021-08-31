package homework;

import java.util.Scanner;

/*
 * 2차원 배열의 합
 * */
public class Q_1 {
	public static void main(String[] args) {
		int[][] b = new int[2][3];
		int[] row = {0, 0};
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print("b[" + i + "] [" + j + "] = ");
				b[i][j] = new Scanner(System.in).nextInt();
				row[i] += b[i][j];
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("합 = " + row[i]);
		}
	}
}
