package p_2021_09_02.emp_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class emp_another {
	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);

		try {
			OutputStream os = new FileOutputStream("Emploee.txt"); // 상대경로
			while (true) {
				System.out.println(i + "번째 사원의 이름을 입력하세요 : ");
				String name = sc.nextLine() + "\r\n";
				if (name.toUpperCase().equals("EXIT\r\n"))
					break;
				System.out.println("직급을 입력하세요 : ");
				String position = sc.nextLine() + "\r\n";
				System.out.println("부서를 입력하세요 : ");
				String dept = sc.nextLine() + "\r\n\n";

				String str = i++ + "번째 사원\r\n" + name + position + dept;
				os.write(str.getBytes());
			} // end while

			System.out.println("memo.txt save success!!!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}