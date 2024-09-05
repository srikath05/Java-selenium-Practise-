package selenium_package;

import java.util.Scanner;

public class StringPolindrome {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String str="madam";
		//String str;
		// String rev=" ";
//		Scanner sc=new Scanner(System.in);
//		str=sc.nextLine();
				
		/*
		 * int length = str.length(); for(int i=length - 1;i>=0; i--) {
		 * 
		 * 
		 * rev=rev+str.charAt(i); System.out.println(rev);
		 * 
		 * if(str.equals(rev)) { System.out.println(str+" polindrome"); }else
		 * System.out.println(str+" not polindrome"); }
		 */
		
		//String str="madam", rev = "";
	  /*    Scanner sc = new Scanner(System.in);
			
			 System.out.println("Enter a string:"); 
			 str = sc.nextLine(); ////
			   int length = str.length(); 
			   for ( int i = length - 1; i >= 0; i-- )
			  rev = rev + str.charAt(i); 
			   if (str.equals(rev)) 
			  System.out.println(str+" is a palindrome");
			   else
			  System.out.println(str+" is not a palindrome");
	
}*/
	
	public static void main(String[] args)
    {
        // Input string
        String str = "madam";
        

        // Convert the string to lowercase
     //   str = str.toLowerCase();
       boolean A = isPalindrome(str);
        System.out.println(A);
    }
			 		
			   public static boolean isPalindrome(String str)
			    {
			        // Initializing an empty string to store the reverse
			        // of the original str
			        String rev = "";

			        // Initializing a new boolean variable for the
			        // answer
			        boolean ans = false;

			        for (int i = str.length() - 1; i >= 0; i--) {
			            rev = rev + str.charAt(i);
			        }

			        // Checking if both the strings are equal
			        if (str.equals(rev)) {
			            ans = true;
			        }
			        return ans;
			    }
			    
	      
		
	}


