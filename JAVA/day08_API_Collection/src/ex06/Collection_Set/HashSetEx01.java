package ex06.Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

// set 순서없고, 중복 허용하지 않음
public class HashSetEx01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		// 5개
//		hs.add("키보드1");
//		hs.add("키보드2");
//		hs.add("키보드3");
//		hs.add("키보드4");
//		hs.add("키보드5");
		
		// 4개
		hs.add("키보드1");
		hs.add("키보드2");
		hs.add("키보드3");
		hs.add("키보드4");
		hs.add("키보드1");
		
		System.out.println("요소 개수 : " + hs.size());
		
		Iterator it = hs.iterator();
		while (it.hasNext()) { // 순서 없음
			System.out.println(it.next());
		}
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(100);
		hs2.add(200);
		hs2.add(300);
		hs2.add(400);
//		hs2.add(500);
		hs2.add(new Integer(1000));
		
		it = hs2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------------------");
		for (Integer item : hs2) {
			System.out.println(item);
		}
		System.out.println(hs);
		
		
	}
}
