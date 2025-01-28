package StringPrograms;

public class Firstletterintocapitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        String s = "my name is srikanth";
		        
		        String[] words = s.split(" ");
		        
		        String result = "";

		        // Loop through each word in the array
		        for (int i = 0; i < words.length; i++) {
		        	
		            String word = words[i];
		            
		            // Capitalize the first letter and add the rest of the word
		          	  result += Character.toUpperCase(word.charAt(0)) + word.substring(1);
		            
//		            if (word.length() > 1) {
//		            word = word.charAt(0) + Character.toUpperCase(word.charAt(1)) + word.substring(2);
//		            }
//		            
//		            result += word;
		            // Add a space between words except for the last one
		            if (i < words.length - 1) {
		            	
		                result += " ";
		            }
		        }
		        
		        // Print the final result
		        System.out.println(result);
		

	}

}
