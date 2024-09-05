package com.test;

import com.emp.*;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Raj");
		emp1.setDept("IT");
		emp1.setSalary(10000);
		emp1.setDesignation("teacher");
		emp1.setClgName("sr");
		emp1.setClgAddress("wgl");
		emp1.setSubject("english");
		emp1.printEmployeeDetails();
		
	   //System.out.println("Id "+emp1.getId() + " Name "+emp1.getName() +" Dept "+ emp1.getDept() + " salary "+emp1.getSalary());
    
		Employee emp2 = new Employee();
		emp2.setId(1);
		emp2.setName("kiran");
		emp2.setDept("IT");
		emp2.setSalary(20000);
		emp2.setDesignation("teacher");
		emp2.setClgName("svs");
		emp2.setClgAddress("kzp");
		emp2.setSubject("phyics");
		emp2.printEmployeeDetails();
	   // System.out.println("Id "+emp2.getId() + " Name "+emp2.getName() +" Dept "+ emp2.getDept() + " salary "+emp2.getSalary());

		
	}

}
