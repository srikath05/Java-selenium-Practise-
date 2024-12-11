package StringPrograms;

public class LargestWord {  
 public static void main(String[] args) {
		 
	 String[] Names = {"Srikanth", "Rickyganji", "Hamsini"};
	 
	 String largest ="";
	 
	 for(int i=0;i<Names.length;i++) {
		 
		 if(Names[i].length()>largest.length()) {
			 largest = Names[i];
		 }
	 }
			System.out.println(largest);
	 }
}


