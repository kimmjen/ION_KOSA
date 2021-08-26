/*문제5] 사칙연산 프로그램 작성(예외처리하기)
  숫자 2개 입력 받고, 연산자(+, -, *, /) 1개 입력 받아서
  ( if 이용 ) 

   
  result> 
    3
    5
    +

   3 + 5 = 8
*/

package day03_basic.Quiz;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 값 : ");
		int x = sc.nextInt();
				
		System.out.println("두 번째 값 : ");
		int z = sc.nextInt();
		
		System.out.println("등호 선택 ( +, - , *, /) 중 하나를 선택");
		String y = sc.next();
		
		int result = 0;
		
		if (y.equals("+")) {
			result = x + z;
			System.out.println(result);
		} else if (y.equals("-")) {
			result = x - z;
			System.out.println(result);
		}  else if (y.equals("*")) {
			result = x * z;
			System.out.println(result);
		}  else if (y.equals("/")) {
			result = x / z;
			System.out.println(result);
		}
	}
}
