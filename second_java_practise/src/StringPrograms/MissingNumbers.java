package StringPrograms;

public class MissingNumbers {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9};
		
		System.out.println("All numbers from : ");
		
		for(int i=arr[0];i<=arr[arr.length-1];i++) {
			
			System.out.print( i + " " );
		}
		
		System.out.println("\n\nMissing numbers : ");
		
		for(int i=arr[0];i<=arr[arr.length-1];i++) {
			
			boolean ismissing = true;
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[j]==i) {
					
					ismissing = false;
					break;
				}
			}
			if(ismissing){
				
				System.out.print(i + " ");
			}
		}
	}

}
