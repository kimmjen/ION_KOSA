package day03_basic.ex04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {
	public static void main(String[] args) {
		
		try {
			System.out.println("x, y integer data input : ");
			
			int x, y, result =0;
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y;
			
			System.out.println(x + " / " + y + "=" + result);
			
		} catch (ArithmeticException e) {
			
		} catch (InputMismatchException e) {
			
		} catch (Exception e) {
			e.printStackTrace(); // 단계적으로 예외를 찾아서 프린
		} finally {
			System.out.println("finally는 무조건 실행됨 정상이건 비정상이건");
		}
	}
}
