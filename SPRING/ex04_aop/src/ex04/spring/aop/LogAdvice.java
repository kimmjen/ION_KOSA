package ex04.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// XML 기반 POJO 방식의 AspectJ를 이용한 AOP 방법
public class LogAdvice {
	/*Around 방식의 사전/사후 처리 AOP around 방식으로 할때는
	인수는 ProceedingJoinPoint, 리턴 - Object 필수 */
	
	public Object arround(ProceedingJoinPoint point) throws Throwable { // 예외처리 위임
		
		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();
		
		System.out.println("[LOG ] methodName = " + methodName 
				+ ", methodName2 = " + methodName2 + " 호출 되기 전,...." );
		
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		Object result = point.proceed();  // 실제 타켓 대상 메소드가 호출 되는 부분
		
		sw.stop();
		System.out.println("[LOG ] " + methodName + " 호출 완료 되었습니다.");
		System.out.println("[LOG ] 실행 시간 : "+ sw.getTotalTimeMillis()/100 + " 초");
		
		return result;
	}
	
}









