package home;

import java.util.Scanner;

/*
 * 전산, 영어, 국어 입력 받아서 평균 60점 이상 합격,
 * 각 과목 과락 40점 이하이면 과목 불합격
 * */
public class Quiz_IF {

	public static void main(String[] args) {
		System.out.print("전산 과목 점수를 입력해주세요 : ");
		int com = new Scanner(System.in).nextInt();
		
		System.out.print("영어 과목 점수를 입력해주세요 : ");
		int eng = new Scanner(System.in).nextInt();
		
		System.out.print("국어 과목 점수를 입력해주세요 : ");
		int kor = new Scanner(System.in).nextInt();
		
		double avg = (com + eng + kor) / 3.0;
		if (avg >= 60 && (com > 40 && eng > 40 && kor > 40))
				System.out.println("합격");
		else {
			if (com <= 40 || eng <= 40 || kor <= 40) {
				if (com <= 40) 
					System.out.println("전산 과목이 " + com +"점으로 40점을 넘지 못하였습니다.");
				if (eng <= 40)
					System.out.println("영어 과목이 " + eng +"점으로 40점을 넘지 못하였습니다.");
				if (kor <= 40)
					System.out.println("국어 과목이  " + kor +"점으로 40점을 넘지 못하였습니다.");
			}
			else {
				System.out.printf("평균이 %.2f점으로 60점을 넘지 못하였습니다.\n", avg );
			}
			System.out.println("불합격");
		}
	}
}