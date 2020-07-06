package com.penukondah1.HelloWorld.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.penukondah1.HelloWorld.Model.Student;

//This service creates a new instance and registers it
@Service
public class StudentService {
	
	/* Using Arrays.asList method to create this list in line and calling the constructor on the student class
	 * to create new student objects*/
	private List<Student> students = Arrays.asList(
			new Student("101","Archie","ECE"),
			new Student("102","Betty","CSE"),
			new Student("103","Cheryl","EEE"),
			new Student("104","Juniper","MECH"),
			new Student("105","Dagwood","CE")
			);
	
	public List<Student> getAllStudents(){
		return students;
	}
	
	public Student getStudent(String id)
	{
		return students.stream().filter(t -> t.getSid().equals(id)).findFirst().get();
		/* filtering by ID, using lambda expression comparing the id of the student with the id we are sending
		 * findFirst to get the very first student element and get() to get student instance*/
		
	}

}
