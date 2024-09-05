package selenium_package;

import java.util.Scanner;

public class Conditionalstmtifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		
/*			int perc=67;
		
		if(perc>=75)
		{
System.out.println("distiction");			
		}
		else if(perc>=65)
		{
			System.out.println("1st class");
		}
		else if(perc>=45)
		{
			System.out.println("just passed");
		}
		
		else
		{
			System.out.println("failed");
		}//
*/		
		/*int pack=56;
		
		if(pack>=85)
		{
			System.out.println("delivery should be in 1day");
		}
		
		else if(pack>=75)
		{
			System.out.println("delivery should be in 2days");
			
							}
		else if(pack>=65)
		{
			System.out.println("delivery should be in 3days");
		}
		else
		{
			System.out.println("delivery in 5days");
		}*/
		
		//int y=50;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter value for n:");
		int n=obj.nextInt();
		switch(n)
		{
		case 10:
			System.out.println("ten");
			break;
		case 20:
			System.out.println("twenty");
			break;
		case 30:
			System.out.println("thirty");
		break;
		case 40:
			System.out.println("forty");
			break;
		default:
			System.out.println("if not print this");
		}
			
		

	}

}
