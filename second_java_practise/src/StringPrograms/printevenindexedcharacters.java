package StringPrograms;

import java.util.Scanner;

public class printevenindexedcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello world hi everyone";
		
		for (int i = 0; i < str.length(); i++)
		{
			if (i % 2 == 0){
				//if (i % 2 != 0){ //for odd letters to print
				
				System.out.print(str.charAt(i));
				
				}
			}
	   }
}
