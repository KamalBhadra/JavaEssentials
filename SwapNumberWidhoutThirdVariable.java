package JavaProgramms;

import java.util.Scanner;

public class SwapNumberWidhoutThirdVariable {

	public static void main(String[] args) {
		int x, y;
		System.out.println("Enter x and y");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("after swapping widhout third variable\nx=" + x + "\ny=" + y);

	}
}

