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
                iterator.remove(); /** Safe removal during iteration */
                return true;
            }
        }
        return false; /** No student found with the given ID */
    }

    /**
     * Finds and returns a student from the list by their ID.
     *
     * Iterates through the list of students and compares each student's ID
     * with the provided ID. Returns the student object if a match is found;
     * otherwise, returns null.
     *
     * @param id The ID of the student to search for
     * @return The Student object if found, or null if no match is found
     */
    public Student findStudentById(int id){
        for (Student student : studentList){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }
    /**
     * Updates a student's information by their ID.
     *
     * @param id The ID of the student to update
     * @param newFirstName The new first name
     * @param newLastName The new last name
     * @param newGrade The new grade
     * @return true if the student was found and updated, false otherwise
     */
    public boolean updateStudentById(int id , String newFirstName , String newLastName , double newGrade){
        for(Student  student : studentList){
            if(student.getId() == id){
                student.setFirstName(newFirstName);
                student.setLastName(newLastName);
                student.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }
    /**
     * Finds and returns a list of students whose grades are within the specified range.
     *
     * This method iterates through the student list and checks each student's grade.
     * If a student's grade is greater than or equal to minGrade and less than or equal to maxGrade,
     * that student is added to the result list.
     *
     * @param minGrade the minimum grade (inclusive)
     * @param maxGrade the maximum grade (inclusive)
     * @return a list of students that meet the grade range criteria; if no student is found, an empty list is returned
     */
    public List<Student> findStudentsByGradeRange(double minGrade, double maxGrade){
        // Create an empty list to store students that match the grade criteria.
        List<Student> result = new ArrayList<>();
        // Iterate over each student in the studentList.
        for(Student student : studentList){
            // Check if the student's grade is within the specified range (inclusive).
            if(student.getGrade() >= minGrade && student.getGrade() <= maxGrade){
                // Add the student to the result list if the condition is met.
                result.add(student);
            }
        }
        // Return the list containing all students that fit the specified grade range.
        return result;
    }
}
