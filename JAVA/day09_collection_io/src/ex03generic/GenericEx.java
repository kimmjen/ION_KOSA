package ex03generic;

public class GenericEx<T> {
	
	T[] v; // 멤버 변수
	
	public void set(T[] v) { // 멤버변수
		this.v = v;
	}
	public void print() {
		for (T item : v) {
			System.out.println(item);
		}
	}

}
