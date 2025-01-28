package StringPrograms;

public class SentenceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "hello world welcome to automation testing";
	        String[] words = str.split(" ");
	        

	        // Reverse each word using a basic for loop
	        for (int i = 0; i < words.length; i++) {
	        	
	            String word = words[i];
	            
	            String reversedWord = "";

	            // Reverse the word
	            for (int j = word.length() - 1; j >= 0; j--) {
	            	
	                reversedWord += word.charAt(j);  // Reverse character-by-character
	            }
	            System.out.print(reversedWord + " ");
	            // Concatenate the reversed word with space
	           
	        }
	       
	    	}

}
