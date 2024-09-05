package com.emp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		emp1.setClgAddress("WGL");
//		emp1.setDept("CSE");
//		emp1.setId(1);
//		emp1.setClgName("SR");	
//		emp1.printEmployeeDetails();
//		
//		Employee emp2 = new Employee();
//		emp2.setClgAddress("HNK");8
//		emp2.setDept("ECE");
//		emp2.setId(2);
//		emp2.setClgName("SRR");	
//		emp2.printEmployeeDetails();
//		
//		Employee emp3 = new Employee();
//		emp3.setClgAddress("HYD");
//		emp3.setDept("EEE");
//		emp3.setId(3);
//		emp3.setClgName("Bhad");	
//		emp3.printEmployeeDetails();
		
		
//		Employee emp1 = createEmployee("WGL","CSe","SR",1);
//		emp1.printEmployeeDetails();
//		Employee emp2 = createEmployee("HNK","ECE","BH",2);
//		emp2.printEmployeeDetails();
//		Employee emp3 = createEmployee("HYD","EEE","SRRR",3);
//		emp3.printEmployeeDetails();
		List al = new ArrayList();
		
		int i =0;
		while(i<1000)
		{
			String clgAddress = "WGL" +i;
			String dept = "CSE"+i;
			String clgName="SR"+i;
			Employee emp = createEmployee(clgAddress,dept,clgName,i);
			al.add(emp);
			i++;
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Employee emp = (Employee) itr.next();
			emp.printEmployeeDetails();
		}
	}
	
	public static Employee createEmployee(String clgAddress,String dept,String clgName,int id)
	{
		Employee emp = new Employee();
		emp.setClgAddress(clgAddress);
		emp.setDept(dept);
		emp.setId(id);
		emp.setClgName(clgName);
		return emp;
	}
}
