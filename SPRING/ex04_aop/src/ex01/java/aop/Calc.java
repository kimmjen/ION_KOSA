package ex01.java.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Calc {
	// 주관심사 : 계산(add, mul)
	// 보조 관심사 : 계산이 걸린 시간 (add, mul 실행 시간)
	//			: add 시작되고 계산이 끝나는 시점까지 걸린 시간
	//			: 보조 관심사 결과로 로그를 출력
	
	public int add(int x, int y) {
		
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		
		log.info("[타이머 시작]");
		
		// 실제 작업
		int result = x + y; // 주관심사
		
		sw.stop();
		log.info("[타이머정지]");
		log.info("[Time log] mthod : add");
		log.info("[Time log] Process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}
	
public int mul(int x, int y) {
		
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		
		log.info("[타이머 시작]");
		
		// 실제 작업
		int result = x * y; // 주관심사
		
		sw.stop();
		log.info("[타이머정지]");
		log.info("[Time log] mthod : add");
		log.info("[Time log] Process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}

}
