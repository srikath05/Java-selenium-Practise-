package com.collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Set<details> sri=new HashSet<details>();
		ArrayList<details> sri=new ArrayList<details>();
		int i=0;
		while(i<5)
		{
			int id=1+i;
			String name="user"+i;
			String address="WGL"+i;
			String designation="employee"+i;
			int salary=10000+i;
			details info=information(id,name,address,designation,salary);
			sri.add(info);
			i++;			
		}
		System.out.println(sri);
		Iterator itr=sri.iterator();
		while(itr.hasNext())
		{
			details sri1=(details) itr.next();
			sri1.printdetails();
		}
	}
	
	
	public static details information(int id,String name,String address,String designation,int salary)
	{
		details info=new details();
		info.setId(id);
		info.setName(name);
		info.setDesignation(designation);
		info.setAddress(address);
		info.setSalary(salary);
		return info;
		
	}
}
