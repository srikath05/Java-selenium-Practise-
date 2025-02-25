package StringPrograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurancecount {

	 public static void main(String args[])
	    {		           
		 String str = "hello world hello everyone";
	
		// Create a HashMap to store the occurrence count of each character
	        Map<Character, Integer> occurrenceMap = new HashMap<>();

	     // Iterate over each character in the string
	    /*    for (int i = 0; i < str.length(); i++) {
	        	
	        	 // Get the character at the current index
	            char ch = str.charAt(i);
	            
	            // Check if the character is already in the map
	            if (occurrenceMap.containsKey(ch)) {
	            	// If it is, increment the count of this character by 1
	                occurrenceMap.put(ch, occurrenceMap.get(ch) + 1);
	            } else {
	            	 // If it's not in the map, add it with an initial count of 1
	                occurrenceMap.put(ch, 1);
	            }
	        }*/
	        
         for(char ch : str.toCharArray()) {
	        	
	        	if(occurrenceMap.containsKey(ch)) {
	        		
	        		occurrenceMap.put(ch, occurrenceMap.get(ch)+1);
        	}else {
	        		occurrenceMap.put(ch, 1);
	        	}
	        }
	        // Print the result
	        System.out.println(occurrenceMap);
			
	        
	        // Most frequent character in the string 
	        
	        String input = "loveleetcodes";
	        System.out.println("Most frequent character in the string is : ");
	          Map<Character, Integer> charCountMap = new HashMap<>();
	          int maxCount = 0;
	          char mostFrequentChar = ' ';

	          // Count frequency of each character
	          for (char ch : input.toCharArray()) {
	              charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	              
	              // Update most frequent character if new max found
	              if (charCountMap.get(ch) > maxCount) {
	                  maxCount = charCountMap.get(ch);
	                  mostFrequentChar = ch;
	              }
	          }
	          System.out.println(mostFrequentChar);
	        
	        
	        
	        
		  //String text1 = "hello world, hello everyone";
		  String text1 = "The quick brown fox jumps over the lazy dog. The dog barked.";
		  String text2 = text1.toLowerCase();
	        String substring = "dog";
	        
	        int count = text2.split(substring, -1).length - 1;
	        
	        System.out.println("The substring '" + substring + " occurs " + count + " times.");
	    }	
	
}

