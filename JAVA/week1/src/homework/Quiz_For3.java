package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 성적처리
 * */
public class Quiz_For3 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		String[] re = { "국어", "영어", "전산"};
		int[] s = new int[3];
		String name;
		
		char c = 'y';
		
		while(c == 'y') {
			System.out.print("\n이름을 입력하시오 : ");
			name = sc.next();
			try {
				for(int i = 0; i < 3; i++) {
					System.out.printf("%s 점수를 입력하시오 (0 ~ 100): ", re[i]);
					s[i] = sc.nextInt();
					if(s[i] < 0 || s[i] > 100) {
						System.out.println("0 ~ 100 사이의 값으로 다시 입력해 주세요 : ");
						s[i] = sc.nextInt();
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.");
				e.printStackTrace();
				return;
				
			} catch(Exception e) {
				e.printStackTrace();
				return;
			}
				
			System.out.printf("\n%s님의 성적표 ******\n", name);
			System.out.printf("국어 : %d, 전산 : %d, 영어 : %d\n", s[0], s[1], s[2]);
				
			int sum = s[0] + s[1] + s[2];
			double avg = (double)sum / 3.0;
			char a;
				
			switch((int)avg / 10) {
			case 10:
			case 9: a = 'A'; break;
			case 8: a = 'B'; break;
			case 7: a = 'C'; break;
			case 6: a = 'D'; break;
			default: a = 'F'; break;
			}
				
			System.out.printf("총점 : %d 평균 : %.2f 평점(학점) : %c\n", sum, avg, a);
			
			System.out.print("계속 하시겠습니까? (y/n) ");
			c = sc.next().charAt(0);
		}
	}
}
/*
 * Scanner sc = new Scanner(System.in);
 * 
 * String[] sub = { "국어", "영어", "전산" }; int[] s = new int[3]; String name;
 * 
 * char c = ' ';
 * 
 * while (c == 'y') { System.out.println("\n이름 입력 : "); name = sc.next(); try {
 * for (int i = 0; i < 3; i++) { System.out.printf("%s 점수를 입력하세요 (0 ~ 100): ",
 * sub[i]); s[i] = sc.nextInt(); if (s[i] < 0 || s[i] > 100) {
 * System.out.println("0 ~ 100 사이의 값으로 입력 하세요 : "); s[i] = sc.nextInt(); } } }
 * catch (InputMismatchException e) { System.out.println("잘못 입력했어요.");
 * e.printStackTrace(); return; } catch (Exception e) { e.printStackTrace();
 * return; } System.out.printf("\n%s 님의 성적표 *******\n", name);
 * System.out.printf("국어: %d, 영어: %d, 영어: %d\n", s[0], s[1], s[2]);
 * 
 * int sum = s[0] + s[1] + s[2]; double avg = (double) sum / 3.0; char a; switch
 * ((int) avg / 10) { case 10: case 9: a = 'A'; break; case 8: a = 'B'; break;
 * case 7: a = 'C'; break; case 6: a = 'D'; break; default: a = 'F'; break; }
 * System.out.printf("총점: %d, 평균: %.2f, 평균(학점): %c\n", sum, avg, a);
 * 
 * System.out.print("계속 하시겠어요? (y/n"); c = sc.next().charAt(0);
 * 
 * } } }
 */
/*
 * Scanner sc = new Scanner(System.in);
 * 
 * String[] re = { "국어", "영어", "전산"}; int[] s = new int[3]; String name;
 * 
 * char c = 'y';
 * 
 * while(c == 'y') { System.out.print("\n이름을 입력하시오 : "); name = sc.next(); try {
 * for(int i = 0; i < 3; i++) { System.out.printf("%s 점수를 입력하시오 (0 ~ 100): ",
 * re[i]); s[i] = sc.nextInt(); if(s[i] < 0 || s[i] > 100) {
 * System.out.println("0 ~ 100 사이의 값으로 다시 입력해 주세요 : "); s[i] = sc.nextInt(); } }
 * } catch (InputMismatchException e) { System.out.println("잘못 입력하셨습니다.");
 * e.printStackTrace(); return;
 * 
 * } catch(Exception e) { e.printStackTrace(); return; }
 * 
 * System.out.printf("\n%s님의 성적표 ******\n", name);
 * System.out.printf("국어 : %d, 전산 : %d, 영어 : %d\n", s[0], s[1], s[2]);
 * 
 * int sum = s[0] + s[1] + s[2]; double avg = (double)sum / 3.0; char a;
 * 
 * switch((int)avg / 10) { case 10: case 9: a = 'A'; break; case 8: a = 'B';
 * break; case 7: a = 'C'; break; case 6: a = 'D'; break; default: a = 'F';
 * break; }
 * 
 * System.out.printf("총점 : %d 평균 : %.2f 평점(학점) : %c\n", sum, avg, a);
 * 
 * System.out.print("계속 하시겠습니까? (y/n) "); c = sc.next().charAt(0); } } }
 */
