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
    public static void printStudentsWithinRange(List<Student> students){
        for(Student student : students){
            System.out.println(student);
        }
    }
}
