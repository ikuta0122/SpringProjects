package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba01.Student;

public class MyTest01 {
	@Test
	public void test01() {
		String config = "applicationContext01.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Student student = (Student) ac.getBean("myStudent");
		System.out.println("student = " + student);
	}
}
