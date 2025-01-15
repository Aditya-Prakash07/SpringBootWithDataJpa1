package com.aditya.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> { // all the methods of crud operation is
																			// already defined in JpaRepository
																			// interface

}
