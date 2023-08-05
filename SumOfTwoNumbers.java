package JavaProgramms;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static double sum(double num1, double num2) {
		return num1 + num2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        double num1=sc.nextDouble();
        System.out.println("Enter Number 2");
        double num2=sc.nextDouble();
        
        double result=sum(num1,num2);
        System.out.println("The sum of two number is"+ "  "+ result);
        
	}

}
