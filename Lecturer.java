
/**
 * Write a description of class Lecturer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends UniversityStakeHolder {
    private double studentFees;
    private String qualification;
    private int yearOfStudy;

    // Default Constructor
    public Student() {
    }

    public Student(String firstName, String lastName, int universityNumber, double studentFees, int yearOfStudy, String qualification) {
        super(firstName, lastName, universityNumber);
        this.studentFees = studentFees;
        this.yearOfStudy = yearOfStudy;
        this.qualification = qualification;
    }

    // Accessor/Getter method
    public double getStudentFees() {
        return studentFees;
    }

    // Accessor/Getter method
    public int getYearOfStudy() {
        return yearOfStudy;
    }

    // Accessor/Getter method
    public String getQualification() {
        return qualification;
    }

    // Mutator/Setter
    public void setStudentFees(double studentFees) {
        this.studentFees = studentFees;
    }

    // Mutator/Setter
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    // Implementing the institutionRole method defined in the UniversityStakeholder class
    @Override
    public void institutionRole() {
        System.out.println("Institution role: Attending classes and studying according to the schedule and producing excellent module marks and academic records.");
    }

    @Override
    public String toString() {
        return "Student" +
                "\nFirst name: " + getFirstName() +
                "\nLast name: " + getLastName() +
                "\nUniversity Number: " + getUniversityNumber() +
                "\nStudent fees: R" + studentFees +
                "\nYear of Study: " + yearOfStudy +
                "\nQualification: " + qualification;
    }
}