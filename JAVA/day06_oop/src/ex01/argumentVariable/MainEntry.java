package ex01.argumentVariable;

import java.util.Iterator;

// 가변 길이 배열 - 자료형이 같아야함
public class MainEntry {
	public static void main(String[] args) {
//		plus(1, 2);
//		plus(3);
//		plus(10, 22, 3, 4, 5, 6, 7, 9);
//		plus("A", "kbs");
//		plus("33", "kbs", "mbc", "sbs");
		
		//-------------------------------
		int hap = plus2(1, 2, 3);
		System.out.println("return type : " + hap);
		System.out.println(plus2(10, 20, 30));
		
		String str2 = plus3("a", "b", "c");
		System.out.println("return type : " + str2);
		System.out.println(str2);
	}
	// 1. void
	public static void plus(int...x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}
	
	public static void plus(String...str) {
		String sum = "";
		for (int i = 0; i < str.length; i++) {
//			System.out.print(str[i] + " ");
//			str[i] = str[i] + str;
//			str[0] += str[i];
			sum += str[i] + " ";
 		}
//		System.out.println(str);
//		System.out.println("sum = " + sum);
		System.out.println(sum);
	}
	
	// 2. return type(출력에 책임은 호출한 곳에 있다.)
	public static int plus2(int...x) {
		int sum = 0;
		for (int i = 1; i < x.length; i++) {
			sum += x[i];
		}
		return sum;
	}
	public static String plus3(String...x) {
		String sum2 = " ";
		for (int i = 0; i < x.length; i++) {
			sum2 += x[i] + " ";
		}
		return sum2;
	}
	
}

