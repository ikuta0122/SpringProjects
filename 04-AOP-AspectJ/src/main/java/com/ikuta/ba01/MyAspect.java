package com.ikuta.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
    //	@Before(value = "execution(void com.ikuta.ba01.SomeServiceImpl.doSome(String,Integer))")
	//	@Before(value = "execution(void *..SomeServiceImpl.doSome(String,Integer))")
	//	@Before(value = "execution(void *..SomeServiceImpl.doSome(..))")
	//	@Before(value = "execution(void *..SomeServiceImpl.do*(..))")
	//	@Before(value = "execution(void do*(..))")
    @Before(value = "execution(public void com.ikuta.ba01.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(JoinPoint joinpoint) {
        // 获取方法签名
        System.out.println("方法签名 = " + joinpoint.getSignature());
        // 获取方法名称
        System.out.println("方法名称 = " + joinpoint.getSignature().getName());
        // 获取方法实参
        Object[] args = joinpoint.getArgs();
        for (Object arg : args) {
            System.out.println("方法实参 = " + arg);
        }
        // 实现增强功能的要求
        System.out.println("前置通知,在执行目标方法之前输出执行时间: " + new Date());
    }
}
