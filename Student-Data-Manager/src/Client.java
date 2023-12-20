import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author Lorraine Low
 * @version 4.30.0
 */

public class Client {

	/**
	 * The array list to store student objects
	 */
	private static ArrayList<Student> studentList = new ArrayList<Student>();

	/**
	 * A boolean variable with a false value. Variable is set to 'true' when student
	 * array list is sorted.
	 */
	private static boolean listSorted = false;

	/**
	 * Main method of Client class
	 * <p>
	 * This class is used to call other methods in order to run the program.
	 * </p>
	 * Precondition - Nil.<br>
	 * Postcondition - Execute the methods called in this method.
	 * 
	 * @param args An array of strings which stores arguments passed by command line
	 *             when program is run.
	 * @return Nil.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		studentInfo();
		run();

	}

	/**
	 * This method is used to print out the student information.<br>
	 * <p>
	 * Precondition - Nil.<br>
	 * Postcondition - Print out the message that includes the student information
	 * in the helper print line method.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	private static void studentInfo() {
		Helper.println(
				"-------------------------\nStudent Data Manager V1.0\n-------------------------");
	}

	/**
	 * This method is used to run the main methods included in the Client class
	 * which includes the menu and option <br>
	 * <p>
	 * Precondition - Nil.<br>
	 * Postcondition - Prints the menu and run the function method(s) upon selection
	 * until client exits.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	private static void run() {
	    readStudentAndMarksFile(studentList);
	    while (true) {
	        int choice = printMenuAndGetChoice();
	        switch (choice) {
	            case 1:
	            	displayAllInfo();
	                break;
	            case 2:
	            	searchStudentResults();
	                break;
	            case 3:
	            	removeFromList();
	                break;
	            case 4:
	                updateMarks();
	                break;
	            case 5:
	            	calcCourseworkAvg();
	                break;
	            case 6:
	                sortStudentsById();
	                break;
	            case 7:
	            	outputSortedList();
	                break;
	            case 0:
	                Helper.println("End of Program.");
	                return;
	            default:
	                Helper.println("Invalid choice.");
	        }
	    }
	}

	/**
	 * This method is used to display the menu containing the options for user
	 * input.<br>
	 * <p>
	 * Precondition - Nil.<br>
	 * Postcondition - Returns the number which the user has input as their choice.
	 * </p>
	 * 
	 * @param Nil.
	 * @return choice Returns the choice that is input by user.
	 */
	private static int printMenuAndGetChoice() {
		Helper.println("\n-----------Menu-----------");
		Helper.println("1. Display all information");
		Helper.println("2. Search for a student's results");
		Helper.println("3. Remove a student");
		Helper.println("4. Update an existing student's results (from a file)");
		Helper.println("5. Display coursework student count against average");
		Helper.println("6. Sort list by student ID");
		Helper.println("7. Export sorted list to file");
		Helper.println("0. Quit (exit the program)");
		Helper.println("--------------------------");
		int choice = Helper.getInt("Enter choice: ");
		return choice;
	}

