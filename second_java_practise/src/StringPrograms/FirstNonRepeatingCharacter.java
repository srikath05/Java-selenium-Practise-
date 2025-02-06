package StringPrograms;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
//    String inputt = "loveleetcode";
//
//    for (int i = 0; i < inputt.length(); i++) {
//        char c = inputt.charAt(i);
//        // Check if the character appears only once in the string
//        if (inputt.indexOf(c) == inputt.lastIndexOf(c)) {
//            System.out.println("First non-repeating character: " + c);
//            return;
//        }
//        // If no non-repeating character is found
//       
//    }
//    System.out.println("No non-repeating character found.");
		////////////////////////////////////////////////////////////////////////////////////////////////
    
  //  String input1 = "aabccffed";
    String input1 = "loveleetcode";

    System.out.print("Non-repeating characters1: ");
    
    for (int j = 0; j< input1.length(); j++) {
        char ch = input1.charAt(j);
        // Check if the character appears only once in the string
        if (input1.indexOf(ch) == input1.lastIndexOf(ch)&& input1.indexOf(ch)==j) {    //Non repeating characters
        	
       // 	   if (input1.indexOf(ch) != input1.lastIndexOf(ch)&& input1.indexOf(ch)==j) { //repeating characters
        	
            System.out.print(ch + " ");
            // Print the non-repeating character
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Second non repeating characters
    String input = "loveleetcodes";

    int SecondnonRepeating = 0;

    for (int k = 0; k < input.length(); k++) {
        char cc = input.charAt(k);
        // Check if the character appears only once in the string
        if (input.indexOf(cc) == input.lastIndexOf(cc)) {
        	SecondnonRepeating++; // Increment the count for non-repeating characters

            if (SecondnonRepeating == 2) { // If this is the second non-repeating character
            	System.out.println();
                System.out.println("Second non-repeating character: " + cc);
                return;
            }
        }
    }

    // If there is no second non-repeating character
    System.out.println("No second non-repeating character found.");
    
    // non reapeting numbers
    
    int[] arr = {1, 1, 2, 3, 3, 4, 5, 5};
	 
	for(int i=0;i<arr.length;i++) {
		boolean uni = true;
		for(int j=0;j<arr.length;j++) {
			if(i!=j && arr[i]==arr[j]) {
				uni = false;
				break;
			}
		}
		if(uni) {
			System.out.println(arr[i] + " ");
		}
	}
    
   }   
}
	    


