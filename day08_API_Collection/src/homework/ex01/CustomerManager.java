package homework.ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CustomerManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		int num = 0;
		Iterator itr = list.iterator();
		
		while(true) {
			System.out.println();
			num = sc.nextInt();
			
			if (num == 1) {
				list.add(new Customer());
				System.out.println();
				for (int i = 0; i < list.size(); i++) {
					System.out.println();
				}
				System.out.println();
			} else if(num == 2) {
				if (!itr.hasNext()) {
					System.out.println();
					continue;
				}
				System.out.println();
				list.remove(sc.nextInt() - 1);
				System.out.println();
				for (int i =0; i < list.size(); i++) {
					System.out.println();
				}
			} else if (num == 3) {
				if (!itr.hasNext()) {
					System.out.println();
					continue;
				}
				System.out.println();
				list.set(sc.nextInt() - 1, new Customer());
				System.out.println();
				for (int i = 0; i < list.size(); i++) {
					System.out.println("Customer " + (i + 1) + list.get(i));
				}
			}else if (num == 4) {
				
			} else if (num == 5) {
				
			}
		}
	}
}
