package com.emp;

import com.inheritance.TestInheritance;
import com.runtime.polymorphism.TestRuntimePolymorphism;
import bankinfo.totalbanksinfo;

public class Sample {

	public static void main(String[] args) {
	
		
		Employeinformation exec=new Employeinformation();
		exec.main(args);
	
		TestInheritance TH=new TestInheritance();
		TH.main(args);
		
		totalbanksinfo bank=new totalbanksinfo();
		bank.main(args);
		
		TestRuntimePolymorphism poly=new TestRuntimePolymorphism();
		poly.main(args);
		
	}

}
