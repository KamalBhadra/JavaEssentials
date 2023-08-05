package JavaProgramms;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 14, 47, 94, 94, 52, 86, 36, 94, 89 };
		int largest = 0;
		int secondlargest = 0;
		System.out.println("The Given array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondlargest) {
				secondlargest = arr[i];
			}
		}
		System.out.println("\nSecond largest number is" + secondlargest);
		System.out.println("\nlargest number is" + largest);

		
	}

}
