package StringPrograms;

public class VowelsandConsonats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			 String str = "Hello World";
//			 VowelConsonantCount(str);
//			 }
//	static void VowelConsonantCount(String str) {
	    int vowels = 0, consonants = 0;
	    str = str.toLowerCase();

	    for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);

	  
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                vowels++;
	            } else {
	                consonants++;
	            }
	        
	    }

	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);
	

	}

}
