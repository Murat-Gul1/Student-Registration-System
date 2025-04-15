import java.util.List;
public class Main {
    public static void main(String[] args) {
    StudentManager manager = new StudentManager();
    Student s1 = new Student();
    s1.setFirstName("Murat");
    s1.setLastName("Gül");
    s1.setGrade(101);
    manager.addStudent(s1);
        
    }

}