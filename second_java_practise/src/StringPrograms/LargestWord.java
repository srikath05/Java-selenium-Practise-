package StringPrograms;

public class LargestWord {  
 public static void main(String[] args) {
		 
	 String[] Names = {"Srikanth", "Rickyganji", "SriHamsiniganji"};
	 
	 String largest ="";
	 
	 for(int i=0;i<Names.length;i++) {
		 
		 if(Names[i].length()>largest.length()) {
			 largest = Names[i];
		 }
	 }System.out.println(largest);
	 
	 //Smallest word
	 
	  String[] Names1 = {"Srikanth", "Rickyganji", "SriHamsiniganji"};

      // Initialize the smallest word to the first element
      String smallest = Names1[0];

      // Loop through the array to find the smallest word
      for (int i = 1; i < Names1.length; i++) {
          if (Names1[i].length() < smallest.length()) {
              smallest = Names1[i];
          }
      }

      // Print the smallest word
      System.out.println("The smallest word is: " + smallest);
	 
      //Smallest number
      int[] array = {12, 35, 1, 10, 34, 36};

      // Initialize the least number with the first element of the array
      int least = array[0];

      // Loop through the array to find the least number
      for (int i = 1; i < array.length; i++) {
          if (array[i] < least) {
              least = array[i];
          }
      }

      // Print the least number
      System.out.println("The least number in the array is: " + least);
	
			
	 }
}


