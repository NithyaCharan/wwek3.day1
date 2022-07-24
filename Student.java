package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name : XYZ");
	}
	
	public void studentDept() {
		System.out.println("Student department : CSC");
	}
	
	public void studentId() {
		System.out.println("Student ID : 116045");
	}
	
	public static void main(String[] args) {
		
		Student st = new Student();
		
		//example for multilevel inheritance
		//calling methods from the class College
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		
		//calling methods from the class Department which extends College
		st.deptName();
		
		//calling methods from the class Student which extends Department
		st.studentDept();
		st.studentId();
		st.studentName();
		
	}
}
