package com.inheritance;

import java.util.HashMap;
import java.util.Map;

public class Studinfodis  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Studentinfo> sri= new HashMap<String,Studentinfo>();
		int i=0;
		while(i<5)
		{
			int roll=i;
			String name="shirisha"+i;
			String dept="ECE"+i;
			String clg="KITS"+i;
			Studentinfo stu=disstu(roll,name,dept,clg);
			sri.put(name, stu);
			i++;
		}
		 
		
		
		
		System.out.println(sri);
		System.out.println("********");
		Studentinfo roll=sri.get("shirisha3");
		roll.printstudentinfo();
		
		
	}

	
	public static Studentinfo disstu(int roll,String name,String dept,String clg)	
	{
		Studentinfo stu=new Studentinfo();
		stu.setRoll(roll);
		stu.setName(name);
		stu.setDept(dept);
		stu.setClg(clg);
		return stu;
		
	}
	
}
