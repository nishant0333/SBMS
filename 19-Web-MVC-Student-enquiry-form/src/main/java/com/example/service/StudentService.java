package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.binding.Student;
import com.example.entity.StudentEntity;
import com.example.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;

	public List<String> getCources(){
		
		return Arrays.asList("java","paython","java script","C++","DevOpps");
	}
	
	public List<String> getTimings(){
		
		return Arrays.asList("Morning","Afternoon","Evening");
	}
	
	
	public Boolean save(Student student) {
		
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(student, entity);
		entity.setTimings(Arrays.toString(student.getTimings()));
		System.out.println(entity);
		StudentEntity save = repo.save(entity);
		
		
			return true;
		}
		
		
	}
	

