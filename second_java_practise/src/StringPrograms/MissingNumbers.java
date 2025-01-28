package StringPrograms;

public class MissingNumbers {

	public static void main(String[] args) {
		
		 int[] arr = {1, 2, 4, 6, 7}; // Input sorted array

	        System.out.print("Missing numbers: ");

	        // Loop through the range between the smallest and largest element in the array
	        for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
	        	
	            boolean isMissing = true; // Assume the current number is missing

	            // Check if the number exists in the array
	            for (int j = 0; j < arr.length; j++) {
	            	
	                if (arr[j] == i) { // If found, mark as not missing
	                	
	                    isMissing = false;
	                    
	                    break; // Exit the inner loop early
	                }
	            }

	            // If the number is still marked as missing, print it
	            if (isMissing) {
	            	
	                System.out.print(i + " ");
	            }
	        }
	}

}
