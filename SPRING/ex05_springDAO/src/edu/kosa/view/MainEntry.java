package edu.kosa.view;

import java.util.Scanner;

import edu.kosa.dao.GiftDAO;
import edu.kosa.dao.GiftDAOImpl;

public class MainEntry { // view
	public static void main(String[] args) throws Exception { // 예외처리 윙ㅁ
		
		GiftDAO dao = new GiftDAOImpl();
		Scanner sc = new Scanner(System.in);
//		GiftVO vo = new GiftVO();
		
		
		System.out.println("선택하세요. 1. insert/ 2. selectAll/ 3. select/ 4. update/ 5. delete/ 6. close");
		
		switch (sc.nextInt()) {
		case 1:
			System.out.println("insert call");
			break;
		case 2: dao.selectAll(); break;
		case 3: System.out.println("gno select call"); break;
		case 4: System.out.println("update call"); break;
		case 5: System.out.println("delete call"); break;
		
		default: System.out.println("없는 번호입니다. 1 ~ 6 선택하세요.");
		break;

		}
		
		
	}
}
