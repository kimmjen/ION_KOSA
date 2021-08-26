package Quiz;

import java.util.Scanner;

/*
 * 전산, 영어, 국어 입력 받아서 평균 60 점이상이고,
 * 각 과목 과락 40점 이하이면 과목 불합격
 * */
public class Q_IF3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] sub= {"전산", "영어", "국어"};
		int[] score = new int[3];
		int sum =0;
		for(int i=0;i<3;i++) {
			System.out.println(sub[i]+" 점수를 입력하세요 : ");
			score[i] = input.nextInt();
			sum += score[i];
		}
		Boolean visit=false;
		for(int i=0;i<3;i++) {
			if(score[i]<40) {
				System.out.println(sub[i]+"과목이 40점 이하라서 과락입니다.");
				visit=true;
			}
		}
		if(!visit) {
			if(sum < 180) System.out.println("과목평균 : " + sum/3 + "으로 60점이하라서 과락입니다.");
			else System.out.println("합격입니다.");
		}
		
	}

}

