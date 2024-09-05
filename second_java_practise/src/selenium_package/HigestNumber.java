package selenium_package;

public class HigestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=800;
		int b=900;
		int c=900;
		
		/*if((a>b)&&(a>c))
			System.out.println("a is greater");
		else if((b>a)&&(b>c))
		System.out.println("b is greater");
		
		else if((c>a)&&(c>b))
				System.out.println("c is greater");
		else 
			System.out.println(" two or more value are same");*/
		
		try {
		if((a>b)&&(a>c))
			System.out.println("a is greater");
		else if((b>a)&&(b>c))
			System.out.println("b is greater");
		else if((c>a)&&(c>b))
			System.out.println("c is is greater");
		else
			System.out.println("two or more values are same");
		}
		catch(Exception e)
		{
			System.out.println("Exception is ;"+e.getMessage());
		}
		
	}

}
