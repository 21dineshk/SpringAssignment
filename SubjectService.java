package com.ensemble.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ensemble.model.Subject;
import com.ensemble.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository sr;
	
	public List<Subject> getAllSubjects(){
		return sr.findAll();
	}

	public void loadSubjects(Subject s) {
		sr.save(s);
	}
	
	public Optional<Subject> getStudentsById(int subjectId) {
		return sr.findById(subjectId);
	}
	
	public void updateSubjects(Subject s,int subjectId) {
		sr.save(s);
	}
	
	public void deleteSubjects(Subject s,int subjectId) {
		sr.delete(s);
	}
}
