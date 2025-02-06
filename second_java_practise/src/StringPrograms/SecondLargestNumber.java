package StringPrograms;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int[] array = {12, 35, 1, 10, 34, 36,40};

	     // Initialize with a very low value
     
	        int largest = 0;
	        int secondLargest = 0;
	        // Loop through the array to find the largest and second-largest
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > largest) {
	                secondLargest = largest;
	                largest = array[i];
	            } else if (array[i] > secondLargest && array[i] < largest) {
	                secondLargest = array[i];
	            }
	        }
	        System.out.println("The second-largest element is: " + secondLargest + " Largest : " + largest);

	}
}
