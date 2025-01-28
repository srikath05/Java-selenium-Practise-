package selenium_package;

public class SumOfPrimenumbers {

	 public static void main(String[] args) {
	        int count = 0; // Number of primes found
	        int sum = 0;   // Sum of primes

	        // Loop through numbers to find primes
	        for (int number = 2; count < 100; number++) {
	            if (isPrime(number)) {
	                sum += number; // Add the prime number to the sum
	                count++;       // Increment the count of primes
	            }
	        }

	        System.out.println("The sum of the first 100 prime numbers is: " + sum);
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int n) {
	        if (n < 2) return false; // Numbers less than 2 are not prime
	        for (int i = 2; i <= n / 2; i++) { // Check divisors from 2 to n/2
	            if (n % i == 0) return false; // If divisible, it's not prime
	        }
	        return true; // Prime number
	    }
	}
 
