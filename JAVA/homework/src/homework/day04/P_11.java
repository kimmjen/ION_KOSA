package homework.day04;

public class P_11 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("3의 배수의 갯수 : " + count);
        System.out.println("3의 배수의 합 : " + sum);
    }
}
