package com.ikuta.ba08;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Pointcut(value = "execution(* *..SomeServiceImpl.doSome(..))")
    private void myPointcut() {
        //无需代码，
    }

    @Before(value = "myPointcut()")
    public void myBefore() {
        System.out.println("前置通知,目标方法执行之前执行");
    }

    @After(value = "myPointcut()")
    public void myAfter() {
        System.out.println("最终通知,总会被执行");
        // 一般做资源清除工作的。
    }

}
