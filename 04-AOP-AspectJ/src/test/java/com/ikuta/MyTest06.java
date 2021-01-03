package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba06.SomeService;

public class MyTest06 {
	@Test
	public void test01() {
		String config = "ba06/applicationContext.xml";
		// 获取Spring容器中的目标对象,实际上是代理对象
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		// 代理对象调用业务方法
		SomeService proxy = (SomeService) ac.getBean("someService");
		proxy.doFifth();
	}
}
