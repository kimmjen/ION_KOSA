package ex04.io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in; // 표준입력
		System.out.println("단일 문자 입력 요망 : ");
		try {
//			int num = is.read(); //  예외 발생, '0' ~'9' : 48 ~ 57, 'A' : 65
			int num = is.read() - 48; //  예외 발생, '0' ~'9' : 48 ~ 57, 'A' : 65
			
			// enter 값, 문제 발생 처리 - 자바에서 '문자' 2바이트 처리
			is.read();	is.read();
			
			int num2 = is.read() -48; //  예외 발생, '0' ~'9' : 48 ~ 57, 'A' : 65
//			System.out.println((char)A); // 문자
//			System.out.print(num);
			System.out.println(num + num2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

