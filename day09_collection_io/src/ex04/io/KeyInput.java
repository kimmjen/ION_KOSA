package ex04.io;

import java.io.IOException;

public class KeyInput {
	public static void main(String[] args) 
			throws IOException { // 예외 처리 위임
		
		int su1 = 0, su2 = 0;
		System.out.println("데이터 입력 끝은 Crtl + Z 누르세요.");
		
		while((su1 = System.in.read()) != -1) {
			System.out.print((char) su1 + "\t");
		}
		System.out.println();
	}
}
