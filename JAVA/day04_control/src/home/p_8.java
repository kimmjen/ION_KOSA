package home;

import java.util.Scanner;

public class p_8 {

	public static void main(String[] args) {
		System.out.println("정수 두개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a + " / " + b + " = " + (a / b));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}