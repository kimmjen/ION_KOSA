// ApplicationContext = App
package ex03;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // spring 설정에 사용되는 클래스임을 명시 <--- ctx.xml
public class App { 
	
	@Bean // @Bean으로 생성 // 객체() 생성어노테이션으로 했음
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("잠자기");
		hobbys.add("꾹꾹이");
		
		MyCats myCats = new MyCats("쿠키", 13, hobbys); // 생성자
		myCats.setWeight(15.3);
		myCats.setColor("brown");
		
		return myCats;
	}

	@Bean
	public MyCats cat2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("잠자기");
		hobbys.add("꾹꾹이");
		
		MyCats myCats = new MyCats("냥", 18, hobbys); // 생성자
		myCats.setWeight(13.3);
		myCats.setColor("black");
		
		return myCats;
	}
	
	@Bean
	public Cats catsInfo() {
		Cats cats = new Cats(this.cat1());
		
		return cats;
	}
	
	

}
