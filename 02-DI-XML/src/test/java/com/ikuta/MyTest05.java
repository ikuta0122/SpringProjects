package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba05.Student;

public class MyTest05 {
	@Test
	public void test05() {
		String config = "ba05/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		// 从容器中获取Student对象
		Student student = (Student) ac.getBean("myStudent");
		System.out.println("student = " + student);
	}
}
