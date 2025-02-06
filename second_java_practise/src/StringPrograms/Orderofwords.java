package StringPrograms;

public class Orderofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    String input = "My name is Srikanth";
	        String[] words = input.split(" ");  // Split input into words
	        String reversed = "";

	        // Loop through the words array from the end to the beginning
	        for (int i = words.length - 1; i >= 0; i--) {
	        	
	            reversed += words[i]+ " ";  // Concatenate each word
	        }

	        // Remove the extra space at the end
	        System.out.println(reversed);
	    }
	}


