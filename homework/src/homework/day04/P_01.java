package homework.day04;

public class P_01 {
    public static void main(String[] args) {

        int tmp = 0;
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            tmp += i;
            sum += tmp;
        }
        System.out.println("1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? " + sum);
        // 1, 3, 6, 10, 15
    }
}
