package com.cjc.main.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired StudentService se;
	@postMapping("/saveStudentData)
	public ResponseEntity<Student> onSaveData(Student int id)
	{
            
	Student	stud=se.onSaveStudentData(id);
		Return new ResponseEntity<Student>(stud,HttpStatus.Created);
			
	}

		

	

}
