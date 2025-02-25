package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
//    String inputt = "loveleetcode";
//
//    for (int i = 0; i < inputt.length(); i++) {
//        char c = inputt.charAt(i);
//        // Check if the character appears only once in the string
//        if (inputt.indexOf(c) == inputt.lastIndexOf(c)) {
//            System.out.println("First non-repeating character: " + c);
//            return;
//        }
//        // If no non-repeating character is found
//       
//    }
//    System.out.println("No non-repeating character found.");
		////////////////////////////////////////////////////////////////////////////////////////////////
    
  //  String input1 = "aabccffed";
    String input1 = "loveleetcode";

    System.out.print("Non-repeating characters1: ");
    
    for (int j = 0; j< input1.length(); j++) {
        char ch = input1.charAt(j);
        // Check if the character appears only once in the string
        if (input1.indexOf(ch) == input1.lastIndexOf(ch)&& input1.indexOf(ch)==j) {    //Non repeating characters
        	
       // 	   if (input1.indexOf(ch) != input1.lastIndexOf(ch)&& input1.indexOf(ch)==j) { //repeating characters
        	
            System.out.print(ch + " ");
            // Print the non-repeating character
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Second non repeating characters
    String input = "loveleetcodes";

    int SecondnonRepeating = 0;

    for (int k = 0; k < input.length(); k++) {
        char cc = input.charAt(k);
        // Check if the character appears only once in the string
        if (input.indexOf(cc) == input.lastIndexOf(cc)) {
        	SecondnonRepeating++; // Increment the count for non-repeating characters

            if (SecondnonRepeating == 2) { // If this is the second non-repeating character
            	System.out.println();
                System.out.println("Second non-repeating character: " + cc);
                return;
            }
        }
    }
    
    String inputword = "my name is srikanth and my my name";
	
	String[] words = inputword.split(" ");
	  System.out.println("most frequently occurred word in the string : ");
	Map<String,Integer> maxchar = new HashMap<>();
	
	//int maxcount =Integer.MAX_VALUE; // for lowest frequency char 
	int maxcount = 0;
	String maxcharacter = "";
	
	for(String  ch : words) {
		
		maxchar.put(ch , maxchar.getOrDefault(ch, 0)+1);
		
		if(maxchar.get(ch)>maxcount) {
			
			maxcount = maxchar.get(ch);
			maxcharacter = ch;
		}
	}
	System.out.println(maxcharacter);
	
	/////////////////////////////     
	
	  String input3 = "loveleetcodes";
	  
	  System.out.println("most frequently occurred character in the string : ");
	  HashMap<Character, Integer> charCountMap = new HashMap<>();
      int maxCount = 0;
      char mostFrequentChar = ' ';

      // Count frequency of each character
      for (char ch : input3.toCharArray()) {
          charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
          
          // Update most frequent character if new max found
          if (charCountMap.get(ch) > maxCount) {
              maxCount = charCountMap.get(ch);
              mostFrequentChar = ch;
          }
      }
      System.out.println(mostFrequentChar);

    // If there is no second non-repeating character
 //   System.out.println("No second non-repeating character found.");
    
    // non reapeting numbers
    
    int[] arr = {1, 1, 2, 3, 3, 4, 5, 5};
	 
	for(int i=0;i<arr.length;i++) {
		boolean uni = true;
		for(int j=0;j<arr.length;j++) {
			if(i!=j && arr[i]==arr[j]) {
				uni = false;
				break;
			}
		}
		if(uni) {
			System.out.print(arr[i] + " ");
		}
	}
    
   }   

	    
}

