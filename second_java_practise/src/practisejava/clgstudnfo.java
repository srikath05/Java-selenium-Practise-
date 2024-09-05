package practisejava;

public class clgstudnfo extends studetails{

	
	int roll;
	String clgname;
	String clgaddress;
	String depts;
	String stuname;
	int labs;
	
	public  String stuname()
	{
		String stuname="srikanth";
		return stuname;
	}
	
	public void print()
	{
		System.out.println("roll "+roll+", "+"clgname "+clgname+", "+"clgaddress "+clgaddress+", "+"dept "+depts+"Stuname "+stuname+", "+"labs "+ labs);
	}
		
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		clgstudnfo info=new clgstudnfo();
		info.clgname=info.clgname();
		info.clgaddress=info.clgaddress();
		info.depts=info.depts();
		info.roll=info.roll();
		info.stuname=info.stuname();
		info.labs=info.labs();
		info.print();
		
		/*clgstudnfo info1=new clgstudnfo();
		info1.clgaddress=info1.clgaddress();
		info1.clgname=info1.clgname();
		info1.print();*/
		
				}

	


	



}
