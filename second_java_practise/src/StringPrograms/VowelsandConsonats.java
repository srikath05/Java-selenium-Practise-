package StringPrograms;

public class VowelsandConsonats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				String str = "HelloWorldHieveryone";
				str = str.toLowerCase();
				String result ="";
				int vowels =0,consonats =0;
				
				  
				    for (int i = 0; i < str.length(); i++) {
				        char c = str.charAt(i);

				  
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
			}
	}
