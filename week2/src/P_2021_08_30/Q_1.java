package P_2021_08_30;

import java.util.Random;
import java.util.Scanner;

/*
 * 업다운
 */

public class Q_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = new Random().nextInt(100) + 1;
		int num;
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("1 ~ 100 사이의 숫자 입력 : ");
			num = sc.nextInt();
			if (num == n) {
				System.out.println("맞았습니다.");
				break;
			} else if (num > n) System.out.println("더 작은 숫자입니다.");
			else System.out.println("더 큰 숫자입니다.");
			
		}
		if (i == 5) System.out.println("답은 " + n + "이었습니다.");
	}
}
