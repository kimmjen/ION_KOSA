package day03_basic.ex04;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		
		System.out.println("x, y integer data input : ");
		
		int x, y, result =0;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x / y;
		
		System.out.println(x + " / " + y + "=" + result);
	}
}
