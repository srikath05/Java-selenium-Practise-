package selenium_package;

import selenium_package.Add;
import selenium_package.Sub;



public class Practiceofmethodscalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int add=Add.add(a, b);
		int sub=Sub.sub(a, b);
		
		int div=Div.div(a, b);
		String str="sri";
		
		print(add, sub, str);
		
	}
		
		public static void print(int val1,int val2,int val3)
		{
			System.out.println("val "+","+ val1 +","+ val2 +","+ val3);
		}
		public static void print(int val1,int val2,String val)
		{
			System.out.println("val "+","+ val1 +","+ val2 +","+ val);
		}

}
