package p_2021_08_31.EMP.inherit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Emp e;
		e = input();
		e.output();
	}

	public static Emp input() {
		int n;
		int pay;
		String arr[];
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1(정규직), 2(영업직), 3(알바) 번호입력 >> ");
			n = sc.nextInt();
		} while(n < 1 || n > 3);
		try {
			switch(n) {
			
			case 1:
				arr = inputEmp();
				System.out.print("급여 >> ");
				pay = sc.nextInt();
				return new RegularEmp(arr[0], arr[1], arr[2], arr[3], pay);
			case 2:
				arr = inputEmp();
				System.out.print("급여 >> ");
				pay = sc.nextInt();
				System.out.print("상여금 >> ");
				int comm = sc.nextInt();
				return new SalesEmp(arr[0], arr[1], arr[2], arr[3], pay, comm);
			case 3:
				arr = inputEmp();
				System.out.print("몇 일동안 >> ");
				int day = sc.nextInt();
				System.out.print("몇 시간씩 >> ");
				int time = sc.nextInt();
				return new PartTimeEmp(arr[0], arr[1], arr[2], arr[3], day, time);
			default:
				System.out.println("error");
				System.exit(0);
			}
//			return null;
			System.out.println();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String[] inputEmp() {
		String basicInfo[] = new String[4];
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 폰번호 부서 직급 입력 >> ");
		for (int i = 0; i < 4; i++) {
			basicInfo[i] = sc.next();
		}

		return basicInfo;
	}

}
