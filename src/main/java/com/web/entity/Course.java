package com.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Course {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String courseName;

	    @ManyToOne
	    @JoinColumn(name = "Student_Id") 
	    private Student student;

		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Course(Long id, String courseName, Student student) {
			super();
			this.id = id;
			this.courseName = courseName;
			this.student = student;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		@Override
		public String toString() {
			return "Course [id=" + id + ", courseName=" + courseName + ", student=" + student + "]";
		}

	    
}
