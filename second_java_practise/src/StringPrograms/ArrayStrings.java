package StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String[] Names = {"Srikanth", "Ricky", "Hamsini"};
	 //Replacing or adding name
	//Names[0] ="Shiri";
	
	// Adding a new name to the existing array
	// List<String> namesList = Arrays.asList("Srikanth", "Ricky", "Hamsini");
   //  namesList.add("NewName"); // Add new name
	
	/* names = Arrays.copyOf(names, names.length + 1); // Increase size by 1
     names[names.length - 1] = "NewName"; // Add new element*/
	
	for(int i=0; i<=Names.length;i++) {		
	
		String currentnames = Names[i];
		//System.out.println(Names[i]);
	    System.out.print(currentnames.charAt(0) + " " );//1st letter of words
		System.out.println(currentnames.charAt(currentnames.length()-1));//last letter of the words
	   // System.out.println(Names[i].charAt(Names[i].length()-1));//last letter of the words
		
	}
  }
}
