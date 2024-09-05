package selenium_package;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sri=new Scanner(System.in);
		System.out.println("enter value n");
		int n=sri.nextInt();
		System.out.println("Multiplication table of "+ n +" is");
		for(int j=1;j<=10;j++)
		{
			System.out.println(n+" x "+j+" = "+n*j);
		}
	}

}
