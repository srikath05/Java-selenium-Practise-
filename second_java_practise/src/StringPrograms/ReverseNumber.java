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
		int rev=0;
		while(n > 0)
			
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse of div " +rev);
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
	
	

