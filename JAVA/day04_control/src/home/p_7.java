package home;

import java.util.Scanner;

public class p_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("대문자->소문자, 소문자->대문자로 바꾸고 싶은 word 입력하세요 : ");
		String word = sc.nextLine();
		String answer = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				answer += (char) (ch - 'a' + 'A');
			else if (ch >= 'A' && ch <= 'Z')
				answer += (char) (ch - 'A' + 'a');
			else
				answer += (char) ch;
		}
		System.out.println(answer);
	}
}