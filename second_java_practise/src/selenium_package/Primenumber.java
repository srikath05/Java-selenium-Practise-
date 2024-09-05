package selenium_package;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorialnumber fc=new Factorialnumber();
		fc.main(null);
		Scanner sri=new Scanner(System.in);
		System.out.println("enter value m");
		int m=sri.nextInt();
		//int counter=0;
		int i=1;
		i++;
		{
			if(m%i!=0)
			{
				System.out.println("prime no.");
			}
			else
			{
				System.out.println("not a prime no.");
			}
			
		}
			
			
/*		{
			if(n%i==0)
			{
				counter++;
			}
		}
		if(counter==0)
			
		{
			System.out.println("prime no.");
		}
		else
		{
			System.out.println("not a prime no");
		}*/
	
	}
	
}


	
