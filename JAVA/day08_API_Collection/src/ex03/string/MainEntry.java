package ex03.string;

// String : 불변객체,
public class MainEntry {
	public static void main(String[] args) {
		int x= 999;
		String str = "abc";
		System.out.println("str : " + str); // str : abc
		
		char data[] = {'a', 'b', 'c', 'd'};
		String str2 = new String(data);
		System.out.println("str : " + str2); // str : abcd
		
		String str3 = "korea";
		System.out.println("str : " + str3);
		System.out.println(str.hashCode());
		
		String str4 = "busan";
		System.out.println("str : " + str4);
		System.out.println(str.hashCode());
		
		String str5 = "busan";
		System.out.println("str : " + str5);
		System.out.println(str.hashCode());
	}
}
