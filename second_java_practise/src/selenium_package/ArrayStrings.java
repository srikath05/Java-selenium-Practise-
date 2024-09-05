package selenium_package;

public class ArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String[] Names = {"Srikanth", "Ricky", "Hamsini"};
	 //Replacing or adding name
	Names[0] ="Shiri";
	for(int i=0; i<=Names.length;i++) {
		
	
		String currentnames = Names[i];
		System.out.println(Names[i]);
	    System.out.println(currentnames.charAt(0));
		System.out.println(currentnames.charAt(currentnames.length()-1));
		
	}
}

}
