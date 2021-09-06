package ex05.Interface;

interface A { // intercate - abstract method, final method 만
	int x = 99; //  <- final static int x = 99;
	final int y = 777;
	char ch = 'A';
	
	// 추상 메소드, abstract 생략 가능 - 무조건 추상 메소드임
	public void show(); // <- public abstract void show();
	public abstract void disp();
}// A end

interface B {
	void bView(); // 추상 메소드
	
}

interface C {
	String name = "Hello";
	public void cDraw();
}

// interface 간에 상속에서도 extends 키워드 사용한다.
interface D extends B {
	void dView();
}

class Ret implements D {

	@Override // B
	public void bView() {
		// TODO Auto-generated method stub
		
	}

	@Override // D
	public void dView() {
		// TODO Auto-generated method stub
		
	}
	public int plus(int x, int y) {
		return x + y;
	}
} //Ret end

class Shape {
	
}

class Multi extends Shape implements B, C, A {

	@Override // A
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(x);
		
	}

	@Override // 
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("A interface");
		
	}

	@Override // C
	public void cDraw() {
		// TODO Auto-generated method stub
		System.out.println("C interface");
		
	}

	@Override // B
	public void bView() {
		// TODO Auto-generated method stub
		System.out.println("B interface");
		
	}
	
}
public class MainEntry {
	public static void main(String[] args) {
		Multi m = new Multi();
		m.show();
		m.cDraw();
		m.disp();
		
		B b = new Multi();
		b.bView();
		
		A a = new Multi();
		a.disp();
	}
}
