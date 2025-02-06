package StringPrograms;

import java.util.UUID;

public class RandomAlphaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reqstring = UUID.randomUUID().toString();
		
		reqstring = reqstring.replace("-", "");
		reqstring = reqstring.substring(0,6);
		
		System.out.println("String = " + reqstring );
	}

}
