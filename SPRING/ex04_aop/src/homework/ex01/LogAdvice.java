package homework.ex01;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	public Object around(ProceedingJoinPoint point) throws Throwable {
		String str1 = "실제 실행 구현 전에 호출된 메세지";
		String str2 = "실행 후에 호출된 메세지";

		System.out.println(str1);

		Object obj = point.proceed();

		System.out.println(str2);

		return obj;
	}
}
