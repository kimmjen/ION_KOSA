package homework;

import java.util.Scanner;

/*
 * 성적 처리 배열
 * */
public class Q_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = 7;
		int[][] arr = new int[n][3];
		String[] name = new String[n];
		int[] sum = new int[3];
		String[] s = {"국어", "영어", "전산"};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("\n 이름을 입력하세요 : ");
			name[i] = sc.next();
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%s 점수를 입력하세요.", s[j]);
				arr[i][j] = sc.nextInt();
				sum[i] += arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("\n%s의 성적표 *********\n", name[i]);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%s = %d점\t", s[j], arr[i][j]);
			}
			
			char c;
			switch((sum[i] / 3) / 10 ) {
			case 10:
				case 9: c = 'A'; break;
				case 8: c = 'B'; break;
				case 7: c = 'C'; break;
				case 6: c = 'D'; break;
				default: c = 'F'; break;
				
			}
			System.out.printf("\n총점: %d\t평균: %.2f\t학점: %c\n", sum[i], (double)sum[i]/3.0, c);
		}
	}
}
