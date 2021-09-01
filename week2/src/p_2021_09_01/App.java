package p_2021_09_01;

import java.util.Scanner;
import java.util.Vector;

public class App {
	
	public static void main(String[] args) {
		
		Vector<Customer> v = new Vector<Customer>();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("1. 추가, 2. 삭제, 3. 고객리스트 출력, 4. 수정" );
			int a = sc.nextInt();
			
			if (a == 1 || a == 2) {
				System.out.println("이름, 주소, 전화번호");
				String name = sc.next();
				String address = sc.next();
				String phone = sc.next();
				
				
				
			}
			
		}
		
	}
}
