import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		String userNum;
		String userName;
		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		userName = scnr.next();

		System.out.println("Thanks, " + userName + ". Please enter a positive integer"
				+ " between 1 and 100 and I will tell you a banal fact about it. Enter 0 to quit.");
		userNum = scnr.next();

		String error;
		while ((error = validateNumber(userNum)) != null) {
			System.out.println(error);
			userNum = scnr.next();
		}
		
		boolean numIsOdd = Integer.parseInt(userNum) % 2 > 0;
		
		if (numIsOdd && Integer.parseInt(userNum) > 60) {
			System.out.println(userNum + " Odd and over 60.");
		}

		else if (numIsOdd) {
			System.out.println(userNum + " Odd.");
		}

		else if (Integer.parseInt(userNum) >= 2 && Integer.parseInt(userNum) <= 25) {
			System.out.println("Even and less than 25.");
		}

		else if (Integer.parseInt(userNum) >= 26 && Integer.parseInt(userNum) <= 60) {
			System.out.println("Even.");
		}

		else if (Integer.parseInt(userNum) > 60) {
			System.out.println(userNum + " Even.");
		}
		
		else {
			System.out.println("Goodbye.");
		}
		

	}

	public static String validateNumber(String numStr) {
		if (!isNumber(numStr)) {
			return "Invalid entry. Please enter a positive integer.";
		}

		if (!isWithinRange(numStr)) {
			return "Invalid entry. Please enter an integer between 1 and 100.";
		}

		return null;
	}

	public static boolean isWithinRange(String userNum) {

		if (Integer.parseInt(userNum) >= 0 && Integer.parseInt(userNum) <= 100) {
			return true;
		}
		return false;
	}

	public static boolean isNumber(String userNum) {

		for (int i = 0; i < userNum.length(); ++i) {
			char currentChar = userNum.charAt(i);
			boolean currentCharisDigit;
			currentCharisDigit = Character.isDigit(currentChar);

			if (currentCharisDigit == false) {
				return false;
			}
		}
		return true;
	}
}
