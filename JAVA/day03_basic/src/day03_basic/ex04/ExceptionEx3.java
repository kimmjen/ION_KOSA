package day03_basic.ex04;

import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {
		
		try {
			System.out.println("x, y integer data input : ");
			
			int x, y, result =0;
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y;
			
			System.out.println(x + " / " + y + "=" + result);
			
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage()); // 에러메시지를 얻어 올거야, sysout
			e.printStackTrace(); // 단계적으로 예외를 찾아서 프린
		}
	}
}
