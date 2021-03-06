package ex03.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "HelloJAVA";
		String s2 = "kimmjen";
		
		System.out.println(s2.replace("mm", "MM"));
		System.out.println(s2);
		
		s2 = s2.replace("mm", "MM");
		System.out.println(s2);
		
		s1 = s1 + s2;
		System.out.println(s1);
		System.out.println("======================================");
		//
		System.out.println("Test start");
		String s3 = new String("            ab                cd         ");
		System.out.println(s3);
		System.out.println("길이 구하기");
		System.out.println(s3.length());

		System.out.println("공백 제거"); // 중간 사이 공백은 제거 불능
		s3 = s3.trim();
		System.out.println(s3);
		System.out.println("길이 구하기");
		System.out.println(s3.length());
		
		System.out.println("분리");
		System.out.println("------------------------------------------------");
		String s4= new String("ab/cdefg/34235/akdsfjl/32493240");
		System.out.println(s4);
		String[] s4_t = s4.split("/");
		for (int i = 0 ; i < s4_t.length; i++) {
			System.out.println("분리된 : " + i + " 번 문자열 : " + s4_t[i]);
		}

		System.out.println("------------------------------------------------");

		String s5= new String("ab cdefg 34235 akdsfjl 32493240");
		System.out.println(s5);
		String[] s5_t = s5.split(" ");
		for (int i = 0 ; i < s5_t.length; i++) {
			System.out.println("분리된 : " + i + " 번 문자열 : " + s5_t[i]);
		}
		
		System.out.println("------------------------------------------------");
		String s6 = "qwertty1234566 asdfs 09877 zxcv lcvvbc";
		char ch = s6.charAt(0);
		System.out.println(ch);
		
		System.out.println("------------------------------------------------");
		System.out.println("소/ 대문자 출력");
		String s7 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("소문자 출력 toLowerCase() : " + s7.toLowerCase());
		String s8 = s7.toLowerCase();
		System.out.println("대문자 출력 toUpperCase() : " + s8.toUpperCase());
		
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.println(s1.length());
		char[] ch2 = s1.toCharArray();
		
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(ch2[i] + "\t");
		}
	}
}
