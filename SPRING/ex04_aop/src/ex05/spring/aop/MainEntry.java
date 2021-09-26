package ex05.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "ex05/spring/aop/appCtx.xml";
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(config);
		
		
		Print stu = context.getBean("student", Print.class);
		stu.show();
		
		Print epl = context.getBean("e", Print.class);
		epl.show();

	}
}
