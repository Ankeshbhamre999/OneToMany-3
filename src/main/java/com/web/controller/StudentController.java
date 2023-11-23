package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Student;
import com.web.service.StudentServiceImpl;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	
	
	 	@Autowired
	    private StudentServiceImpl studentService;

	    @PostMapping("/saveStudent")
	    public Student createStudent(@RequestBody Student student) {
	        return studentService.save(student);
//	        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	    }

}
