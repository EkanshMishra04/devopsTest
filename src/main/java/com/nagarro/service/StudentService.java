package com.nagarro.service;

import java.util.List;

import com.nagarro.dto.StudentDto;
import com.nagarro.model.Student;
import com.nagarro.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public Student saveStudentRecord(Student student) {
		return studentRepo.save(student);
	}
	
	public Student findStudentById(Integer id) {
		return studentRepo.findById(id).orElse(new Student());
	}
	
	public List<Student> findAllStudents(){
		return studentRepo.findAll();
	}
	
	public Student studentDtoToStudent(StudentDto studentdto) {
		Student student = new Student();
		student.setName(studentdto.getName());
		student.setDepartment(studentdto.getDepartment());
		student.setAddress(studentdto.getAddress());
		return student;
	}

}
