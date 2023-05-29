package com.Innovative.Controller;

import java.util.List;

import com.Innovative.model.InnovativeStudent;
import com.Innovative.service.InnovativeStudentServiceImpl;

public class StudentController {
	public static void main(String[] args) {
		
		InnovativeStudentServiceImpl service = new InnovativeStudentServiceImpl();
		InnovativeStudent student = new InnovativeStudent(104,"saven","Bang",112345687,25000.00, "saven@abc.com");
//		service.createStudent(student);
//		System.out.println(student);
		
		
		InnovativeStudent student1 = new InnovativeStudent();
		student1.setName("pallavi reddy");
		student1.setAddress("Hyd");
		student1.setId(102);
//		service.updateStudent(student1);
		
		InnovativeStudent  delete=new InnovativeStudent();
		delete.setId(102);
//		service.deleteStudent(delete);
//		System.out.println(delete);
		
		
		
		InnovativeStudent find=new InnovativeStudent();
		find.setId(101);
//		service.findById(find);
		
		
		
		List<InnovativeStudent>listofstudent=service.getAllStudents();
		for(InnovativeStudent stu:listofstudent) {
			System.out.println(stu);
		}
		
		
	}

}
