package p_2021_09_01.p_Customer;

import java.util.Scanner;
import java.util.Vector;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Vector<Customer> customer = new Vector<Customer>();
		System.out.println("고객 관리 프로그램");
		System.out.println(" 1. 고객추가\n 2.고객 리스트 출력\n 3. 고객 삭제 \n 4. 수정\n 5. 프로그램 종료\n");
		try {
			while (true) {
				int num;
				do {
					System.out.print("원하시는 작업의 번호를 입력해주세요.(1 ~ 5) : ");
					num = sc.nextInt();
				} while (num < 1 || num > 5);

				switch (num) {
				case 1: {
					add(customer);
					break;
				}
				case 2: {
					for (int i = 0; i < customer.size(); i++) {
						System.out.printf("%d번 고객\n", customer.get(i).getNum());
						System.out.println(customer.get(i));
						System.out.println();
					}
					break;
				}
				case 3: {
					System.out.print("삭제할 고객의 번호를 입력하세요 : ");
					int n = sc.nextInt();
					int i = check(customer, n);
					if (i < 0) {
						do {
							System.out.print("존재하지 않는 고객번호입니다. 다시 입력해 주세요 : ");
							n = sc.nextInt();
							i = check(customer, n);
						} while (i < 0);
					}
					del(customer, i);
					break;
				}
				case 4: {
					System.out.print("수정할 고객의 번호를 입력하세요 : ");
					int n = sc.nextInt();
					int i = check(customer, n);
					if (i < 0) {
						do {
							System.out.print("존재하지 않는 고객번호입니다. 다시 입력해 주세요 : ");
							n = sc.nextInt();
							i = check(customer, n);
						} while (i < 0);
					}
					edit(customer, i);
					break;
				}
				default: {
					System.out.print("종료되었습니다.");
					System.exit(0);
				}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int check(Vector<Customer> c, int n) {
		for (int i = 0; i < c.size(); i++) {
			if (n == c.get(i).getNum())
				return i;
		}
		return -1;
	}

	public static void del(Vector<Customer> c, int n) {
		c.remove(n);
	}

	public static void add(Vector<Customer> c) {
		Scanner sc = new Scanner(System.in);
		String name, adress, phone;
		System.out.print("고객 이름을 입력해주세요 : ");
		
		name = sc.next();
		System.out.print("주소를 입력해주세요 : ");
		
		adress = sc.next();
		System.out.print("전화번호를 입력해주세요 : ");
		
		phone = sc.next();
		c.add(new Customer(++Customer.cnt, name, adress, phone));
	}

	public static void edit(Vector<Customer> c, int n) {
		Scanner sc = new Scanner(System.in);
		char yn;
		do {
			System.out.print("수정할 사항 번호를 입력해주세요 (1.이름, 2.주소, 3.전화번호) : ");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				System.out.print("수정할 이름을 입력해주세요 : ");
				String name = sc.next();
				c.get(n).setName(name);
				break;
			}
			case 2: {
				System.out.print("수정할 주소를 입력해주세요 : ");
				String add = sc.next();
				c.get(n).setAddress(add);
				break;
			}
			case 3: {
				System.out.print("수정할 전화번호를 입력해주세요 : ");
				String phone = sc.next();
				c.get(n).setPhone(phone);
				break;
			}
			default: {
				System.out.println("번호를 잘못입력하셨습니다.");
			}
			}
			System.out.print("계속 수정하시겠습니까? (Y/N) : ");
			yn = sc.next().charAt(0);
		} while (yn == 'Y' || yn == 'y');
	}
}