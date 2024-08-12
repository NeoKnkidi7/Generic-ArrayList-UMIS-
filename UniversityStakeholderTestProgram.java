
/**
 * Write a description of class UniversityStakeholderTestProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class UniversityStakeholderTestProgram implements Comparable<UniversityStakeHolder> {
    private String firstName;
    private String lastName;
    private int universityNumber;

    // Default Constructor
    protected UniversityStakeholderTestProgram() {
    }

    // Parameterized Constructor
    protected UniversityStakeholderTestProgram(String firstName, String lastName, int universityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.universityNumber = universityNumber;
    }

    // Accessor/Getter method for first name
    public String getFirstName() {
        return firstName;
    }

    // Accessor/Getter method for last name
    public String getLastName() {
        return lastName;
    }

    // Accessor/Getter method for universityNumber
    public int getUniversityNumber() {
        return universityNumber;
    }

    // Mutator/Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Mutator/Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Mutator/Setter for universityNumber
    public void setUniversityNumber(int universityNumber) {
        this.universityNumber = universityNumber;
    }

    // Abstract method
    public abstract void institutionRole();

    @Override
    public String toString() {
        return "Stakeholder" +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nUniversity Number: " + universityNumber;
    }

    @Override
    public int compareTo(UniversityStakeHolder other) {
        return Integer.compare(this.universityNumber, other.universityNumber);
    }
}