	/**
	 * This method is used to update an exiting student's marks from another file to the
	 * student array list.<br>
	 * <p>
	 * Precondition - A valid file with the new student marks information must
	 * exist.<br>
	 * Postcondition - Uses the marks information from the input file to update the
	 * student array list.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	private static void updateMarks() {
		String fileName = Helper.getString("Enter file name (default - marksInput.csv): ");
		readMarksInputFile(studentList, fileName);
	}

	/**
	 * This method is used to remove a student object from the student array
	 * list.<br>
	 * <p>
	 * Precondition - A student object with the corresponding student id taken as
	 * input must exist in the array list.<br>
	 * Postcondition - Removes student object with corresponding student id from
	 * array list.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	private static void removeFromList() {
		long id = Helper.getLong("Enter student ID to remove: ");
		boolean idFound = false;
		for (int i = 0; i < studentList.size(); i++) {
			Student studentToRem = studentList.get(i);
			if (studentToRem.getId() == id) {
				studentList.remove(studentToRem);
				Helper.println("Student is removed from list.");
				idFound = true;
			}
		}
		if (!idFound) {
			Helper.println("Unable to find student ID from list.");
		}
	}

	/**
	 * This method is used to display all information in the student array list.<br>
	 * <p>
	 * Precondition - A valid student object must exist in the student array
	 * list.<br>
	 * Postcondition - Prints out all student information.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	private static void displayAllInfo() {
		for (Student student : studentList) {
			student.reportGrade();
			Helper.println("");
		}

	}

	/**
	 * This method is used to calculate the average overall mark of course work
	 * students and display the count of students scoring above, equals, and below
	 * the average.<br>
	 * <p>
	 * Precondition - An valid instance of a course work student must exist in the
	 * student array list.<br>
	 * Postcondition - Calculate average overall mark and prints number of students
	 * above or equal to the average, and number of students below the average.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	private static void calcCourseworkAvg() {
		double totalMarks = 0;
		int totalCount = 0;
		int equalAboveAveCount = 0;
		int belowAveCount = 0;

		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			if (student instanceof Student_Course) {
				totalCount = totalCount + 1;
				totalMarks = totalMarks + ((Student_Course) student).getUnit_course().getOverallMarks();
			}
		}
		double ave = totalMarks / totalCount;

		for (int j = 0; j < studentList.size(); j++) {
			Student student = studentList.get(j);
			if (student instanceof Student_Course) {
				if (((Student_Course) student).getUnit_course().getOverallMarks() >= ave) {
					equalAboveAveCount = equalAboveAveCount + 1;
				} else {
					belowAveCount = belowAveCount + 1;
				}
			}
		}
		Helper.println("\nNo. of coursework students obtaining an overall of:\n\nEqual or above average - "
				+ equalAboveAveCount + "\nBelow average - " + belowAveCount);

	}

	/**
	 * This method is used to display all grade information for a student
	 * object.<br>
	 * <p>
	 * Precondition - A valid student object with the corresponding student id taken
	 * as input must exist in the student array list.<br>
	 * Postcondition - Prints out all grade information of the student.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	private static void searchStudentResults() {
		long id = Helper.getLong("Enter student ID: ");
		boolean idFound = false;
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			if (student.getId() == id) {
				Helper.println("\n----Student's Results-----");
				student.reportGrade();
				Helper.println("--------------------------");
				idFound = true;
			}
		}
		if (!idFound) {
			Helper.println("Unable to find existing student ID.");
		}
	}

	/**
	 * This method is used to sort all students based on their student id in the
	 * student array list.<br>
	 * <p>
	 * Precondition - Two or more student objects with a valid student id must exist
	 * in the student array list.<br>
	 * Postcondition - Sorts all student objects based on their student id in
	 * ascending order.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	private static void sortStudentsById() {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 1; i < studentList.size(); i++) {
				Student student1 = studentList.get(i - 1);
				Student student2 = studentList.get(i);
				long student1Id = student1.getId();
				long student2Id = student2.getId();
				if (student1Id > student2Id) {
					studentList.set(i - 1, student2);
					studentList.set(i, student1);
					swap = true;
					listSorted = true;
				}
			}
		}
		if (listSorted = true) {
			Helper.println("List has been sorted.");
		}
	}

	/**
	 * This method is used to output the sorted student array list to a file.<br>
	 * <p>
	 * Precondition - Student array list must first be sorted.<br>
	 * Postcondition - Outputs the sorted array list with student information to a
	 * file.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	private static void outputSortedList() {
		if (!listSorted) {
			Helper.println("Unable to write to file as list has not been sorted.");
		} else {
			PrintWriter writer;
			try {
				writer = new PrintWriter("sortedStudents.csv");
				for (Student student : studentList) {
					String s = student.toCSVFile();
					writer.println(s);
				}
				Helper.println("Sorted list has been written to file.");
				writer.close();
			} catch (FileNotFoundException ex) {
				Helper.println("Unable to write to file.");
			}
		}
	}

	/**
	 * This method is used to read the files with students and marks information and
	 * add them to student array list.<br>
	 * <p>
	 * Precondition - students.csv with student information and marks.csv file with
	 * marks information must exist.<br>
	 * Postcondition - Reads students.csv and marks.csv file and adds their
	 * information to the student array list.
	 * </p>
	 * 
	 * @param studentList The array list which will be used to store student and
	 *                    marks information.
	 * @return Nil.
	 */
	private static void readStudentAndMarksFile(ArrayList<Student> studentList) {
		try {
			Scanner studentFile = new Scanner(new File("students.csv"));
			Scanner marksFile = new Scanner(new File("marks.csv"));

			while (studentFile.hasNext() || marksFile.hasNext()) {

				String studentsLine = studentFile.nextLine();
				String[] attribute = studentsLine.split(",");
				String enrollmentType = attribute[0];
				String firstName = attribute[1];
				String lastName = attribute[2];
				long id = Long.parseLong(attribute[3]);

				String marksLine = marksFile.nextLine();
				String[] attribute2 = marksLine.split(",");

				if (enrollmentType.equalsIgnoreCase("Coursework")) {

					Student_Course sC = new Student_Course(firstName, lastName, id);

					String unitId = attribute2[1];
					int level = Integer.parseInt(attribute2[2]);
					double a1 = Double.parseDouble(attribute2[3]);
					double a2 = Double.parseDouble(attribute2[4]);
					double exam = Double.parseDouble(attribute2[5]);

					Unit_Course uC = new Unit_Course(unitId, level, a1, a2, exam);
					sC.setUnit_course(uC);
					studentList.add(sC);

				} else if (enrollmentType.equalsIgnoreCase("Research")) {

					Student_Research sR = new Student_Research(firstName, lastName, id);

					double proposal = Double.parseDouble(attribute2[1]);
					double finalDissertation = Double.parseDouble(attribute2[2]);

					Research uR = new Research(proposal, finalDissertation);
					sR.setResearch_unit(uR);
					studentList.add(sR);
				}
			}
		} catch (FileNotFoundException err) {
			System.out.println(err);
		}
	}

