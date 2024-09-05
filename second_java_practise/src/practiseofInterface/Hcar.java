package practiseofInterface;

public class Hcar implements car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hcar CarD = new Hcar();
		
car Icar = new Hcar();
	}

	@Override
	public int tyres() {
		// TODO Auto-generated method stub
		
		return 4;
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return "Newmodel";
	}

	@Override
	public String audio() {
		// TODO Auto-generated method stub
		return "Yes";
	}

	@Override
	public String windows() {
		// TODO Auto-generated method stub
		return "Power Window";
	}

	@Override
	public String lights() {
		// TODO Auto-generated method stub
		return "LED";
	}
	
	

}
