package StringPrograms;

public class LargestWord {  
 public static void main(String[] args) {
		 
		 String sentence = "srikanth shirisha srihamsini sriansh";
		  String[] words = sentence.split(" ");

		    String largest = "";
		   
		    for (int i = 0; i < words.length; i++) {
		        if (words[i].length() > largest.length()) {
		            largest = words[i];  // Update largest word
		        }
		    }System.out.println(largest);
			
	 }
}


