package StringPrograms;

public class HigestElementInaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int[] array = {12, 35, 1, 10, 34, 99};

			/*
			 * if (array.length == 0) { 
			 * System.out.println("Array is empty."); return; }
			 */

	        int highest = array[0]; // Assume the first element is the highest

	        // Iterate through the array to find the highest integer
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > highest) {
	                highest = array[i];
	            }
	        }

	        System.out.println("The highest element in the array is: " + highest);

	}

}
