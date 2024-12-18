package com.tt.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tt.student.model.Student;
import com.tt.student.repo.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/create")
	private Student saveStudent(@RequestBody Student student) {
		return repo.save(student);
	}
	
	@GetMapping("/fetchAll")
	private List<Student> getAllStudents(){
		return repo.findAll();

	}

}
