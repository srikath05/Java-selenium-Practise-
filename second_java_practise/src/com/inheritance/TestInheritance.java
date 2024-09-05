package com.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
//		Teacher t = new Teacher();
//		t.setClgName("Bhadrakali");
//		t.setClgAddress("Warangal");
//		t.setDesignation("Professor");
//		t.printDetails();
//		t.printNumberofclasses();
		
		// TODO Auto-generated method stub
		SpecilizedTeacher tch = new SpecilizedTeacher();
		tch.setDesignation("Teacher1");
		tch.setClgName("SR");
		tch.setClgAddress("WGL");
		tch.setSubject("phyics");
	    tch.printDetails();
	    tch.printTeacherDetails();
	    tch.printNumberofclasses();
	    tch.printAge();
	    
	    SpecilizedTeacher sch = new SpecilizedTeacher();
	    sch.setDesignation("Teacher2");
	    sch.setClgName("KNR");
	    sch.setClgAddress("WGL");
	    sch.setSubject("English");
	    sch.printDetails();
	    sch.printTeacherDetails();
	    sch.printNumberofclasses();
	    sch.printAge();
	    
	    SpecilizedTeacher sch3 = new SpecilizedTeacher("Teacher3","VRT","HYD","Maths");
	    sch3.printDetails();
	    sch3.printTeacherDetails();
	    sch3.printNumberofclasses();
	    sch3.printAge();
	    
	    	}

}
