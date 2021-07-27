package com.learn.security.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/student")
public class StudentController {

	   private static final List<Student> STUDENTS = Arrays.asList(
			      new Student("Saeed ahmed", "sheikh"),
			      new Student("Waqar ali", "soomro"),
			      new Student("Majid ali", "joyo")
			   );
	   
	   
	   @GetMapping
	   public ResponseEntity<List<Student>> findAllStudents(){
		      return ResponseEntity.ok(STUDENTS);
	   }
	   

}
