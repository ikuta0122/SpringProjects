package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba03.SomeService;

public class MyTest03 {
    @Test
    public void test01() {
        String config = "ba03/applicationContext.xml";
        // 获取Spring容器中的目标对象,实际上是代理对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        String res = proxy.doThird("zhangsan", 20);
        System.out.println("目标方法的执行结果  = " + res);
    }
}
