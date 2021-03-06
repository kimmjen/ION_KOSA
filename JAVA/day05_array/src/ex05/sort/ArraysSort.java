package ex05.sort;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		
		int[] a = { 7, 3, 5, 2, 8};
		int temp;
		
		System.out.println("--------sort전 출력--------");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\t");
		}
		// sort
		System.out.println("\n 오름차순 정렬됨");
		Arrays.sort(a); // 정렬 알고리즘이 이미 내부적으로 처리 되어 있는 메소드
		
		System.out.println("\n 내림차순 정렬됨");
		for(int i =  a.length - 1; i >= 0; i--) {
			System.out.println(a[i] + "\t");
		}
		
	}
}
