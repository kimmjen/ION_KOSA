package p_2021_09_02.emp_file;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		Employee e = new Employee();
		
		while(true) {
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.print("(1) 회원추가 ㅣ (2) 전체보기 | (3) 회원삭제 | (4) 종료 ");
			System.out.print(">> ");
			switch(new Scanner(System.in).nextInt()) {
				case 1:
					e.addEmployee();
					break;
				case 2:
					e.listEmployee();
					break;
				case 3:
					e.removeEmployee();
					break;
				case 4:
					System.exit(0);
			}
		}
	}

}