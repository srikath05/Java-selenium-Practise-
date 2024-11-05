package selenium_package;

import java.util.Scanner;

public class ReverString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter string = ");
//		String name =sc.nextLine();
		String name = " i am a automation Tester";
		//String n =  name.replace("a", "");
	//System.out.println(n);
		String rev = "";
		for(int i=name.length()-1; i>=0; i--) {
		
			
			 rev =rev+name.charAt(i);
			 
		}System.out.println(rev);
		if(rev.equals(name)) {
			 
			 System.out.println(rev + " is ploindrome");
		 }else {
			 System.out.println("not a ploindrome");
		 }
		
	}
}	




