package StringPrograms;

import java.util.Arrays;
import java.util.List;

public class LargestWord2 {  
 public static void main(String[] args) {
		 
	 String[] Names = {"Srikanth", "Rickyganji", "SriHamsiniganji"};
	 
	 String largest ="";
	 
	 for(int i=0;i<Names.length;i++) {
		 
		 if(Names[i].length()>largest.length()) {
			 largest = Names[i];
		 }
	 }System.out.println(largest);
	 
	 
	  //second and largest word	
	 
	 
	 String[] input = {"Srikanth", "ganjiSriansh", "SriHamsiniganji"};
	 
	 String Largest ="";
	 String secondlargest = "";
	 
	 for(int i=0;i<input.length;i++) {
		 
		 if(input[i].length()>Largest.length()) {
			 secondlargest = Largest;
			 Largest = input[i];
		 }else if(input[i].length()>secondlargest.length()&& input[i].length()<Largest.length()) {
			 
			 secondlargest = input[i];
		 }
	 }
	 System.out.println("Largest " + Largest + " - Length : " + Largest.length());
	 
	 System.out.println("Secondlargest " + secondlargest + " - Length : " + secondlargest.length());
	
	 //smallest word
	 
	 String[] arr = {"Srikanth", "Rickyganji", "SriHamsiniganji"};
	 
	 String smallest = arr[0]; 
	 
	 for(int i=0;i<arr.length;i++) {
		 
		 if(arr[i].length()<smallest.length()) {
			 smallest = arr[i];
		 }
	 }
	 System.out.println("smallest name in array is : " + smallest + " - Length " + smallest.length());
	 
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
	
			
      
      // Print max of 6 characters

	    List<String> inputList = Arrays.asList("Testing", "QA", "Automation", "SDET", "Code", "Python");

      // Loop through the list and find the word with exactly 6 characters
      for (String word : inputList) {
          if (word.length() == 7) {
              System.out.println("word which as max of 6 char length : " + word);
          }
      }
      
 }}

