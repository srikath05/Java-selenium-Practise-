package StringPrograms;
import java.util.Arrays;
public class Anagrams {

	public static void main(String[] args) {
	
		
		        String a = "listern";
		        String t = "silent";

		        // Check if the strings are anagrams
		        if (isAnagram(a, t)) {
		            System.out.println("The strings are anagrams.");
		        } else {
		            System.out.println("The strings are not anagrams.");
		        }
		    }

		    static boolean isAnagram(String a, String t) {
		        // Check if lengths are different
		        if (a.length() != t.length()) {
		            return false;
		        }

		        // Sort the characters of both strings
		        char[] aChars = a.toCharArray();
		        char[] tChars = t.toCharArray();

		        Arrays.sort(aChars);
		        Arrays.sort(tChars);

		        // Compare the sorted arrays
		        return Arrays.equals(aChars, tChars);
		    }
		}


