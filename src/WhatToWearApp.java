import java.util.Scanner;

public class WhatToWearApp {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What kind of event?");
		String eventType = scnr.next();
		System.out.println("What's the temperature?");
		int temp = scnr.nextInt();
		
		String eventClothing, tempClothing;
		
		if (eventType.equals("casual")) {
			eventClothing = "something comfy";
		}
		else if (eventType.equals("semi-formal")) {
			eventClothing = "a polo";
		}
		else if (eventType.equals("formal")) {
			eventClothing = "a suit";
		}
		else {
			eventClothing = "whatever you want, dude,";
		}
		
		if (temp < 54) {
			tempClothing = "a coat.";
		}
		
		else if ((temp >= 54) && (temp <= 74)) {
			tempClothing = "a jacket.";
		}
		
		else if (temp > 74) {
			tempClothing = "no jacket.";
		}
		
		else {
			tempClothing = " get on out there.";
		}
		
		System.out.println("Because its " + temp + " degrees and you're going" +
		" to a " + eventType + " event, wear " + eventClothing + " and " + tempClothing);
	}
	

}
