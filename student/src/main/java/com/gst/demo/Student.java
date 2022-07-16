package com.gst.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Student {
	
	@Autowired
	public StudentModelClass stud;

	@GetMapping("/test")
	public String test() {
		stud.setStudentId("12341243");
		
		//StudentModelClass stud = new Stud
		
		return stud.getStudentId();
	}
}
