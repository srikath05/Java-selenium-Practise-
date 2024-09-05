package practiseofInterface;

public class Carsinfo extends Magnacar {

	int tyres;
	String model;
	String audio;
	String windows;
	int seats;
	String lights;
	
		public int seats()
		{
		 int seats=5;
		 return seats;
		}
		public String lights()
		{
			String lights="fog lights available";
			return lights;
		}
		
		public void printdetails()
		{
			System.out.println("tyres "+tyres+" model "+model+" audio"+audio+" windows "+windows );
			
		}
		
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Carsinfo detail=new Carsinfo();
			detail.tyres = detail.tyres();
			detail.model = detail.model();
			detail.audio = detail.audio();
			detail.windows = detail.windows();
			detail.seats = detail.seats();
			detail.lights = detail.lights();
			detail.printdetails();
			
			
			
		}
	
}
