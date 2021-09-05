package homework.day06;

import java.util.Arrays;
import java.util.Random;

public class P_02 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {

            lotto[i] = random.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(lotto);

        System.out.print("로또 번호 : ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
