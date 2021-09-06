package homework.day04;

public class P_3 {
    public static void main(String[] args) {

        // int sum = 0;
        double sum = 0;

        // for (int i = 2; i <= 10; i++) {
        // sum += (i - 1 / i);
        // }

        for (double i = 1; i <= 9; i++) {
            sum += (i / (i + 1));
        }
        System.out.println("1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 +  9/10 = ?" + sum);
        // 7.07103174603
    }
}
