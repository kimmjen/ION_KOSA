package ex04.For;

public class MultiFor {
	public void main(String[] args) {
		
		for (int i = 1; i <=2; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(j + "\t");
			}// j end
			System.out.println();
		}// i end
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println("*");
			}// j end
			System.out.println();
		}// i end
	}
}
