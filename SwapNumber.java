package JavaProgramms;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp;
		System.out.println("Enter a and b");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping"+ a+ b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping"+a + b);
		

	}

}
