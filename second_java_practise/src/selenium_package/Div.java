package selenium_package;

public class Div extends Add {

	public static void main(String[] args) {
		
		Div d =new Div();// if the methods in extended class have non static method need to use this method
		d.addition(10, 20);
		//Calc c=new Calc();
		Div.div(10, 20);// if the methods in extended class have  static method need to use this method
		Div.add(10, 5);
//	Add a=new Add();// if it is not extended inheritance use this method
//	a.addition(10, 20);
//	a.message();
		//Add.addition(10, 30);
		//Add.message();
		//Div.message();
		//Add.add(80, 20);
	}
	
	public   int addition(int a,int b, int f)
	{
		int c;
		c= a+b+f;
		System.out.println("Add is "+c);
	
		return c;		 
		
		
		}
public static  void message(String str) {
		
		str="hello world";
		System.out.println(str);
	}

	public static int div(int d,int e)
	{
		int f=e/d;
		System.out.println("div is : "+f);
		return f;
} 

	
	public static int add(int e,int d) {
		
		int f=e-d;
		System.out.println("add is "+f);
		return f;
	}
	
	
	
}
