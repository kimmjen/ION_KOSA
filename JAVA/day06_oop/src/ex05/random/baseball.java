package ex05.random;

import java.util.Scanner;

public class baseball {
	public static void main(String[] args) {
		int[] comNum = new int[3];
		int[] userNum = new int[3];
		int[] panel = new int[9];

		// 패널초기화
		for (int k = 0; k < panel.length; k++) {
			panel[k] = k + 1;
		}

		// 컴퓨터 번호 랜덤출력
		int randomNum;
		for (int i = 0; i < comNum.length; i++) {
			do {
				randomNum = (int) (Math.random() * 9) + 1;
			} while (panel[randomNum - 1] == -1);
			comNum[i] = randomNum;
			panel[randomNum - 1] = -1;

			System.out.println("뽑힌번호 : " + randomNum);
		}

		// 유저 번호 입력 받기

		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int input = 0;
		int temp;
		boolean gameExit = true;
		int gameCount = 0;
		while (gameExit) {
			do {
				System.out.println("※※※※※ 세자리 정수를 입력하세요. ※※※※※");
				System.out.println("※※※※※ 단, 각 자리수는 중복이 없어야 합니다. ※※※※※");
				input = sc.nextInt();

				if (input < 100 || input > 999) {
					System.out.println("★★★★★★★★잘못된 입력값입니다 . 세자리 정수를 입력하세요.★★★★★★★★");
					check = true;
					continue; // 밑줄 실행안하고 do 로 다시 올라간다.
				}
				temp = input;
				for (int i = 0; i < userNum.length; i++) {
					userNum[userNum.length - i - 1] = temp % 10;
					temp = temp / 10;
				}

				if (userNum[0] == userNum[1] || userNum[0] == userNum[2] || userNum[1] == userNum[2]) {
					System.out.println("중복된 번호가 있습니다. 다시 입력해주세요.");
					continue;
				}
				check = false;

			} while (check);

			int strike = 0;
			int ball = 0;

			for (int i = 0; i < comNum.length; i++) {
				for (int j = 0; j < userNum.length; j++) {
					if (comNum[i] == userNum[j]) {
						if (i == j) { // 숫자와 위치가 같으면 스트라이크
							strike++;
						} else { // 숫자만 같고 위치가 다르면.
							ball++;
						}
					}
				}
			}

			// 출력
			gameCount++;
			System.out.println("============================================================");
			System.out.printf("input Number : %d, Result : %dS-%dB \n", input, strike, ball);
			System.out.print("Strike : ");
			for (int i = 0; i < strike; i++) {
				System.out.print("● ");
			}

			System.out.println();

			System.out.print("Ball : ");
			for (int i = 0; i < ball; i++) {
				System.out.print("○ ");
			}
			System.out.println();
			System.out.println("============================================================");
			if (strike == 3) {
				System.out.printf("축하합니다 게임종료입니다. 시도 횟수 : %d", gameCount);
				gameExit = false;
			}
		}
	}
}