/**
 * @author Lorraine Low 
 * @version Eclipse IDE 2023-12 (4.30.0)
 */

public class Student_Course extends Student {

	/**
	 * The unit course information of each course work student from Unit_Course
	 * class.
	 */
	private Unit_Course unit_course;

	/**
	 * Parameterized Constructor of Student_Course class
	 * <p>
	 * This constructor is used to represent and initialize the student course object.
	 * </p>
	 * Precondition - The value of first name and last name must be a string and the
	 * value of id must be a valid long value.<br>
	 * Postcondition - A student course object is created with the variables set to
	 * their parameter values, and enrollment type set to 'C'.
	 * 
	 * @param firstName The first name of student course object.
	 * @param lastName  The last name of student course object.
	 * @param id        The identifier value of student course object.
	 * @return Nil.
	 */
	public Student_Course(String firstName, String lastName, long id) {
		super(firstName, lastName, id, "Coursework");
	}

	/**
	 * This method is used to report the grade information of student course
	 * object.<br>
	 * <p>
	 * Precondition - Nil.<br>
	 * Postcondition - Inherits methods from Student super class. Prints student and
	 * unit course information using display methods.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	public void reportGrade() {
		System.out.println("Enrollment Type: " + this.getEnrollmentType());
		this.display();

		if (unit_course != null) {
			unit_course.display();
		}
	}

	/**
	 * This method is used to retrieve the unit course of student course object.<br>
	 * <p>
	 * Precondition - The unit course must be initialized.<br>
	 * Postcondition - Returns the unit course information of student course object.
	 * </p>
	 * 
	 * @param Nil.
	 * @return unit_course The unit course of student course object.
	 */
	public Unit_Course getUnit_course() {
		return unit_course;
	}

	/**
	 * This method is used to set the unit course of student course object.<br>
	 * <p>
	 * Precondition - The unit course must follow the parameters of Unit_Course.<br>
	 * Postcondition - Sets the unit course information of student course object.
	 * </p>
	 * 
	 * @param unit_course The unit course to set for student course object.
	 * @return Nil.
	 */
	public void setUnit_course(Unit_Course unit_course) {
		this.unit_course = unit_course;
	}

}
