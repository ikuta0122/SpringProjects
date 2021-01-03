package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba04.Student;

public class MyTest04 {
    @Test
    public void test04() {
        String config = "ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent");// 从容器中获取Student对象
        System.out.println("student = " + student);
    }
}
