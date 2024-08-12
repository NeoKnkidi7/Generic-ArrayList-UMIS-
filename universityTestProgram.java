
/**
 * Write a description of class universityTestProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniversityStakeHolderTest {
    public static void main(String[] args) {
        MyArrayList<UniversityStakeHolder> stakeholders = new MyArrayList<>();

        // Adding students and lecturers
        Student student1 = new Student("Neo", "Nkidi", 45979278, 456769, 2, "Bachelor of Science in IT");
        Lecturer lecturer1 = new Lecturer("Dr. Katleho", "Nkwali", 20385046, "Faculty of Mathematics and Computer Science");
        Student student2 = new Student("Alice", "Mbele", 46998238, 456769, 1, "Bachelor of Pharmacy");
        Student student3 = new Student("Josh", "Connor", 56699272, 456769, 3, "Bachelor of Medicine and Bachelor of Surgery");
        Lecturer lecturer2 = new Lecturer("Mr. John", "Snyman", 16375949, "Faculty of Health Sciences");
        Lecturer lecturer3 = new Lecturer("Miss Zamukuhle", "Moloi", 12475229, "Faculty of Education");

        stakeholders.add(0, student1);
        stakeholders.add(1, lecturer1);
        stakeholders.add(2, student2);
        stakeholders.add(3, student3);
        stakeholders.add(4, lecturer2);
        stakeholders.add(5, lecturer3);

        // Displaying stakeholders
        System.out.println("Original List: " + stakeholders);

        // Getting max and min
        System.out.println("Max: " + stakeholders.getMax());
        System.out.println("Min: " + stakeholders.getMin());

        // Checking for uniqueness
        MyArrayList<UniversityStakeHolder> uniqueStakeholders = stakeholders.getUnique();
        System.out.println("Unique List: " + uniqueStakeholders);

        // Checking if list is a palindrome
        System.out.println("Is Palindrome: " + stakeholders.isPalindrome());

        // Filtering based on university number
        MyArrayList<UniversityStakeHolder> filteredStakeholders = stakeholders.getFiltered(student1);
        System.out.println("Filtered List: " + filteredStakeholders);

        // Equality check
        MyArrayList<UniversityStakeHolder> otherStakeholders = new MyArrayList<>();
        otherStakeholders.add(0, student1);
        otherStakeholders.add(1, lecturer1);
        otherStakeholders.add(2, student2);
        otherStakeholders.add(3, student3);
        otherStakeholders.add(4, lecturer2);
        otherStakeholders.add(5, lecturer3);

        System.out.println("Equality Check: " + stakeholders.equals(otherStakeholders));
    }
}