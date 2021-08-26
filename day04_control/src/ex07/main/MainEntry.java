package ex07.main;

public class MainEntry {
public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("Using error: 데이터를 입력하세요.");
			return;
		}
		
		int su1 = Integer.parseInt(args[0]);
		int su2 = Integer.parseInt(args[1]);
			
		System.out.println("plus is : " + (su1 + su2));

	}
}
