package com.ensemble.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="Student_Subject_Mapping")
public class StuSubMapping {
	
	@Id
	private int id;
	
	@ManyToOne
	//@JoinColumn(name="studentId")
	private Student students;
	
	@ManyToOne
	//@JoinColumn(name="subjectId")
	private Subject subjects;
	
	@JsonFormat(pattern="dd-mm-yyyy",shape=Shape.STRING)
	@Column(name="date")
	private String modificationDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public Subject getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}

	public String getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(String modificationDate) {
		this.modificationDate = modificationDate;
	}

	@Override
	public String toString() {
		return "StuSubMapping [id=" + id + ", students=" + students + ", subjects=" + subjects + ", modificationDate="
				+ modificationDate + "]";
	}
	
	
	
	

}
