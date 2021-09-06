package Q_homework;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 정규직,\t2. 판매직,\t3. 아르바이트");
			int a = sc.nextInt();
			
			if (a == 1 || a == 2) {
				System.out.println("이름, 연락처, 부서, 급여 입력");
				String name = sc.next();
				String phone = sc.next();
				String department = sc.next();
				int pay = sc.nextInt();
				if (a == 1) {
					String position = "정규직";
					Employee e = new Regular(name, phone, department, position, pay);
					e.disp();
					
				} else if (a == 2) {
					String position = "판매직";
					Regular r = new Sales(name, phone, department, position, pay);
					r.disp();
				}
			} else if (a == 3) {
				System.out.println("이름, 연락처, 부서 입력");
				String name = sc.next();
				String phone = sc.next();
				String department = sc.next();
				String position = "아르바이트";
				Employee em = new PartTime(name, phone, department, position);
				em.disp();
			} else {
				System.out.println("1 ~ 3 까지만 입력");
				
				while(true) {
					String yn ="";
					System.out.println("계속 입력 하실 건가요? (y/n)");
					yn = sc.next();
					
					if (yn.equals("y") || yn.equals("Y")) {
						break;
					} else if (yn.equals("N") || yn.equals("n")) {
						System.exit(0);
					} else {
						System.out.println("y와 n 중에 입력");
					}
				}// while end
			}
		} // while end
	}
}
