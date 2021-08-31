package ex04.Abstract;

public class Rectangle extends Shape {
	int y = 5, h = 10;

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		result = (x * y) * h; 
		return result;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		calc(5);
		System.out.println(result + " 크기의 " + name + " 이 그려졌습니다.");

	}

}
