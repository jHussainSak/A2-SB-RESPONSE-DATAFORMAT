package com.servertech.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servertech.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	Student st=new Student(1,"Jamshed","Hussain","jahussa@gmail.com");
	Student st1=new Student(1,"Jamshed","Khan","jahussa@gmail.com");
	Student st2=new Student(1,"Jamshed","Sarver","jahussa@gmail.com");
	
	ArrayList<Student> stList=new ArrayList<Student>();
	
	@GetMapping(value ="/student",produces = {"application/json","application/xml"})
	public ArrayList<Student> getStudent() {
		stList.add(st);
		stList.add(st1);
		stList.add(st2);
		return stList;
	}//EOM
	
}//EOC
