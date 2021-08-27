package ex05.sort;
/*  기준이 있고, 뒤에 작은 것이 있으면 자리바꾼다.
 * */
public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8};
		int temp;
		
		System.out.println("--------sort전 출력--------");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\t");
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				if (a[i] > a[j] ) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			} // end
		}// end
		
		System.out.println("--------sort후 출력--------");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\t");
		}
		
	}
}
