package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Course;
import com.web.service.CourseServiceImpl;


@RestController
@RequestMapping("/course")
public class CourseController {
	
	
	@Autowired
	private CourseServiceImpl service;
	
	@PostMapping("/saveCourse")
	public Course createCourse(@RequestBody Course course ,@PathVariable Long id )
	{
		
		return service.
		
//		
//		return new ResponseEntity<>(saveCourse, HttpStatus.OK); 
//	}
	}
	
}
