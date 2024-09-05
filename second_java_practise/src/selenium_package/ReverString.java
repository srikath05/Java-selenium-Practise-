package selenium_package;

import java.util.Scanner;

public class ReverString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Srikanth";
		String rev = "";
		for(int i=name.length()-1; i>=0; i--) {
			
			 rev =rev+name.charAt(i);
			 
			
		}
	 System.out.println(rev);
	 
	 boolean A = palindrome(name);
	 System.out.println(A);
			
}

public static boolean palindrome(String Palinword1) {
	
	Scanner word = new Scanner(System.in);
	
	
	System.out.println("ente value to check the given number is Polindrome or not :");
	String Palinword11 = word.nextLine();
		
	String reverse ="";
	boolean ans = false;
		for(int j=Palinword11.length()-1; j>=0; j--) {
		
		reverse = reverse+Palinword11.charAt(j);
	}
	if(Palinword11.equals(reverse)) {
		
		System.out.println(reverse + "is Palindrome");
		ans = true;
	}
	
	else {
		System.out.println(reverse + "is not a polindrome");
		  
	}
	return ans;
	
	
	
}


}
