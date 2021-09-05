package homework.day04;

public class P_10_WHILE {
    public static void main(String[] args) {

        int a = 1, b = 1;

        while (true) {
            b = 1;

            while (true) {
                System.out.println(a + " * " + b + " = " + (a * b));
                b++;

                if (b > 9) {
                    break;
                }
            }
            a++;
            if (a > 9) {
                break;
            }
        }
    }
}
