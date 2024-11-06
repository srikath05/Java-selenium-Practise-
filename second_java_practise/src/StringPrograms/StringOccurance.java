package StringPrograms;

import java.util.Scanner;

public class StringOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "The quick brown fox jumps over the lazy dog. The dog barked.";
		// System.out.println(text.toLowerCase() + " " + text.toUpperCase());
		String sentence = text.toLowerCase();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sub string : ");
		String substring =sc.nextLine();
		 
		String occurrences = CountOccurrences(sentence, substring);
		//System.out.println("substring " +substring +" occurs " + occurrences + " times.");

		
	}

public static String CountOccurrences(String str, String substring)
{
     
      int count = (str.split(substring, -1).length) - 1;
      
      System.out.println("The substring " + substring + " occurs " + count + " times.");
	return substring;
}}
