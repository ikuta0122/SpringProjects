package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba07.SomeServiceImpl;

public class MyTest07 {
    @Test
    public void test01() {
        String config = "ba07/applicationContext.xml";
        // 获取Spring容器中的目标对象,实际上是代理对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 代理对象调用业务方法
        SomeServiceImpl proxy = (SomeServiceImpl) ac.getBean("someService");
        proxy.doSome();
        System.out.println("proxy :" + proxy.getClass().getName());
        // proxy :com.ikuta.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$d225d787
    }
}
