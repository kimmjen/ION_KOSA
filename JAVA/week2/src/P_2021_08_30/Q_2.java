package P_2021_08_30;

import java.util.Arrays;
import java.util.Random;

/*
 * 로또
 */

public class Q_2 {
	public static void main(String[] args) {
		System.out.println();
		int cnt = 0;
		int[] ch = new int[45];
		int[] lotto = new int[6];
		while (cnt != 6) {
			int a = new Random().nextInt(45);
			if (ch[a] == 0) {
				ch[a] = 1;
				lotto[cnt++] = a;
			}
		}
		Arrays.sort(lotto);
		for (int j : lotto) {
			System.out.print(j + 1 + " ");
		}
	}
}
