package selenium_package;

public class PrimeNumbersinBwt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("prime numbers between 100 and 200 :");
	for(int n =100; n<=200; n++) {
		
	boolean isPrime = true;
	
	for(int i =2;i<n/2;i++) {
		if(n%i==0) {
			
			isPrime = false;
			break;
		}
	}
	if(isPrime) {
		System.out.print( n +" ");
	}
	
	
	}
	
	System.out.print("\n \n First 10 prime numbers ");
	
	int count = 0;

    for (int num = 2; count < 10; num++) {
        boolean isPrime = true;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.print( num + " ");
            count++;
        }
    }
	}

}
