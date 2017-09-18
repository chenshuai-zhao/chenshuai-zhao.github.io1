package com.springmvc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.mapper.Student;
import com.springmvc.mapper.StudentExample;
import com.springmvc.service.StudentService;


@Controller
public class StudentController {

	private Logger logger= LoggerFactory.getLogger(StudentController.class);
	@Autowired
	private StudentService studentService;

	@RequestMapping("/t1")
	public void t1() {
		StudentExample example=null;
		List<Student> list = studentService.getList(example);
		System.out.println(list);
	}
	
	
	
	@RequestMapping("/t2")
	public void t2() {
		
	}
}
