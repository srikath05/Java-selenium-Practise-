package selenium_package;

public class SumOfPrimenumbers {

		    public static void main(String[] args) {
	        int count = 0; // Number of primes found
	        int sum = 0;   // Sum of primes
	        
	        // Loop through numbers to find primes
	        for (int number = 2; count < 100; number++) {
	            boolean isPrime = true; // Assume number is prime
	            
	            // Check if the number is prime
	            for (int i = 2; i <= number/2; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            
	            if (isPrime) {
	                sum += number; // Add the prime number to the sum
	                count++;       // Increment the count of primes
	            }
	        }
	        
	        System.out.println("The sum of the first 100 prime numbers is: " + sum);
	    }
	}

	
 
