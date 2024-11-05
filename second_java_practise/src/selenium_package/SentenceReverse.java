package selenium_package;

public class SentenceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "hello world welcome to automation testing";
	        String[] words = str.split(" ");
	        String result = "";

	        // Reverse each word using a basic for loop
	        for (int i = 0; i < words.length; i++) {
	            String word = words[i];
	            String reversedWord = "";

	            // Reverse the word
	            for (int j = word.length() - 1; j >= 0; j--) {
	                reversedWord += word.charAt(j);  // Reverse character-by-character
	            }

	            // Concatenate the reversed word with space
	            result += reversedWord + " ";
	        }

	        // Trim the final result to remove the trailing space and print
	        System.out.println(result);
	       
	    	}

}
