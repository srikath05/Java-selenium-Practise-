package StringPrograms;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		// Replace
		 String str=("Testing Master Technologies");
		str=str.replace("Testing", "Quality");
		System.out.println("Replace " + str); 
		
		// Split
		 String str1=("Testing Master Technologies");
		String[] arr=str1.split("s");
		System.out.println(arr.length);
		 for(int i=0;i<0;i++)
		 
			System.out.println(arr[i]);
		
		for(String s:arr)
		System.out.println("Split " + s);
	
		 
		// string contains
		 String str2=("Testing Master Technologies");
		if(str2.contains("Master"))
		{
		System.out.println("contains " + "exit");	
		}
		else
		{
			System.out.println( "contains " + "not exit");
		} 
		 
		 //substring 
		
		String str3=("Testing Masters Technologies");
		String s=str3.substring(8, 14);
		System.out.println("substring " + s);
		 
		
		// ContantEquals	
		 String str4="Srikanth";
		String str5="srikanth"; 
		
		 if(str4.contentEquals(str5))
 			if(str4.equalsIgnoreCase(str5))	
		{
			System.out.println("ContantEquals " + "Both are same");
		}
		else
		{
			System.err.println("ContantEquals " + "not same");
		} 
			// charArt
		
 		String str6="srikanth";
		
			for(int i=0;i<=str6.length();i++)
			
						
		{
			char c=str6.charAt(i);
							
			
		System.out.print("charArt" +  c);
		} 
		 //Converting
	 String h="hyderabad";	// "HYDERABAD";
	System.out.println("Converting " + h.toLowerCase());
	System.out.println("Converting " + h.toUpperCase()); 
		
		// TRIM
	 	String str7="  Testing Master  ";
		str7=str7.trim();
		System.out.println("TRIM " + str7); 
		
		// Index
		 String str8="Testing Master";
		 int index=str8.indexOf(6);
		 System.out.println("Index " + index); 
		
		
		
		
	}
	
	
}
