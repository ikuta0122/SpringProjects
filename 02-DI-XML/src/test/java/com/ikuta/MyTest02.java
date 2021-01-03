package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba02.Student;

public class MyTest02 {
	@Test
	public void test02() {
		String config = "ba02/applicationContext.xml";
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		// 从容器中获取Student对象
		Student student = (Student) ac.getBean("myStudent");
		System.out.println("student = " + student);
	}

}
