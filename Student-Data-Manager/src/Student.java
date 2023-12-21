/**
 * @author Lorraine Low 
 * @version Eclipse IDE 2023-12 (4.30.0)
 */

public class Student {

	/**
	 * The first name for each Student object.
	 */
	private String firstName;

	/**
	 * The last name for each Student object.
	 */
	private String lastName;

	/**
	 * The id for each Student object.
	 */
	private long id;

	/**
	 * The enrollment type for each Student object.
	 */
	private String enrollmentType;

	/**
	 * No-Arg Constructor of Student class
	 * <p>
	 * This constructor is used to represent a student object.
	 * </p>
	 * Precondition - There must be an instance variable of the first name, last
	 * name, id, and enrollment type.<br>
	 * Postcondition - A student object is created with the default first and last
	 * names set to 'no name', id set to '-1', and enrollment type set to 'N.A.'.
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	public Student() {
		this.firstName = "No first name";
		this.lastName = "No last name";
		this.id = -1;
		this.enrollmentType = "N.A.";
	}

	/**
	 * Parameterized Constructor of Student class
	 * <p>
	 * This constructor is used to represent and initialize the student object.
	 * </p>
	 * Precondition - The value of first name, last name, and enrollment type must
	 * be a string and the value of id must be a valid long value.<br>
	 * Postcondition - A student object is created with the variables set to their
	 * parameter values.
	 * 
	 * @param firstName      The first name of student object.
	 * @param lastName       The last name of student object.
	 * @param id             The identifier value of student object.
	 * @param enrollmentType The enrollment type of student object, either course
	 *                       work or research.
	 * @return Nil.
	 */
	public Student(String firstName, String lastName, long id, String enrollmentType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id; 
		this.enrollmentType = enrollmentType;
	}

	/**
	 * This method is used to report the grade information of student object.<br>
	 * <p>
	 * Precondition - Nil.<br>
	 * Postcondition - Prints default message of no grade.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	public void reportGrade() {
		System.out.println("There is no grade here");
	}

	/**
	 * This method is used to report the grade information of student object.<br>
	 * <p>
	 * Precondition - Nil.<br>
	 * Postcondition - Prints default message of no grade.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	public boolean equals(Student student) {
		if (this.id == student.getId()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method is used to display the variables of student object.<br>
	 * <p>
	 * Precondition - Nil.<br>
	 * Postcondition - Prints the value of first name, last name, and student id of
	 * student object.
	 * </p>
	 * 
	 * @param Nil.
	 * @return Nil.
	 */
	public void display() {
		System.out.println("ID: " + this.id);
		System.out.println("First name: " + this.firstName);
		System.out.println("Last name: " + this.lastName);
	}

	/**
	 * This method is used to retrieve the first name of student object.<br>
	 * <p>
	 * Precondition - The first name must be initialized at the constructor.<br>
	 * Postcondition - Returns the value of first name of student object.
	 * </p>
	 * 
	 * @param Nil.
	 * @return firstName The first name of student object.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This method is used to set the first name of student object.<br>
	 * <p>
	 * Precondition - The first name must consist of a string value.<br>
	 * Postcondition - Sets the value of first name of student object.
	 * </p>
	 * 
	 * @param firstName The first name to set for student object.
	 * @return Nil.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This method is used to retrieve the last name of student object.<br>
	 * <p>
	 * Precondition - The last name must be initialized at the constructor.<br>
	 * Postcondition - Returns the value of last name of student object.
	 * </p>
	 * 
	 * @param Nil.
	 * @return lastName The last name of student object.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This method is used to set the last name of student object.<br>
	 * <p>
	 * Precondition - The last name must consist of a string value.<br>
	 * Postcondition - Sets the value of last name of student object.
	 * </p>
	 * 
	 * @param lastName The last name to set for student object.
	 * @return Nil.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This method is used to retrieve the id of student object.<br>
	 * <p>
	 * Precondition - The id must be initialized at the constructor.<br>
	 * Postcondition - Returns the value of id of student object.
	 * </p>
	 * 
	 * @param Nil.
	 * @return id The id of student object.
	 */
	public long getId() {
		return id;
	}

	/**
	 * This method is used to set the id of student object.<br>
	 * <p>
	 * Precondition - The id must be a valid long value.<br>
	 * Postcondition - Sets the value of id of student object.
	 * </p>
	 * 
	 * @param id The id to set for student object.
	 * @return Nil.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * This method is used to retrieve the enrollment type of student object.<br>
	 * <p>
	 * Precondition - The enrollment type must be initialized at the
	 * constructor.<br>
	 * Postcondition - Returns the value of enrollment type of student object.
	 * </p>
	 * 
	 * @param Nil.
	 * @return enrollmentType The enrollment type of student object.
	 */
	public String getEnrollmentType() {
		return enrollmentType;
	}

	/**
	 * This method is used to set the enrollment type of student object.<br>
	 * <p>
	 * Precondition - The name must consist of a string value.<br>
	 * Postcondition - Sets the value of enrollment type of student object.
	 * </p>
	 * 
	 * @param enrollmentType The enrollment type to set for student object.
	 * @return Nil.
	 */
	public void setEnrollmentType(String enrollmentType) {
		this.enrollmentType = enrollmentType;
	}

	/**
	 * This method is used to format the student information when outputting to a
	 * file.<br>
	 * <p>
	 * Precondition - Nil.<br>
	 * Postcondition - Returns the variables of the student object.
	 * </p>
	 * 
	 * @param Nil.
	 * @return enrollmentType The enrollment type of student object.
	 * @return firstName The first name of student object.
	 * @return lastName The last name of student object.
	 * @return id The id of student object.
	 */
	public String toCSVFile() {
		return enrollmentType + "," + firstName + "," + lastName + "," + id;
	}

}