package JavaProgramms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int num, a = 0, b = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times");
		num=sc.nextInt();
		System.out.println("Fibonacci Series of Number is");
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+ "  "+" ");
		}

	}
}