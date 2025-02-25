package StringPrograms;

import java.util.Arrays;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		      //  String input1 = "selenium 123java456";
		        String input1  =  "Hello123456!@#WORLD";

		        // Using Regex to extract only alphabets
		        String output2 = input1.replaceAll( "[^a-zA-Z]", "");

		      System.out.println(output2);  // Output: seleniumjava
		      
		      int[] arr2 = {1, 1, 2, 3, 3, 4, 5, 5};
		        
		        int[] uniqueArray = Arrays.stream(arr2).distinct().toArray(); // Remove duplicates
		        
		        System.out.println("without duplicates : " + Arrays.toString(uniqueArray) + " ");
		      
		      String input = "Hello123456!@#WORLD";
		        String output = ""; // Initialize an empty string

		        // Iterate through the input string using a normal for loop
		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i); // Get the character at the current index
		             	if(!Character.isDigit(c) && Character.isAlphabetic(c))
		            { // Check if it's an alphabet
		                output += c; // Concatenate the character to the output
		            }
		        }
		      System.out.println(output);
		    }
		
	}


