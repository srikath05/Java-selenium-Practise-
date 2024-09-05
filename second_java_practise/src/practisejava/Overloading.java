package practisejava;

public class Overloading {
	public static int add(int a,int b)
	{
		//System.out.println(a+b);
		return a+b;
	}
	public static int add(int a,int b,int c)
	{
		//System.out.println(a+b+c);
		return a+b+c;
	}
	public static void main(String[] args) {
		
	System.out.println(Overloading.add(10, 20));
	System.out.println(Overloading.add(10, 20, 30));
	
	}
}
