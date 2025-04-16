package StringPrograms;

public class VowelsRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       String str = "HelloWorldHieveryone";

		       System.out.println(str.length());
		       String vowels = "AEIOUaeiou";
		       
		       String result = "";
		       int vowelCount = 0, consonantCount = 0;
		       for(char ch : str.toCharArray()) {
		      	 
		      	 if(vowels.indexOf(ch) !=-1	){
		      		 
		      		 vowelCount++;
		      		 
		      		 result = ch + result;
		      		 
		      		 result +="$";
		      		 
		      	 }else {
		      		result +=ch;
		      		 
		      		consonantCount++;
		      	 }
		      
		       }	 System.out.println(" print only vowels :" + result);
		     
		       System.out.println("count of = " + "vowelCount : "+  vowelCount + " and  " + "consonantCount : " + consonantCount);
		    }
		}


