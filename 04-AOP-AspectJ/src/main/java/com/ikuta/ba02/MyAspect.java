package com.ikuta.ba02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    @AfterReturning(
            value = "execution(public String *..SomeServiceImpl.doOther(..))",
            returning = "res"
    )
    public void myAfterReturning(Object res) {
        System.out.println("后置通知,在目标方法执行之后获取返回值:" + res);
    }
}
