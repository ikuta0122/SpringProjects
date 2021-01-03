package com.ikuta.ba04;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    @AfterThrowing(
            value = "execution(* *..SomeServiceImpl.doForth(..))",
            throwing = "exception"
    )
    public void myAfterThrowing(Exception exception) {
        System.out.println("异常通知:方法发生异常时执行：" + exception.getMessage());
        // 发送邮件，短信，通知开发人员
    }
}
