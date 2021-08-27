package quiz;

import java.util.Scanner;

public class q_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = 7;
		int[][] arr = new int[su][3];

		for (int i = 0; i < arr.length; i++) {
			int kor, eng, math;

			while (true) {
				System.out.println("kor : ");
				kor = sc.nextInt();
				if (kor >= 0 && kor <= 100)
					break;
			}
			arr[i][0] = kor;
			while (true) {
				System.out.println("eng : ");
				eng = sc.nextInt();
				if (eng >= 0 && eng <= 100)
					break;
			}
			arr[i][1] = eng;
			while (true) {
				System.out.println("math : ");
				math = sc.nextInt();
				if (math >= 0 && math <= 100)
					break;
			}
			arr[i][2] = math;
		}
		
		for (int i = 0; i < arr.length; i++) {
			char grade;
			switch ((arr[i][0] + arr[i][1] + arr[i][2]) / 30) {
			case 10:
			case 9:
				grade ='A';
//				System.out.println("평점(학점) : A");
				break;
			case 8:
				grade ='B';
//				System.out.println("평점(학점) : B");
				break;
			case 7:
				grade ='C';
//				System.out.println("평점(학점) : C");
				break;
			case 6:
				grade ='D';
//				System.out.println("평점(학점) : D");
				break;
			default:
				grade ='F';
//				System.out.println("평점(학점) : F");
				break;
			}
			System.out.println("학생  : " + (i + 1) /* + "의 성적표" */);
			System.out.println("국어 : " + arr[i][0] + ", 전산 : " + arr[i][1] + ", 영어 : " + arr[i][2]);
			System.out.print("총점 : " + (arr[i][0] + arr[i][1] + arr[i][2])  + " 학점 : " + grade);
			System.out.printf(" 평균 : %.2f ", (arr[i][0] + arr[i][1] + arr[i][2]) / 3.0);
			System.out.println();
		}
	}
}
