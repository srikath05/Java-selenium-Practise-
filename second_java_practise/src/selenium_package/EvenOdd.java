package selenium_package;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=5;
		if(n%2==0);
		System.out.println(n + " is even number");
		else
		{
			System.err.println(n + " is Odd number");*/
		
		Scanner obj =new Scanner(System.in);
		System.out.println("enter value for n:");
		int n=obj.nextInt();
		if(n%2==0)
		System.out.println(n + " is even number");
		else
			System.out.println(n + " is odd number");
		}
	}


