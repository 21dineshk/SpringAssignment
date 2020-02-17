package com.ensemble.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="student_name")
	private String studentName;
	@Column(name="standard")
	private int standard;
	@Column(name="age")
	private int age;
	@Column(name="student_rank")
	private int rank;
	@OneToMany(mappedBy="students")
	private List<StuSubMapping> stusubmapping;

	public int getStudentId() {
		return id;
	}

	public void setStudentId(int studentId) {
		this.id = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<StuSubMapping> getStusubmapping() {
		return stusubmapping;
	}

	public void setStusubmapping(List<StuSubMapping> stusubmapping) {
		this.stusubmapping = stusubmapping;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + id + ", studentName=" + studentName + ", standard=" + standard + ", age="
				+ age + ", rank=" + rank + "]";
	}

}
