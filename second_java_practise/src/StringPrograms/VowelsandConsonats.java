package StringPrograms;

public class VowelsandConsonats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				String str = "HelloWorldHieveryone";
				str = str.toLowerCase();
				String result ="";
				int vowels =0,consonats =0;
								  
				   // for (int i = 0; i < str.length(); i++) {
				    //    char c = str.charAt(i);

				        for(char c : str.toCharArray()) {
				  
				            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				               vowels++;
				                result +="$";
				               
				            } else {
				                consonats++;
				                result +=c;
				            }
				          }
				System.out.println(str +" = " + result);
				System.out.println("vowels = " + vowels + "," + "consonats = " + consonats);
			
			      String str1 = "HelloWorldHieveryone";
			        
			        String Vowels = "aeiouAEIOU";
			        String Result = "";

			        // Collect vowels from the string
			        for (char ch : str.toCharArray()) {
			            if (Vowels.indexOf(ch) != -1) {
			                Result = ch + Result; // Reverse order storage
			            }
			        }

			        // Print vowels in reverse order
			        System.out.println("Vowels in reverse order: " + Result);
			    }
	}
	
