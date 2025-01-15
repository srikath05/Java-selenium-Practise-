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
		
		  int number = 12345;  // Input number
	        int reversed = 0;

	        // Loop to reverse the digits of the number
	        while (number != 0) {
	            int digit = number % 10;      // Extract the last digit
	            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
	            number = number / 10;        // Remove the last digit from the number
	        }

	        System.out.println("Reversed number: " + reversed);
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
	
	

