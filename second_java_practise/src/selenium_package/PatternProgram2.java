package selenium_package;

public class PatternProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i,j;
		for(i=0;i<7;i++)
		{
			
			
			for(j=1;j<=i;j++)
			{
				System.out.print(j + " ");
				
			}
		System.out.println();
		}
			
		
		//pattern 2
	     int n = 5; // Number of rows
	        int num = 1; // Starting number

	        for (int a = 1; a <= n; a++) {
	        	        	
	            for (int b = 1; b <= a; b++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println(); // Move to the next line after each row
	        }
 }
	}



