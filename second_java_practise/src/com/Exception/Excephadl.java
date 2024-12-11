package com.Exception;

public class Excephadl {

	public static void M4() {
		System.out.println("execute M5");
		
		int z=0;
		try {
			 z=M5();
			 System.out.println("z iss  : "+z);
		}
			catch(Exception e) {
				System.out.println("Exception is : "+e);
			
		}
		finally
		{
			
			System.out.println("z is : "+z);
			System.out.println("exit from a M4");
		}
		
	}
	
	public static int M5()
	{
		
		int x=10;
		int y=0;
		int z=x/y;
		System.out.println("z sis :"+z);
		return z;
	
	}
		
}


