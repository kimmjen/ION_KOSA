package homework;

import java.util.Scanner;

/*
 * 
   과제5. info() { 이름 연락처 주소 출력 함수}
   과제6. abs(int x) { 절댓값 출력하는 함수 만들기}
   과제7. max() { 두개 정수 입력 받아서 큰수 리턴하는 함수}
   과제8.성적처리 프로그램 함수로 분할 할것
	  입력함수 input()
	  총점함수 total(~~)
	  평균함수 average(~~)
	  평점(학점) grade(~~)
	  출력함수 output()
  과제9. loopLine(매개변수 넣을지 말지 개발자 역량) {라인을 N번 출력하는 함수}
 * */
public class Ass_2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("문제 5");
		info();

		System.out.println("\n문제 6");
		System.out.println("숫자를 입력해주세요 : ");
		int i = sc.nextInt();
		abs(i);

		System.out.println("\n문제 7 - 1");
		System.out.println("서로 다른 두 수를 입력해주세요 : ");
		int n = max();
		System.out.println("더 큰 수는 " + n + " 입니다.");

		System.out.println("\n문제 7 - 2");
		System.out.println("서로 다른 두 수를 입력해주세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("더 큰 수는 " + max(a, b) + " 입니다.");

	}

	// 문제5
	public static void info() {
		String name = "김제민";
		String phone = "010-0000-0000";
		String adress = "서울";

		System.out.println(name + " " + phone + " " + adress);
	}

	// 문제6
	public static void abs(int x) {
		if (x < 0)
			System.out.println("절대값 : " + -x);
		else
			System.out.println("절대값 : " + x);
	}

	// 문제 7 - 1
	public static int max() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b)
			return a;
		else
			return b;
	}

	// 문제 7 - 1
	public static int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

}
