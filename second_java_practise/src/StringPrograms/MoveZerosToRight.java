package StringPrograms;
import java.util.Arrays;

public class MoveZerosToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 0, 30, 0, 2, 0, 4, 0 ,6};

        int index = 0; // Pointer for non-zero elements

        // Traverse the array using a normal for loop
        for (int i = 0; i < arr.length; i++) {
        	
            if (arr[i] != 0) {
            	
                arr[index] = arr[i]; // Move non-zero element forward
                
                index++;
            }
        }
            // Fill the rest of the array with zeros
        for (int i = index; i < arr.length; i++) {
        	
            arr[i] = 0; 
        }
        
        System.out.println("Array after moving zeros to the right: " + Arrays.toString(arr));

	  }

   }
