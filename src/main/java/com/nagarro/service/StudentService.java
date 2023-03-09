package com.nagarro.service;

import com.nagarro.model.Student;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	
	public Student findAllStudents() {
		return new Student(1,"xyz-5-tyu","D-002","Shubham Mishra");
	}

}
