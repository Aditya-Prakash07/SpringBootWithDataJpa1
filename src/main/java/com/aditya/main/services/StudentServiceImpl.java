package com.aditya.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditya.main.entities.Student;
import com.aditya.main.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean addStudentDetails(Student std) {
		boolean status = false;
		try {
			studentRepository.save(std);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			status = false;
		}

		return status;
	}

	@Override
	public List<Student> getAllStdDetails() {
		return studentRepository.findAll();
	}

}
