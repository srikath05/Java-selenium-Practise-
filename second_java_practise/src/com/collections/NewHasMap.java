package com.collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.emp.Employee;

public class NewHasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Map<Integer, Employee> sriHash = new HashMap<Integer, Employee>();

				int i = 0;
				int n;
				Scanner sc = new Scanner(System.in);
				sc.hasNext();
				System.out.println("N values is =");
				while (i< 3) 
				{
					int id=i;
					String clgAddress="wgl"+i;
					String clgName="SR"+ i;
					String dept="ECE"+i;
					String name = "raj" + i;
					Employee sri= createEmployee(id,clgAddress,clgName,dept, name);
					sriHash.put(i, sri);
					i++;
				}
				
				Set<Integer> keySetValues = sriHash.keySet();
				
				Iterator itr = keySetValues.iterator();
				
				while(itr.hasNext())
				{
					int currentKey = (int) itr.next();
					Employee cuurentEmp = sriHash.get(currentKey);
					printEmployeeDetails(cuurentEmp);
				}
				
	
	}
			
	public static void printEmployeeDetails(Employee e)
	{
		System.out.println("Name :" +e.getName());
		e.printEmployeeDetails();
	}
	
	public static Employee createEmployee(int id, String clgAddress, String clgName, String dept, String name) {
		
		Employee sri = new Employee();
			sri.setId(id);
			sri.setClgAddress(clgAddress);
			sri.setClgName(clgName);
			sri.setDept(dept);
			sri.setName(name);
			return sri;
			}
		}
        		

