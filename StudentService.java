package com.ensemble.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ensemble.model.Student;
import com.ensemble.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository sr;
	
	public List<Student> getAllStudents(){
		return sr.findAll();
	}

	public void loadStudents(Student s) {
		sr.save(s);
	}
	
	public Optional<Student> getStudentsById(int studentId) {
		return sr.findById(studentId);
	}
	
	public void updateStudents(Student s,int studentId) {
		sr.save(s);
	}
	
	public void deleteStudents(Student s,int studentId) {
		sr.delete(s);
	}
}
