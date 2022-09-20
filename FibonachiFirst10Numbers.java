package com.syntax.group.project;

public class FibonachiFirst10Numbers {

	public static void main(String[] args) {
	/*Write a Java Program to print the first 10 numbers of
	 * Fibonacci series.
	 * */
		int num1=0;
		int num2=1;
		
		for (int i=1; i<=10; i++) {
			System.out.print(num1+" ");
			
			int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
		}

	}

}
