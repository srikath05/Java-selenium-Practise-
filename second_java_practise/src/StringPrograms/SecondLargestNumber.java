package StringPrograms;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int[] array = {12, 35, 1, 10, 34, 36};

//	        if (array.length < 2) {
//	            System.out.println("Array must have at least two elements.");
//	            return;
//	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE; // Initialize with a very low value

	        // Loop through the array to find the largest and second-largest
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > largest) {
	                secondLargest = largest;
	                largest = array[i];
	            } else if (array[i] > secondLargest && array[i] != largest) {
	                secondLargest = array[i];
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("No second-largest element found.");
	        } else {
	            System.out.println("The second-largest element is: " + secondLargest);
	        }
	}
	
	

}
