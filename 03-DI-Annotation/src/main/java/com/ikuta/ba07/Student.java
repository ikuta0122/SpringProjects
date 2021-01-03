package com.ikuta.ba07;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myStudent")
public class Student {
	@Value(value = "${stuname}")
	private String name;

	@Value(value = "${stuage}")
	private Integer age;

	//@Resource只使用byName的方式,如果byName赋值失败则程序报错并终止执行
	@Resource(name = "mySchool")
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
