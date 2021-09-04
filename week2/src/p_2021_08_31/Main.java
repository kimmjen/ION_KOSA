package p_2021_08_31;

import java.util.Scanner;

import p_2021_08_31.EMP.inherit.Emp;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int typ = 0;
		String name = "";
		String phone = "";
		String dept = "";
		String lev = "";
		String re = "";
		int sal = 0;
		while (true) {
			System.out.println("정규직 - 1, 판매직 - 2, 파트타이머 - 3");
			System.out.print("숫자로 입력하세요 : ");
			typ = sc.nextInt();
			switch (typ) {
			case 1 :
				System.out.println("정규직 대한 정보를 입력하세요.\n이름, 연락처, 부서, 직급, 월급");
				name = sc.next();
				phone = sc.next();
				dept = sc.next();
				lev = sc.next();
				sal = sc.nextInt();
				Employee r = new Regular(name, phone, dept, lev, sal);
				r.display();
				System.out.println("---------------------------");
				break;
			case 2 :
				System.out.println("판매직에 대한 정보를 입력하세요.\n이름, 연락처, 부서, 직급, 월급");
				name = sc.next();
				phone = sc.next();
				dept = sc.next();
				lev = sc.next();
				sal = sc.nextInt();
				Employee s = new Sales(name, phone, dept, lev, sal);
				s.display();
				System.out.println("---------------------------");
				break;
			case 3 :
				System.out.println("파트타이머에 대한 정보를 입력하세요.\n이름, 연락처, 부서, 직급");
				name = sc.next();
				phone = sc.next();
				dept = sc.next();
				lev = sc.next();
				Employee p = new Parttime(name, phone, dept, lev);
				p.display();
				System.out.println("---------------------------");
				break;
			default :
				System.out.println("정해진 형식이 아닙니다.");
				break;
			}
			System.out.println("또 다른 정보를 입력하시겠습니까? y or n");
			while (true) {
				re = sc.next();
				if (re.equals("y") || re.equals("n") || re.equals("Y") || re.equals("N"))
					break;
				System.out.println("제대로 된 형식에 맞춰 입력하세요 y or n");
			}
			if (re.equals("n") || re.equals("N"))
			{
				System.out.println("종료");
				break;
			}
		}
	}
}