package com.ikuta;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ikuta.ba06.Student;

public class MyTest06 {
    @Test
    public void test06() {
        String config = "ba06/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器中获取Student对象
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student = " + student);
    }
}
