package StringPrograms;

public class ArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String[] Names = {"Srikanth", "Ricky", "Hamsini"};
	 //Replacing or adding name
	//Names[0] ="Shiri";
	for(int i=0; i<=Names.length;i++) {		
	
		String currentnames = Names[i];
		//System.out.println(Names[i]);
	    System.out.print(currentnames.charAt(0) + " " );//1st letter of words
		System.out.println(currentnames.charAt(currentnames.length()-1));//last letter of the words
	   // System.out.println(Names[i].charAt(Names[i].length()-1));//last letter of the words
		
	}
  }
}
