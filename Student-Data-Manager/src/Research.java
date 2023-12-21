/**
 * @author Lorraine Low 
 * @version Eclipse IDE 2023-12 (4.30.0)
 */

public class Research extends Unit{
	
	/**
	 * The proposal mark for the research unit
	 */
	private double proposal;
	
	/**
	 * The final dissertation mark for the research unit
	 */
	private double finalDissertation;
	
	/**
	 * Parameterized Constructor of Research class
	 * <p>
	 * This constructor is used to represent and initialize the research object.
	 * </p>
	 * Precondition - The value of proposal and final dissertation must be a valid
	 * double value.<br>
	 * Postcondition - A research object is created with the variables set to
	 * their parameter values, and enrollment type set to 'R'.
	 * 
	 * @param proposal The proposal mark for the research object.
	 * @param finalDissertation  The final dissertation mark for the research object.
	 * @return Nil.
	 */
	public Research(double proposal, double finalDissertation) {
		super("Research");
		this.proposal = proposal;
		this.finalDissertation = finalDissertation;
	}
	
	/**
	 * This method is used to retrieve the overall marks of the research unit.<br>
	 * <p>
	 * Precondition - The proposal and final dissertation variables must be initialized.<br>
	 * Postcondition - Calculates and returns the overall marks of the research unit.
	 * </p>
	 * 
	 * @param Nil.
	 * @return overallMarks The overall marks of the research unit.
	 */
	public double getOverallMarks() {
		double overallMarks = (proposal*0.4 + finalDissertation*0.6);
		return overallMarks;
	}
	
	/**
	 * This method is used to retrieve the student's final grade of the research unit.<br>
	 * <p>
	 * Precondition - getOverallMarks() must return a value.<br>
	 * Postcondition - Calculates and returns the final grade of the research unit based on the overall marks.
	 * </p>
	 * 
	 * @param Nil.
	 * @return finalGrade The final grade of research unit.
	 */
	public String getFinalGrade() {
		double overallMark = getOverallMarks();
		return Helper.finalGrade(overallMark);
	}
	
	/**
	 * This method is used to display the overall marks and the final grade of research object.<br>
	 * <p>
	 * Precondition - The variables must be initialized.<br>
	 * Postcondition - Prints the value of overall marks and final grade of research object.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	public void display() {
		System.out.println("Overall marks: "+this.getOverallMarks());
		System.out.println("Final Grade: "+this.getFinalGrade());
	}

}
