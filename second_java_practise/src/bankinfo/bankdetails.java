package bankinfo;

public class bankdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bank sri=new corp();
		System.out.println("corp bank details  "+"interest rate :"+sri.intrest()+", "+"loan :"+sri.loan()+", "+"withdrawlimit :"+sri.withdrawlimit());
					
		Bank sri1=new andhra();
		System.out.println("andhra bank details  "+"interest rate :"+sri1.intrest()+", "+"loan :"+sri1.loan()+", "+"withdrawlimit :"+sri1.withdrawlimit());
		
		Bank sri2=new axis();
		System.out.println("axis bank details  "+"interest rate :"+sri2.intrest()+", "+"loan :"+sri2.loan()+", "+"withdrawlimit :"+sri2.withdrawlimit());
		
		
	}

}
