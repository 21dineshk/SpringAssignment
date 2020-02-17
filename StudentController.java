package com.ensemble.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ensemble.model.Student;
import com.ensemble.service.StudentService;



@RestController
public class StudentController {
	
	@Autowired
    private StudentService ss;
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return ss.getAllStudents();
	}
	
	@PostMapping("/student")
	public void loadStudents(@RequestBody Student s) {
		ss.loadStudents(s);
	}
	
	@GetMapping("/student/{studentId}")
	public Optional<Student> getStudentsById(@PathVariable int studentId) {
		return ss.getStudentsById(studentId);
	}
	
	@PutMapping("/student/{studentId}")
	public void updateStudents(@RequestBody Student s,@PathVariable int studentId) {
		ss.updateStudents(s,studentId);
	}
	
	@DeleteMapping("/student/{studentId}")
	public void deleteStudents(Student s,@PathVariable int studentId) {
		ss.deleteStudents(s,studentId);
	}

}
