package selenium_package;

public class FibanacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*int a=0,n=10;
		int b=1;
		int c=0;
		System.out.print("FibanacciSeries of "+ n + " = " + a+" "+b);
		
			while(c<=n)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.print( " " +c);
			}*/
			
		int n = 10; // Number of terms 
        int a = 0, b = 1, c;

        System.out.println("Fibonacci Series:");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
		}
	

	}