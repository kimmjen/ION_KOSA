package Quiz;

import java.util.Scanner;

public class Q_switch {

	public static void main(String[] args) {
		System.out.print("전산 과목 점수를 입력해주세요 : ");
		int com = new Scanner(System.in).nextInt();
		
		System.out.print("영어 과목 점수를 입력해주세요 : ");
		int eng = new Scanner(System.in).nextInt();
		
		System.out.print("국어 과목 점수를 입력해주세요 : ");
		int kor = new Scanner(System.in).nextInt();
		
		double avg = (com + eng + kor) / 3.0;
		switch((com + eng + kor) / 30) {
		case 10: 		case 9:		case 8:		case 7:
		case 6:
			if (com > 40 && eng > 40 && kor > 40)
				System.out.printf("평균이 %.2f점으로 합격입니다.\n", avg );
			else {
					if (com <= 40) 
						System.out.println("전산 과목이 " + com +"점으로 40점을 넘지 못하였습니다.");
					if (eng <= 40)
						System.out.println("영어 과목이 " + eng +"점으로 40점을 넘지 못하였습니다.");
					if (kor <= 40)
						System.out.println("국어 과목이  " + kor +"점으로 40점을 넘지 못하였습니다.");
					System.out.printf("평균은 %.2f점입니다.\n", avg );
					System.out.println("불합격");
			}
			break;
		default:
			if (com <= 40) 
				System.out.println("전산 과목이 " + com +"점으로 40점을 넘지 못하였습니다.");
			if (eng <= 40)
				System.out.println("영어 과목이 " + eng +"점으로 40점을 넘지 못하였습니다.");
			if (kor <= 40)
				System.out.println("국어 과목이  " + kor +"점으로 40점을 넘지 못하였습니다.");
			System.out.printf("평균은 %.2f점입니다.\n", avg );
			System.out.println("불합격");
			break;
		}
	}
}
