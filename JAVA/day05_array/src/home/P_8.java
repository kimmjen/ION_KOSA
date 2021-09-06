package home;

import java.util.Scanner;

/* P
 * 성적처리 프로그램 함수로 분할 할것

  입력함수 input()

  총점함수 total(~~)

  평균함수 average(~~)

  평점(학점) grade(~~)

  출력함수 output()
 * A
 * 
 * */

public class P_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su = 3;
		String[] name = new String[su];
		int[][] arr = new int[su][3];
		input(name, arr);
		output(name, arr);
	}
	public static void input(String[] name, int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();
			int kor, com, eng;
			while (true) {
				System.out.print("국어 : ");
				kor = sc.nextInt();
				if (kor >= 0 && kor <= 100)
					break;
			}
			arr[i][0] = kor;
			while (true) {
				System.out.print("전산 : ");
				com = sc.nextInt();
				if (com >= 0 && com <= 100)
					break;
			}
			arr[i][1] = com;
			while (true) {
				System.out.print("영어 : ");
				eng = sc.nextInt();
				if (eng >= 0 && eng <= 100)
					break;
			}
			arr[i][2] = eng;
		}
	}
	public static void output(String[] name, int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(name[i]+"님의 성적표 *******");
			System.out.println("국어 : " + arr[i][0] + ", 전산 : " + arr[i][1] + ", 영어 : " + arr[i][2]);
			total(arr[i][0], arr[i][1], arr[i][2]);
			avg(arr[i][0], arr[i][1], arr[i][2]);
			grade(arr[i][0], arr[i][1], arr[i][2]);
			System.out.println();
		}
	}
	public static void total(int a, int b, int c) {
		System.out.print("총점 : " + (a+b+c));
	}
	public static void avg(int a, int b, int c) {
		System.out.printf(" 평균 : %.2f ", (a + b + c)/3.0);
	}
	
	public static void grade(int a, int b, int c) {
		switch ((a + b + c)/30) {
		case 10:
		case 9:
			System.out.println("평점(학점) : A");
			break;
		case 8:
			System.out.println("평점(학점) : B");
			break;
		case 7:
			System.out.println("평점(학점) : C");
			break;
		case 6:
			System.out.println("평점(학점) : D");
			break;
		default:
			System.out.println("평점(학점) : F");
			break;
		}
	}
}