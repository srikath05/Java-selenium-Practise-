package selenium_package;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value b/w 1 to7 ");
		
		int d= sc.nextInt();
					
		switch (d)
		{
		case 1:
			System.out.println("monday");
		break;
		case 2:
			System.out.println("tuesday");
		break;
		case 3:
			System.out.println("wed");
		break;
		case 4:
			System.out.println("thur");
		break;
		case 5:
			System.out.println("fri");
		break;
		case 6:
			System.out.println("sat");
		break;
		case 7:
			System.out.println("sun");
		break;
		} 
	defualt:
		System.out.println("enter valid input");
		}
	}

		

