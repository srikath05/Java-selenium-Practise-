package StringPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseNumber.removechar("srikanth");
		
		System.out.println(ReverseNumber.charRemoveAt("srikanthganji", 6));
		// String str = "India is my country";  
	   //System.out.println(charRemoveAt(str, 7));  
/*		int act = 525;
		int div= act;
		int rev=0;
		
		while(div > 0)
		{
			 int rem=div%10;
			 rev=rev*10+rem;
			 div=div/10;
			
		}
		System.out.println("reverse of div " +rev);
		
		if(act==rev)
		{
			System.out.println("is polyndrome "+rev);
		}
		else
		{
			System.out.println("not polyndrome "+rev);
		}*/
		
		//int div=123;
		Scanner obj =new Scanner(System.in);
		System.out.println("enter value for n:");
		int n=obj.nextInt();
		// int n = 12345; // Input number to be reversed
	        int rev = 0;   // Variable to store the reversed number
	        
	        // Loop continues until the number `n` becomes 0
	        while (n > 0) {
	            // Step 1: Get the last digit of the number using the modulus operator
	            int rem = n % 10;
	            
	            // Step 2: Build the reversed number
	            // Multiply the current reversed number by 10 to shift digits to the left,
	            // then add the extracted digit (rem)
	            rev = rev * 10 + rem;
	            
	            // Step 3: Remove the last digit from the number
	            // Divide the number `n` by 10 to eliminate the last digit
	            n = n / 10;
	        }
	        
	        // Print the reversed number
	        System.out.println(rev); // Output: 54321
		}
	
	public static  void removechar(String str) {
		
		//String str= "srikanthshirisha";
		String str1=str.replace("a", "");
		System.out.println(str1);
		
		
	}
	
    

 
 public static String charRemoveAt(String str, int p) {  
	  
	  
    return str.substring(0, p) + str.substring(p + 1);  
	
	
	
	
}
	}
	
	

