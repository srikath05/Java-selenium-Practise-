package StringPrograms;

public class FirstNonRepeatingCharacter {

		    public static int firstNonRepeatingCharacter(String s) {
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            // Check if the character occurs only once in the string
	            if (s.indexOf(c) == s.lastIndexOf(c)) {
	                return i;
	            }
	        }
	        return -1; // No non-repeating character found
	    }

	    public static void main(String[] args) {
	        String input = "loveleetcode";
	        int result = firstNonRepeatingCharacter(input);
	        System.out.println("The index of the first non-repeating character is: " + result);
	    }
	}


