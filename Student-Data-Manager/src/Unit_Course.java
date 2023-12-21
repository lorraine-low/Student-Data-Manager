/**
 * @author Lorraine Low 
 * @version Eclipse IDE 2023-12 (4.30.0)
 */

public class Unit_Course extends Unit {

	/**
	 * The unit id for the unit course
	 */
	private String unitID;

	/**
	 * The level of the unit course
	 */
	private int level;

	/**
	 * The assignment 1 mark for the unit course
	 */
	private double a1;

	/**
	 * The assignment 2 mark for the unit course
	 */
	private double a2;

	/**
	 * The exam mark for the unit course
	 */
	private double exam;

	/**
	 * Parameterized Constructor of Unit_Course class
	 * <p>
	 * This constructor is used to represent and initialize the unit course object.
	 * </p>
	 * Precondition - The value of unit id must be a string, the value of level must
	 * be a valid integer value, and the value of a1, a2, and exam must be a valid
	 * double value.<br>
	 * Postcondition - A unit course object is created with the variables set to
	 * their parameter values, and enrollment type set to 'C'.
	 * 
	 * @param unitID The unit id of unit course object.
	 * @param level  The level of unit course object.
	 * @param a1     The assignment 1 mark of unit course object.
	 * @param a2     The assignment 2 mark of unit course object.
	 * @param exam   The exam mark of unit course object.
	 * @return Nil.
	 */
	public Unit_Course(String unitID, int level, double a1, double a2, double exam) {
		super("Coursework");
		this.unitID = unitID;
		this.level = level;
		this.a1 = a1;
		this.a2 = a2;
		this.exam = exam;
	}

	/**
	 * This method is used to retrieve the overall marks of the unit course.<br>
	 * <p>
	 * Precondition - The a1, a2, and exam variables must be initialized.<br>
	 * Postcondition - Calculates and returns the overall marks of the unit course.
	 * </p>
	 * 
	 * @param Nil.
	 * @return overallMarks The overall marks of the unit course.
	 */
	public double getOverallMarks() {
		double overallMarks = (a1 * 0.3 + a2 * 0.3 + exam * 0.4);
		return overallMarks;
	}

	/**
	 * This method is used to retrieve the student's final grade of the unit course.<br>
	 * <p>
	 * Precondition - getOverallMarks() must return a value.<br>
	 * Postcondition - Calculates and returns the final grade of the unit based on the overall marks.
	 * </p>
	 * 
	 * @param Nil.
	 * @return finalGrade The final grade of unit course.
	 */
	public String getFinalGrade() {
		double overallMark = getOverallMarks();
		return Helper.finalGrade(overallMark);
	}

	/**
	 * This method is used to display the unit id, overall marks and the final grade of unit course object.<br>
	 * <p>
	 * Precondition - The variables must be initialized.<br>
	 * Postcondition - Prints the value of unit id, overall marks and final grade of unit course object.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	public void display() {
		System.out.println("Unit ID: " + this.unitID);
		System.out.println("Overall marks: " + this.getOverallMarks());
		System.out.println("Final Grade: " + this.getFinalGrade());
	}

}
