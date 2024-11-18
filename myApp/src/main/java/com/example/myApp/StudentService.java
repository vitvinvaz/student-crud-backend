package com.example.myApp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
	
	@Autowired
	StudentDao repo;

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Student getStudentById(int studentId) {
		// TODO Auto-generated method stub
		return repo.findById(studentId).orElse(new Student());
	}

	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}
	
	 public Student updateStudent(Student student) {
	        return repo.save(student);
	    }

	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		 repo.deleteById(studentId);
	}
	
	

}
