package com.ikuta.ba06;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "myStudent")
public class Student {
    @Value(value = "张飞")
    private String name;

    @Value(value = "29")
    private Integer age;


    @Resource//@Resource默认byName,如果byName赋值失败则使用byType赋值
    private School school;

    public void setSchool(School school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
    }

}
