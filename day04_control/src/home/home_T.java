package home;

import java.util.Scanner;

public class home_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, com, tot = 0;
		double avg = 0;
		String name = "", str = null;
		char yn = ' ', grade = ' ';

		while (true) {
			System.out.println("name : ");
			name = sc.next();

			/*
			 * do { System.out.println("kor, eng, com = "); kor = sc.nextInt(); eng =
			 * sc.nextInt(); com = sc.nextInt(); } while (kor < 0 || kor > 101 || eng < 0 ||
			 * eng > 101 || com < 0 || com > 101);
			 */

			do {
				System.out.println("kor = ");
				kor = sc.nextInt();
			} while (kor < 0 || kor > 101);

			do {
				System.out.println("eng = ");
				eng = sc.nextInt();
			} while (eng < 0 || eng > 101);

			do {
				System.out.println("com = ");
				com = sc.nextInt();
			} while (com < 0 || com > 101);

			tot = kor + eng + com ;
			avg = tot / 3.;
			
			// 학점(평점)
//			if
			if(avg >= 90) {
				grade = 'A';
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg >= 70) {
				grade = 'C';
			} else if (avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			
			try {

//				total = (kor + eng + com);
				avg = (((float) tot) / 3);

				if (avg < 60) {
					System.out.println("불합격 입니다");
				}
				if (kor < 40) {
					System.out.println("국어 불합격" + kor + "점");
				}
				if (eng < 40) {
					System.out.println("영어 불합격" + eng + "점");
				}
				if (com < 40) {
					System.out.println("전산 불합격" + com + "점");
				} else {
					System.out.println("축하드립니다 평균 점수" + avg + "점 으로 합격 입니다");
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력 해주세요");
			}

			System.out.println("\n\n" + name + "님의 성적표**************");
			System.out.println("kor : " + kor + "\teng : " + eng + "\tcom : " + com);
			System.out.println("tot : " + tot + "\tavg : " + avg + "\tgrade : " + grade);

			System.out.println("더 입력 할거야 ? (y/n)");
//			yn = sc.next().charAt(0);
			str = sc.next();

//			if (yn == 'n' || yn == 'N') break;
//			if (str.toUpperCase() == 'N') break;
//			if(str.equalsIgnoreCase("n")) break;
			if (str.equalsIgnoreCase("y"))
				continue;
		}

	}

}