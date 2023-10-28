package com.gfg.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {

	BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));

    System.out.println("Enter an integer");

    // Taking integer input
    int a = Integer.parseInt(br.readLine());
    
    System.out.println("Enter an double value");
    double d = Double.parseDouble(br.readLine());

    System.out.println("Enter a String");

    String b = br.readLine();

    // Printing input entities above
    System.out.printf("You have entered:- " + a
                      + " and name as " + b+ " Double value provided "+d);
    
}

	

}
