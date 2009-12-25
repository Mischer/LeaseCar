package com.epam.leasecar.logic;
import java.util.Collection;

import com.epam.leasecar.model.Car;
import com.epam.leasecar.model.User;
import com.epam.leasecar.model.Admin;
import com.epam.leasecar.model.Order;

public interface Logic {
	
	
	public void addOrderToArchive(Long oid);
	public void addOrderToArchiveRefuse(Long oid);
/*	public Student getStudent(String name);

	public Collection<Teacher> getAllTeachers();
	public Collection<Course> getAllCourses();
	public Collection<Student> getAllStudents();
	public Collection<Mark> getAllMarks();
*/
	
/*
	public void assignStudentToCourse(Course course, ActiveStudent activeStudent);
	public void studiesCourse(Course course, ActiveStudent activeStudent);
	public void finishedCourse(Course course, ActiveStudent activeStudent);
	
	public void addInArchive(Course course, Teacher teacher, ActiveStudent activeStudent, int mark);
*/	
}