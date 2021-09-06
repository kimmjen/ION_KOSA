package homework.day04;

public class P_02 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 1)
                sum -= i;
            else
                sum += i;
        }
        System.out.println("(-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?" + sum);
    }
}
