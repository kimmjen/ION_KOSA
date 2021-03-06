package ex02.IF;

import java.util.Scanner;
/* 문제 윤녕/평년 판정 프로그램 작성
 * */
public class MainEntry {

	public static void main(String[] args) {
		
		System.out.println("year = ");
		int year = new Scanner(System.in).nextInt(); // 객체 생성, 메모리 할당, 생성자 함수 자동 호출
		
		boolean flag = false;
		String msg = null;
		
		if (year % 4 == 0) {
			if ((year % 100 != 0) || (year % 400 == 0)) {
				flag = true;
			}
		}
		msg = (flag == true) ? "윤년" : "평년";
		
		System.out.println(year + "년도 ==> " + msg);
	}
}
