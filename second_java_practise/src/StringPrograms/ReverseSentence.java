package StringPrograms;

public class ReverseSentence {

		 public static String reverseString(String input) {
			   String[] words = input.split(" ");  // Split the input string into words
		        String result = "";  // Initialize an empty string for the reversed sentence

		        // Loop through each word
		        for (int j = 0; j < words.length; j++) {
		            String word = words[j];  // Get the current word
		            String reversedWord = "";  // Initialize an empty string for the reversed word

		            // Reverse the current word using a simple loop
		            for (int i = word.length() - 1; i >= 0; i--) {
		                reversedWord += word.charAt(i);  // Append each character in reverse order
		            }

		            result += reversedWord + " ";  // Add the reversed word to the sentence

		              }

		        return result;  // Return the complete reversed sentence
		    }


		    public static void main(String[] args) {
		        String original = "i am a automation Tester";
		        String result = reverseString(original);
		        System.out.println("Original String: " + original);
		        System.out.println("Reversed String: " + result);
}
}