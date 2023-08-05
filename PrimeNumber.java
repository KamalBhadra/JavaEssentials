package JavaProgramms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, count = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number");
		num = s.nextInt();
		
		for(i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("\nIt is a prime Number");
		else
			System.out.println("\nIt is not a prime Number");

	}
}