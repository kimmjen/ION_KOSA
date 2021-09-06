package p_2021_09_02.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 사칙연산 - i/o
 */
public class Q_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su1, su2;
		char c;
		int result = 0;
		
		System.out.println("첫 번째 수 : ");
		su1 = Integer.parseInt(br.readLine());
		
		System.out.println("두 번째 수 : ");
		su2 = Integer.parseInt(br.readLine());
		
		System.out.println("연산자 (+, -, *, /) ");
		c = (char)br.read();
		
		switch (c) {
		case '+' : {
			System.out.printf("%d + %d = %d", su1, su2, su1+su2);
			break;
		}
		case '-' : {
			System.out.printf("%d - %d = %d", su1, su2, su1+su2);
			break;
		}
		case '*' : {
			System.out.printf("%d * %d = %d", su1, su2, su1+su2);
			break;
		}
		case '/' : {
			System.out.printf("%d / %d = %d", su1, su2, su1+su2);
			break;
		}
	}
}

}