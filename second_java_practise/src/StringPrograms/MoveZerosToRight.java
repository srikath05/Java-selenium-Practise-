package StringPrograms;
import java.util.Arrays;

public class MoveZerosToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 0, 30, 0, 2, 0, 4, 0 ,6};

        int index = 0; // Pointer for non-zero elements
        
        
        Arrays.sort(arr);
        System.out.println("sorting the array " + Arrays.toString(arr));
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
        
        int[] arr1 = {1, 0, 30, 0,-2, 2, 0, 4, 0 ,6,0,0};
        
        int index1 = arr1.length-1; 
        
        for (int i = arr1.length - 1; i >= 0; i--) {
        	 Arrays.sort(arr1);
            if (arr1[i] != 0) {
            	
                arr1[index1] = arr1[i]; // Move non-zero element to the end
                
                index1--;
               // Arrays.sort(arr1);
            }
        }
        
        // Fill the remaining part of the array with zeros
        for (int i = index1; i >= 0; i--) {
            arr1[i] = 0;
        }
       // Arrays.sort(arr1);
        System.out.println("Array after moving zeros to the Left: " + Arrays.toString(arr1));
        

    }
	
	
	
}
