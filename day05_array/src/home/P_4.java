package home;

import java.util.Scanner;

/* P
 * 7명의 데이터를 받아서 총점/평균/학점 구하는 프로그램 작성 (배열이용할 것)
 * A
 * 
 * */

public class P_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int su = 3;
		Scanner sc = new Scanner(System.in);
		String[] name = new String[su];
		int[][] arr = new int[su][3];
		for (int i = 0; i < arr.length; i++) {
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
		for (int i = 0; i < arr.length; i++) {
			char grade = ' ';
			System.out.println(name[i] + "님의 성적표 *******");
			System.out.println("국어 : " + arr[i][0] + ", 전산 : " + arr[i][1] + ", 영어 : " + arr[i][2]);
			System.out.print("총점 : " + (arr[i][0] + arr[i][1] + arr[i][2]));
			System.out.printf(" 평균 : %.2f ", (arr[i][0] + arr[i][1] + arr[i][2]) / 3.0);
			System.out.print("학점 : " + grade);
			switch ((arr[i][0] + arr[i][1] + arr[i][2]) / 30) {
			case 10:
			case 9:
				grade = 'A';
				System.out.println("평점(학점) : A");
				break;
			case 8:
				grade = 'B';
				System.out.println("평점(학점) : B");
				break;
			case 7:
				grade = 'C';
				System.out.println("평점(학점) : C");
				break;
			case 6:
				grade = 'D';
				System.out.println("평점(학점) : D");
				break;
			default:
				grade = 'F';
				System.out.println("평점(학점) : F");
				break;
			}
			System.out.println();
		}
	}
}