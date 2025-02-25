package StringPrograms;

public class Firstletterintocapitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // String words = "this is interview for srikANTH";
				
				//This Is Interview For Srikanth
				
				String input = "this is interview for srikANTH";
		        String[] words = input.toLowerCase().split(" ");
		        String result = "";

		        for (String word : words) {
		            
		                result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
						 //Character.toUpperCase(word.charAt(0)) - Capitalizes the first letter. 
		                // word.substring(1) → Extracts the remaining letters after the first character.		 
						 }
		        
		        

		      //  result = result.trim(); // Remove trailing space
		        System.out.println(result);  // Output: "This Is Interview For Srikanth"
		        
				}
		

	}

