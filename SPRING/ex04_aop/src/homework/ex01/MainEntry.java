package homework.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("homework/ex01/ctx.xml");
		Student student = context.getBean("student", Student.class);
		Worker worker = context.getBean("worker", Worker.class);

		student.show();
		System.out.println("-------------");
		worker.show();
	}
}
