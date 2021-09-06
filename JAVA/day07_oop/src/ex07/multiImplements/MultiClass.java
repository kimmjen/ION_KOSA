package ex07.multiImplements;

import ex04.Abstract.Shape;
import ex06.Interface.IDraw;

public class MultiClass extends Shape implements IDraw, Test {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("IDraw interface");
		System.out.println(result);
		
	}
	
	@Override
	public void tView() {
		// TODO Auto-generated method stub
		System.out.println("Test interface");
		result = 7.7;
		System.out.println(result);

	}

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		System.out.println("Shape class");
		return 5.5;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		System.out.println("Shape class method");

	}

}
