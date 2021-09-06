package ex05.random;

import java.util.Scanner;

public class lotto2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[7];
		System.out.println("로또 번호 추출");
		
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length - 1; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println("보너스 번호");
		System.out.println("마지막 보너스 번호 : " + lotto[6]);
		
		
	}
}
