package com.cjc.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Student {
	
	private int studId;
	private String studName;
	private String studPassword;
	private String studClgName;
	

}
