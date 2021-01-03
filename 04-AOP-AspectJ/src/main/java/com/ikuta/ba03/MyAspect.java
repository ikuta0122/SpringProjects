package com.ikuta.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
	@Around(value = "execution(* *..SomeServiceImpl.doThird(..))")
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
		Object result;
		// 1.在目标方法之前加入功能
		System.out.println("环绕通知,在目标方法执行之前输出时间" + new Date());
		// 2.目标方法调用
		result = pjp.proceed();
		// 3.在目标方法之前加入功能
		System.out.println("环绕通知,在目标方法执行之后提交事务");
		// 4.修改目标方法的执行结果
		if (result != null) {
			result = "Hello World";
		}
		// 5.返回目标方法的执行结果
		return result;
	}
}
