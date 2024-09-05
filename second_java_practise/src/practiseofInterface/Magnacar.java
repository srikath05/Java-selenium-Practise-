package practiseofInterface;

public abstract class Magnacar implements car{
	
	public final int tyres()
	
	{
		int tyres =4;
		return tyres;
	}
	
	public String model()
	{
		String model="classic";
		return model;
	}
	
	public String audio()
	{
		String audio="Avaliable";
		return audio;
	}
	public String windows()
	{
		String windows="not power windows";
		return windows;
	}
	
	public abstract int seats();


}
