/*과제2] 연산자(+, -, *, /)와 정수 2개 입력 받아 사칙연산 프로그램 작성

> 입력받기 - Scanner class  jdk 5.0
   java.io <--- Input  / Output

   nextXXX()
        자료형
   nextInt()
   nextFloat()
   nextDouble()
   next() vs nextLine()  <--- String input method*/
package day03_basic.Quiz;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("더하기 : " + x + " + " + y + " = " + (x+y));
		System.out.println("빼기 : " + x + " - " + y + " = " + (x-y));
		System.out.println("곱하기 : " + x + " * " + y + " = " + (x*y));
		System.out.println("나누기 : " + x + " / " + y + "= " + (x/y));
	}
}
