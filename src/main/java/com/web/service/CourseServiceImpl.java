package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Course;
import com.web.repo.CourseRepository;


@Service
public class CourseServiceImpl  implements CourseService{

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course save(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public Course save(Course course, Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
