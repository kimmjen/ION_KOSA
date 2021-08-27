package ex02.array;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		int[][] a = new int[2][3]; // 행크기, 열크기
		
		a[0][0] = 1; //초기화 작업
		a[0][1] = 2;
		a[0][2] = 3;
		
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
//		a[2][0] = 7;
//		a[2][1] = 8;
//		a[2][2] = 9;
		
		// 2.
		int[][] a2 = {{1,2,3},{4,5,6}};
		int[][] a3 = new int[][] {{1,2,3},{4,5,6}};
		
		// 배열값 출력
		System.out.println("a2[0][2] = " + a2[0][2]);
		
		for (int i = 0; i < 2; i++) { // 행 크기
			for (int j = 0; j < 3; j++) { // 값
				System.out.println(a2[i][j] + " ");
			}
			System.out.println();
		}// i end
		System.out.println("*********************************");
		
		System.out.println("배열의 행크기 : " + a2.length);
		System.out.println("배열의 행크기 : " + a2[0].length);
		System.out.println("배열의 행크기 : " + a2[1].length);

		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a2[i].length; j++) {
				System.out.println(a2[i][j] + " ");
			}
			System.out.println();
		}// i end
		
		
		System.out.println("==============================");
		System.out.println("2차원배열");
		
		// 2차원 배열에 임의의 데이터 입력 받아서 값 출력하고 행의 더한 결과 출력하는 프로그램 작성
		/*
		 * int[][] b = new int[2][3]; System.out.println("data input : "); for (int i =
		 * 0; i < b.length; i++) { System.out.println((i+1) + "번째 데이터 = "); // b[i] =
		 * new Scanner(System.in).nextInt(); // sum += b[i]; }
		 * 
		 * for (int i = 0; i < 2; i++) { // 행 크기 for (int j = 0; j < 3; j++) { // 값
		 * System.out.println(a2[i][j] + " "); } System.out.println(); }// i end
		 * 
		 * System.out.println("배열의 행크기 : " + a2[0].length);
		 * 
		 * System.out.println("배열의 행크기 : " + a2[1].length);
		 */
		int[][] b = new int[2][3];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j <b[0].length; j++) {
				System.out.println("b[" + i + "][" + j + "]에 넣을 정수를 입력 : ");
				b[i][j] = sc.nextInt();
				sum += b[i][j];
			}
			System.out.println();
			
			for (int j = 0; j < b[0].length; j++ ) {
				System.out.println(b[i][j] + "\t");
			}
			System.out.println((i+1) + "행의 합 : " + sum);
			sum=0;
		}
		
		
		
	}
}
