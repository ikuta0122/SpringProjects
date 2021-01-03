package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba01.Student;

public class MyTest01 {
	@Test
	public void test01() {
		String config = "ba01/applicationContext.xml";
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		// 从容器中获取Student对象
		Student student = (Student) ac.getBean("myStudent");
		System.out.println("student = " + student);
	}

}
