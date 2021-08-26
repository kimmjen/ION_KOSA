package home;

import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		char re = ' ';

		while (true) {
			if (flag == true) {
				System.out.println("다시 입력하시겠습니까? Y/N");
				re = sc.next().charAt(0);
				if (re == 'N')
					System.out.println("프로그램 종료");
					break;
			}
			flag = true;
			try {
				System.out.println("이름, 국어, 전산, 영어를 입력하세요.");
				String name = sc.next();
				int x = sc.nextInt(); 
				int y = sc.nextInt();
				int z = sc.nextInt();

//				name = sc.next();
//				k = sc.nextInt();
//				j = sc.nextInt();
//				en = sc.nextInt();
				if (x < 0 || x > 100 || y > 100 || y < 0 || z > 100 || z < 0) {
					System.out.println("잘못된 점수입니다. 프로그램을 종료합니다.");
					break;
				}
				int total = x + y + z;
				double avg = (double) total / 3;
				char grade = ' ';
				if (avg <= 100 && avg >= 90)
					grade = 'A';
				else if (avg < 90 && avg >= 80)
					grade = 'B';
				else if (avg < 80 && avg >= 70)
					grade = 'C';
				else if (avg < 70 && avg >= 60)
					grade = 'D';
				else
					grade = 'F';

				System.out.println(name + " 님의 성적표*********");
				System.out.println("국어 : " + x + ", 전산 : " + y + ", 영어 : " + z);
				System.out.println("총점 : " + total + ", 평균 : " + avg + ", 평점(학점) : " + grade);

			} catch (Exception e) {
				System.out.println("잘못된 입력값입니다.");
			}

		}

	}

}