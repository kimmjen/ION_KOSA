package home;

import java.util.Scanner;

/* P
 * max() { 두개 정수 입력 받아서 큰수 리턴하는 함수}
 * A
 * 
 * */

public class P_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max());
	}

	public static int max() {
		System.out.print("두 수를 입력하세요 : ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		if (x > y)
			return x;
		else
			return y;
	}
}