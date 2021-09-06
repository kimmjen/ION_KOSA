package ex05.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		BufferedReader br2 = new BufferedReader(new InputStreamReader(is));
		
		System.out.println("character input = ");
		String str = br.readLine(); // 예외 발생, 여러개 데이터 입력 받기
		int su = Integer.parseInt(str);
		int su1 = Integer.parseInt(br.readLine());
		int su2 = Integer.parseInt(br.readLine());
		
		int su3 = Integer.parseInt(br2.readLine());
		int su4 = Integer.parseInt(br2.readLine());
		
		System.out.println(str);
		System.out.println(su + 100);
		System.out.println(su1 + su2);
		
		System.out.println(su3 + su4);
	}
}
