package StringPrograms;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        String input = "selenium 123java456";

		        // Using Regex to extract only alphabets
		        String output = input.replaceAll( "[^a-zA-Z]", "");

		      System.out.println(output);  // Output: seleniumjava
		    }
		
	}


