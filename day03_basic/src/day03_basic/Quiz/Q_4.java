/*다음을 입력 받아서 출력하는 프로그램 작성
  이름, 국어, 영어, 전산 점수 입력 받아서
  총점, 평균 까지 출력하는

 result>
  이도연님의 성적표 *****
  국어 : 100, 영어: 100, 전산 : 100
  총점 : 300, 평균: 100.00 
*/
package day03_basic.Quiz;


import java.util.Scanner;

public class Q_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이도연님의 성적표 *****");
		int x = sc.nextInt();
		int y = sc.nextInt();		
		int z = sc.nextInt();
		
		System.out.println("국어: " + x + ", " + "영어: " + y + ", " + "전산: " + z);
		
//		System.out.println("영어: ");
//		
//		System.out.println("전산: ");
		
		
		double div = (x+y+z)/3;
		System.out.println( "총점 : " + (x+y+z) + ", " + "평균 : " + div);
	}

}
