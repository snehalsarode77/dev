package com.gfg.InputOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizeResult {

	public static void main(String[] args) {
		
		
		/*
		 * ArrayList<Integer> ar = new ArrayList<>(); for (int i = 0; i <
		 * Integer.MAX_VALUE; i++) { int cnt = 0; ar.add(i); cnt++;
		 * System.out.println(cnt+""+ar); }
		 */
		int day = 2;
        String dayType = null;
        String dayString;

        // Switch case
        switch (day) {

        // Case
        case 1:
            dayString = "Monday";
            

        // Case
        case 2:
            dayString = "Tuesday";
           

            // Case
        case 3:
            dayString = "Wednesday";
           
        case 4:
            dayString = "Thursday";
            
        case 5:
            dayString = "Friday";
            dayType = "Weekday";
            break;
        case 6:
            dayString = "Saturday";
            
        case 7:
            dayString = "Sunday";
            dayType = "Weekend";
            break;
        default:
            dayString = "Invalid day";
        }
        System.out.println(dayString + " is a " + dayType);
	}
	}
//}
