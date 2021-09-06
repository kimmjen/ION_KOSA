package ex03.Switch;

import java.util.Scanner;

/*
 * */
public class SwitchEx02 {

	public static void main(String[] args) {
		System.out.println("학점 : ");
		int score = new Scanner(System.in).nextInt();
		char grade = ' ';

//		switch (score) {
//		case 100:
//			grade = 'A';
//			break;
//
//		case 90:
//			grade = 'B';
//			break;
//
//		case 80:
//			grade = 'C';
//			break;
//
//		case 70:
//			grade = 'D';
//			break;
//		case 60:
//			grade = 'E';
//			break;
//
//		default:
//			grade = 'F';
//			break;
		switch (score / 10) {
		case 10:	
		case 9:	grade = 'A'; break;
		case 8:	grade = 'B'; break;
		case 7:	grade = 'C'; break;
		case 6:	grade = 'D'; break;
		

		default:
			grade = 'F';
			break;
		} // switch end
		System.out.println("\n\n 점수는 : " + score + " 점" + " 학점은 : " + grade);
	}

}
