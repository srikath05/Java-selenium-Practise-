package StringPrograms;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] a = {2, 5, 6, 4, 1, 3};

        // Selection Sort Algorithm
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j; // Finding the minimum element index
                }
            }
            // Swap the found minimum element with the first element
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

        // Printing sorted array
        System.out.print("Sorted Array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
	}

}
