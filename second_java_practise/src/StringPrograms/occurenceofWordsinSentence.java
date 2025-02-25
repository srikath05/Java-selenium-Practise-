package StringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class occurenceofWordsinSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  //  List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
	    
	    String name = "i am a automation Tester a automation Tester Tester";
			
			String[] items = name.split(" ");
	    	
        Map<String, Integer> occurrenceMap = new HashMap<>();

        // Simple for loop to count element occurrences in the list
//        for (int i = 0; i < items.size(); i++) {
//            String item = items.get(i);
            
            for(String item : items) {
            if (occurrenceMap.containsKey(item)) {
                occurrenceMap.put(item, occurrenceMap.get(item) + 1);
            } else {
                occurrenceMap.put(item, 1);
            }
        }
       
        // Print the result
        System.out.println(occurrenceMap);
	}

} 

