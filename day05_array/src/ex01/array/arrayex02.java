package ex01.array;

import java.util.Scanner;

public class arrayex02 {
	public static void main(String[] args) {
		/*
		 * int[] a = new int[5]; a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4; a[4] = 5;
		 */
		
		/*
		 * int[] a = {1,2,3,4,5}; System.out.println("a[0] = " + a[0]);
		 * 
		 * for (int i = 0; i < a.length; i++) { System.out.println("a[" + i + "] = " +
		 * a[i]); }
		 * 
		 * int[] arr = new int[5]; int x = 5; for (int i = 0; i < arr.length; i++) {
		 * arr[i] = i; arr[i] = x *5; arr[i] = x++ *5; }
		 * 
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i] + "\t"); if
		 * ((i+1) % 5 == 0) System.out.println(); } System.out.println();
		 */
		
		// 임의의 배열에 데이터 입력받아서 입력된 데이터 출력 및 합 구하는 프로그램 작성
		int[] b = new int[5];
		int sum = 0;
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		System.out.println("data input : ");
		for (int i = 0; i < b.length; i++) {
			System.out.println((i+1) + "번째 데이터 = ");
			b[i] = new Scanner(System.in).nextInt();
			sum += b[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
		System.out.println("sum = " + sum);
	}
}
