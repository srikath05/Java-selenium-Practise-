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
        // for (int i = 0; i < items.size(); i++) {
        // String item = items.get(i);
            
            for(String item : items) {
            if (occurrenceMap.containsKey(item)) {
                occurrenceMap.put(item, occurrenceMap.get(item) + 1);
            } else {
            	
                occurrenceMap.put(item, 1);
            }
        }
       
        // Print the result
        System.out.println(occurrenceMap);
        
        String names = "i am a automation Tester a automation Tester Tester";
        
        String[] Name = names.split(" ");
        
        Map<String, Integer> mapocc = new HashMap<>();
        
        int maxcount = 0;
        
        String maxwordfreq = "";
        
        for(String word : Name) {
        	
        	 		
        		mapocc.put(word, mapocc.getOrDefault(word, 0)+1);
        		
          	if(mapocc.get(word)>maxcount) {
          		
          		maxcount = mapocc.get(word);
          		maxwordfreq = word;
          	}
                			
        }
	
        System.out.println(maxwordfreq + " = occured : " + maxcount);
	
        //////////////////////////////////////////////////////////////////
        
        String Names = "i am test automation Tester test automation Tester  Tester test test Tester";
   	 
   	 
   	 String[] words = Names.split(" ");
   	 
   	 int Maxcount =0;
   	 int secmaxcount = 0;
   	 String topfreqword = "";
   	 String sectopfreqword = "";
   	 Map<String, Integer> Mapocc = new HashMap<>();
   	 
   	 for(String word : words) {
   		 
   		 Mapocc.put(word, Mapocc.getOrDefault(word,0)+1);
   	 } 
   		 for (Map.Entry<String, Integer> entry : Mapocc.entrySet()) {
   			 
   		 int count = entry.getValue();
   		 if(count>Maxcount) {
   			 secmaxcount = Maxcount;
   			sectopfreqword = topfreqword;
   			Maxcount = count;
   			 topfreqword = entry.getKey();
   		 }else if(count>secmaxcount && count<Maxcount) {
   			 secmaxcount = count;
   			 sectopfreqword = entry.getKey();
   		 }
   	 }
   	 System.out.println(topfreqword + " : "+maxcount + mapocc );
   	 System.out.println(sectopfreqword + " : "+secmaxcount);
     
        
	
} }

