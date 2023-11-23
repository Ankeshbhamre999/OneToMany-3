package com.web.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;

	    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch =  FetchType.EAGER)
	    private List<Course> courses = new ArrayList<>();

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(Long id, String name, List<Course> courses) {
			super();
			this.id = id;
			this.name = name;
			this.courses = courses;
		}
		
		

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Course> getCourses() {
			return courses;
		}

		public void setCourses(List<Course> courses) {
			this.courses = courses;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", courses=" + courses + "]";
		}
	    
		
	    
	}


