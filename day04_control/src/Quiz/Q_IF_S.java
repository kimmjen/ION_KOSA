package Quiz;

import java.util.Scanner;

/*
 * 전산, 영어, 국어 입력 받아서 평균 60 점이상이고,
 * 각 과목 과락 40점 이하이면 과목 불합격
 * */
public class Q_IF_S {

	public static void main(String[] args) {
		
		int com, eng, kor;
		float avg;
		Scanner sc = new Scanner(System.in);
		
		com = sc.nextInt();
		eng = sc.nextInt();
		kor = sc.nextInt();
		
		avg = (com + eng + kor)/3;
		
		if (avg >= 60){
			if (com >= 40 && eng >= 40 && kor >= 40 ) {
				System.out.printf("평균 %.2f 점으로 합격입니다", avg);
			}
			
		}
			if (com < 40 || eng < 40 || kor < 40) {
			
				if (com <= 40) {
					System.out.println("com과목 " + com + "점으로, 불합격입니다.");
					
				} else if (eng <= 40) {
					System.out.println("eng과목 " + eng + "점으로, 불합격입니다.");
					
				} else if (kor <= 40) {
					System.out.println("kor과목 " + kor + "1점으로, 불합격입니다.");	
		}
	}
}
}

