package StringPrograms;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        String input1 = "selenium 123java456";

		        // Using Regex to extract only alphabets
		        String output2 = input1.replaceAll( "[^a-zA-Z]", "");

		      System.out.println(output2);  // Output: seleniumjava
		      
		      String input = "selenium 123java456";
		        String output = ""; // Initialize an empty string

		        // Iterate through the input string using a normal for loop
		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i); // Get the character at the current index
		          //  if (!Character.isDigit(c))
		            	if(!Character.isDigit(c))
		            { // Check if it's an alphabet
		                output += c; // Concatenate the character to the output
		            }
		        }
		      
		    }
		
	}


