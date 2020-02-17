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
import com.ensemble.model.Subject;
import com.ensemble.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
    private SubjectService ss;
	
	@GetMapping("/subject")
	public List<Subject> getAllSubjetts(){
		return ss.getAllSubjects();
	}
	
	@PostMapping("/subject")
	public void loadSubjects(@RequestBody Subject s) {
		ss.loadSubjects(s);
	}
	
	@GetMapping("/subject/{subjectId}")
	public Optional<Subject> getSubjectsById(@PathVariable int subjectId) {
		return ss.getStudentsById(subjectId);
	}
	
	@PutMapping("/subject/{subjectId}")
	public void updateSubjects(@RequestBody Subject s,@PathVariable int subjectId) {
		ss.updateSubjects(s,subjectId);
	}
	
	@DeleteMapping("/subject/{subjectId}")
	public void deleteSubjects(Subject s,@PathVariable int subjectId) {
		ss.deleteSubjects(s,subjectId);
	}

}
