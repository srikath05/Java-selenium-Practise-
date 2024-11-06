package com.emp;

import selenium_package.Add;
import selenium_package.Calc;
//import selenium_package.Div;
//import selenium_package.Mul;

import selenium_package.Sub;

public class ClassA {

		
	
	public static void main(String[] arg)
	
	{

		int d=10;
		int e = 20;
		
		//Calc sri=new Calc();
		int add=Add.add(10, 20);//sri.add(a, b);
		int sub=Sub.sub(10, 20);//sri.sub(a, b);
		int mul=Calc.mul(d, e);//sri.mul(d, e);
		
		int div = Calc.add(10, 20);
		
		
		
		
				
	}
	
	
	
}
