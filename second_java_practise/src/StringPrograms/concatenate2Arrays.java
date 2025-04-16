package StringPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class concatenate2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Method 1 Merged Array: " );

        int[] a = { 1, 2, 3 };
        int[] b = { 5, 6, 7, 8 };
        
        
        int[] result1 = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();

        // Print merged array
        System.out.println(Arrays.toString(result1));
        
///////////////////////////////////////////////////////////////////

                  
        System.out.println("Method 3 Merged Array: ");
            // Create a new array with the total length of a and b
            int[] results = new int[a.length + b.length];

            // Copy elements of array a
            for (int i = 0; i < a.length; i++) {
                results[i] = a[i];
            }

            // Copy elements of array b
            for (int i = 0; i < b.length; i++) {
                results[a.length + i] = b[i];
            }

            // Print merged array
            System.out.print( Arrays.toString(results));
            
       ///////////////////////////////////
            
            int[] input = {1, 2, 3, 5, 6, 7, 8};
            
            int mid = 3;
            
            int[] first = Arrays.copyOfRange(input, 0, mid);
            int[] sec = Arrays.copyOfRange(input, mid, input.length);
            
            
            System.out.println(Arrays.toString(first));
            System.out.println(Arrays.toString(sec));
        }
    		
	}


