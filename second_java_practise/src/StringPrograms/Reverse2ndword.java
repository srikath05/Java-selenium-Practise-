package StringPrograms;

import java.lang.reflect.Array;

public class Reverse2ndword {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I love programming";
       
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Check if the sentence has at least two words
        if (words.length > 1) {
            // Reverse the second word manually
            String secondWord = words[1];
            String reversedSecondWord = "";
            for (int i = secondWord.length() - 1; i >= 0; i--) {
                reversedSecondWord += secondWord.charAt(i);
            }
            words[1] = reversedSecondWord;
        }

        // Join the words back into a sentence
        System.out.println(String.join(" ", words));
    }
}

	


