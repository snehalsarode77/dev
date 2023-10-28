package com.gfg.InputOutput;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		/*// Declaring 2-D array with 2 rows
		int arr[][] = new int[2][];

		// Making the above array Jagged

		// First row has 3 columns
		arr[0] = new int[3];

		// Second row has 2 columns
		arr[1] = new int[2];

		// Initializing array
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = count++;

		// Displaying the values of 2D Jagged array
		System.out.println("Contents of 2D Jagged Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	*/
	
		/*
		 * int arr[][] = new int[2][]; 
		 * System.out.println(arr.length);
		 * System.out.println(arr[0][0]); 
		 * //System.out.println(arr[0].length);
		 * 
		 * int arr1[] = new int[2]; System.out.println(arr1[0]+" "+arr1[1]);
		 */
		
		int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		
		Arrays.sort(arr);
		System.out.println(Arrays.asList(arr).toString());
		
	}
	
}
