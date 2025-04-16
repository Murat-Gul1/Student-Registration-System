import java.util.concurrent.atomic.AtomicInteger;
/**
 * This class represents a student with personal and academic information.
 * Each student is automatically assigned a unique ID upon creation using a static AtomicInteger.
 */
public class Student {
    // Static AtomicInteger to generate unique IDs for each Student instance.
    private static final AtomicInteger idGenerator = new AtomicInteger(240);
    /** The student's first name*/
    private String firstName;
    /** The student's last name*/
    private String lastName;
    /** The student's unique ID number*/
    private final int id;
    /** The student's grade (0-100 scale)*/
    private double grade;
    /**
     * Default constructor that automatically assigns a unique ID to the student.
     */
    public Student(){
    // Retrieve the current value of idGenerator and then increment it atomically.
    this.id = idGenerator.getAndIncrement();
    }
    /**
     * Sets the student's first name. Must be non-null, non-empty and contain only letters.
     *
     * @param firstName the first name to set
     * @throws IllegalArgumentException if firstName is null, blank, or contains non-letter characters
     */
    public void setFirstName (String firstName){
        if(firstName == null || firstName.trim().isEmpty()||!firstName.trim().matches("[A-Za-z]+")){
            throw new IllegalArgumentException("First name must contain only letters and cannot be empty.");
        }
        this.firstName = firstName.trim();
    }

    /** Returns the student's first name*/
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * Sets the student's last name. Must be non-null, non-empty and contain only letters.
     *
     * @param lastName the last name to set
     * @throws IllegalArgumentException if lastName is null, blank, or contains non-letter characters
     */
    public void setLastName(String lastName){
        if(lastName == null || lastName.trim().isEmpty()||!lastName.trim().matches("[A-Za-z]+")){
            throw new IllegalArgumentException("Last name must contain only letters and cannot be empty.");
        }
        this.lastName = lastName.trim();
    }

    /** Returns the student's last name*/
    public String getLastName(){
        return this.lastName;
    }

    /** Returns the student's ID*/
    public int getId(){
        return this.id;
    }

    /**
     * Sets the student's grade ensuring it is within the valid range (0-100).
     *
     * @param grade the grade to set (must be between 0 and 100)
     * @throws IllegalArgumentException if grade is not within the valid range
     */
    public void setGrade(double grade){
        if(grade < 0 || grade > 100){
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        this.grade = grade;
    }

    /** Returns the student's grade*/
    public double getGrade(){
        return this.grade;
    }

    /** Returns a string representation of the student's information*/
    @Override
    public String toString(){
        return "Id =" + id +
                ", First Name ='" + firstName + '\''+
                ", Last Name ='" +  lastName + '\'' +
                ", grade ='" + grade + '\'';
    }
}
