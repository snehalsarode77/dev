package com.gfg.InputOutput;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class LoopingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List<Integer> list = new ArrayList<>(); long startTime; long endTime;
		 * 
		 * for (int i = 0; i < 1000000; i++) { list.add(i); } // Type 1 startTime =
		 * Calendar.getInstance().getTimeInMillis(); for (int i : list) { int a = i; }
		 * endTime = Calendar.getInstance().getTimeInMillis();
		 * System.out.println("For each loop :: " + (endTime - startTime) + " ms");
		 * 
		 * // Type 2 startTime = Calendar.getInstance().getTimeInMillis(); for (int j =
		 * 0; j < list.size(); j++) { int a = list.get(j); } endTime =
		 * Calendar.getInstance().getTimeInMillis();
		 * System.out.println("Using collection.size() :: " + (endTime - startTime) +
		 * " ms");
		 * 
		 * // Type 3 startTime = Calendar.getInstance().getTimeInMillis(); int size =
		 * list.size(); for (int j = 0; j < size; j++) { int a = list.get(j); } endTime
		 * = Calendar.getInstance().getTimeInMillis();
		 * System.out.println("By calculating collection.size() first :: " + (endTime -
		 * startTime) + " ms");
		 * 
		 * // Type 4 startTime = Calendar.getInstance().getTimeInMillis(); for(int j =
		 * list.size()-1; j >= 0; j--) { int a = list.get(j); } endTime =
		 * Calendar.getInstance().getTimeInMillis();
		 * System.out.println("Using [int j = list.size(); j > size ; j--] :: " +
		 * (endTime - startTime) + " ms"); }
		 */

		
		
		/*
		 * int number = 534; int firstDigit =
		 * Integer.parseInt(Integer.toString(number).substring(0, 1));
		 * System.out.println(firstDigit);
		 */
		
		int i = 2;
		while(i >= 0) {
			main(args);
			System.out.println("GFG");
			
			--i;
			
		}
	}
	
	
			
			  
	

}
