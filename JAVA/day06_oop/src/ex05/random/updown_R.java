package ex05.random;

import java.util.Scanner;

public class updown_R {
	public static void main(String[] args) {
		System.out.println("=================== 업다운 게임! 횟수 5번안에 ! ===================");
		System.out.println("범위는 1~100까지 입니다 숫자를 입력해주세요.");
		int ans = 0;
		int hint = 5;
		int des = (int) (Math.random() * 100) + 1; // 1~100 까지 랜덤 값
		Scanner input = new Scanner(System.in);
		// System.out.println(des);
		while (true) {
			ans = input.nextInt();
			hint--;
			System.out.println("남은횟수 " + hint + " 회");
			if (ans < des) {
				System.out.println("입력한 값은 " + ans + "입니다. 정답보다 값이 낮습니다!");
			} else if (ans > des) {
				System.out.println("입력한 값은 " + ans + "입니다. 정답보다 값이 높습니다!");
			} else if (hint == 0) {
				System.out.println("남은 기회를 모두 사용하셨습니다. 게임오버~");
				break;
			} else {
				System.out.println("축하합니다. 정답입니다!");
				break;
			}
		}
		input.close();

	}
}
