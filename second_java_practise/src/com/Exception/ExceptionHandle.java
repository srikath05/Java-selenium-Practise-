package com.Exception;

public class ExceptionHandle {

	public void method1()
	{
		System.out.println("Entering method1");
		int c=0;
		try {
			 c = method2();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured in method2 Exception"+e);
		}
		finally
		{
			System.out.println(" C : "+c);
			System.out.println("Exiting method1");
		}

	}
	public int method2() throws Exception
	{
		System.out.println("Entering method2");
		int x=10;
		int y=0;
		int c=0;
		c = x/y;
		System.out.println("Exiting method1");
		return c;
	}
}
