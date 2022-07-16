package com.gst.demo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentModelClass {
	
	private String studentId;
	private String studentName;
	
	
	
	public void getData() {
		System.out.println("StudentModelClass.getData()");
	}

}
