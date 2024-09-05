package com.emp;

public class Employeinformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB info=new ClassB();
		info.setId(1);
		info.setName("srikanth");
		info.setDept("CCR");
		info.setSpan("Rx");
		info.setEmpsalary(30000);
		info.setDoj(22-6-2015);
		info.setQualif("MBA");
		info.setGender("male");
		info.setDesignation("Manger");
		info.setClgName("SR");
		info.setClgAddress("wgl");
		info.setSubject("Maths");
		info.printemp();
		
		info.printTeacherDetails();
		
		
		ClassB info1=new ClassB();
		info1.setId(2);
		info1.setName("shirisha");
		info1.setDept("MC");
		info1.setSpan("Rx");
		info1.setEmpsalary(40000);
		info1.setDoj(28/6/2016);
		info1.setQualif("BSC");
		info1.setGender("Female");
		info1.setDesignation("Deputy Manger");
		info1.setClgName("AVN");
		info1.setClgAddress("hyd");
		info1.setSubject("Eng");
		info1.printemp();
		info1.printTeacherDetails();
		
		ClassB info2=new ClassB();
		info2.setId(3);
		info2.setName("rajesh");
		info2.setDept("IT");
		info2.setSpan("ADP");
		info2.setEmpsalary(50000);
		info2.setDoj(10062019);
		info2.setQualif("Btech");
		info2.setGender("male");
		info2.setDesignation("Sr.software");
		info2.setClgName("kits");
		info2.setClgAddress("wgl");
		info2.setSubject("java");
		info2.printemp();
		info2.printTeacherDetails();
		
		
		//ClassB info3=new ClassB("50000","22062019","lkg","male","5","sri","stu","scho");
		
		
	
		
				
				
	}
	

}
