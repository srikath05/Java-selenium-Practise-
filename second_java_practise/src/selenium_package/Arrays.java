package selenium_package;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
				  
		// TODO Auto-generated method stub
		//String[] citie = {"hyd","Amr","wgl","del"}; 
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter city name");
		String[] cities=new String[4];
		
		for(int i=0;i<cities.length;i++)
		{
			cities[i]=sc.next();
		}
	System.out.println("display cities names");
	for(String city : cities)
	{
		System.out.println(city);
	}*/
	
	
// to display value from display
		
		/*int[][] A= new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
			System.out.println("display value");
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				System.out.println(A[i][j]);
				
		*/
		//Scanner sc=new Scanner(System.in);
		
		/*int [][] A =new int[2][2];
		int [][] B =new int[2][2];
		int [][] C = new int[2][2];
		*/
				
		/*System.out.println("enter value for A");
		
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
			{	
				A[i][j]=sc.nextInt();
				
			}
		System.out.println("enter value for B");
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
			{	
				B[i][j]=sc.nextInt();
				
			}*/
		//System.out.println("display values for c");
		
				/*for(int i=0;i<3;i++)
					for(int j=0;j<3;j++)*/
		
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{	
				c[i][j]=0;//C[i][j]=A[i][j]+B[i][j];// addition of two matrix
				
				for(int k=0;k<3;k++)
			{
					c[i][j]=(a[i][k]*b[k][j]);
				System.out.print(c[i][j]+ "  " );
			}}
		System.out.println(" ");
		}
		
}
	