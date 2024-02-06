package com.pk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.entity.Student;
import com.pk.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
		
	public List<Student>getAllStudents(){
	   return studentRepository.findAll();
	}
	
	public Student getStudentById(Integer id) {
		return studentRepository.findById(id).get();
	}
	
	public void saveStudent(Student student) {
		 studentRepository.save(student);
	}
	
	public void deleteById(Integer id) {
		studentRepository.deleteById(id);
	}
	
	public void updateStudentById(Integer id, Student student) {
		
		Student existingStudent = studentRepository.findById(id).get();
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setContactNo(student.getContactNo());
		existingStudent.setEmailId(student.getEmailId());
		studentRepository.save(existingStudent);
	}
	
	
	
}
