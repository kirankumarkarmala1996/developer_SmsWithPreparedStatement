package com.Innovative.service;

import java.util.List;

import com.Innovative.model.InnovativeStudent;

public interface InnovativeStudentService {

	void createStudent(InnovativeStudent student);

	List<InnovativeStudent> getAllStudents();

	void updateStudent(InnovativeStudent student);

	void deleteStudent(InnovativeStudent student);

	void findById(InnovativeStudent student);

}