	/**
	 * This method is used to read the input file with new marks information update
	 * it to the student array list.<br>
	 * <p>
	 * Precondition - A valid file with the new student marks information must
	 * exist.<br>
	 * Postcondition - Reads input file and uses the marks information from the
	 * input file to update the student array list.
	 * </p>
	 * 
	 * @param studentList   The array list which is used to store student and marks
	 *                      information.
	 * @param inputFileName The file name containing the new student marks
	 *                      information.
	 * @return Nil.
	 */
	private static void readMarksInputFile(ArrayList<Student> studentList, String inputFileName) {
		try {
			Scanner marksInputFile = new Scanner(new File(inputFileName));
			while (marksInputFile.hasNext()) {
				String marksInputLine = marksInputFile.nextLine();
				String[] attribute = marksInputLine.split(",");
				if (attribute.length == 6) {
					for (int i = 0; i < studentList.size(); i++) {
						Student student = studentList.get(i);
						long id = student.getId();
						if (Long.parseLong(attribute[0]) == id) {
							String unitId = attribute[1];
							int level = Integer.parseInt(attribute[2]);
							double a1 = Double.parseDouble(attribute[3]);
							double a2 = Double.parseDouble(attribute[4]);
							double exam = Double.parseDouble(attribute[5]);

							Unit_Course uC = new Unit_Course(unitId, level, a1, a2, exam);
							Student_Course sC = new Student_Course(student.getFirstName(), student.getLastName(), id);
							sC.setUnit_course(uC);
							studentList.set(i, sC);

						}
					}
				} else if (attribute.length == 3) {
					for (int i = 0; i < studentList.size(); i++) {
						Student student = studentList.get(i);
						long id = student.getId();
						if (Long.parseLong(attribute[0]) == id) {
							double proposal = Double.parseDouble(attribute[1]);
							double finalDissertation = Double.parseDouble(attribute[2]);

							Research uR = new Research(proposal, finalDissertation);
							Student_Research sR = new Student_Research(student.getFirstName(), student.getLastName(),id);
							sR.setResearch_unit(uR);
							studentList.set(i, sR);

						}
					}

				} else {
					Helper.println("Please format each entry in input file with correct marks format.");
				}
			}

		} catch (FileNotFoundException err) {
			System.out.println(err);
		}
	}


}
