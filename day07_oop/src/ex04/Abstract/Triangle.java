package ex04.Abstract;

public class Triangle extends Shape {
	
	int w = 100;

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		result = (x * w) / 2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.0);
		// TODO Auto-generated method stub
		System.out.println(result + " 크기의 " +  name + " 이 그려졌습니다.");

	}

}
