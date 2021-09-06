package p_2021_09_02.BMI_To;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Person_Manager pm = new Person_Manager();
		Scanner sc = new Scanner(System.in);

		System.out.println("회원관리");
		System.out.println("1.추가 2.삭제 3.전체회원정보보기 4.선택한회원정보보기 5.저장 6.종료");
		try {
			
			int nInput;
			while (true) {
				
//			System.out.println("원하는 번호를 입력하세요.(1 ~ 6) : ");
				
				do {
					System.out.print("원하시는 작업의 번호 입력(1 ~ 6) : ");
					nInput = sc.nextInt();
				} while (nInput < 1 || nInput > 6);
				switch (nInput) {
				case 1:
					pm.Add();
					break;
				case 2:
					pm.Del();
					break;
				case 3:
					pm.PrintALL();
					break;
				case 4:
					pm.PrintSell();
					break;
				case 5:
					pm.Save();
					break;
				default :
					System.out.println("시트템 종료");
					System.exit(0);
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
