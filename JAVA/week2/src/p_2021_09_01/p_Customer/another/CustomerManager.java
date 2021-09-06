package p_2021_09_01.p_Customer.another;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
	
	private ArrayList<Customer> arr = new ArrayList<Customer>();
	
	public void addCustomer(Customer customer) {
		arr.add(customer);
		System.out.println(customer.getName() + " 등록");
	}
	
	public void deleteCustomer(String name) {
		for (Customer c : arr) {
			if (c.getName().equals(name)) {
				arr.remove(c);
				System.out.println(c.getName() + " 삭제");
				break;
			}
		}
	}
	
	public void showCustomer() {
		for (Customer c : arr) {
			System.out.println("----------------------");
			System.out.println("id : " + c.getId() +
					"\t이름 : " + c.getName() +
					"\t주소 : " + c.getAddrss() + 
					"\t번호 : " + c.getPhone()
					);
		}
	}
	
	public void modifyCustomer(String name) {
		for (Customer c : arr) {
			if (c.getName().equals(name)) {
				System.out.print("수정 주소 : ");
				c.setAddrss(new Scanner(System.in).next());
				System.out.print("수정 번호 : ");
				c.setPhone(new Scanner(System.in).next());
				break;
			}
		}
	}

}
