package ex08.api;

// Object class

class Point {}
public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode()); // 123961122
		System.out.println("object String : " + pt.toString()); //7637f22
		System.out.println("object String : " + pt);
		System.out.printf("10진수%d\n", 0x7637f22); // 0x숫자 : 16진수, 0숫자 : 8진수  10진수123961122
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode()); // 123961122
		System.out.println("object String : " + pt2); //7637f22
		
		Point pt3 = new Point();
		
		if (pt.hashCode() == pt3.hashCode()) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다");
		}
		
		Point pt4 = new Point();
		pt4 = pt;
		
		if (pt.hashCode() == pt4.hashCode()) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
	}
}
