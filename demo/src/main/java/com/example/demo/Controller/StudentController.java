package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Student;
import com.example.demo.services.Studentservices;

@RestController

@CrossOrigin
public class StudentController {
	
	@Autowired
	private Studentservices studentservices;
	
	
	@PostMapping("/Student")
	
	public Student addStudent(@RequestBody Student student) {
		return this.studentservices.addStudent(student);
	}
		
	@GetMapping("/students")
	
		public List<Student> getStudents() {
		System.out.println("hhhhhh");
		return this.studentservices.getStudents();
		
	}
	
	
}




