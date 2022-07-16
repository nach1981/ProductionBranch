package com.gst.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

	@Autowired
	public StudentModelClass stud;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
				
	
		
	}
	
	public void getData() {
		//stud.s
	}

}
