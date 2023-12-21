/**
 * @author Lorraine Low
 * @version Eclipse IDE 2023-12 (4.30.0)
 */

public class Unit {

	/**
	 * The enrollment type for Unit class.
	 */
	private String enrolmentType;

	/**
	 * This method is used to set the static unit enrollment type.<br>
	 * <p>
	 * Precondition - The enrollment type must consist of a string.<br>
	 * Postcondition -Sets the enrollment type of the unit.
	 * </p>
	 * 
	 * @param enrollmentType The enrollment type of the unit.
	 * @return Nil.
	 */
	public Unit(String enrolmentType) {
		this.enrolmentType = enrolmentType;
	}

	/**
	 * This method is used to retrieve the enrollment type of the unit.<br>
	 * <p>
	 * Precondition - The enrollment type must be initialized.<br>
	 * Postcondition - Returns the enrollment type of the unit.
	 * </p>
	 * 
	 * @param Nil.
	 * @return enrollmentType The enrollment type of the unit.
	 */
	public String getEnrolmentType() {
		return enrolmentType;
	}

	/**
	 * This method is used to set the enrollment type of the unit.<br>
	 * <p>
	 * Precondition - The enrollment type must consist of a string.<br>
	 * Postcondition - Sets the enrollment type of the unit.
	 * </p>
	 * 
	 * @param enrollmentType The enrollment type of the unit.
	 * @return Nil.
	 */
	public void setEnrolmentType(String enrolmentType) {
		this.enrolmentType = enrolmentType;
	}

	/**
	 * This method is used to retrieve the student's final grade of the unit.<br>
	 * <p>
	 * Precondition - Nil.<br>
	 * Postcondition - Returns the final grade of the unit with the default value
	 * set to 'N.A.'.
	 * </p>
	 * 
	 * @param Nil.
	 * @return "N.A." The default value of final grade.
	 */
	public String getFinalGrade() {
		return "N.A.";
	}

}
