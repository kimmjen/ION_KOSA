package Quiz;

import java.util.Scanner;

/*
 * 전산, 영어, 국어 입력 받아서 평균 60 점이상이고,
 * 각 과목 과락 40점 이하이면 과목 불합격
 * */
public class Q_IF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전산 : ");
		int x = sc.nextInt();
		
		System.out.println("영어 : ");
		int y = sc.nextInt();
		
		System.out.println("국어 : ");
		int z = sc.nextInt();
		
//		int avg = (x+y+z)/3;
		double avg = (x+y+z)/3.0;
		
	
		if (avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
			if ((x<= 40) && (y <= 40) && (z <= 40)) {
				System.out.println("과락 과목 : " + "전산 :" + x + "영어 :" + y + "국어 :" + z);
			}
		}
	}
	
}
