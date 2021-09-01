package ex06.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
// 중복 허용, 순서대로
public class VertorEx01 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("length        /        capacity");
		System.out.println(v.size() + "             /             " + v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>(3, 4); // 3, 4 초기용량/ 증가용량
		v2.add(2);
		v2.add(new Integer(333));
		v2.add(2);
		v2.add(20);
		v2.add(12);
		v2.add(50);
		v2.add(89);
		
		System.out.println(v2.size() + "             /             " + v2.capacity());
		
		System.out.println("----- iterator() method -----");
		Iterator it = v2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----- get() method -----");
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		// 정렬 된 상태
		System.out.println("----- sort method -----");
		Collections.sort(v2); // 요소 순서대로 정렬
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("----- elementsAt() method -----");
		for (int i = 0; i < v2.size(); i++) {
			Integer num = v2.elementAt(i);
			System.out.println(num);
		}
		System.out.println("----- trimToSize() method -----");
		v2.trimToSize(); // capacity 조정
		System.out.println(v2.size() + "             /             " + v2.capacity());
		
	}
}
