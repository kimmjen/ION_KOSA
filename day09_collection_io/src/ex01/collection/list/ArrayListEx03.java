package ex01.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx03 {
	public static void main(String[] args) {
		System.out.println("ArrayList1");
		ArrayList list = new ArrayList(10);
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(6));
		
		System.out.println();
		System.out.println("ArrayList2");
		ArrayList list2 = new ArrayList(list.subList(1, 4)); // subList 데이터 복사
		// 리스트 출력 만들기
		print(list, list2);
		
		System.out.println("데이터 정렬");
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		
		System.out.println();
		System.out.println("----containsAll 데이터 확인 boolean 타입 : T, F");
		System.out.println("list.containsAll(list2) : " + list.containsAll(list2));
		
		System.out.println();
		// 데이터 뒤에서 부터 채워짐
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 세번째요소에 A를 넣어줘
		// list : [1, 2, 3, 4, 5, 6]
//		list2 : [2, 3, 4, A, B, C]
		print(list, list2);
		
		System.out.println();
		// retains
		System.out.println("---- 데이터 확인(중복자료가 아닌 데이터는 삭제)------");
		System.out.println("list.retainAll(list2) : " + list.retainAll(list2));
		print(list, list2);
//		list : [2, 3, 4]
//				list2 : [2, 3, 4, A, B, C]
		
		System.out.println();
		System.out.println();
		for (int i = list2.size() - 1; i >= 0; i--) {
			
			if (list.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list, list2);
		
	}
	
	// 리스트 출력
	public static void print(ArrayList list, ArrayList list2) {
		// TODO Auto-generated method stub
		System.out.println("list : " + list); // list : [1, 2, 3, 4, 5, 6]
		System.out.println("list2 : " + list2); // list2 : [2, 3, 4]
	}
}
