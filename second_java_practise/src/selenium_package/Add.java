package selenium_package;

public  class Add extends Calc{

	public   int addition(int a,int b)
	{
		int c;
		c= a+b;
		System.out.println("Add is "+c);
		return c;		 
		
		
		}
	
	public   void message() {
		
		
		System.out.println("hello");
	}
	public static void main(String[] args)
	{
			
	}}
	
	/*
 * 
 * public static class SoftAssertion {
 * 
 * @Test public static void softAssert(){ SoftAssert softAssertion= new
 * SoftAssert(); System.out.println("softAssert Method Was Started");
 * softAssertion.assertTrue(false);
 * 
 * System.out.println("softAssert Method Was Executed");
 * softAssertion.assertAll(); }
 * 
 * @Test public void hardAssert(){
 * 
 * System.out.println("hardAssert Method Was Started");
 * Assert.assertTrue(false);
 * System.out.println("hardAssert Method Was Executed"); } } }
 */