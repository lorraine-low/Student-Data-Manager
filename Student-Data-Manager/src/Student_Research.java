/**
 * @author Lorraine Low 
 * @version 4.30.0
 */

public class Student_Research extends Student {
	
	/**
	 * The research unit information of each research student from Research class.
	 */
	private Research research_unit;

	/**
	 * Parameterized Constructor of Student_Research class
	 * <p>
	 * This constructor is used to represent and initialize the student research object.
	 * </p>
	 * Precondition - The value of first name and last name must be a string and the
	 * value of id must be a valid long value.<br>
	 * Postcondition - A student research object is created with the variables set to
	 * their parameter values, and enrollment type set to 'R'.
	 * 
	 * @param firstName The first name of student research object.
	 * @param lastName  The last name of student research object.
	 * @param id        The identifier value of student research object.
	 * @return Nil.
	 */
	public Student_Research(String firstName, String lastName, long id) {
		super(firstName, lastName, id, "Research");
	}
	
	/**
	 * This method is used to report the grade information of student research
	 * object.<br>
	 * <p>
	 * Precondition - Nil.<br>
	 * Postcondition - Inherits methods from Student super class. Prints student and
	 * research information using display methods.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	public void reportGrade() {
		System.out.println("Enrollment Type: "+this.getEnrollmentType());
		this.display();
		
		if(research_unit!=null) {
			research_unit.display();
			
		}
	}
	
	/**
	 * This method is used to retrieve the research unit of student research object.<br>
	 * <p>
	 * Precondition - The research unit must be initialized.<br>
	 * Postcondition - Returns the research unit information of student research object.
	 * </p>
	 * 
	 * @param Nil.
	 * @return research_unit The research unit of student research object.
	 */
	public Research getResearch_unit() {
		return research_unit;
	}
	
	/**
	 * This method is used to set the research unit of student research object.<br>
	 * <p>
	 * Precondition - The research unit must follow the parameters of Research.<br>
	 * Postcondition - Sets the research unit information of student research object.
	 * </p>
	 * 
	 * @param research_unit The research unit to set for student research object.
	 * @return Nil.
	 */
	public void setResearch_unit(Research research_unit) {
		this.research_unit = research_unit;
	}
	
}
