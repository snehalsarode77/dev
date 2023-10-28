package com.gfg.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InputOutput {

	public static void main(String args[]) throws IOException {

		// Creating object of Scanner class to
		// read input from keyboard
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter an integer");

		// Using nextInt() to parse integer values
		int a = scn.nextInt();

		System.out.println("Enter a String");

		// Using nextLine() to parse string values
		String b = scn.nextLine();
		// nextLine() does not read values from console and cursor will not come into
		// console it will skip that step.

		String b1 = scn.nextLine();
//use one more call of nextLine() method bz it will consume the newline character. 
		
		 String s = scn.nextLine();
	     System.out.println("You entered string " + s);

		/*
		 * System.out.printf("You have entered:- " + a + " " + "and name as " + b);
		 */
		System.out.printf("You have entered:- " + a + " " + "and name as " + b1);
		
		 float n = 2324435.3f;

	        // here number is formatted from right margin and
	        // occupies a width of 20 characters
	        System.out.printf(
	            "Formatted to right margin: n = %20.4f\n", n);
	        
	        double income = 23456.789;
	        
	        DecimalFormat ft = new DecimalFormat("$#####.##");
	        System.out.println("Your Formatted Dream Income : "
	                           + ft.format(income));

	}
}
