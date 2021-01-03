package com.ikuta.service.impl;

import java.util.List;

import com.ikuta.dao.StudentDao;
import com.ikuta.entity.Student;
import com.ikuta.service.StudentService;

public class StudentServiceImpl implements StudentService {
	// 引用类型
	private StudentDao studentDao;

	// 使用set注入，赋值
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public int addStudent(Student student) {
		int nums = studentDao.insertStudent(student);
		return nums;
	}

	@Override
	public List<Student> queryStudents() {
		List<Student> students = studentDao.selectStudents();
		return students;
	}
}
