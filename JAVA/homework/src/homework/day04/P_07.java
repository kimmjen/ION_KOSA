package homework.day04;

import java.util.Scanner;

public class P_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("영어 단어 입력 : ");

        String s = sc.next();
        String res = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c > 64 && c < 91)
                c += 32;
            else
                c -= 32;
            res += c;
        }
        sc.close();
        System.out.println("대소문자 변환 : " + res);
    }
}
