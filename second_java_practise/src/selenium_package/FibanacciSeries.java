package selenium_package;

public class FibanacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+","+b);
		try {
			while(c<=20)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.print( "," +c);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is : "+e);

		}
		finally
		{
			System.out.println("program executed");
		}

	}

	public void method1() {

	}
	public void method2()
	{

	}
}