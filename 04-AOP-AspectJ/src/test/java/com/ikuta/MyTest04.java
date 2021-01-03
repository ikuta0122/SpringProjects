package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba04.SomeService;

public class MyTest04 {
    @Test
    public void test01() {
        String config = "ba04/applicationContext.xml";
        // 获取Spring容器中的目标对象,实际上是代理对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 代理对象调用业务方法
        SomeService proxy = (SomeService) ac.getBean("someService");
        proxy.doForth();
    }
}
