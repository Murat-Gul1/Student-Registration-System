import java.util.List;
import java.util.ArrayList;
public class StudentManager {
    private List<Student> studentList;

    public StudentManager(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void printStudent(){
        for(Student  student : studentList){
            System.out.println(student);
        }
    }
}
