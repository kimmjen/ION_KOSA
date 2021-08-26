package Quiz;

import java.util.Scanner;

/*
 * 전산, 영어, 국어 입력 받아서 평균 60 점이상이고,
 * 각 과목 과락 40점 이하이면 과목 불합격
 * */
public class Q_IF2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("전산 , 영어 , 국어 점수를 입력해주세요 ! ");
		
		System.out.println("전산점수는 ?" );
		int x = sc.nextInt();
		System.out.println("영어점수는 ?" );
		int y = sc.nextInt();
		System.out.println("국어점수는 ?" );
		int z = sc.nextInt();
		
		int avg = (x+y+z)/3;
		
		if(avg >= 60 && (x>40 && y>40 && z>40) )
		{
			System.out.println("합격 ㅅㄱ ");
		}	
		else {
			System.out.println("ㅈㅅ불합격");
		}
		
		if(avg >= 60 && (x<=40||y<=40||z<=40)){
			System.out.println( "40점못넘겨서 과락뜸");
		}
		
		
	}

}
