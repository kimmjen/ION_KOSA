package ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Point { } 

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex02/di/ctx.xml");

		ScoreShow show = context.getBean("show", ScoreShowImpl.class);
		show.print();
		
		ScoreShowImpl show3 = (ScoreShowImpl)context.getBean("show");
		
		//////////////////////////////////////////////
		String flag = (show == show3 ) ? "same" : "diff";
		System.out.println(flag);
		
		///////////////////////////////////////////////////
		Point pt = new Point();
		Point pt2 = new Point();
		
		flag = (pt == pt2 ) ? "same" : "diff";
		System.out.println(flag);
		//////////////////////////////////////////////
		
		System.out.println("--------------------------------");
		
		ScoreShow show2 = context.getBean("show2", ScoreShowImpl.class);
		
		show2.input();
		show2.print();
		
		
//		if(show == show2) {
//			System.out.println("same");
//		} else {
//			System.out.println("different");
//		}
	}
}
