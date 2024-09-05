package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.emp.Employee;

public class Practiseforhasmap {

	public static void main(String[] args) {
		
		Map<Integer,Employee> ki=new HashMap<Integer,Employee>();
		//Map<Integer,String> kir=emphminfo();
		int i=0;
		while(i<3)
		{
			int id=i;
			String clgName="Sr"+i;
			String clgAddress="wgl"+i;
			String dept="dept"+i;
			Employee raj= emphminfo(id,clgName,clgAddress,dept);
			ki.put(id, raj);
			i++;
		}
		
		System.out.println(ki);
		Employee id=ki.get(1); 
		
		id.printEmployeeDetails();
		id.printDetails();
		Set<Integer> s= ki.keySet();
		Iterator itr1 = s.iterator();
		while(itr1.hasNext())
		{
			Integer r = (Integer) itr1.next();
			System.out.println(r);
		}
		
		Collection<Employee> c = ki.values();
		Iterator itr2 = c.iterator();
		while(itr2.hasNext())
		{
			
			Employee e= (Employee) itr2.next();
			e.printEmployeeDetails();
		}

	}
	
	public static Employee emphminfo(int id,String clgName,String clgAddress,String dept)
	{
		
	/*	Employee mp1=new Employee();
		mp1.setId(id);
		mp1.setClgAddress(clgAddress);
		mp1.setClgName(clgName);
		mp1.setDept(dept);
		mp1.setClgAddress(clgAddress);
		return (Map) mp1;*/
		//at the thime of returning this raj obj it vl be Employee's variable(Employee raj=new Employee();)
		Employee raj=new Employee();
		raj.setId(id);
		raj.setClgName(clgName);
		raj.setClgAddress(clgAddress);
		raj.setDept(dept);
		return raj;
		
	
				
	}
	
	
}
