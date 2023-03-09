package com.nagarro.controller;

import com.nagarro.model.Student;
import com.nagarro.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public Student findAllStudent() {
		return service.findAllStudents();
	}
	
	
}
