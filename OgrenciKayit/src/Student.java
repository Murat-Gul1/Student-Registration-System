// This class represents a student with basic personal and academic information.
public class Student {
    // The student's first name
    private String firstName;
    // The student's last name
    private String lastName;
    // The student's unique ID number
    private int id;
    // The student's grade (0-100 scale)
    private double grade;
    // Default constructor
    public Student(){

    }
    // Sets the student's first name
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    // Returns the student's first name
    public String getFirstName(){
        return this.firstName;
    }

    // Sets the student's last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // Returns the student's last name
    public String getLastName(){
        return this.lastName;
    }

    // Sets the student's ID
    public void setId(int id){
        this.id = id;
    }

    // Returns the student's ID
    public int getId(){
        return this.id;
    }

    // Sets the student's grade
    public void setGrade(double grade){
        this.grade = grade;
    }

    // Returns the student's grade
    public double getGrade(){
        return this.grade;
    }

    // Returns a string representation of the student's information
    @Override
    public String toString(){
        return "Id =" + id +
                ", First Name ='" + firstName + '\''+
                ", Last Name ='" +  lastName + '\'' +
                ", grade ='" + grade + '\'';
    }
}
