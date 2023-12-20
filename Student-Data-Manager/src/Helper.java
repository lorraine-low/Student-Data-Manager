import java.util.Scanner;

/**
 * @author Lorraine Low
 * @version 4.30.0
 */

public class Helper {

	/**
	 * This method is used to scan the next token of the input as a long type.
	 * <p>
	 * Precondition - Message must consist of a string value.<br>
	 * Postcondition - Returns the long input after validation.
	 * </p>
	 * 
	 * @param msg The message to display to the client for the user input.
	 * @return n Return the long input.
	 */
	public static long getLong(String msg) {
		Scanner kb = new Scanner(System.in);
		System.out.print(msg);
		while (!kb.hasNextLong()) {
			System.out.print("\nInput is not a long value. Please enter again: ");
			kb.nextLine();
		}
		long n = kb.nextLong();
		return n;
		
	}

	/**
	 * This method is used to scan the next token of the input as an integer.
	 * <p>
	 * Precondition - Message must consist of a string value.<br>
	 * Postcondition - Returns the integer input after validation.
	 * </p>
	 * 
	 * @param msg The message to display to the client for the user input.
	 * @return n Return the integer input.
	 */
	public static int getInt(String msg) {
		Scanner kb = new Scanner(System.in);
		System.out.print(msg);
		while (!kb.hasNextInt()) {
			System.out.print("\nInput is not an integer. Please enter again: ");
			kb.nextLine();
		}
		int n = kb.nextInt();
		return n;
	
	}

	/**
	 * This method is used to scan the next token of the input as a string.
	 * <p>
	 * Precondition - Message must consist of a string value.<br>
	 * Postcondition - Returns the string input with all whitespace removed.
	 * </p>
	 * 
	 * @param msg The message to display to the client for the user input.
	 * @return s Return the string input.
	 */
	public static String getString(String msg) {
		Scanner kb = new Scanner(System.in);
		System.out.print(msg);
		String s = kb.nextLine().replaceAll(" ", "");
		return s;
	}

	/**
	 * This method is used to display the text parameter on the console and adds a
	 * new line.<br>
	 * <p>
	 * Precondition - Message must consist of a string value.<br>
	 * Postcondition - Prints out the message on the console and adds a new line.
	 * </p>
	 * 
	 * @param msg The message to display to the client.
	 * @return Nil.
	 */
	public static void println(String msg) {
		System.out.println(msg);
	}

	/**
	 * This method is used to display the text parameter on the console.<br>
	 * <p>
	 * Precondition - Message must consist of a string value.<br>
	 * Postcondition - Prints out the message on the console.
	 * </p>
	 * 
	 * @param msg The message to display to the client.
	 * @return Nil.
	 */
	public static void print(String msg) {
		System.out.print(msg);
	}
	
	/**
	 * This method is used to determine the final grade of each student.<br>
	 * <p>
	 * Precondition - Overall mark must be a value between 0 to 100.<br>
	 * Postcondition - Converts overall mark to the corresponding grade.
	 * </p>
	 * 
	 * @param overallMark The overall mark of each student.
	 * @return finalGrade The final computed grade.
	 */
	public static String finalGrade(double overallMark) {
		if (overallMark >= 80 && overallMark <= 100) {
			String finalGrade = "HD";
			return finalGrade;
		} else if (overallMark >= 70 && overallMark < 80) {
			String finalGrade = "D";
			return finalGrade;
		} else if (overallMark >= 60 && overallMark < 70) {
			String finalGrade = "C";
			return finalGrade;
		} else if (overallMark >= 50 && overallMark < 60) {
			String finalGrade = "P";
			return finalGrade;
		} else if (overallMark >= 0 && overallMark < 50) {
			String finalGrade = "N";
			return finalGrade;
		} else {
			return null;
		}
	}

}
