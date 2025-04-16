package selenium_package;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		
	Scanner sri=new Scanner(System.in);
		System.out.println("enter value n");
		int n=sri.nextInt();
		
		int f=1;
		
		for(int i=1;i<=10;i++)
			f=f*i;
		{
			
			System.out.println("Factorial of  is : " + f);
		}
		
		}
		
			
	/*	 Scanner obj=new Scanner(System.in);
		System.out.println("ente value for n :");
		int n=obj.nextInt();
int fact=1;

for(int i=n;i>=1;i--)
	
	
{
	fact=fact*i;
	}

System.out.println("Factorial of "+n+" is : " + fact);*/
}