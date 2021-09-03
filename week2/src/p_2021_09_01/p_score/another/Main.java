package p_2021_09_01.p_score.another;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScoreManager sm = new ScoreManager();

		System.out.println("*********작업 리스트*********");
		System.out.println("1. 고객 추가\n2. 고객 삭제\n3. 고객 리스트 출력\n4. 프로그램 종료\n");

		try {
			int num;
			while (true) {
				do {
					System.out.print("원하시는 작업의 번호 입력(1~4) : ");
					num = sc.nextInt();
				} while (num < 1 || num > 5);

				switch (num) {
				case 1:
					sm.addScore();
					break;
				case 2:
					sm.deleteScore();
					break;
				case 3:
					sm.showScore();
					break;
				default:
					System.out.print("프로그램 종료");
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
