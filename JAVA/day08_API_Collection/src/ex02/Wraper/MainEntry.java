package ex02.Wraper;

class Point {

}

public class MainEntry {
	public static void main(String[] args) {
		Integer iA = new Integer(10);
		Integer iB = new Integer("10");
		String su = "30";
		Point pt = new Point();
		
		System.out.println("test start");
		System.out.println(iA);
		System.out.println(iB);
		System.out.println("test end");
		System.out.println();
		System.out.println(iA.MAX_VALUE); // 2147483647
		System.out.println(iB.MIN_VALUE); // -2147483648

		System.out.println(pt); // 123a439b
		System.out.println(pt.toString()); // 123a439b
		System.out.println(iA.getClass().getName() + '@' + Integer.toHexString(iA.hashCode()));
		System.out.println();
		System.out.println(iA); // 10
		System.out.println(iA.getClass().getName() + '@' + Integer.toHexString(iA.hashCode())); // java.lang.Integer@a : a = 10
		System.out.println(iA.getClass().getName() + '@' + Integer.toHexString(pt.hashCode())); // java.lang.Integer@123a439b
		
		System.out.println();
		System.out.printf("%d %o %x %X\n", 10, 10, 10, 10); // 10 12 a A
		System.out.printf("%d %d %d \n", 012, 0xA, 0x12); // 10 10 18  // 0숫자 - 16진수, 0x숫자 - 16진수
		
		int x = 77;
		double y = 5.5;
		System.out.println(x + "," + y);
		x = (int)y; // static 영역에 있음
		System.out.println(x + "," + y);
		
		// Boxing & Unboxing
		int c = iA.intValue(); // jdk 4.x 이전에 사용하던 메소드 // 
		int d = iB; // jdk 5.x 이후부터는 autoboxing, unboxing
		int num = Integer.parseInt(su);
		
		System.out.println(c + num);// 40
		System.out.println(c + d); // 20
		System.out.println();
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Float.MIN_VALUE); // 1.4E-45
		
		int e = Integer.parseInt("123");
		int f= Integer.parseInt("1111111", 2); // radix
		
		System.out.println(f); //127
		System.out.println(e + 20); // 143

	}
}
