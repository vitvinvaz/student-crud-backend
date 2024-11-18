package com.example.myApp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
   
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudentById(@PathVariable int studentId) {
		return service.getStudentById(studentId);
				
	}
	
	@PostMapping("/students")
	public void createStudent(@RequestBody Student student) {
		 service.createStudent(student);
	}
	
	@PutMapping("/students/{studentId}")
    public void updateStudent(@RequestBody Student student) {
         service.updateStudent(student);
    }
	
	@DeleteMapping("/students/{studentId}")
	public void deleteStudent(@PathVariable int studentId) {
		 service.deleteStudent(studentId);
	}
	
	
	
	
	
}
