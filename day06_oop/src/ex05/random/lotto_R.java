package ex05.random;

import java.util.ArrayList;
import java.util.Scanner;

public class lotto_R {
	public static void main(String[] args) {
		
	
	int bonusNum = 0;
	int count = 0;
	boolean bonusCK = false;
	int[] userLotto = new int[6];
	int[] comLotto = new int[6];
	Scanner sc = new Scanner(System.in);
	int[] panel = new int[45];
	ArrayList<Integer> eqNumbers = new ArrayList<Integer>();
	ArrayList<Integer> eqbonusNums = new ArrayList<Integer>();
	for(int i = 0;i<panel.length;i++)
	{
		panel[i] = i + 1;
	}
	// 유저 넘버입력
	int userNum;
	for(int i = 0;i<userLotto.length;i++)
	{
		do {
			System.out.println("※※※※※로또 번호를 입력하세용. 번호는 1~45 번까지 입니다.※※※※※");
			userNum = sc.nextInt();
			if (userNum < 1 || userNum > 45) {
				System.out.println("▲▲▲▲▲1~45 범위의 로또 번호를 입력해주세요!▲▲▲▲▲\n");
			} else if (panel[userNum - 1] == -1) {
				System.out.println("▲▲▲▲▲중복된 로또 번호를 입력했습니다. 다시 입력해주세요 !▲▲▲▲▲\n");
			}
		} while ((userNum < 1 || userNum > 45) || panel[userNum - 1] == -1); // userNum 에 50 입력하면 panel[50-1] 가 실행안됨
																				// why? 논리 순서상
		userLotto[i] = userNum;
		panel[userNum - 1] = -1;
	}
	// 유저 버블정렬
	int temp;
	for(int i = 0;i<userLotto.length-1;i++)
	{
		for (int j = 0; j < userLotto.length - 1 - i; j++) {
			if (userLotto[j] > userLotto[j + 1]) {
				temp = userLotto[j];
				userLotto[j] = userLotto[j + 1];
				userLotto[j + 1] = temp;
			}
		}
	}
	// 패널 값 다시 초기화
	for(int i = 0;i<panel.length;i++)
	{
		panel[i] = i + 1;
	}
	int randomNum;
	// 컴퓨터 번호 랜덤출력
	for(int i = 0;i<comLotto.length+1;i++)
	{
		do {
			randomNum = (int) (Math.random() * 8) + 1;// 45
		} while (panel[randomNum - 1] == -1);
		if (i == comLotto.length) {
			bonusNum = randomNum;
		} else {
			comLotto[i] = randomNum;
		}
		panel[randomNum - 1] = -1;
	}
	// 버블 컴퓨터 정렬
	for(int i = 0;i<comLotto.length-1;i++)
	{
		for (int j = 0; j < comLotto.length - 1 - i; j++) {
			if (comLotto[j] > comLotto[j + 1]) {
				temp = comLotto[j];
				comLotto[j] = comLotto[j + 1];
				comLotto[j + 1] = temp;
			}
		}
	}

	// 맞는거 번호 비교
	for(int i = 0;i<userLotto.length;i++)
	{
		for (int j = 0; j < userLotto.length; j++) {
			if (comLotto[i] == userLotto[j]) {
				count++;
				break;
			}
		}
	}
	// 유저 넘버 출력
	System.out.println("==================================================");System.out.print("입력한 번호는 : ");
	for(int i = 0;i<userLotto.length;i++)
	{
		System.out.print(userLotto[i] + " ");
	}System.out.println();System.out.println("==================================================");System.out.print("당첨번호 는 : ");
	// 컴퓨터 번호출력
	for(int i = 0;i<comLotto.length;i++)
	{
		System.out.print(comLotto[i] + " ");
	}System.out.println();System.out.println("==================================================");
	// 보너스 번호출력
	System.out.println("보너스 번호 : "+bonusNum);System.out.println("==================================================");
	// 맞는거 번호출력.
	for(int i = 0;i<userLotto.length;i++)
	{
		for (int j = 0; j < userLotto.length; j++) {
			if (comLotto[i] == userLotto[j]) {
				eqNumbers.add(comLotto[i]);
			}
		}
		if (userLotto[i] == bonusNum) {
			eqbonusNums.add(bonusNum);
		}
	}System.out.println("맞은번호는 ? ");
	for(int i = 0;i<eqNumbers.size();i++)
	{
		System.out.print(eqNumbers.get(i) + " ");
	}System.out.print("\t "+eqNumbers.size()+"개 맞았습니다.\n");
	// 보너스 번호 맞춤
	for(int i = 0;i<eqbonusNums.size();i++)
	{
		System.out.print(eqbonusNums.get(i) + " ");
	}System.out.print("\t 보너스 번호 "+eqbonusNums.size()+"개 맞았습니다.\n");
	for(int i = 0;i<userLotto.length;i++)
	{
		if (bonusNum == userLotto[i]) {
			bonusCK = true;
			break;
		}
	}if(count==6)
	{
		System.out.println("축하합니다. 1등입니다. 사표 던지세요.");
	}else if(count==5&&bonusCK==true)
	{
		System.out.println("축하합니다. 2등입니다.");
	}else if(count==5&&bonusCK==false)
	{
		System.out.println("축하합니다. 3등입니다.");
	}else if(count==4)
	{
		System.out.println("축하합니다. 4등입니다.");
	}else if(count==3)
	{
		System.out.println("축하합니다. 5등입니다.");
	}else
	{
		System.out.println("꽝 다음기회에");
	}
}
}
