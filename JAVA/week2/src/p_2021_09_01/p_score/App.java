package p_2021_09_01.p_score;

import java.util.Scanner;
import java.util.Vector;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Score> score = new Vector<Score>();

		int idx = -1;
		System.out.println("성적 관리 프로그램");
		System.out.println("1. 성적 입력\t 2. 성적 리스트 출력\t 3. 종료");
		try {
			while (true) {
				Scanner sc = new Scanner(System.in);
				int num;
				do {
					System.out.println("원하는 작업 번호 입력 : ");
					num = sc.nextInt();
				} while (num < 1 || num > 3);

				switch (num) {
				case 1: {
					score.add(new Score());
					score.get(++idx).input();
					break;
				}
				case 2: {
					for (int i = 0; i < score.size(); i++) {
						System.out.println(score.get(i).toString());
						System.out.println();
					}
					break;
				}
				case 3: {
					System.out.println("시스템 종료");
					System.exit(0);
				}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}