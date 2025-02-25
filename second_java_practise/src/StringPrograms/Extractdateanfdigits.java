package StringPrograms;

public class Extractdateanfdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        String s = "The amazon code 1234 is dispatched on june-14";
		        
		        // Split the string by spaces
		        String[] words = s.split(" ");
		        
		        String number = "";
		        String date = "";
		        
		        // Iterate over the words array using a normal loop
		    //    for (int i = 0; i < words.length; i++) {
		       //     String word = words[i];
		            
		            for(String word : words) {
		            
		            // Check if the word is numeric (number)
		            if (word.matches("\\d+")) {
		                number = word;
		            }
		            
		            // Check if the word contains a hyphen (likely a date)
		            else if (word.contains("-")) {
		                date = word;
		            }
		        }
		        
		        // Output the extracted number and date
		        System.out.println("Number: " + number);
		        System.out.println("Date: " + date);
		
	}

}
