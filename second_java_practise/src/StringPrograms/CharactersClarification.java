package StringPrograms;

public class CharactersClarification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        String input = "Hello123456!@#WORLD";

		        int uppercaseCount = 0;
		        int lowercaseCount = 0;
		        int digitCount = 0;
		        int specialCharCount = 0;
		        String uppercase ="";
		      
		     //   for (int i = 0; i < input.length(); i++) {
		    //        char ch = input.charAt(i);
		            
		            for(char ch : input.toCharArray())

		            if (Character.isUpperCase(ch)) {
		            	System.out.print( ch );
		               uppercaseCount++;
		              } else if (Character.isLowerCase(ch)) {
		            	  System.out.print( ch );
		                lowercaseCount++;
		               
		            } else if (Character.isDigit(ch)) {
		                digitCount++;
		                
		            } else {
		                specialCharCount++;
		                
		            }
		        
		        
		        System.out.println("Uppercase letters: " + uppercaseCount );
		        System.out.println("Lowercase letters: " + lowercaseCount);
		        System.out.println("Digits: " + digitCount);
		        System.out.println("Special characters: " + specialCharCount);
		    }
}
//Explanation
//Character.isUpperCase(ch) checks if the character is uppercase.
//Character.isLowerCase(ch) checks if the character is lowercase.
//Character.isDigit(ch) checks if the character is a digit.
//If a character is none of the above, it�s counted as a special character.
