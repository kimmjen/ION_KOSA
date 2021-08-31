package ex03.Abstract;

abstract class Shape { // 추상 클래스 super class 강제성
	double result = 0; // 추상 메소드
	public abstract double calc();
	public abstract void draw();
	
	public void show() { // 일반 메소드
		System.out.println("Super class Shape");
	}
}// Shape end

class Circle extends Shape {// sub class
	double r = 5.0;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		calc();
		System.out.println("원의 넓이 : " + result + " 인원을 그렸습니다.");
		
	}
	
}

class Triangle extends Shape { // sub class
	
	int w = 10, h = 20;

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		result = (w * h) / 2;
		return result;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		calc();
		System.out.println("삼각형의 넓이 : " + result + " 인 삼각형을 그렸습니다.");
		
	}
	
} // triangle end
// 사각형 클래스
class Rec extends Shape {
	int x = 5, y = 5, h = 10;

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		result = (x * y) * h; 
		return result;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		calc();
		System.out.println("사각형의 넓이 : " + result + "인 사각형을 그렸습니다.");
		
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		// 이클립스 기반
//		Shape s = new Shape(); // 자체적으로 객체 생성할 수 없다.
		Circle c = new Circle();
//		c.calc();
		c.draw();
		
		Triangle t = new Triangle();
		t.draw();
		
		Rec r = new Rec();
		r.draw();
	}
}
