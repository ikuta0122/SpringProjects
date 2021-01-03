package com.ikuta;

import com.ikuta.service.SomeService;
import com.ikuta.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    /**
     * 正转方式创建对象,没有使用Spring容器
     */
    @Test
    public void test01() {
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    /**
     * 反转方式创建对象,使用Spring容器
     */
    @Test
    public void test02() {
        String config = "beans.xml";// 1.指定spring配置文件的名称
        // ApplicationContext就是表示Spring容器,通过容器获取对象
        // ClassPathXmlApplicationContext:表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);// 2.获取spring容器对象
        SomeService service = (SomeService) ac.getBean("someService1");// 3.从spring容器中获取某个对象
        service.doSome();// 4.使用spring创建的对象
    }

    /**
     * 获取spring容器中定义的对象信息
     */
    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 获取容器中定义的对象数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量 : " + nums);
        // 获取容器中定义的对象名称
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("容器中定义的对象名称 : " + name);
        }
    }

    /**
     * 获取一个非自定义的类对象
     */
    @Test
    public void test04() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date myDate = (Date) ac.getBean("myDate");
        System.out.println("Date : " + myDate);
    }
}
