package ex01.collection.map;

import java.util.Set;
import java.util.TreeSet;

public class HashSetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		// List list = new LinkedList(set); // LinkedList(Collection c)
		// Collections.sort(list); // Collections.sort(List list)
		System.out.println(set);
	}
}