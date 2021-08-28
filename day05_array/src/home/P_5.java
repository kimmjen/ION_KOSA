package home;

import java.util.Scanner;

/* P
 *  info() { 이름, 연락처, 주소, 출력 함수}
 * A
 * 
 * */

public class P_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		info();
	}

	public static void info() {
		System.out.print("이름을 입력하세요 : ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("연락처를 입력하세요 : ");
		String phone = new Scanner(System.in).nextLine();
		System.out.print("주소를 입력하세요 : ");
		String address = new Scanner(System.in).nextLine();

		System.out.println(name + "님의 연락처는 " + phone + "이며 주소는 " + address + "입니다.");
	}

}
