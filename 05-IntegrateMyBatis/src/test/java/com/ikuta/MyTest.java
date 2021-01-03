package com.ikuta;

import com.ikuta.entity.Student;
import com.ikuta.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void testInsertStudent() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        // 获取spring容器中的service对象
        StudentService service = (StudentService) ctx.getBean("studentService");
        Student student = new Student();
        student.setId(1018);
        student.setName("王杰");
        student.setEmail("zhoufeng@qq.com");
        student.setAge(20);
        int nums = service.addStudent(student);
        // spring和mybatis整合在一起使用，事务是自动提交的
        // 无需执行SqlSession.commit()
        System.out.println("nums=" + nums);
    }

    @Test
    public void testSelectStudents() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        // 获取spring容器中的service对象
        StudentService service = (StudentService) ctx.getBean("studentService");
        List<Student> students = service.queryStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
