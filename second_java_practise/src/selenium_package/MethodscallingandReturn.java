package selenium_package;

import selenium_package.Add;
import selenium_package.Sub;
import selenium_package.Mul;
import selenium_package.Printer;
public class MethodscallingandReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a =10;
			int b=20;
			int c=30;
			int d=0;
			/*Add obj=new Add();
			obj.add(a, b);
			Sub obj1=new Sub();
			obj1.sub(a, b);
			Div obj2=new Div();
			obj2.div(d, e);
			Mul m = new Mul();
			int mul=m.mul(a,b);*/
			String str = "Raj";
			
			int abc = add(a,b);
			int def = sub(a,b);
			int ghi=mul(a,b);
			int jkl =Div.div(b, a);
			int mno=add(a,b,c);
		
			
			print(abc,def,ghi,jkl,mno);
			
			/*int add = Add.add(a, b);
			int sub= Sub.sub(a,b);*/
			//int div=Div.div(a, b);
			
			/*print(add,sub,mul);
			print(add,sub,str);
			Printer.print(add,sub,mul,div);*/
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static int add(int a,int b)
	{
		int c;
		c= a+b;
		return c;		 
	}
	public static int add(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
		
	}
	public static int sub(int a,int b)
	{
		int c;
		c= a-b;
		return c;		 
	}
	public static int mul(int a,int b)
	{
		int c;
		c= a*b;
		return c;		 
	}
	public static void print(int val1,int val2,int val3,int val4,int val5)
	{
		System.out.println("add " +val1+"sub "+val2+"mul "+val3+"div "+val4+", "+"add "+val5);
	}
	/*public static void print(int val1,int  val2,int val3)
	{
		System.out.println("val " +val1 + val2+val3);
	}
	public static void print(int val1,int  val2,String str)
	{
		System.out.println("val " +val1 + val2+str);
	}*/
}
