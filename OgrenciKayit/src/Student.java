public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private double grade;

    public Student(){

    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }
    public double getGrade(){
        return this.grade;
    }
}
