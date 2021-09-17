package ex03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		
		Cats catsInfo = ctx.getBean("catsInfo", Cats.class);
		catsInfo.catsInfoPrint();
		
		MyCats cat2 = ctx.getBean("cat2", MyCats.class);
		catsInfo.setMyCats(cat2);
		catsInfo.catsInfoPrint();
		
		MyCats cat1 = ctx.getBean("cat1", MyCats.class);
		catsInfo.setMyCats(cat1);
		catsInfo.catsInfoPrint();
		
//		Cats cat3 = ctx.getBean("cat3", Cats.class);
//		catsInfo.catsInfoPrint();
		
		// xml 설정 파일을 이용한 방법
		String configcontext = "classpath:ex03/AppContent.xml";
		// 추상클래스, 충돌 방지하기 위해 이름이 같을 경우
		AbstractApplicationContext context = new GenericXmlApplicationContext(configcontext);
		
		// bean 가져오는애 - getBean 메소드
		// 직접 객체를 생성 하는 것이 아니라, 생성되어 있는 객체를 외부에서 얻어옴
		MyCats myCats = context.getBean("cat3", MyCats.class);
		Cats cats = context.getBean("cats", Cats.class);
		
		cats.setMyCats(myCats);
		cats.catsInfoPrint();
		
		context.close();
		
	}
}
