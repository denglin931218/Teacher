package com.sql.itcast.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import com.sql.itcast.IStudentImpl;
import com.sql.itcast.Student;

public class testStudent {

	@Test
	public void testadd() {
		IStudentImpl dao = new IStudentImpl();
		Student student = new Student();
		student.setSid(7);
		student.setSname("小四");
		student.setMajor("网银");
		student.setBirth(Date.valueOf("1990-09-08"));
		student.setScore(70);
		dao.addStudent(student);
		
	}
	@Test
	public void testqueryAllStudent() {
		IStudentImpl dao = new IStudentImpl();
		for(Student student: dao.queryAllStudent()){
			System.out.println(student);
		}
	}
	@Test
	public void testDeleteStudentById() {
		IStudentImpl dao = new IStudentImpl();
		dao.deleteStudentById(2);
	}
	@Test
	public void testUpdateStudent() {
		IStudentImpl dao = new IStudentImpl();
		Student student = new Student();
		student.setSname("张");
		dao.updateStudent(student);
	}	
	@Test
	public void testDeleteStudentByI() {
		IStudentImpl dao = new IStudentImpl();
		dao.deleteStudentById(2);
	}
	

}
