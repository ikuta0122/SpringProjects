package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba01.SomeService;

public class MyTest01 {
    @Test
    public void test01() {
        String config = "ba01/applicationContext.xml";
        // 获取Spring容器中的目标对象,实际上是代理对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        proxy.doSome("zhangsan", 20);
    }
}
