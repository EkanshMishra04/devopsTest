package com.nagarro.controller;

import java.util.List;

import com.nagarro.dto.StudentDto;
import com.nagarro.model.Student;
import com.nagarro.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public List<Student> findAllStudent() {
		return service.findAllStudents();
	}
	@GetMapping("/{id}")
	public Student findStudentById(@PathVariable("id") Integer id) {
		return service.findStudentById(id);
	}
	
	@PostMapping("/")
	public Student saveStudentRecord(@RequestBody StudentDto studentdto) {
		Student student = service.studentDtoToStudent(studentdto);
		return service.saveStudentRecord(student);
	}
	
	
}
