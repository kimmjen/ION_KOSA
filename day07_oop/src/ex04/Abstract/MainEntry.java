package ex04.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		
		//1. 각자의 클래스로 객체 생성 형태
		Circle c = new Circle();
		c.show("원");
		
		Rectangle r = new Rectangle();
		r.show("사각형");
		
		Triangle t = new Triangle();
		t.show("삼각형");
		
		System.out.println("=======================");
		
		// 2. Shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("원");
		
		sh = new Rectangle();
		sh.show("사각형");
		
		sh = new Triangle();
		sh.show("삼각형");
		
		System.out.println("=======================");
		
		//3. 배열을 이용한 형태
		Shape[] ss= new Shape[3]; // 배열 선언 및 생성
		ss[0] = new Circle();
		ss[1] = new Rectangle();
		ss[2] = new Triangle();
		
		String[] name = {"Circle", "Rectangle", "Triangle"};
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
		
		// 4. 
		Shape[] sss= new Shape[3]; // 배열 선언 및 생성
//		ss[0] = new Circle();
//		ss[1] = new Rectangle();
//		ss[2] = new Triangle();
		
		String[] name1 = {"Circle", "Rectangle", "Triangle"};
		Object[] shape = {new Circle(), new Rectangle(), new Triangle()};
		
		for (int i = 0; i < sss.length; i++) {
			sss[i] = (Shape)shape[i];
			sss[i].show(name1[i]);
		}
		
		
		
//		Shape s = new Circle();
//		s.show("원");
	}
}
