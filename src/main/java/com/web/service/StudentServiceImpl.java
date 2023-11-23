package com.web.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Student;
import com.web.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	  @Autowired
	    private StudentRepository studentRepository;

	@Override
	 @Transactional
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}
