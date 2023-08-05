package JavaProgramms;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, a, temp;
		int number = 153;
		temp = number;
		while (number > 0) {
			a = number % 10;
			number = number / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");
	}

}
