package bankinfo;

public class totalbanksinfo extends corp {
	

	public static void main(String[] args) {
		
	
		Bankmethods bm=new sbi();
		{
		
			
			
			System.out.println("sbi interest rate is : " +bm.intrestrate());
			System.out.println("sbi loan is :" +bm.loan());
		}
		Bankmethods bm1=new icici();
		{
			System.out.println("icici interest rate is : " +bm1.intrestrate());
			System.out.println("icici loan is :" +bm1.loan());
		
		}
		Bankmethods bm2=new citi();
		{
			System.out.println("citi interest rate is : " +bm2.intrestrate());
			System.out.println("citi loan is :" +bm2.loan());
		
		}
		
		}
	}


