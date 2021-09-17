package ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				 new String[] {"ex01/di/ctx.xml", "ex01/di/applicationCtx.xml", "ex01/di/appContext.xml"});

		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ex01/di/ctx.xml");
		
//		MessageBeanImpl bean = (MessageBeanImpl)context.getBean("messageBeanImpl");
		MessageBean bean = context.getBean("messageBeanImpl", MessageBeanImpl.class);
		bean.sayHello();
		
		MessageBean bean2 = context.getBean("message", MessageBeanImpl.class);
		bean2.sayHello();
	}
}






