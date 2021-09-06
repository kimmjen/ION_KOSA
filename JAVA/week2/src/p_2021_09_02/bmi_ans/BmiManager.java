package p_2021_09_02.bmi_ans;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BmiManager extends BMI {
	static HashMap<Integer, BMI> bmi = new HashMap<Integer, BMI>();
	

	public static void add() {
		bmi.put(BMI.cnt, new BMI());
		calcBMI(BMI.cnt);
		BMI.cnt++;
	}

	public static void del() {
		int i;
		while(true) {
			System.out.print("삭제를 원하시는 번호를 입력해 주세요 : ");
			i = new Scanner(System.in).nextInt();
			if(check(i)) break;
			else {
				System.out.println("없는 번호입니다.");
				continue;
			}
		}
		bmi.remove(i);
		System.out.println("삭제되었습니다.");
	}

	public static void show() {
		int i = 1;
		try {
			OutputStream os = new FileOutputStream("BMI.txt"); //상대경로
			Set set = bmi.entrySet();
			Iterator it = set.iterator();
			while(it.hasNext()) {
				Map.Entry e = (Map.Entry)it.next();
				String str = bmi.get(e.getKey()).toString()+ "\n==> " + judgment((int)(bmi.get(e.getKey()).getBmi() * 10)) + "\r\n\n";
				os.write(str.getBytes()); 
			}
			System.out.println("BMI.txt save success!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// bmi 계산
	public static void calcBMI(int i) {
		bmi.get(i).setBmi((double)bmi.get(i).getWeight() / (((double)bmi.get(i).getHeight() / 100.0) * ((double)bmi.get(i).getHeight() / 100.0)));
	}
	
	// bmi 확인
	public static boolean check(int i) {
		if(bmi.containsKey(i)) return true;
		return false;
	}
	
	// bmi 판단
	private static String judgment(int i) {
		if (185 > i) return "체중부족";
		else if (185 <= i && 229 >= i) return "정상";
		else if (230 <= i && 249 >= i) return "과체중";
		else return "과체중";
	}

}
