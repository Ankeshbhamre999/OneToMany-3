package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
