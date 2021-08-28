package home;

import java.util.Scanner;

/* P
 * 7의 갯수를 구해라.

    문자를 찾는다던가

    int[] a = {7,5,7,8,2,7,3,7,7,90}

    int seek=7;

    원하는 숫자의 갯수 찾는걸 만든다던가
 * A
 * 찾고 싶은 숫자를 입력하세요 : 10
찾으려는 숫자 10과 같은 개수는  : 0개
 * */

public class P_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, 5, 7, 8, 2, 7, 3, 7, 7, 90 };
		System.out.print("찾고 싶은 숫자를 입력하세요 : ");
		int seek = new Scanner(System.in).nextInt();
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (seek == a[i])
				cnt++;
		}
		System.out.println("찾으려는 숫자 " + seek + "과 같은 개수는  : " + cnt + "개");
	}
}