package homework;

import java.util.Scanner;

/*
 * 
   과제8.성적처리 프로그램 함수로 분할 할것
	  입력함수 input()
	  총점함수 total(~~)
	  평균함수 average(~~)
	  평점(학점) grade(~~)
	  출력함수 output()
  과제9. loopLine(매개변수 넣을지 말지 개발자 역량) {라인을 N번 출력하는 함수}
 * */
public class Ass_3 {

	static String name;
	static String[] sub = { "국어", "영어", "전산" };

	public static void main(String[] args) {
		System.out.println("문제 8");
		int[] score = { 0, 0, 0 };
		input(score);
		output(score);

		System.out.println("\n\n문제 9");
		loopLine(6);
	}

	// 문제 8
	public static void input(int[] score) {
		System.out.print("이름을 입력하시오 : ");
		name = new Scanner(System.in).next();
		for (int i = 0; i < 3; i++) {
			try {
				do {
					System.out.printf("0~100 사이의 %s점수를 입력하시오 : ", sub[i]);
					score[i] = new Scanner(System.in).nextInt();

				} while (score[i] < 0 && score[i] > 100);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}

	}

	public static int total(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}

	public static double average(int sum, int n) {
		return (double) sum / (double) n;
	}

	public static char grade(int i) {
		switch (i) {
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';
		}
	}

	public static void output(int[] score) {
		System.out.printf("\n%s의 성적표******\n", name);
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s:%4d점\t", sub[i], score[i]);
		}
		int sum = total(score);
		double avg = average(sum, score.length);
		System.out.printf("\n총점:%4d점\t평균:%.2f점\t학점:%4c", sum, avg, grade((int) avg / 10));
	}

	// 문제 9
	public static void loopLine(int x) {
		for (int i = 0; i < x; i++) {
			System.out.println("-------------------");
		}
	}
}
