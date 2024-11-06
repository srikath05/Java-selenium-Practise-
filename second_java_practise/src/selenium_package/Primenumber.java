package selenium_package;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sri=new Scanner(System.in);
		System.out.println("enter value N");
		int N=sri.nextInt();
		//int counter=0;
		int i=1;
		i++;
		{
			if(N % i != 0)
			{
				System.out.println("prime no.");
			}
			else
			{
				System.out.println("not a prime no.");
			}
			
		}
//		System.out.println("prime numbers between 1 to 20 are : ");
//			for(int j=2;j<=20;j++) {
//				if(isPrime(j));
//				System.out.print(j + " ");
//			}
			
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
	

//
//	public static boolean isPrime(int num) {
//		
//		for( int i =2; i<num; i++) {
//			if(num%i==0) {
//				return false;
//			}
//		}return true;
//		
//	}

	
}