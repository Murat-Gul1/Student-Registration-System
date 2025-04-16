import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class StudentManager {
    /**
     List that holds all student objects
     */
    private List<Student> studentList;
    /**
     Constructor that initializes the student list
     */
    public StudentManager(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
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
        if(id < 240){
            throw new IllegalArgumentException("ID must be greater than or equal to 240 and positive");
        }

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getId() == id){
                iterator.remove(); /** Safe removal during iteration */
                return true;
            }
        }
        return false; /** No student found with the given ID */
    }

    /**
     * Finds and returns a student by their ID.
     *
     * @param id the ID of the student to search for (must be positive)
     * @return the Student object if found; null otherwise
     * @throws IllegalArgumentException if id is not a positive integer
     */
    public Student findStudentById(int id){
        if(id < 240 ){
            throw new IllegalArgumentException ("ID must be greater than or equal to 240 and positive");
        }
        if(studentList.isEmpty()){
            return null;
        }
        for (Student student : studentList){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

    /**
     * Returns a copy of the current student list.
     *
     * This method allows safe access to the student list without exposing the internal list directly.
     *
     * @return a new list containing all students
     */
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentList);
    }
}
