package com.ikuta.ba01;

import org.springframework.stereotype.Component;

@Component(value = "myStudent")
public class Student {
    private String name;
    private Integer age;

    public Student() {
        super();
    }

    public Student(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
