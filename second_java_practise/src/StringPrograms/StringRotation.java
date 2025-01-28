package StringPrograms;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string str1 :");
		String str1 = sc.nextLine();
		System.out.println("Enter string str2 :");
		String str2 = sc.nextLine();

		if(areRotations(str1, str2)) {
	System.out.println("String is rotational");
		}else {
	System.out.println("String is not rotational");
 }

	}

public static boolean areRotations(String str1, String str2) {
	
	if(str1.length()!=str2.length()) {
		System.out.println("Strings are not rotational");
		return false;
}
		return (str1+str2).contains(str2);
}
}