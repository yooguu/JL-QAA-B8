package com.javaprogram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner (System.in);
		int num1;
		int num2;
		
		try {	
		System.out.println("Enter the first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		num2 = scan.nextInt();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new Exception("you cant input String!");
		}
		
		System.out.println("Addition: " + (num1 + num2));
		System.out.println("Subtraction: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));
		System.out.println("Division: " + (num1 / num2));
		

	}

}
