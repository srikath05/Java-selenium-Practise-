package StringPrograms;

public class PrimeIndexCharacters {

		   public static void main(String[] args) {
			   String input = "HelloWorldHieveryone";

		        System.out.print("Characters at prime indices: ");
		        for (int i = 2; i < input.length(); i++) { // Start from index 2
		            boolean isPrime = true;

		            // Check if the current index is prime
		            for (int j = 2; j < i; j++) {
		                if (i % j == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		            // If the index is prime, print the character
		            if (isPrime) {
		                System.out.print(input.charAt(i));
		            }
		        }
		    }
	     }

