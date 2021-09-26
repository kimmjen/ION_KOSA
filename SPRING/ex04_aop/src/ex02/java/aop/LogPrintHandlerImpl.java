package ex02.java.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements InvocationHandler {
	
	private Object target;
	
	// 생성자 함수
	public LogPrintHandlerImpl(Object target) {

		this.target = target;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("------------invoke method start------------");
		
		Log log = LogFactory.getLog(getClass());
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		log.info("[타이머시작]");
		// 주 관심사
		int result = (int)method.invoke(target, args);
		//////////
		
		log.info("[타이머 정지]");
		sw.stop();
		
		log.info("[TIME LOG] method : " + method.getName());
		log.info("[TIME LOG] Process Time : " + sw.getTotalTimeMillis());
		
		
		return result;
	}

}
