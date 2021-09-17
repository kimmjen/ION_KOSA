package ex01;

public class MessageBeanImpl implements MessageBean {
	
	private String name;
	private String greeting;
	
	//1. 1. constructor 이용 <--- DI
	public MessageBeanImpl() { }
	public MessageBeanImpl(String name, String greeting) {
		this.name = name;
		this.greeting = greeting;
	}

	//2. setter method 이용 방법  <--- DI
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	@Override
	public void sayHello() {
		System.out.println(greeting + " / " + name + "!!!");
	}
	

}
