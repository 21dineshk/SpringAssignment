package com.ensemble.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Subject {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="subject_name")
	private String subjectName;
	@Column(name="credit")
	private int credit;
	@OneToMany(mappedBy="subjects")
	private List<StuSubMapping> stusubmapping;
	
	public int getSubjectId() {
		return id;
	}
	public void setSubjectId(int subjectId) {
		this.id = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public List<StuSubMapping> getStusubmapping() {
		return stusubmapping;
	}
	public void setStusubmapping(List<StuSubMapping> stusubmapping) {
		this.stusubmapping = stusubmapping;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + id + ", subjectName=" + subjectName + ", credit=" + credit + "]";
	}
	
	
}
