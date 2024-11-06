package selenium_package;

import selenium_package.Add;
import selenium_package.Sub;

import selenium_package.Div;;

public class Calc {

	/*int d=10;
	int e=20;
	int f=1;	

	void Multi() 
	{
		int f=d*e;
		System.out.println("multi is : "+f);
		
	}
	void div()
	{
		int f=e/d;
		System.out.println("div is : "+f);
		
	}


	public static void main(String[] args) {

		Calc sri = new Calc();
		sri.Multi();
		sri.div();
*//*	
	void mul(int d,int e)
	{
		int f=e*d;
		System.out.println("multi is : "+f);
		
	}
	
	void div(int d,int e)
	{
		int f=e/d;
		System.out.println("div is : "+f);
		
	}
	
	void print(int e,int d)
	{
		System.out.println("val is : "+e+", "+d);
		
	}
	
	void Str()
	{
		
		String str="srikanth";
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("srikanth", "shirisha"));
		int index=str.indexOf(2);
		System.out.println(index);
	}
	public static void main(String[] args) {
		
		Calc sri=new Calc();
		sri.mul(10, 20);
		sri.div(10, 100);
		sri.Str();
	
	}*/
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

	public static int mul(int d,int e)
	{
		int f=e*d;
		//System.out.println("multi is : "+f);
		return f;
	}
	
	public static int div(int d,int e)
	{
		int f=e/d;
		//System.out.println("div is : "+f);
		return f;
	}
	
	

	public static void print(int val1,int val2,int val3,int val4,String str )
	{
		System.out.println("mul is : "+val1+","+val2+","+val4+","+str);
	}
	public static void print(int val1,int val2,int val3,int val4 )
	{
		System.out.println("val is : "+val1+","+","+val2+","+val3+","+val4);
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int d=10;
		int e=20;
		
		
		
		int mul=mul(d, e);
		int div=div(d,e);
		int add=add(a,b);
		int sub=sub(a,b);
		/*Calc sri=new Calc();
		sri.mul(d, e);
		sri.div(d, e);
		sri.Str();*/
				
	
		print(add,sub,mul,div);
		print(add,sub,mul,div);
		
	}
	}
	
