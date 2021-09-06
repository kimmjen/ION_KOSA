package homework.day04;

public class P_06 {
    public static void main(String[] args) {

        // int num = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.printf("%3d ", i);
            if (i % 20 == 0)
                System.out.println();
        }
    }
}
