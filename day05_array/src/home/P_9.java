package home;

import java.util.Scanner;

/* P
 * loopLine(매개변수 넣을지 말지 개발자 역량) {라인을 N번 출력하는 함수}
 * A
 * 
 * */

public class P_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopLine();
	}

	public static void loopLine() {
		System.out.print("숫자를 입력하세요 : ");
		int x = new Scanner(System.in).nextInt();
		System.out.println("-----------------------------");
		abs(x);
	}

	public static void abs(int x) {
		if (x >= 0)
			System.out.println(x);
		else
			System.out.println(-x);
	}
}