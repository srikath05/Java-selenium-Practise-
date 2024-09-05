package com.emp;

import selenium_package.Add;
import selenium_package.Calc;
//import selenium_package.Div;
//import selenium_package.Mul;
import selenium_package.Printer;
import selenium_package.Sub;

public class ClassA {

	/*int a=10;
	int b=20;
	int c=1;
	
	 void add()
	{
		int c=a+b;
		System.out.println("add is : "+c);
		
	}
	
	 void sub()
	{
		int c=a-b;
		System.out.println("sub is : "+c);
	}
	
	void mul()
	{
		int c=a*b;
		System.out.println("mul is : "+c);
	}
	
	void div()
	{
		int c=b/a;
		System.out.println("div is : "+c);
	}
	
	
	public static void main(String[] args)
	{
		
		ClassA sri=new ClassA();
		sri.add();
		sri.sub();
		sri.mul();
		sri.div();
			
		
	}*/
	
/*
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("add is : "+c);
	}
	void mul(int a,int b)

	{
		int c=a*b;
		System.out.println("add is : "+c);
	}
	
	void sub(int a, int b)
	{
		
		int c=a-b;
		System.out.println("add is : "+c);
	}
	void div(int a , int b)
	{
		int c=b/a;
		System.out.println("add is : "+c);
	}
	
	void str(String str)
	
	{
		str="shirisha";
		
		System.out.println(str);	
	}
	
	
	public static void main(String[] args)
	
	{
		
		
		ClassA sri=new ClassA();
		sri.add(10,20);
		sri.sub(10,20);
		sri.mul(10,20);
		sri.div(10,20);
		sri.str("shirisha");
		
			}*/
/*	
	public static int add(int a,int b)	
	{
		
		int c=a+b;
		return c;
	}
	public static int sub (int a ,int b)	
	{
		
		int c=a-b;
		return c;
	}

	public static String str ()	
	{
		
		String str="shirisha";
		return str;
	}
	public static void print(int val1,int val2,String str)
	{
		System.out.println("val is :"+val1+val2+str);
		
	}
	public static void print(int val1,int val2)
	{
		System.out.println("val is :"+val1+val2);
		
	}*/
	
	
	public static void main(String[] arg)
	
	{

		int d=10;
		int e = 20;
		
		//Calc sri=new Calc();
		int add=Add.add(10, 20);//sri.add(a, b);
		int sub=Sub.sub(10, 20);//sri.sub(a, b);
		int mul=Calc.mul(d, e);//sri.mul(d, e);
		
		int div = Calc.add(10, 20);
		
		Printer.print(add, sub, mul, div);
		
		//sri.print(add,sub,mul,div);
		//sri.print(add, sub, mul, div);
		
		
	
		//int add=add(a,b);
		//int sub=sub(a,b);
	/*	ClassA sri=new ClassA();
		sri.add(a, b);
		sri.sub(a, b);*/
		
				
	}
	
	
	
}
