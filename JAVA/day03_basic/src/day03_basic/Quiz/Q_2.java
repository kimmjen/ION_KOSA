/*과제1] 3개 정수 입력 받아서 큰 순서대로 출력하는 프로그램 작성
 x = 3
 y = 4
 z = 5

  result>
    5 > 4 > 3 
*/

package day03_basic.Quiz;

import java.util.Scanner;

public class Q_2 {
	public static void main(String[] args) {
		
		
//		int x = 0, y = 0, z = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x: ");
		int x = sc.nextInt();
		System.out.println("y: ");
		int y = sc.nextInt();
		System.out.println("z: ");
		int z = sc.nextInt();
		
		if (x > y && y > z) {
			
			System.out.println(x + " > " + y + " > " + z);
			
		} else if (y > x && x > z){
			
			System.out.println(y + " > " + x + " > " + z);
			
		} else if (z > y && y > x){
			
			System.out.println(z + " > " + y + " > " + x);
			
		} else if (x > z && y > z){
			
			System.out.println(x + " > " + z + " > " + y);
			
		} else if (y > z && z > x){
			
			System.out.println(x + " > " + z + " > " + x);
			
		} else if (z > x && x > y){
			
			System.out.println(z + " > " + x + " > " + y);
			
		}

//		result = (x < y) ? x : (y > z) ? y : z;
//		
//		System.out.println(result);

	}
}
