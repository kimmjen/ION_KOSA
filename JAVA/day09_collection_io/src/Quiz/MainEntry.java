package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 x : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("정수 y : ");
		int y = Integer.parseInt(br.readLine());
		System.out.print("연산자 : ");
		String n = br.readLine();
		
		try {

			switch(n) {
			case "+" : 
				System.out.println(x+y);
				System.out.println("x" + " + " + " y " + " = " + (x+y));
			case "-" :
				System.out.println(x-y);
				System.out.println("x" + " - " + " y " + " = " + (x-y));
			case "*" :
				System.out.println(x*y);
				System.out.println("x" + " * " + " y " + " = " + x*y);
			case "/" :
				System.out.println(x/y);
				System.out.println("x" + " / " + " y " + " = " + x/y);
			}
		}catch (Exception e ) {
			e.printStackTrace();
		}
		
	}
}
