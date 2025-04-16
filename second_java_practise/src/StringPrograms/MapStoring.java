package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class MapStoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    Map<Integer, String> map = new HashMap<>();
		     
		     map.put(1, "Ram");
		     map.put(2, "raju");
		     map.put(3, "Sita");
		     map.put(4, "hamsi");
		     
		     for(int key : map.keySet()) {
		    	 
		    	 System.out.println(key + map.get(key));
		        }
		     
		     
		     int keyToFind = 2;
		     String value = map.get(keyToFind);

		     if (value != null) {
		         System.out.println("Value for key " + keyToFind + " is: " + value);
		     } else {
		         System.out.println("Key " + keyToFind + " not found in the map.");
		     }
		 	     
		     String valueToFind = "raju";

		     for (Map.Entry<Integer, String> entry : map.entrySet()) {
		         if (entry.getValue().equals(valueToFind)) {
		             System.out.println("Key for value '" + valueToFind + "' is: " + entry.getKey());
		         }
		     }
		     
		   }
		 
		}
