package StringPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5};

		        // Convert array to List
		        List<Integer> list = new ArrayList<>();
		        for (int num : arr) {
		            list.add(num);
		        }

		        // Use a Set to remove duplicates
		        Set<Integer> set = new HashSet<>(list);

		        // Convert the Set back to a List if needed
		        List<Integer> uniqueList = new ArrayList<>(set);

		        // Print the result
		        System.out.println("List without duplicates: " + uniqueList);
		        
//		        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5};
//
//		        System.out.print("Duplicate elements: ");
//		        for (int i = 0; i < arr.length; i++) {
//		            for (int j = i + 1; j < arr.length; j++) {
//		                if (arr[i] == arr[j]) {
//		                    System.out.print(arr[i] + " ");
//		                    break; // Skip further checks for this duplicate
//		                }
		    }
}

  