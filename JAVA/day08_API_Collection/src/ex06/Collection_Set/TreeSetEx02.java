package ex06.Collection_Set;

import java.util.TreeSet;

public class TreeSetEx02 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();

		int[] score = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };

		for (int i = 0; i < score.length; i++) {
			set.add(score[i]);
		}
		System.out.println(set); // 자동정려ㅑㄹ
		
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
		System.out.println("50보다 작은 값 : " + set.tailSet(new Integer(50)));
	}
}
