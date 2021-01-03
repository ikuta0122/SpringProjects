package com.ikuta.ba01;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("Spring默认调用类的无参构造方法创建对象");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        System.out.println("set注入调用类的setter()方法,name = " + name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("set注入调用类的setter()方法,age = " + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
