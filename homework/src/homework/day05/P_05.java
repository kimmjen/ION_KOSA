package homework.day05;

public class P_05 {
    public static void main(String[] args) {

        int[] a = { 7, 5, 7, 8, 2, 7, 3, 7, 7, 90 };
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 7) {
                count++;
            }
        }
        System.out.println("7의 갯수 : " + count);
    }
}
