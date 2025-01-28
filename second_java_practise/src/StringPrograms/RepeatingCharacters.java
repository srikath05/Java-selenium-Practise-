package StringPrograms;

public class RepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "loveleetcode";
		System.out.print("Repeating character are : ");
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(input.indexOf(ch) != input.lastIndexOf(ch)&& input.indexOf(ch)==i) {
				System.out.print(ch + " ");
			}
		}

	}

}

