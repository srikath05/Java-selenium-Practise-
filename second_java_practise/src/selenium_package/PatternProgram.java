package selenium_package;



public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//pattern1	
	int i=0;
	int j=0;
	
	for(i=0;i<=6;i++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
	
	System.out.println();
	}System.out.println("pattern1");
	//pattern 2
	
	for(int k=6;k>=0;k--)
	{
		for(int l=1;l<=k;l++)
		{
			System.out.print(l +" ");
		}
	
	System.out.println();
	}System.out.println("pattern2");
	
	
	//pattern3
	
	for (int a = 1; a <= 6; a++) {
        // Print spaces
        for (int b = 6; b > a; b--) {
            System.out.print("  "); // Two spaces
        }
        // Print stars
        for (int b = 1; b <= a; b++) {
        	
            System.out.print("* ");
        }
        System.out.println(); // Move to the next line after each row
    
	}System.out.println("pattern3");
	
	

}}
