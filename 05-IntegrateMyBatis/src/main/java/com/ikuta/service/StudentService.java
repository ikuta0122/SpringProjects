package com.ikuta.service;

import java.util.List;

import com.ikuta.entity.Student;

public interface StudentService {
	int addStudent(Student student);

	List<Student> queryStudents();
}
