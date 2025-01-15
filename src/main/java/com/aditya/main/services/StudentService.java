package com.aditya.main.services;

import java.util.List;

import com.aditya.main.entities.Student;

public interface StudentService {

	public boolean addStudentDetails(Student std);

	public List<Student> getAllStdDetails();

	public Student getStdDetails(long id);

}
