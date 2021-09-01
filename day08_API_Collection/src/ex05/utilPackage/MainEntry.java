package ex05.utilPackage;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // system이 가지고 있는 날짜 얻어옴
		
		System.out.print(c.get(Calendar.YEAR) + " 년");
		System.out.print((c.get(Calendar.MONTH) + 1)  + " 월"); // 월은 0일부터
		System.out.print(c.get(Calendar.DATE) + " 일");
		System.out.println();
		
		System.out.println("=================================");
		System.out.println();
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.print(h + "시간 " + m + "분 " + s + "초");
		System.out.println();
		
		StringTokenizer st = new StringTokenizer("this is test");
		while(st.hasMoreTokens()) { // 다음 코ㅡㄴ(요소)가 있다면
			System.out.println(st.nextToken());
		}
		
//		StringTokenizer st2 = new StringTokenizer("")
	}
}
