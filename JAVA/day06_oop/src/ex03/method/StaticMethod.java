package ex03.method;

/*
 * static method : 객체 생성없이 바로 사용가능
 * 호출방법 > objectName.methodName();
 * 			className.methodName();
 */
class A {
	int x, y;
	// static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + " ,  " + yy);
	}
} // A class end

public class StaticMethod {
	public static void main(String[] args) {
		A.setData(3, 5); // className.methodName();
		
		A a = new A(); // 객체생성, 메모리에 할당, 생성자 함수 자동 호출
		a.setData(2, 4); // ojbectName.methodName()
	}
}
