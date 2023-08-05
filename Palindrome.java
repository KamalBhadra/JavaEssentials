package JavaProgramms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result, sum = 0, temp;
		int number = 454;

		temp = number;
		while (number > 0) {
			result = number % 10; // getting reminder
			sum = (sum * 10) + result;
			number = number / 10;
		}
		if (temp == number)
			       System.out.println("Palindrom number");
		else
			System.out.println("not Palindrom number");
	}
}
