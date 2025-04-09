import java.util.Iterator;
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
    
    /**
     * Removes a student from the list by their unique ID.
     *
     * This method safely iterates over the student list using an Iterator
     * to avoid ConcurrentModificationException. If a student with the
     * specified ID is found, they are removed from the list.
     *
     * @param id The unique identifier of the student to remove
     * @return true if the student was found and removed; false otherwise
     */
    public boolean removeStudentById(int id){
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getId() == id){
                iterator.remove(); // Safe removal during iteration
                return true;
            }
        }
        return false; // No student found with the given ID
    }
}
