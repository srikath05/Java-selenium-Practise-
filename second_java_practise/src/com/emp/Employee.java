package com.emp;

import com.inheritance.SpecilizedTeacher;

public class Employee extends SpecilizedTeacher{
	
	private int id;
	private String name;
	private String dept;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void printEmployeeDetails()
	{
		printTeacherDetails();
		System.out.println("Id = "+id + " Name = "+name +" Dept = "+ dept + " salary = "+salary);
	}
	
	
}
