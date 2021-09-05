package homework.day04;

public class P_06_1 {
    public static void main(String[] args) {

        int i = 1;
        int cnt = 0;
        while (true) {
            if (i > 100)
                break;
            if (i % 2 == 0) {
                System.out.print(i);
                if (i != 100)
                    System.out.print(", ");
                cnt++;
            }
            if (cnt == 10) {
                System.out.println();
                cnt = 0;
            }
            i++;
        }
    }
}
