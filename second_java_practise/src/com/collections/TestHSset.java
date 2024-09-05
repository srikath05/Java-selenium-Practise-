package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.emp.Employee;

public class TestHSset {

	public static void main(String[] args) {
		Set<Employee> SS=new HashSet<Employee>();
	
		int i=0;
		while(i<3)
		{
			int id=i;
			String clgAddress="wgl"+i;
			String clgName="SR"+ i;
			String dept="ECE"+i;
			String name = "Sri" + i;
			Employee sri= createEmployee(id,clgAddress,clgName,dept, name);
			SS.add(sri);
			i++;
		}
		
		
		Iterator itr=SS.iterator();
		while(itr.hasNext())
		{
			Employee srik=(Employee) itr.next();
			srik.printEmployeeDetails();
		}

	}

	
	public static Employee createEmployee(int id,String clgAddress,String clgName,String dept, String name)
	{
		Employee sri=new Employee();
		sri.setId(id);
		sri.setClgAddress(clgAddress);
		sri.setClgName(clgName);
		sri.setDept(dept);
		sri.setName(name);
		return sri;
		
		
	}
}
