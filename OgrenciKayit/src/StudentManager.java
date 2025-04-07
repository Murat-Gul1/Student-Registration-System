import java.util.List;
import java.util.ArrayList;
public class StudentManager {
    // List that holds all student objects
    private List<Student> studentList;
    // Constructor that initializes the student list
    public StudentManager(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    /**
     * Prints all students in the list using their toString() method.
     */
    public void printStudent(){
        for(Student  student : studentList){
            System.out.println(student);
        }
    }
}
