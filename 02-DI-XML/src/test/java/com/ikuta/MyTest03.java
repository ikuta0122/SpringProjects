package com.ikuta;

import com.ikuta.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {
	@Test
	public void test03() {
		String config = "ba03/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		// 从容器中获取Student对象
		Student student1 = (Student) ac.getBean("myStudent1");
		System.out.println("student = " + student1);
		Student student2 = (Student) ac.getBean("myStudent2");
		System.out.println("student = " + student2);
		Student student3 = (Student) ac.getBean("myStudent3");
		System.out.println("student = " + student3);
		File myFile = (File) ac.getBean("myFile");
		System.out.println("myFile = " + myFile.getName());
	}

}
