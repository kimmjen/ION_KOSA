package homework;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  4. 1~ 10까지 출력하는 프로그램 작성 (for문 )
 *  5. 1~ 100까지 합을 출력하는 프로그램 작성
 *  6. 1~ 100까지 중에서 짝수 출력하고 한행에 10개씩 출력
 *  7. 대문자 <--> 소문자 변경 프로그램 작성 ( if ) 
 *  8. 두수 입력 받아서 나눗셈 하는 프로그램 작성 (예외처리)
	- 숫자가 아닌 문자 입력 됐을때.
	- 정수가 아닌 실수 데이터 입력 됐을때.
	- 어떤 수를 0으로 나눌 수 없다.
 *  * */

public class Ass_2 {
	public static void main(String[] args) {
		
		// 과제 4
		for (int i = 1; i <= 10; i++) {
			System.out.println("과제 4: " + i + " ");
		}
		
		// 과제 5
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 += i;
		}
		System.out.println("과제 5 : " + "1 ~ 100까지의 합 : " + sum1);
		
		// 과제 6
		int sum2 = 0;
		System.out.print("과제 6 : ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) System.out.printf("%3d", i);
			if (i % 20 == 0) System.out.println();
			
		}
		
		// 과제 7
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 단어 입력 : ");
		String s = sc.next();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c > 64 && c < 91) c += 32;
			else c -= 32;
			res += c;
		}
		System.out.println("대소문자 변환 : " + res);
		
		// 과제 8
		try {
			System.out.println("두 개의 정수 입력 : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("%d / %d = %d", a, b, a/b);
			
		} catch (InputMismatchException e1) {
			
			System.out.println("잘못 입력이요.");
			e1.printStackTrace();
			
		} catch (ArithmeticException e2) {
			
			System.out.println("0으로 나눌 수 없습니다.");
			e2.printStackTrace();
			
		} catch (Exception e3) {
			
			e3.printStackTrace();
		}
	}
}
