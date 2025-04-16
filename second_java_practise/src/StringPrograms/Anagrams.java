package StringPrograms;
import java.util.Arrays;
public class Anagrams {

	public static void main(String[] args) {
	
		
		        String a = "listern";
		        String t = "silentr";

		     // Check if lengths are different
		        if (a.length() != t.length()) {
		            System.out.println("The strings are not anagrams.");
		          //  return;
		        }

		        // Sort the characters of both strings
		        char[] aChars = a.toCharArray();
		        char[] tChars = t.toCharArray();

		        Arrays.sort(aChars);
		        Arrays.sort(tChars);

		        // Compare the sorted arrays
		        if (Arrays.equals(aChars, tChars)) {
		            System.out.println("The strings are anagrams.");
		        } else {
		            System.out.println("The strings are not anagrams.");
		        }
		    }
		}


