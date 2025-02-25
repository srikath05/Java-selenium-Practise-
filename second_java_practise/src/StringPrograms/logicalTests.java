package StringPrograms;

public class logicalTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    String s1 = "srikanth";  
	        String s2 = "srikanth";  

	        //   boolean s3 = s1.equals(s2);  // Case-sensitive comparison false

	        String s3 = "srikanth";  
	        String s4 = "srikanth"; 
	      System.out.println("2." + s3);
	       boolean s5 =  s3.equals(s4);
	       System.out.println("1 " + s5);
	        
	       System.out.println("Srikanth s2 and s3 :" + s2 == s3);
	        
	      //  String s3 = s1;  // Assigning the value of s1 to s3

	      //  System.out.println(s3);  // Output: "srikanth"
	        
	      //  boolean s3 = s1.equals(s2);  // Case-sensitive comparison

	      //  System.out.println(s3);  // Output: true
	        
	        
	        Integer i1 = 127;
	        Integer i2 = 127;
	        System.out.println(i1 == i2); // Comparison using '=='
	 
	        Integer i3 = 128;
	        Integer i4 = 128;
	        System.out.println(i3 == i4); // Comparison using '=='
	 
	        Integer i5 = 127;
	        Integer i6 = 127;
	        System.out.println(i5 == i6); // Comparison using '=='
	        
//output    true   // i1 == i2: Both refer to the same cached Integer object (127 is within the cache range)
//	        false  // i3 == i4: Different objects created for values outside the cache range (128)
//	        true   // i5 == i6: Both refer to the same cached Integer object (127 is within the cache range)

	        
	        String a = "Test";
	        String b = "Test";
	        String c = new String("Test");

	        System.out.println(a == b);  // Compare references
	        System.out.println(a == c);  // Compare references
	        
	      //output  true   // a == b because they point to the same string literal in the pool
	      //output   false  // a == c because a is a string literal and c is a new object

	}

}
