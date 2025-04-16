package StringPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class RemoveDuplicatesIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {1, 1, 2, 3, 3, 4, 5, 5};

	        // Create a Set to store unique elements
	        Set<Integer> set = new HashSet<>();

	        // Use a normal for loop to add elements to the Set
	        for (int i = 0; i < arr.length; i++) {
	            set.add(arr[i]);
	        }

	        // Print the unique elements
	        System.out.println("List without duplicates: " + set);
	        
	        int[] arr2 = {1, 1, 2, 3, 3, 4, 5, 5};
	        
	        int[] uniqueArray = Arrays.stream(arr2).distinct().toArray(); // Remove duplicates
	        
	        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
		        
		        // print only duplicate elements 
		        int[] arr1 = {1, 1, 2, 3, 3, 4, 5, 5};

		        System.out.print("Duplicate elements: ");
		        for (int i = 0; i < arr1.length; i++) {  // Outer loop - picks an element
		            for (int j = i + 1; j < arr1.length; j++) {  // Inner loop - compares with later elements
		                if (arr1[i] == arr1[j]) { // If duplicate is found
		                    System.out.print(arr1[i] + " ");
		                    break; // Skip further checks for this element
		           }   
		         }
		       }	        
		} 
	}
	
	
	
	
  