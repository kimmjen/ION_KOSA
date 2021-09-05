package homework.day05;

public class P_03 {
    public static void main(String[] args) {

        int[] a = { 7, 5, 3, 8, 2 };
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("배열의 합 : " + sum);
    }
}
