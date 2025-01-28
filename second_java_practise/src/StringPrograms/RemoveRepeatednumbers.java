package StringPrograms;

public class RemoveRepeatednumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        int[] repetedNums = {1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8};

	        // Traverse the array and print unique elements
	       for (int i = 0; i < repetedNums.length; i++) {
	            boolean isDuplicate = false;
	            
	            // Check if current element has appeared before
	            for (int j = 0; j < i; j++) {
	                if (repetedNums[i] == repetedNums[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	             // If it's not a duplicate, print it
	            if (!isDuplicate) {
	                System.out.print(repetedNums[i] + " ");
	            }
	        }
	          	
	}

}
