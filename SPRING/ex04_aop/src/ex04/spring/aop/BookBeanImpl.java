package ex04.spring.aop;

public class BookBeanImpl implements BookBean {

	@Override
	public void testHello(String str) {
		System.out.println("public void testHello(String str) 호출됨");
	}

	@Override
	public int korHello() {
		System.out.println("public int korHello() 호출됨");
		return 100;
	}

}
