package com.Innovative.service;

import java.util.List;

import com.Innovative.Dao.StudentDaoImpl;
import com.Innovative.model.InnovativeStudent;

public class InnovativeStudentServiceImpl implements InnovativeStudentService {

	
	// tight-coupling
	private static StudentDaoImpl dao= new StudentDaoImpl();
	@Override
	public void createStudent(InnovativeStudent student) {
		dao.save(student);
		
	}

	@Override
	public List<InnovativeStudent> getAllStudents() {
			 return dao.findAll();
	}

	@Override
	public void updateStudent(InnovativeStudent student) {
		dao.update(student);
		
	}

	@Override
	public void deleteStudent(InnovativeStudent student) {
		dao.delete(student);
	}

	@Override
	public void findById(InnovativeStudent student) {
		dao.findById(student);
		
	}
	

}
