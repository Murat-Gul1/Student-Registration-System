import java.util.ArrayList;
import java.util.List;
/**
 * Utility class for operations related to Student objects.
 */
public class StudentUtils {
    /**
     * Prints the information of each student in the provided list.
     *
     * This method iterates through the list of students and prints each student's information
     * using their {@code toString()} method. If the list is empty, no output is produced.
     *
     * @param students the list of Student objects to be printed.
     */
    public static void printStudents(List<Student> students){
        for(Student student : students){
            System.out.println(student);
        }
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
    public static List<Student> findStudentsByGradeRange(List<Student> students,double minGrade, double maxGrade){
        // Create an empty list to store students that match the grade criteria.
        List<Student> result = new ArrayList<>();
        // Iterate over each student in the students.
        for(Student student : students){
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
