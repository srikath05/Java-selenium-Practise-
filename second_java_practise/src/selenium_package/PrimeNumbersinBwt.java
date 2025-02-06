package selenium_package;

public class PrimeNumbersinBwt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int n =100; n<=200; n++) {
		
	boolean isPrime = true;
	
	for(int i =2;i<n/2;i++) {
		if(n%i==0) {
			
			isPrime = false;
			break;
		}
	}
	if(isPrime) {
		System.out.println(n +" ");
	}
	
	}
	
	}
	

}
