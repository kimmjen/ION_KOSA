package ex01.objectClass;

class Circle {
	int x, y;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle(); // 인스턴스
		Circle c2 = new Circle();
		
		System.out.println("c1 : " + c1.hashCode());
		System.out.println("c2 : " + c2.hashCode());
		
		if (c1 == c2) System.out.println("같다");
		else System.out.println("다르다");
		
		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");
		System.out.println("=============");
		if (x == y) System.out.println("같다");
		else System.out.println("다르다");
		
		System.out.println("참조(reference) 자료형 비교");
		System.out.println("=============");
		String str1 = new String("KOREA");
		String str2 = new String("KOREA");
		
		if (str1 == str2) System.out.println("같다.");
		else System.out.println("다르다.");
		
		System.out.println("******** equals() method 비교 ********");
		if(str1.equals(str2)) { // heap 영역내 실제 데이터 비교
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		System.out.println();
		if(str1.equalsIgnoreCase(str2)) System.out.println("같다.");
		else System.out.println("다르다.");
		
		
	}
}
